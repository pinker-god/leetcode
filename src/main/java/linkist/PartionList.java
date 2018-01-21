package linkist;

/**
 * @author pinker on 2017/11/29
 */
public class PartionList {
  public ListNode partition(ListNode head, int x) {
    ListNode node1 = new ListNode(0), node2 = new ListNode(2), p1 = node1, p2 = node2;
    while (head != null) {
      if (head.val < x) {
        p1.next = head;
        p1 = p1.next;
      } else {
        p2.next = head;
        p2 = p2.next;
      }
      head = head.next;
    }
    p2.next = null;
    p1.next = node2.next;
    return node1.next;
  }
}
