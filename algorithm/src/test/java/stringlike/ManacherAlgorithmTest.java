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
 * @author pinker on 13/02/2018
 */
@RunWith(Parameterized.class)
public class ManacherAlgorithmTest {
  @Parameter
  public String input;
  @Parameter(1)
  public int output;
  private ManacherAlgorithm solution;

  public static final Object[][] tests = {
    {"abcdcbafg", 7},
    {"abcdfg", 1},
    {"", 0},
    {"abcbakjhgghjk", 8},
    {"abcbaaaaaab", 8}
  };

  @Parameters
  public static final Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() throws Exception {
    solution = new ManacherAlgorithm();
  }

  @Test
  public void longestPalindrome() {
    assertThat(solution.longestPalindrome(input),is(output));
    assertThat(solution.longestPalindromeWithManacher(input),is(output));
  }
}
