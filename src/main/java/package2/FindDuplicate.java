package package2;

/**
 * @author pinker on 2018/1/21
 * 287. Find the Duplicate Number
 */
public class FindDuplicate {
  public int findDuplicate(int[] nums) {
    int fast = nums[nums[0]], slow = nums[0];
    //get fast,slow value
    while (fast!=slow) {
      fast = nums[nums[fast]];
      slow = nums[slow];
    }
    fast = nums[0];
    slow = nums[slow];
    //get crossing-node
    while (fast!=slow) {
      fast = nums[fast];
      slow = nums[slow];
    }
    return fast;
  }
}
