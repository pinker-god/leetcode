package package1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class Solution5Test {


  @Spy
  Solution5 solution;

  /**
   * Input:
   * 1
   * /   \
   * 2     3
   * Output: 1
   *
   * @throws Exception
   */
  @Test
  public void getSum() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    assertThat(solution.getSum(root), is(6));
  }

  @Test
  public void findTilt() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    assertThat(solution.findTilt(root), is(1));
    Mockito.verify(solution).findTilt(root);
  }


  /**
   * 3
   * / \
   * 4   5
   * / \
   * 1   2
   * output
   * 4
   * / \
   * 1   2
   * <p>
   * example
   * 3
   * / \
   * 4   5
   * / \
   * 1   2
   * /
   * 0
   * <p>
   * output
   * 4
   * / \
   * 1   2
   *
   * @throws Exception
   */
  @Test
  public void isSubtree() throws Exception {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(4);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    TreeNode subRoot = new TreeNode(4);
    subRoot.left = new TreeNode(1);
    subRoot.right = new TreeNode(2);
    assertTrue(solution.isSubtree(root, subRoot));
    TreeNode root1 = root;
    root1.left.right.left = new TreeNode(0);
    TreeNode subRoot1 = subRoot;
    assertFalse(solution.isSubtree(root1, subRoot1));
    Mockito.verify(solution, Mockito.times(2)).isSubtree(Mockito.any(TreeNode.class), Mockito.any(TreeNode.class));
  }

  /**
   * 1
   * /   \
   * 2     3
   * \
   * 4
   * <p>
   * Output: "1(2()(4))(3)"
   */
  @Test
  public void tree2str() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    String expected = "1(2()(4))(3)";
    String actual = solution.tree2str(root);
    System.out.println(actual);
    assertThat(expected, is(solution.tree2str(root)));
  }

  /**
   *
   */

}
