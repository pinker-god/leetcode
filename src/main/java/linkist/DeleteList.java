package linkist;

/**
 * @author pinker on 2017/11/28
 */
public class DeleteList {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    int value = head.val;
    ListNode cur = head.next, pre = head, pro;
    while (cur != null) {
      if (cur.val == value) {
        pre.next = cur.next;
        pre = cur;
        pro = cur.next;
        cur.next = null;
        cur = pro;
      } else {
        value = cur.val;
        cur = cur.next;
      }
    }
    return head;
  }
}
