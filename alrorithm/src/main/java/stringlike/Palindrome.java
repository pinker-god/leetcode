package stringlike;

import java.util.Stack;

/**
 * @author pinker on 2018/1/27
 */
public class Palindrome {
  boolean IsPalindrome(String str) {
    char[] chs = str.toCharArray();
    int start = 0, end = chs.length - 1;
    //两个指针同时扫描.
    while (end > start && chs[start] == chs[end]) {
      start++;
      end--;
    }
    if (start == end || start - end == 1) {
      return true;
    }
    return false;
  }

  boolean IsPalindromeWIthStack(String str) {
    if (str == null || str.length() < 1) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    int len = str.length();

    for (int i = 0; i < str.length() / 2; i++) {
      stack.push(str.charAt(i));
    }
    int init = len % 2 == 0 ? str.length() / 2 : str.length() / 2 + 1;
    for (int i = init; i < str.length(); i++) {
      if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
        return false;
      }
    }
    return true;
  }
}
