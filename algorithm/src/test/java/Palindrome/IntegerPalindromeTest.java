package Palindrome;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/29
 */
public class IntegerPalindromeTest {
  private IntegerPalindrome solution = new IntegerPalindrome();

  @Test
  public void isPalindrome() throws Exception {

    assertThat(-2147483648,is(Integer.MIN_VALUE));
    assertThat(solution.isPalindrome(9999), is(true));
    assertThat(solution.isPalindrome(2147483647), is(false));
    assertThat(solution.isPalindrome(-2147483648), is(false));
    assertThat(solution.isPalindrome(123321), is(true));
    assertThat(solution.isPalindrome(1234321), is(true));
    assertThat(solution.isPalindrome(12345321), is(false));
    assertThat(solution.isPalindrome(0), is(true));
    assertThat(solution.isPalindrome(-2), is(false));
    assertThat(solution.isPalindrome(-231132), is(false));
  }
}
