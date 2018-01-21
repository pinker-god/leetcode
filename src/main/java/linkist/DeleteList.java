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
    ListNode cur = head.next, pre = head;
    while (cur != null) {
      if (cur.val == value) {
        pre.next = cur.next;
        cur = cur.next;
      } else {
        value = cur.val;
        pre = cur;
        cur = cur.next;
      }
    }
    return head;
  }

  public ListNode deleteDuplicates1(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode node = new ListNode(head.val), root = node, tmp;
    node.next = head;
    int value = head.val;
    while (node.next != null && node.next.next != null) {
      value = node.next.val;
      if (value == node.next.next.val) {
        tmp = node.next;
        while (tmp != null && tmp.val == value) {
          tmp = tmp.next;
        }
        node.next = tmp;
      } else {
        node = node.next;
      }
    }
    return root.next;
  }

  private ListNode deleteNodes() {
    return null;
  }
}
