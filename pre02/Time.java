import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args)
{
    int hour = 18;
    int minute = 29;
    int second = 33;

    int secInMin = 60;
    int secInHour = 60*secInMin;
    int secInDay = 24*secInHour;

    // calculate & display number of seconds since midnight
    int secSinceMid = second + minute*secInMin + hour*secInHour;

    System.out.println("Seconds since midnight: " + secSinceMid);

    // calculate and display the number of seconds remaining in the day
    int secLeftInDay = secInDay - secSinceMid;

    System.out.println("Number of seconds left in day: " + secLeftInDay);

    // calculate and display the percentage of the day that has passed
    int perOfDayPassed = (secSinceMid * 100) / secInDay;

    System.out.println("Percentage of day that has passed: " + perOfDayPassed + "%");

    // elapsed time since starting this exercise
    // original values: hour: 18, minute: 4, second: 10
    int prevHour = 18;
    int prevMin = 4;
    int prevSec = 10;

    int elapsedTime = (hour - prevHour)*secInHour + (minute - prevMin)*secInMin + (second - prevSec);

    System.out.println("Elapsed time since start of exercise: " + elapsedTime);


  }

}