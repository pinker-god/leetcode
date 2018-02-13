package old.linkist;

import java.util.Stack;

/**
 * @author pinker on 2017/11/28
 */
public class ReverseList {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode pre = head, cur = head.next, child;
    head.next = null;
    while (cur != null) {
      child = cur.next;
      cur.next = pre;
      pre = cur;
      cur = child;
    }
    return pre;
  }

  public ListNode reverseKGroup(ListNode head, int k) {
//     method1(head, k);
//  method2(head,k);
    ListNode cur = head, tmp;
    int count = 0;
    while (cur != null && count != k) {
      count++;
      cur = cur.next;
    }
    if (count == k) {
      cur = reverseKGroup(cur, k);
      while (count-- > 0) {
        tmp = head.next;
        head.next = cur;
        cur = head;
        head = tmp;
      }
      head = cur;
    }
    return head;
  }

  private ListNode method2(ListNode head, int k) {
    ListNode curr = head;
    int count = 0;
    while (curr != null && count != k) {
      curr = curr.next;
      count++;
    }
    if (count == k) {
      curr = reverseKGroup(curr, k);
      // head - head-pointer to direct part,
      // curr - head-pointer to reversed part;
      while (count-- > 0) {
        // reverse current k-group:
        ListNode tmp = head.next;
        // tmp - next head in direct part
        head.next = curr;
        // preappending "direct" head to the reversed list
        curr = head;
        // move head of reversed part to a new node
        head = tmp;
        // move "direct" head to the next node in direct part
      }
      head = curr;
    }
    return head;
  }

  private ListNode method1(ListNode head, int k) {
    if (head == null) {
      return null;
    }
    ListNode root = new ListNode(0), node = root, start;
    Stack<ListNode> stack = new Stack<>();
    while (head != null) {
      start = head;
      for (int i = 0; i < k; i++) {
        stack.push(head);
        head = head.next;
        if (head == null) {
          break;
        }
      }
      if (stack.size() < k) {
        while (start != null) {
          node.next = start;
          start = start.next;
          node = node.next;
        }
        break;
      } else {
        while (!stack.isEmpty()) {
          node.next = stack.pop();
          node = node.next;
        }
      }
    }
    node.next = null;
    return root.next;
  }
}
