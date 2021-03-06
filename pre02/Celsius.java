import java.util.Scanner;

/** 
* Converts a temperature from Celsius to Fahrenheit: F = C * 9/5 + 32 
*/

public class Celsius {
  public static void main(String[] args) {
    double tempInC;
    double tempInF;

    Scanner in = new Scanner(System.in);

    // prompt user for temperatue & get value
    System.out.print("What temperature in Celsius? ");
    tempInC = in.nextDouble();

    // convert and output result
    tempInF = tempInC * 9.0/5.0 + 32.0;
    System.out.printf("%.1f C = %.1f F", tempInC, tempInF);

  }
}