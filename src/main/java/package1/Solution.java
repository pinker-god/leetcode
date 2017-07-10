package package1;

import java.util.List;
import java.util.Stack;

public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        char[] num = Integer.toBinaryString(x ^ y).toCharArray();
        for (char c : num) {
            if (c == '1')
                count++;
        }
        return count;
    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        TreeNode treeNode = new TreeNode(t1.val + t2.val);
        treeNode.left = mergeTrees(t1.left, t2.left);
        treeNode.right = mergeTrees(t1.right, t2.right);
        return treeNode;
    }
}