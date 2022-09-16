// 1.4 To find the sum of command-line arguments and count the invalid integers entered.

package practiceProblem;

public class SumOfIntegers {

  public static void main(String[] args) {
    int sum = 0;
    int invalidIntegers = 0;
    for (String s : args) {
      try {
        int num = Integer.parseInt(s);
        sum += num;
      } catch (NumberFormatException e) {
        invalidIntegers++;
      }
    }

    System.out.println("the total is: "+sum);
    System.out.println("The number of invalid integers are: "+invalidIntegers);
  }

}
