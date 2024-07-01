package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testsumave() {
    Calculate calculate = new Calculate();
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", calculate.sumave(2, 3));
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", calculate.toave(1, 10));
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", calculate.oddto(1, 10));
  }
}
