package stringlike;

import java.util.Arrays;

/**
 * @author pinker on 13/02/2018
 * 主要是用Manacher算法来实现最长回文子串的查询算法--01.05.md
 **/
public class ManacherAlgorithm {
  /**
   * method1 old case & even case
   *
   * @param s input
   * @return longest len of substring palindrome
   */
  public int longestPalindrome(String s) {
    int max = 0, tmp = 0;
    for (int i = 0; i < s.length(); i++) {
      //old case
      for (int j = 0; (i - j >= 0) && (i + j < s.length()); j++) {
        if (s.charAt(i - j) != s.charAt(i + j)) {
          break;
        }
        tmp = j * 2 + 1;
      }
      if (max < tmp) {
        max = tmp;
      }
      //even case
      for (int j = 0; i - j >= 0 && i + j + 1 < s.length(); j++) {
        if (s.charAt(i - j) != s.charAt(i + j + 1)) {
          break;
        }
        tmp = 2 * j + 2;
      }
      if (max < tmp) {
        max = tmp;
      }
    }
    return max;
  }

  public int longestPalindromeWithManacher(String s) {
    //init chars
    char[] chars = new char[2 * s.length() + 3];
    chars[0] = '$';
    for (int i = 0; i < s.length(); i++) {
      chars[2 * i + 1] = '#';
      chars[2 * i + 2] = s.charAt(i);
    }
    chars[chars.length - 2] = '#';
    chars[chars.length - 1] = '&';
    //address  radius value:1. upper-i>Radius[j=id-（i-id）=2*id-i]时：子串必然包含在内，radius[i]=radius[j]
    //                      2. upper-i<radius[j],则子串不全在内，但upper-i以内的必然对称，故取值为upper-i
    int upper = 0, id = 0;
    int[] radius = new int[chars.length];
    for (int i = 1; i < chars.length-1; i++) {
      radius[i] = upper > i ? Math.min(upper - i, radius[2 * id - i]) : 1;
      while (chars[i + radius[i]] == chars[i - radius[i]]) {
        radius[i] += 1;
      }
      if (i + radius[i] > upper) {
        upper = i + radius[i];
        id = i;
      }
    }

    // find the max value
    int max = 0;
    for (int i = 0; i < radius.length; i++) {
      max = Math.max(max, radius[i]);
    }
    return max - 1;
  }
}
