package old.package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xd031 on 2017/7/20.
 */
public class Solution4 {
  public TreeNode addOneRow(TreeNode root, int v, int d) {
    if (d == 1) {
      TreeNode node = new TreeNode(v);
      node.left = root;
      return node;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    Queue<TreeNode> queues = getElements(queue, d);
    while (queues.size() > 0) {
      TreeNode node = queues.poll();
      TreeNode left = new TreeNode(v);
      TreeNode right = new TreeNode(v);
      left.left = node.left;
      right.right = node.right;
      node.left = left;
      node.right = right;
    }
    return root;
  }

  Queue<TreeNode> getElements(Queue<TreeNode> queue, int d) {
    Queue<TreeNode> queue1 = queue;
    if (d == 2) {
      return queue1;
    } else {
      Queue<TreeNode> q = getElements(queue1, d - 1);
      queue1 = new LinkedList<>();
      while (q.size() > 0) {
        TreeNode node = q.poll();
        if (node.left != null) queue1.add(node.left);
        if (node.right != null) queue1.add(node.right);
      }
    }
    return queue1;
  }

  public void test() {
    List<String> list = new ArrayList<>();
    List<String> list1 = list;
    list.add("1");
    System.out.println(list1);
  }

  public void test1(List<String> list) {
    List<String> list1 = list;
    list.clear();
    System.out.println(list1);
    System.out.println(list1.getClass() + "->" + list.getClass());
  }

  public void test2(TreeNode node) {
    TreeNode node1 = node;
    System.out.println(node.getClass() + "->" + node1.getClass());
    System.out.println(node == node1);
  }

  public static void main(String[] args) {
    /*new Solution4().test();
    List<String> list = new ArrayList() {
      {
        add("1");
        add("2");
        add("3");
      }
    };
    new Solution4().test1(list);*/
    new Solution4().test2(new TreeNode(1));
  }
}
