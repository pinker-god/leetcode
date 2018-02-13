package old.linkist;

import org.junit.Before;
import org.junit.Test;

/**
 * @author pinker on 2017/11/29
 */
public class OldEvenListTest {
  private OldEvenList solution;

  @Before
  public void setUp() {
    solution = new OldEvenList();
  }

  @Test
  public void oddEvenList() throws Exception {
    ListNode root = new ListNode(1), node = root;
    node.next = new ListNode(2);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(5);
    node = node.next;
    node.next = new ListNode(6);
    node = node.next;
    node.next = new ListNode(7);
    node = node.next;
    node.next = new ListNode(8);
    node = solution.oddEvenList(root);
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
  }

}
