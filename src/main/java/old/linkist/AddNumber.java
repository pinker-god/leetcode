package old.linkist;

import java.util.Stack;

/**
 * @author pinker on 2017/11/28
 */
public class AddNumber {
  /**
   * 尾插法!--常用!
   *
   * @param l1 链表1
   * @param l2 链表2
   * @return 返回结果
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode cur1 = l1, cur2 = l2;
    ListNode head = new ListNode(0), root = head;
    int m = 0;
    while (cur1 != null || cur2 != null) {
      m /= 10;
      if (cur1 != null) {
        m += cur1.val;
        cur1 = cur1.next;
      }
      if (cur2 != null) {
        m += cur2.val;
        cur2 = cur2.next;
      }
      head.next = new ListNode(m % 10);
      head = head.next;
    }
    if (m / 10 != 0) {
      head.next = new ListNode(m / 10);
    }
    return root.next;
  }

  public ListNode addTwoNumbersWithReverse(ListNode l1, ListNode l2) {
    Stack<Integer> stack1 = getStack(l1), stack2 = getStack(l2);
    int sum = 0;
    ListNode node = new ListNode(0);
    while (!stack1.isEmpty() || !stack2.isEmpty()) {
      if (!stack1.isEmpty()) {
        sum += stack1.pop();
      }
      if (!stack2.isEmpty()) {
        sum += stack2.pop();
      }
      node.val = sum % 10;
      ListNode head = new ListNode(sum / 10);
      head.next = node;
      node = head;
      sum /= 10;
    }
    return node.val == 0 ? node.next : node;
  }

  private Stack<Integer> getStack(ListNode l1) {
    Stack<Integer> stack = new Stack<>();
    while (l1 != null) {
      stack.push(l1.val);
      l1 = l1.next;
    }
    return stack;
  }
}
