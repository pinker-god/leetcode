package old.linkist;

/**
 * @author pinker on 2017/11/29
 */
public class OldEvenList {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode odd = head, even = head.next, node2 = even, node1 = odd;
    head = even.next;
    while (head != null && head.next != null) {
      odd.next = head;
      even.next = head.next;
      odd = odd.next;
      even = even.next;
      head = head.next.next;
    }
    even.next = null;
    if (head != null) {
      odd.next = head;
      odd = odd.next;
    }
    odd.next = node2;
    return node1;
  }
}
