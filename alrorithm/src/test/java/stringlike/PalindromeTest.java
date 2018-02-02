package stringlike;

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
public class PalindromeTest {
  private Palindrome solution;

  @Before
  public void setUp() throws Exception {
    solution = new Palindrome();
  }

  public static final Object[][] tests = {
    {"abcdcba", true},
    {"abcddcba", true},
    {"abcddcbae", false}
  };
  @Parameter
  public String input;
  @Parameter(1)
  public boolean output;

  @Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Test
  public void isPalindrome() throws Exception {
    assertThat(solution.IsPalindrome(input), is(output));
    assertThat(solution.IsPalindromeWIthStack(input), is(output));
  }
}
