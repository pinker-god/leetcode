package old.package1;

/**
 * Created by xd031 on 2017/7/31.
 */
public class Solution6 {
  public int[] nextGreaterElement(int[] findNums, int[] nums) {


    return new int[]{3, -1};
  }

  public boolean canWinNim(int n) {
    return n % 4 != 0;
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode temp = null;
    ListNode root = result;
    int flag = 0;
    while (l1 != null || l2 != null) {
      temp = new ListNode(0);
      int x = (l1 == null ? 0 : l1.val);
      int y = (l2 == null ? 0 : l2.val);
      int value = x + y + flag;
      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
      if (value > 9)
        flag = 1;
      else
        flag = 0;
      temp.val = value % 10;
      result.next = temp;
      result = result.next;
    }
    if (flag == 1) {
      temp = new ListNode(1);
      result.next = temp;
    }
    return root.next;
  }

  public int getMinimumDifference(TreeNode root) {
    return 0;
  }

}
