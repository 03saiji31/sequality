package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public String sumave(int a, int b) {
    int sum = a + b;
    double average = sum / 2.0;
    return "Sum of " + a + " and " + b + " is " + sum + ". Average is " + average + ".";
  }

  public String toave(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    double average = sum / (double) (end - start + 1);
    return "Sum of " + start + " to " + end + " is " + sum + ". Average is " + average + ".";
  }

  public String oddto(int start, int end) {
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      } else {
        sumOdd += i;
      }
    }
    return "Sum of odd of " + start + " to " + end + " is " + sumOdd + ". Sum of even is " + sumEven + ".";
  }

}
