package package2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/22
 */
@RunWith(Parameterized.class)
public class ShortestPalindromeTest {
  public static final Object[][] tests = {
    {"aacecaaa", "aaacecaaa"},
//    {"aacecabaa", ""},//prex=aabac+aace+cabaa
    {"abcd", "dcbabcd"},
    {"abbacd", "dcabbacd"}
  };

  private ShortestPalindrome solution;

  @Parameter
  public String inStr;
  @Parameter(1)
  public String outStr;


  @Parameters(name = "{index}->")
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() throws Exception {
    solution = new ShortestPalindrome();
  }

  @Test
  public void shortestPalindrome() throws Exception {
    assertThat(solution.shortestPalindrome(inStr), is(outStr));
  }

}
