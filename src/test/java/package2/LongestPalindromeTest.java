package package2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/22
 */
@RunWith(Parameterized.class)
public class LongestPalindromeTest {
  public static final Object[][] tests = {
    {"babad", "bab"},
    {"cbbd", "bb"},
    {"aacm", "aa"},
    {"abcdcba", "abcdcba"}
  };
  @Parameter
  public String inStr;
  @Parameter(1)
  public String outStr;
  private LongestPalindrome solution;

  @Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() throws Exception {
    solution = new LongestPalindrome();
  }

  @Test
  public void longestPalindrome() throws Exception {
    assertThat(solution.longestPalindrome(inStr), is(outStr));
  }
}
