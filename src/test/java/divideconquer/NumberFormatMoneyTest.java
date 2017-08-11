package divideconquer;

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
 * Created by xd031 on 2017/8/8.
 */

@RunWith(Parameterized.class)
public class NumberFormatMoneyTest {
  public static final Object[][] tests = {
    {1234567890, "1,234,567,890"},
    {14567890, "14,567,890"},
    {90, "90"}
  };
  @Parameter
  public Object number;
  @Parameter(1)
  public Object result;
  private NumberFormatMoney solution;

  @Parameters
  public static Iterable<Object> samples() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() {
    solution = new NumberFormatMoney();
  }

  @Test
  public void format() throws Exception {
    assertThat(solution.format((Integer) number), is((String) result));
  }
}
