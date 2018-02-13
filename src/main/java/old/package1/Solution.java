package old.package1;

import java.util.*;

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

  public int findComplement(int num) {
    char[] nums = Integer.toBinaryString(num).toCharArray();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == '1')
        nums[i] = '0';
      else if (nums[i] == '0')
        nums[i] = '1';
    }
    int level = 0;
    int result = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == '1')
        result += Math.pow(2, level);
      level++;
    }
    return result;
  }

  public String[] findWords(String[] words) {
    List<Character> list1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    List<Character> list2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    List<Character> list3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
    List<Character> temp = new ArrayList<>();
    List<String> list = new ArrayList<String>();
    for (String str : words) {
      temp.clear();
      for (int i = 0; i < str.length(); i++) {
        temp.add(str.toLowerCase().charAt(i));
      }
      if (list1.containsAll(temp))
        list.add(str);
      else if (list2.containsAll(temp))
        list.add(str);
      else if (list3.containsAll(temp))
        list.add(str);
    }
    return list.toArray(new String[0]);
  }
}
