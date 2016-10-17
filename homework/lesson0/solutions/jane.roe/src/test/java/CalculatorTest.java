import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import jelementary.Calculator;

public class CalculatorTest {
  @Test
  public void singleNumberMakesTheResult() {
      Calculator calc = new Calculator();

      assertThat(calc.run("2"), is(2));
  }
}
