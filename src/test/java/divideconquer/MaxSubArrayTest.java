package divideconquer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class MaxSubArrayTest {

  public static final int[][][] paras = {
    {new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, new int[]{6}},
    {new int[]{2, 1, 3, 4, -1, 2, 1, 5, 4}, new int[]{21}},
    {new int[]{-2, -1, -3, -4, -1, 2, -1, -5, -4}, new int[]{2}},
    {new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}, new int[]{-1}},
    {new int[]{-2}, new int[]{-2}}
  };

  @Parameter
  public int[] input;
  @Parameter(1)
  public int[] result;
  private MaxSubArray demo;

  @Parameters(name = "{index}:MethodInput:{0}->Result:{1}")
  public static Iterable<Object[]> iterable() {
    return Arrays.asList(paras);
  }

  @Before
  public void setUp() {
    demo = new MaxSubArray();
  }

  @Test
  public void maxSubArrayWithDivideConquer1() throws Exception {
    assertThat(demo.maxSubArrayWithDP(input), is(result[0]));
  }

}
