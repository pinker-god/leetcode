package old.package1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/17.
 */
public class Solution2Test {
  /**
   * @throws Exception
   */
  @Test
  public void twoSum() throws Exception {
    int[] input = new int[]{2, 7, 11, 15};
    int[] input1 = new int[]{3, 2, 4};
    int[] input2 = new int[]{3, 3};
    int target = 9;
    int target1 = 6;
    Solution2 solution = new Solution2();
    assertThat(solution.twoSum(input, target), is(new int[]{0, 1}));
    assertThat(solution.twoSum(input1, target1), is(new int[]{1, 2}));
    assertThat(solution.twoSum(input2, target1), is(new int[]{0, 1}));
  }
}
