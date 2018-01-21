package linkist;

import org.junit.Before;
import org.junit.Test;
import scala.tools.cmd.gen.AnyVals;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2017/11/27
 */
public class SortListTest {
  @Test
  public void insertionSortList() throws Exception {
    ListNode root = new ListNode(1), node = root;
    node.next = new ListNode(2);
    node = node.next;
    node.next = new ListNode(7);
    node = node.next;
    node.next = new ListNode(9);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(10);
    node = node.next;
    node.next = new ListNode(5);
    node = node.next;
    node.next = new ListNode(6);
    node = node.next;
    node.next = new ListNode(8);
    node = solution.insertionSortList(root);
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
  }

  @Test
  public void sortList() throws Exception {
    ListNode root = new ListNode(1), node = root;
    node.next = new ListNode(2);
    node = node.next;
    node.next = new ListNode(7);
    node = node.next;
    node.next = new ListNode(9);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(4);
    node = node.next;
    node.next = new ListNode(10);
    node = node.next;
    node.next = new ListNode(5);
    node = node.next;
    node.next = new ListNode(6);
    node = node.next;
    node.next = new ListNode(8);
    node = solution.sortList(root);
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
  }

  /**
   * root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
   *
   * @throws Exception
   */
  @Test
  public void splitListToParts() throws Exception {
   /* ListNode root = new ListNode(1);
    ListNode node = root;
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
    node = node.next;
    node.next = new ListNode(9);
    node = node.next;
    node.next = new ListNode(10);
    ListNode[] nodes = solution.splitListToParts(root, 3);
    assertThat(nodes.length, is(3));
    assertThat(nodes[0].val, is(1));
    assertThat(nodes[1].val, is(5));
    assertThat(nodes[2].val, is(8));
    node = nodes[0];
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
    node = nodes[1];
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
    node = nodes[2];
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();*/
    solution.splitListToParts(null, 3);
  }

  /**
   * Given 1->2->3->4->5->NULL and k = 2,
   *
   * @throws Exception 异常
   */
  @Test
  public void rotateRight() throws Exception {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node = solution.rotateRight(node, 2);
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
    System.out.println();
  }

  private SortList solution;

  @Before
  public void setUp() {
    solution = new SortList();
  }
}
