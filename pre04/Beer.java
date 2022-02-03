import java.io.*;

public class Beer {

  public static void bottleOfBeer(int num) {
    System.out.print(num + " bottle");
    if(num > 1 || num == 0) {
      pluralize();
    }
    System.out.print(" of beer");
  }

  public static void pluralize() {
    System.out.print("s");
  }

  public static void passIt() {
    System.out.println("ya' take one down, ya' pass it around,");
  }

  public static void singing(int numBottles) {
  
    if(numBottles > 0 ) {
      bottleOfBeer(numBottles);
      System.out.println(" on the wall,");
      bottleOfBeer(numBottles);
      System.out.println(",");
      passIt();
      bottleOfBeer(numBottles - 1);
      System.out.println(" on the wall.");
      System.out.println();

      singing(numBottles - 1);
      
    } else {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }
 
  public static void main(String[] args) {
    singing(99);

  }



}