import java.util.Arrays;

public class Array {

  public static void main(String[] args) {
    // Testing powArray
    double[] a = {5, 7, 2, -3, 1, 0, 0.5, 100};
    System.out.println(Arrays.toString(powArray(a, 4)));


    
  }


  /**
  * Takes in an array, a, and returns a new array that contains the elements of a squared
  * @param a double[]
  * @return double[] that contains the elements of a^n
  */
  public static double[] powArray(double[] a, int n) {
    double[] an = new double[a.length];
    for(int i = 0; i < a.length; i++) {
      an[i] = power(a[i], n);
    }
    return an;
  }

  /**
  * Takes in numbers x and n, returns x^n
  *
  * @param x double
  * @param n int
  * @return x^n double
  */

  public static double power(double x, int n) {
    double xn = 1;
    for(int i = 1; i < n; i++) {
      xn *= x;
    }
    return xn;
  }

  /**
  * Takes in an array of scores (1 up to 100 exclusive) and returns a histogram of 100 counters
  *
  * @param scores int[]  scores that can be integers 1-100, including 1, but not including 100
  * @return int[100] of counters
  */
  public static int[] histogram(int[] scores) {
    return scores;
  }

}