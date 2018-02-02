package algorithm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 30/01/2018
 */
@RunWith(Parameterized.class)
public class ValidPalindromeTest {

  private ValidPalindrome solution = new ValidPalindrome();
  @Parameter
  public String input;
  @Parameter(1)
  public boolean output;

  public static final Object[][] tests = {
    {".,", true},
    {"A man, a plan, a canal: Panama", true},
    {"race a car", false}
  };

  @Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Test
  public void isPalindrome() {
    assertThat(solution.isPalindrome(input), is(output));
  }
}
