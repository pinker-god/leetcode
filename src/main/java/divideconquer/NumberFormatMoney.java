package divideconquer;

import java.util.Stack;

public class NumberFormatMoney {

  public String format(int number) {
    return formatWithRecursive(number);
  }

  private String formatWithRecursive(int number) {
    if (number < 1000)
      return number + "";
    return format(number / 1000) + "," + number % 1000;
  }

  private String formatWithStack(int number) {
    Stack stack = new Stack();
    int count = 0;
    while (number > 0) {
      stack.push(number % 10);
      count++;
      if (count % 3 == 0)
        stack.push(",");
      number = number / 10;
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append(stack.pop());
    }
    return builder.toString();
  }
}
