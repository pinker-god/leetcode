package package1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by xd031 on 2017/7/26.
 */
public class TreeTravel {

  String levelTraverse(TreeNode node) {
    if (node == null)
      return "";
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<TreeNode> temp;
    queue.add(node);
    StringBuilder result = new StringBuilder();
    while (!queue.isEmpty()) {
      temp = new LinkedList<>();
      while (!queue.isEmpty()) {
        TreeNode n = queue.poll();
        visited(n, result);
        if (n.left != null)
          temp.add(n.left);
        if (n.right != null)
          temp.add(n.right);
      }
      queue = temp;
    }
    return result.toString().substring(0, result.length() - 1);
  }

  String PreOrder(TreeNode node) {
    if (node == null)
      return "";
    TreeNode temp = node;
    Stack<TreeNode> stack = new Stack<>();
    StringBuilder result = new StringBuilder();
    while (temp != null || !stack.isEmpty()) {
      while (temp != null) {
        visited(temp, result);
        stack.push(temp);
        temp = temp.left;
      }
      temp = stack.pop();
      temp = temp.right;
    }
    return result.toString().substring(0, result.length() - 1);
  }

  String InOrder(TreeNode node) {
    if (node == null)
      return "";
    TreeNode temp = node;
    Stack<TreeNode> stack = new Stack<>();
    StringBuilder result = new StringBuilder();
    while (temp != null || !stack.isEmpty()) {
      while (temp != null) {
        stack.push(temp);
        temp = temp.left;
      }
      temp = stack.pop();
      visited(temp, result);
      temp = temp.right;
    }
    return result.toString().substring(0, result.length() - 1);
  }

  String PostOrder(TreeNode node) {
    if (node == null)
      return "";
    TreeNode temp = node;
    TreeNode pre = null;
    StringBuilder reuslt = new StringBuilder();
    Stack<TreeNode> stack = new Stack<>();
    while (temp != null || !stack.isEmpty()) {
      while (temp != null) {
        stack.push(temp);
        temp = temp.left;
      }
      temp = stack.peek();
      if (temp.right == null || pre == temp.right) {
        stack.pop();
        visited(temp, reuslt);
        pre = temp;
        temp = null;
      }
      if (temp != null)
        temp = temp.right;
    }
    return reuslt.toString().substring(0, reuslt.length() - 1);
  }

  public void visited(TreeNode node, StringBuilder result) {
    result.append(node.val + ",");
  }
}
