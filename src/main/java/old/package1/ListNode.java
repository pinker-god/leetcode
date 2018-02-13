package old.package1;

/**
 * Created by xd031 on 2017/8/1.
 */
public class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ListNode listNode = (ListNode) o;

    if (val != listNode.val) return false;
    return next != null ? next.equals(listNode.next) : listNode.next == null;
  }

  @Override
  public int hashCode() {
    int result = val;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }
}
