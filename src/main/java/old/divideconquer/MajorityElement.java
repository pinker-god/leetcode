package old.divideconquer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xd031 on 2017/8/3.
 */
public class MajorityElement {
  /**
   * majority[0]=nums[0];
   * majority[1]=nums[1]=nums[0];
   * majority[2]=nums[1],
   *
   * @param nums
   * @return
   */
  public int majorityElement(int[] nums) {
    int majority = nums[0];
    Map<Integer, Integer> map = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      //如果不存在,先创建
      if (!map.containsKey(nums[i]))
        map.put(nums[i], 0);
      map.put(nums[i], map.get(nums[i]) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet())
      if (entry.getValue() > (nums.length / 2))
        majority = entry.getKey();
    return majority;
  }

  public int majorityElement1(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }


}
