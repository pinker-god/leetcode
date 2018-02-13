package old.linkist;

import org.junit.Before;
import org.junit.Test;

/**
 * @author pinker on 2017/11/28
 */
public class ReverseListTest {
  private ReverseList solution;
  ListNode root;

  @Before
  public void setUp() {
    solution = new ReverseList();
    root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
  }

  @Test
  public void reverseKGroup() throws Exception {
    ListNode result = solution.reverseKGroup(root, 3);
    levelScan(result);
  }

  @Test
  public void reverseKGroup1() throws Exception {
    root = new ListNode(1);
//    root.next = new ListNode(2);
    ListNode result = solution.reverseKGroup(root, 2);
    levelScan(result);
  }

  void levelScan(ListNode node) {
    while (node != null) {
      System.out.print(node.val + "\t");
      node = node.next;
    }
    System.out.println();
  }

  @Test
  public void reverseKGroup2() throws Exception {
    ListNode result = solution.reverseKGroup(root, 2);
    levelScan(result);
  }
}
