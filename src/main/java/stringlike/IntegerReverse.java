package stringlike;

/**
 * @author pinker on 2018/1/26
 */
public class IntegerReverse {
  public int reverseInteger(int num) {
    int flag = num < 0 ? -1 : 1;
    char[] numChs = Integer.toString(Math.abs(num)).toCharArray();
    reverseString(numChs, 0, numChs.length - 1);
    return flag * Integer.parseInt(new String(numChs));
  }

  void reverseString(char[] str, int start, int end) {
    char tmp;
    while (end > start) {
      tmp = str[start];
      str[start++] = str[end];
      str[end--] = tmp;
    }
  }
}
