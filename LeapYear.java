//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//he LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for 
//the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is not 
//a Leap Year and 2000 is a Leap Year.

package practiceProblem;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = sc.nextInt();
    boolean leap = false;

    if (year % 4 == 0 && year >= 1582) {
      if (year % 100 == 0) {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      } else
        leap = true;
    } else
      leap = false;

    if (leap)
      System.out.println( year + "is a leap year");
    else
      System.out.println( year + "is not a leap year");

  }
}
