package old.package2;


/**
 * @author pinker on 2018/1/22
 * 5. Longest Palindromic Substring
 */
public class LongestPalindrome {
  private int low, maxLen;

  public String longestPalindrome(String s) {
    int len = s.length();
    if (len == 1) {
      return s;
    }
    for (int i = 0; i < len; i++) {
      extendPalindrome(s, i, i);
      extendPalindrome(s, i, i + 1);
    }
    return s.substring(low, low + maxLen);
  }

  private void extendPalindrome(String s, int i, int j) {
    while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
      i--;
      j++;
    }
    if (maxLen < j - i - 1) {
      low = i + 1;
      maxLen = j - i - 1;
    }
  }
}
