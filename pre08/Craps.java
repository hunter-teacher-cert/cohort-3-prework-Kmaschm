import java.util.Random;
import java.util.Scanner;


public class Craps {

  /*
  * Simulates a game of Craps:
  *
  * Main program must take in number of rounds, then play number of rounds specified, and output status of rounds as they occur
  * 
  * Required methods: 
  * roll: takes an integer and returns a random number between 1 and the integer (inclusive)
  *
  * shoot: takes in the number of dice and max value for one die, returns result of rolling the dice 
  *
  * round: takes in no parameters, returns if round is won or lost
  *
  * Rules for a round:
  * 1. Shooter rolls/shoots dice.
  *
  * If shooter rolls:
  * 2, 3, 12  --> Craps, shooter loses
  * 7, 11 --> Natural, shooter wins
  * Any other number not specified:
  * value is now called Point
  * shooter must roll until they roll Point (wins) or 7 (loses)
  *
  * 
  *  
  */

  public static void main(String[] args) {
    //System.out.println(shoot(2, 6));
    String result;
    int numOfRounds;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Craps!  Please state how many rounds you'd like to play.");
    numOfRounds = in.nextInt();

    for(int i = 1; i <= numOfRounds; i++) {
      System.out.println("************* Starting Round " + i + " *************");
      result = round();
      System.out.println("End of round " + i + ": Shooter " + result);
      System.out.println("");
    }
   
  }


  /**
  * Simulates rolling an n-sided die.  Takes in an integer, numSides, and returns a (pseudo)randomly-selected integer from 1 to numSides inclusive.
  *
  * @param numSides integer, represents n-sided die
  * @return integer (pseudo)randomly-chosen from 1 to numSides inclusive
  */
  public static int roll(int numSides) {
    Random rand = new Random();
    return rand.nextInt(numSides) + 1;

  }


  /**
  *  Simulates rolling specified number of n-sided dice.  Takes in an integer number of dice and an integer number of sides, returns total of score of all dice rolls
  *
  * @param numDice    integer, specifies number of dice we will roll
  * @param numSides   integer, specifies the number of sides on each die
  * @return   integer, total value of all dice rolled
  */
  public static int shoot(int numDice, int numSides) {
    int rollTotal = 0;
    for(int i = 0; i < numDice; i++) {
      rollTotal += roll(numSides);
    }
    return rollTotal;
  }

  public static String round() {
    final int NUM_OF_DICE = 2;
    final int NUM_OF_SIDES = 6;
    final String WIN = "wins!";
    final String LOSS = "loses.";

    int currentShot;
    int point;

    currentShot = shoot(NUM_OF_DICE, NUM_OF_SIDES);
    System.out.println("Shooter has rolled: " + currentShot);

    if(currentShot == 2 || currentShot == 3 || currentShot == 12) {
      System.out.println("Craps!");
      return LOSS;
    } else if(currentShot == 7 || currentShot == 11) {
      System.out.println("Natural!");
      return WIN;
    } else {
      point = currentShot;
      while(true) {
        currentShot = shoot(NUM_OF_DICE, NUM_OF_SIDES);
        System.out.println("Shooter has rolled: " + currentShot);

        if(currentShot == point) {
          return WIN;
        }

        if(currentShot == 7) {
          return LOSS;
        }
      }
    }
  }


}