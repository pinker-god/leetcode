package p1;

import org.junit.Test;
import package1.TreeNode;

/**
 * Created by xd031 on 2017/7/9.
 */

public class SolutionTest {
    @Test
    public void testMergeTrees() {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(5);

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(3);
        tree2.left.right = new TreeNode(4);
        tree2.right.right = new TreeNode(7);

    }
}
