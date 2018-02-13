package palindrome;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/27
 */
@RunWith(Parameterized.class)
public class StringToIntegerTest {
  private StringToInteger solution;

  @Parameter
  public String input;
  @Parameter(1)
  public int output;

  public static final Object[][] test = {
    {"1230", 1230},
    {"123", 123},
    {"-321809", -321809},
    {"+", 0},
    {"-", 0},
    {"+12309", 12309},
    {"-1239", -1239},
    {"123a76", 123},
    {"12345678987654321",Integer.MAX_VALUE},
    {"-12345678987654321",Integer.MIN_VALUE}
  };

  @Parameters(name = "{index}")
  public static Iterable<Object[]> tests() {
    return Arrays.asList(test);
  }

  @Before
  public void setUp() throws Exception {
    solution = new StringToInteger();
  }

  @Test
  public void strToInt() throws Exception {
    assertThat(solution.StrToInt(input), is(output));
  }
}
