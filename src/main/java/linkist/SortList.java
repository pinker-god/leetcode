package linkist;


import java.util.List;

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
      ListNode head = new ListNode(0), write = head;
      for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
        write = write.next = new ListNode(cur.val);
        if (cur != null) {
          cur = cur.next;
        }
      }
      ans[i] = head.next;
    }
    return ans;
  }

  private ListNode[] method1(ListNode root, int k) {
    ListNode[] nodes = new ListNode[k];
    if (root == null) {
      return nodes;
    }
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
      for (int j = 0; j < avg + (i < rem ? 1 : 0); j++) {
        cur = cur.next;
      }
      nodes[i] = cur.next;
      if (nodes[i] == null) {
        return nodes;
      }
      cur.next = null;
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
