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
    Queue<TreeNode> temp;
    Queue<TreeNode> queue = new LinkedList<>();
    int sum = 0;
    queue.offer(root);
    while (!queue.isEmpty()) {
      temp = new LinkedList<>();
      while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        sum += Math.abs(getSum(node.left) - getSum(node.right));
        if (node.left != null)
          temp.add(node.left);
        if (node.right != null)
          temp.add(node.right);
      }
      queue = temp;
    }
    return sum;
  }

  //用栈中序遍历
  int getSum(TreeNode node) {
    if (node == null)
      return 0;
    int sum = 0;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = node;
    while (temp != null || !stack.isEmpty()) {
      while (temp != null) {
        stack.push(temp);
        temp = temp.left;
      }
      temp = stack.pop();
      sum += temp.val;
      temp = temp.right;
    }
    return sum;
  }

}
