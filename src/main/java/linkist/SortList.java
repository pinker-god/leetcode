package linkist;


import java.util.Optional;

/**
 * @author pinker on 2017/11/27
 */
public class SortList {
  public void quickList(ListNode root) {

  }

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }
    //充分体会头结点的好处!
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode end = dummy;
    int i;
    for (i = 0; end.next != null; i++) {
      end = end.next;
    }
    ListNode start = dummy;
    for (int j = 0; j < i - k % i; j++) {
      start = start.next;
    }
    end.next = head;
    dummy.next = start.next;
    start.next = null;
    return dummy.next;
  }

  public ListNode[] splitListToParts(ListNode root, int k) {
//    ListNode[] node1= method1(root, k);
    ListNode cur = root;
    int N = 0;
    while (cur != null) {
      cur = cur.next;
      N++;
    }

    int width = N / k, rem = N % k;

    ListNode[] ans = new ListNode[k];
    cur = root;
    for (int i = 0; i < k; ++i) {
      ListNode head = cur;
      for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
        if (cur != null) {
          cur = cur.next;
        }
      }
      if (cur != null) {
        ListNode prev = cur;
        cur = cur.next;
        prev.next = null;
      }
      ans[i] = head;
    }
    return ans;
  }

  private ListNode[] method1(ListNode root, int k) {
    ListNode[] nodes = new ListNode[k];
    ListNode dummy = new ListNode(0);
    dummy.next = root;
    ListNode cur = dummy;
    int size = 0;
    while (cur.next != null) {
      size++;
      cur = cur.next;
    }
    System.out.println(size);
    int avg = size / k;
    int rem = size % k;
    nodes[0] = dummy.next;
    int i;
    for (i = 1; i < k; i++) {
      cur = nodes[i - 1];
      for (int j = 0; j < avg + (rem <= i ? 1 : 0) - 1; j++) {
        if (cur != null) {
          cur = cur.next;
        }
      }
      nodes[i] = Optional.ofNullable(cur).map(node -> node.next).orElse(null);
      if (cur != null) {
        cur.next = null;
      }
    }
    return nodes;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}
