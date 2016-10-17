import org.junit.Test;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import jelementary.Calculator;

public class SimpleCalculatorAcceptanceTest {
  Calculator calc;

  @Before
  public void setUp() {
    calc = new Calculator();
  }

  @Test
  public void addTwoSimpleNumbers() {
      assertThat(calc.run("2+8"), is(10));
  }

  @Test
  public void subtractTwoSimpleNumbers() {
      assertThat(calc.run("10-8"), is(2));
  }
}
