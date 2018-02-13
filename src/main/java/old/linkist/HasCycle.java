package old.linkist;

/**
 * 分析,
 *
 * @author pinker on 2017/11/28
 */
public class HasCycle {
  public boolean hasCycle(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head, slow = head;
    boolean hasCycle = false;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        hasCycle = true;
      }
    }
    if (!hasCycle) {
      return null;
    }
    fast = head;
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    return fast;
  }

}
