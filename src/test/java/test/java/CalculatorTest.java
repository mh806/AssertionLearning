package test.java;

import main.java.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  private static Calculator cal = new Calculator();
  @Test
  public void add() {
    Assert.assertEquals(4,cal.Add(4,2));
  }

  @Test
  public void deduct() {
    Assert.assertEquals(4,cal.Deduct(4,2));
  }

  @Test
  public void multiple() {
    Assert.assertEquals(8,cal.Multiple(4,2));
  }

  @Test
  public void divide() {
    Assert.assertEquals(2,cal.Divide(4,2));
  }
}