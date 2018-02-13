package old.linkist;

import org.junit.Before;
import org.junit.Test;

/**
 * @author pinker on 2017/11/28
 */
public class DeleteListTest {
  /**
   * 1->2->3->3->4->4->5
   *
   * @throws Exception 异常
   */
  @Test
  public void deleteDuplicates1() throws Exception {
    ListNode root = new ListNode(1), node = root;
    node.next = new ListNode(2);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(5);
    node = solution.deleteDuplicates1(root);
    levelScan(node);
  }

  private DeleteList solution;

  @Before
  public void setUp() {
    solution = new DeleteList();
  }

  @Test
  public void deleteDuplicates() throws Exception {
    ListNode node = new ListNode(1);
    node.next = new ListNode(1);
    node.next.next = new ListNode(1);
    node = solution.deleteDuplicates(node);
    levelScan(node);
  }

  void levelScan(ListNode node) {
    while (node != null) {
      System.out.print(node.val + "\t");
      node = node.next;
    }
    System.out.println();
  }
}
