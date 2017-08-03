package divideconquer;

/**
 * Created by xd031 on 2017/8/3.
 */
public class MaxSubArray {

  /**
   * dp算法:dp[i] = (dp[i - 1] > 0 ? dp[i - 1] : 0) + nums[i];
   * dp[0]=num[0];
   * dp[1]=max(num[1],dp[0]+num[1])
   * dp[2]=max(dp[1]+num[2],num[2])
   * ....
   * dp[n]=max(dp[n-1]+num[n],num[n])
   * 不能分成独立的小问题,分成的子问题之间有重叠.很像归纳法
   */

  public int maxSubArrayWithDP(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int max = dp[0];
    for (int i = 1; i < nums.length; i++) {
      dp[i] = (dp[i - 1] > 0 ? dp[i - 1] : 0) + nums[i];
      max = Math.max(max, dp[i]);
    }
    return max;

  /*  int max=nums[0];
    int[] state=new int[nums.length];
    state[0]=nums[0];
    for (int i = 1; i < nums.length; i++) {
      state[i]=Math.max(state[i-1]+nums[i],nums[i]);
      max=Math.max(max,state[i]);
    }
    return max;*/
  }
}
