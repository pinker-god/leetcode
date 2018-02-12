package Palindrome;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import stringlike.Palindrome;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author pinker on 2018/1/27
 */
@RunWith(Parameterized.class)
public class PartitionPalindromeTest {
  private PartitionPalindrom solution;

  @Before
  public void setUp() throws Exception {
    solution = new PartitionPalindrom();
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
    assertThat(solution.isPalindrom(input), is(output));
  }
}
