
public class Loops {

  public static void main(String[] args){
    //System.out.println(squareRoot(9));
    //System.out.println(power(2, 10));
    //System.out.println(factorial(6));
  }

  /**
  * Computes an approximation of the square root of a number
  *
  * @param  a   double of which we're finding the approximation of its square root 
  * @return     approximation of square root of a
  */
  public static double squareRoot(double a) {
    double currGuess = a/2;
    double newGuess;
    double diff;
    while(true) {
      newGuess = (currGuess + a/currGuess) / 2;
      diff = Math.abs(newGuess - currGuess);
      // System.out.println("Current guess: " + currGuess + " New guess: "  + newGuess + " Difference: " + diff);
     if (diff < 0.0001) {
        break;
      }
      currGuess = newGuess;
    }
    return newGuess;
  }

  /**
  * Takes in x and n, returns x^n
  * @param x double, base of power
  * @param n int, exponent (must be positive)
  * @return x^n
  * 
  */
  public static double power(double x, int n) {
    double xn = x;
    for(int i=1; i < n; i++) {
      xn *= x;
    }
    return xn;
  }

  /**
  * Takes in an integer n and computes the factorial of n: n!
  *
  * @param n  integer that we are finding the factorial of.  Must be >= 0
  * @returns n!
  */
  public static int factorial(int n) {
    int result = 1;
    if(n == 0) {
      return result;
    } else {
      for(int i = n; i > 1; i--) {
        result = result*i;
      }
    }
    return result;
  }


}
