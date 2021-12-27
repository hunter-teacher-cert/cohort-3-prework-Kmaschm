import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args)
{
    double hour = 18.0;
    double minute = 29.0;
    double second = 33.0;

    double secInMin = 60.0;
    double secInHour = 60.0*secInMin;
    double secInDay = 24.0*secInHour;

    // calculate & display number of seconds since midnight
    double secSinceMid = second + minute*secInMin + hour*secInHour;

    System.out.println("Seconds since midnight: " + secSinceMid);

    // calculate and display the number of seconds remaining in the day
    double secLeftInDay = secInDay - secSinceMid;

    System.out.println("Number of seconds left in day: " + secLeftInDay);

    // calculate and display the percentage of the day that has passed
    double perOfDayPassed = (secSinceMid / secInDay) * 100;

    System.out.println("Percentage of day that has passed: " + perOfDayPassed + "%");

    // elapsed time since starting this exercise
    // original values: hour: 18, minute: 4, second: 10
    double prevHour = 18.0;
    double prevMin = 4.0;
    double prevSec = 10.0;

    double elapsedTime = (hour - prevHour)*secInHour + (minute - prevMin)*secInMin + (second - prevSec);

    System.out.println("Elapsed time since start of exercise: " + elapsedTime);


  }

}