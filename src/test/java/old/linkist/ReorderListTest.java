package old.linkist;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2017/11/29
 */
public class ReorderListTest {
  private ReorderList solution;

  @Before
  public void setUp() {
    solution = new ReorderList();
  }

  @Test
  public void reorderList() throws Exception {
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
    node = node.next;
    node.next = new ListNode(9);
    node = node.next;
    node.next = new ListNode(10);
    solution.reorderList(root);
    assertThat(root.val, is(1));
    root = root.next;
    assertThat(root.val, is(10));
    root = root.next;
    assertThat(root.val, is(2));
    root = root.next;
    assertThat(root.val, is(9));
    root = root.next;
    assertThat(root.val, is(3));
    root = root.next;
    assertThat(root.val, is(8));
    root = root.next;
    assertThat(root.val, is(4));
    root = root.next;
    assertThat(root.val, is(7));
    root = root.next;
    assertThat(root.val, is(5));
    root = root.next;
    assertThat(root.val, is(6));
  }

}
