package package2;

/**
 * @author pinker on 2018/1/22
 * 214. Shortest Palindrome
 */
public class ShortestPalindrome {

  public String shortestPalindrome(String s) {
    int len = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == s.charAt(len)) {
        len++;
      }
    }
    if (len==s.length()) {
      return s;
    }
    String suffix = s.substring(len);
    return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, len)) + suffix;
  }
}
