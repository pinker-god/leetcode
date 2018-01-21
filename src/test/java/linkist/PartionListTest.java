package linkist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pinker on 2017/11/29
 */
public class PartionListTest {

  /**
   * Given 1->4->3->2->5->2 and x = 3,
   * return 1->2->2->4->3->5.
   *
   * @throws Exception yichang
   */
  private PartionList solution;

  @Before
  public void setUp() {
    solution = new PartionList();
  }

  @Test
  public void partition() throws Exception {
    ListNode root = new ListNode(1), node = root;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(2);
    node = node.next;
    node.next = new ListNode(5);
    node = node.next;
    node.next = new ListNode(2);
    node = solution.partition(root, 3);
    while (node != null) {
      System.out.print(node.val + "\t");
      node = node.next;
    }
    System.out.println();
  }
}
