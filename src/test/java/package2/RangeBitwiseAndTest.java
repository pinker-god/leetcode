package package2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/23
 */
@RunWith(Parameterized.class)
public class RangeBitwiseAndTest {
  private RangeBitwiseAnd solution;
  @Parameter
  public int arg1;
  @Parameter(1)
  public int arg2;
  @Parameter(2)
  public int output;
  public static final Object[][] tests = {
    {5, 7, 4},
    {1, 2, 0},
    {0, 2147483647, 0}
  };

  @Parameters(name = "{index}->")
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() throws Exception {
    solution = new RangeBitwiseAnd();
  }

  @Test
  public void rangeBitwiseAnd() throws Exception {
    assertThat(solution.rangeBitwiseAnd(arg1, arg2), is(output));
  }
}
