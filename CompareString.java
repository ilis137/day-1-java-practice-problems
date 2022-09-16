//Write a program to check two strings are equal or not. 

package practiceProblem;

public class CompareString {
  static String name1 = "Iliyas";
  static String name2 = "Rahul";
  static String name3 = "Iliyas";
  static String name4 = "iliyas";

  public static void main(String[] args) {
    System.out.println(name1.equals(name2));
    System.out.println(name1.equals(name3));
    System.out.println(name1.equals(name4));
  }
}
