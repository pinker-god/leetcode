package Palindrome;

import java.util.Stack;

/**
 * @author pinker on 2018/1/29
 */
public class IntegerPalindrome {
  public boolean isPalindrome(int x) {
    if (x<0){
      return false;
    }
    if (x < 10) {
      return true;
    }
    int len = 0;
    //get len of integer 352
    while (x / (int) Math.pow(10, len) > 9) {
      len++;
    }
    int head, tail;
    while (len > 0) {
      head = x / (int) Math.pow(10, len);
      tail = x % 10;
      if (head != tail) {
        return false;
      }
      x = (x % (int) Math.pow(10, len)) / 10;
      len -= 2;
    }
    return true;
  }
}
