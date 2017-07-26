package p1;

import config.Appconfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import package1.Solution1;

import static org.hamcrest.Matchers.is;

/**
 * Created by xd031 on 2017/7/10.
 */
public class Solution1Test {
  @Spy
  private Solution1 solution;


  /**
   * Input: [1,4,3,2]
   * <p>
   * Output: 4
   * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
   */
  @Test
  public void testarrayPairSum() {
    int[] arrs = {1, 4, 3, 2};
    Assert.assertThat(solution.arrayPairSum(arrs), is(4));
    Assert.assertThat(solution.arrayPairSum1(arrs), is(4));
  }
}
