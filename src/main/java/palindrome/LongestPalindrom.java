package palindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pinker on 12/02/2018
 */
public class LongestPalindrom {
  public int longestPalindrome(String s) {
    StringBuilder str = new StringBuilder();
    String tmp = "";
    int pos = -1;
    for (int i = 0; i < s.length(); i++) {
      System.out.println(tmp);
      pos = tmp.indexOf(s.charAt(i));
      if (pos >= 0) {
        str.append(s.charAt(i));
        tmp = tmp.substring(0, pos) + tmp.substring(pos + 1, tmp.length());
      } else {
        tmp += s.charAt(i);
      }
    }
    System.out.println("回文队列:" + str.toString() + 2*str.length());

    return (2 * str.toString().length() + (tmp.length() > 0 ? 1 : 0));
  }
}
