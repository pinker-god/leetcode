package Palindrome;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 12/02/2018
 */
public class LongestPalindromTest {
  private LongestPalindrom solution=new LongestPalindrom();

  @Test
  public void longestPalindrome() {
//    assertThat(solution.longestPalindrome("abccccdd"), is(7));
    assertThat(solution.longestPalindrome("bb"), is(2));
  }
}
