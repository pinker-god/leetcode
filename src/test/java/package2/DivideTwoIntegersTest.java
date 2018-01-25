package package2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/24
 */
@RunWith(Parameterized.class)
public class DivideTwoIntegersTest {
  private DivideTwoIntegers solution;
  @Parameter
  public int dividend;
  @Parameter(1)
  public int divisor;

  @Before
  public void setUp() throws Exception {
    solution = new DivideTwoIntegers();
  }

  @Test
  public void divide() throws Exception {
    assertThat(solution.divide(dividend, divisor), is((int) dividend / divisor));
  }

}
