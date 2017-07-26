package package1;

import java.util.*;

/**
 * Created by xd031 on 2017/7/
 * * 1
 * /   \
 * 2     3
 * \
 * 4
 * <p>
 * Output: "1(2()(4))(3)"
 */
public class Solution5 {


  //应该用先序遍历二叉树.
  public String tree2str(TreeNode root) {
    if (root == null)
      return "";
    StringBuilder result = new StringBuilder();
    Stack<TreeNode> stacks = new Stack<>();
    stacks.add(root);
    Set<TreeNode> visited = new HashSet<>();
    TreeNode node = null;
    while (!stacks.isEmpty()) {
      node = stacks.peek();
      if (visited.contains(node)) {
        stacks.pop();
        result.append(")");
      } else {
        visited.add(node);
        result.append("(" + node.val);
        if (node.right != null)
          stacks.push(node.right);
        if (node.left != null)
          stacks.push(node.left);
        if (node.left == null && node.right != null)
          result.append("()");
      }
    }
    return result.substring(1, result.length() - 1);
  }

  public boolean isSubtree(TreeNode s, TreeNode t) {
    String tree1 = preOrder(s, true);
    String tree2 = preOrder(t, true);
    return tree1.contains(tree2);
  }

  String preOrder(TreeNode tree, boolean left) {
    if (tree == null) {
      if (left)
        return "lnull";
      else
        return "rnull";
    }
    return "#" + tree.val + preOrder(tree.left, true) + preOrder(tree.right, false);
  }

  public int findTilt(TreeNode root) {
    if (root == null)
      return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<TreeNode> temp = new LinkedList<>();
    int sum = 0;
    queue.offer(root);
    while (queue != null) {
      while (queue != null) {
        TreeNode node = queue.poll();
        int leftSum = 0;
        int rightSum = 0;
        if (node.left != null) {
          leftSum = getSum(node.left);
          temp.add(node.left);
        }
        if (node.right != null) {
          rightSum = getSum(node.right);
          temp.add(node.right);
        }
        sum += Math.abs(leftSum - rightSum);
      }
      queue = temp;
    }
    return sum;
  }

  //用栈中序遍历
  int getSum(TreeNode node) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(node);
    while (!stack.empty()) {
      TreeNode treeNode = stack.peek();
    }
    return 0;
  }

}
