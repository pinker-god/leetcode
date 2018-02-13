package palindrome;

/**
 * @author pinker on 30/01/2018
 */
public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    int start = 0, end = s.length() - 1;
    while (start < end) {
      while (start < s.length() && (!Character.isLetterOrDigit(s.charAt(start)))) {
        start++;
      }
      while (end > 0 && (!Character.isLetterOrDigit(s.charAt(end)))) {
        end--;
      }
      if (start == s.length()) {
        return true;
      }
      if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  boolean flag = false;

  public boolean validPalindrome(String s) {
    if (s.length() == 1 || s.length() == 0) {
      return true;
    }
    int start = -1, end = s.length();
    while (++start < --end) {
      if (s.charAt(start) != s.charAt(end)) {
        if (flag) {
          return false;
        }
        flag = true;
        return validPalindrome(s.substring(start+1,end+1))||validPalindrome(s.substring(start,end));
      }
    }
    return true;
  }
}
