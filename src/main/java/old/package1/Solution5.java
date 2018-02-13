package old.package1;

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

  int max = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    maxDepth(root);
    return max;
  }

  public int maxDepth(TreeNode node) {
    if (node == null)
      return 0;
    max = Math.max(maxDepth(node.left) + maxDepth(node.right), max);
    return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
  }

  public static void main(String[] args) {
    //handleFor();
    //BubbleSort();
    //selectSort();
    quickSort();
  }

  public static void quickSort() {
    int arr[] = {3, 4, 6, 2, 1, 7, 9};
    System.out.println(Arrays.toString(arr));
    int low;
    int high;
    int temp;
    List visited = new ArrayList();
    for (int i = 0; i < arr.length - 1; i++) {
      low = 0;
      high = arr.length - 1;
      for (; visited.contains(low); ) {
        low++;
      }
      while (low < high) {
        while (arr[high] > arr[low]) {
          high--;
        }
        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        while (arr[low] < arr[high]) {
          low++;
        }
        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
      }
      visited.add(low);
      System.out.println(Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));
  }

  private static void selectSort() {
    int arr[] = {3, 4, 6, 2, 1, 7, 9};
    System.out.println(Arrays.toString(arr));
    int min;
    int index;
    for (int i = 0; i < arr.length; i++) {
      min = arr[i];
      index = i;
      for (int j = i; j < arr.length; j++) {
        if (min > arr[j]) {
          min = arr[j];
          index = j;
        }
      }
      arr[index] = arr[i];
      arr[i] = min;
    }
    System.out.println(Arrays.toString(arr));
  }

  private static void BubbleSort() {
    int arr[] = {3, 4, 6, 2, 1, 7, 9};
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length - 1; i++) {
      int temp;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.println(Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));
  }

  private static void handleFor() {
    byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7};
    int[] arrs = {1, 2, 3, 4, 5, 6, 7};

    System.out.println(Arrays.toString(bytes));
    System.out.println(Arrays.toString(arrs));
    for (int i = 0; i < bytes.length; i++)//修改值不能用增强for循环
      bytes[i] = 6;
    System.out.println(Arrays.toString(bytes));
  }
}
