package linkist;

import java.util.Stack;

/**
 * @author pinker on 2017/11/29
 */
public class ReorderList {
  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode root, node1 = head, node2 = head;
    //查找中点
    while (node1.next != null && node1.next.next != null) {
      node2 = node2.next;
      node1 = node1.next.next;
    }
    //倒置链表
    root = node2.next;
    while (root.next != null) {
      ListNode current = root.next;
      root.next = current.next;
      current.next = node2.next;
      node2.next = current;
    }
    //输出检测一下!
    root = node2.next;
    while (root != null) {
      System.out.print(root.val + "\t");
      root = root.next;
    }
    //连接
    node1 = head;
    root = node2;
    node2 = node2.next;
    while (node1 != root) {
      root.next = node2.next;
      node2.next = node1.next;
      node1.next = node2;
      node1 = node2.next;
      node2 = root.next;
    }
  }
}
