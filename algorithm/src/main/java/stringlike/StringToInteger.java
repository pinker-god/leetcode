package stringlike;

/**
 * @author pinker on 2018/1/27
 */
public class StringToInteger {
  int StrToInt(String str) {
    // sign must be initialized,may be some value not contains '+', which means '+'
    int sign = 1, digit, index = 0, total = 0;
    //empty string
    if (str.length() == 0) {
      return 0;
    }
    //remove space, should not to use trim
    while (index < str.length() && str.charAt(index) == ' ') {
      index++;
    }

    //handle sign
    if (str.charAt(index) == '+' || str.charAt(index) == '-') {
      sign = str.charAt(index) == '+' ? 1 : -1;
      index++;
    }
    //convert string to number
    while (index < str.length()) {
      digit = str.charAt(index++) - '0';
      //exception
      if (digit < 0 || digit > 9) {
        break;
      }
      //avoid overflow
      if (total > Integer.MAX_VALUE / 10 || total == Integer.MAX_VALUE / 10 && digit > 7) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      total = total * 10 + digit;
    }
    return total * sign;
  }
}
