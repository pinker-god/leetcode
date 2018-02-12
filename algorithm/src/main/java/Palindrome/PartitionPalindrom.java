package Palindrome;

import java.util.List;

/**
 * @author pinker on 12/02/2018
 */
public class PartitionPalindrom {
  public List<List<String>> partition(String s) {
    int start=0,end=s.length()-1;

    return null;
  }

 public boolean isPalindrom(String str) {
    int start = 0, end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

}
