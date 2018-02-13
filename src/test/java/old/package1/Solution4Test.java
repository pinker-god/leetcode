package old.package1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedList;
import java.util.Queue;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/20.
 * 4
 * /   \
 * 2     6
 * / \   /
 * 3   1 5
 * <p>
 * v = 1
 * <p>
 * d = 2
 * <p>
 * Output:
 * 4
 * / \
 * 1   1
 * /     \
 * 2       6
 * / \     /
 * 3   1   5
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class Solution4Test {
  @Spy
  Solution4 solution;

  @Test
  public void getElements() throws Exception {
    TreeNode root1 = new TreeNode(4);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(6);
    root1.left.left = new TreeNode(3);
    root1.left.right = new TreeNode(1);
    root1.right.left = new TreeNode(5);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root1);
    Queue<TreeNode> queues = solution.getElements(queue, 3);
    System.out.println("size:"+queues.size());
    while (queues.size() > 0)
      System.out.println(queues.poll().val);
  }


  @Test
  public void addOneRow() throws Exception {
    TreeNode root1 = new TreeNode(4);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(6);
    root1.left.left = new TreeNode(3);
    root1.left.right = new TreeNode(1);
    root1.right.left = new TreeNode(5);
    TreeNode root = solution.addOneRow(root1, 1, 2);
    assertThat(root.left.val, is(1));
    assertThat(root.right.val, is(1));
    Mockito.verify(solution).addOneRow(root1, 1, 2);
  }

}
