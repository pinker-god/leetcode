package linkist;

import java.util.*;

/**
 * @author pinker on 2017/11/28
 */
public class IntersactionList {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    backtrack(list, "", 0, 0, n);
    return list;
  }

  public void backtrack(List<String> list, String str, int open, int close, int max) {

    if (str.length() == max * 2) {
      list.add(str);
      return;
    }
    if (open < max) {
      backtrack(list, str + "(", open + 1, close, max);
    }
    if (close < open) {
      backtrack(list, str + ")", open, close + 1, max);
    }
  }


  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Stack<ListNode> stack1 = new Stack<>();
    Stack<ListNode> stack2 = new Stack<>();
    while (headA != null) {
      stack1.push(headA);
      headA = headA.next;
    }
    while (headB != null) {
      stack2.push(headB);
      headB = headB.next;
    }
    ListNode root = null, node;
    while (!stack1.isEmpty() && !stack2.isEmpty()) {
      node = stack1.pop();
      if (node != stack2.pop()) {
        break;
      }
      root = node;
    }
    return root;
  }

  public ListNode swapPairs(ListNode head) {
    ListNode root = new ListNode(1), tmp, node1, node2;
    root.next = head;
    head = root;
    while (root.next != null && root.next.next != null) {
      node1 = root.next;
      node2 = node1.next;
      tmp = node2.next;
      root.next = node2;
      node2.next = node1;
      node1.next = tmp;
      root = node1;
    }
    return head.next;
  }

  public ListNode swapPairs1(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode node = head.next;
    head.next = swapPairs1(head.next.next);
    node.next = head;
    return node;
  }
}
