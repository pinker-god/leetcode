package old.divideconquer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/8/2.
 */
@RunWith(Parameterized.class)
public class BinarySearchTest {

  public static final int[][][] objects = {
    {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5}, new int[]{4}},
    {new int[]{2, 3, 4, 5, 6, 7, 8}, new int[]{5}, new int[]{3}},
    {new int[]{1}, new int[]{1}, new int[]{0}},
    {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{10}, new int[]{-1}},
    {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{-2}, new int[]{-1}},
  };

  @Parameter(0)
  public int[] sortArr;
  @Parameter(1)
  public int[] target;
  @Parameter(2)
  public int[] result;
  private BinarySearch demo;

  @Parameters(name = "{index}:binarySearchWithDivideConquer({0},{1})=={2}")
  public static Iterable<Object[]> test() {
    return Arrays.asList(objects);
  }

  @Before
  public void setUp() {
    demo = new BinarySearch();
  }

  @Test
  public void binarySearchWithDivideConquer() throws Exception {
    assertThat(demo.binarySearchWithDivideConquer(sortArr, target[0], 0, sortArr.length - 1), is(result[0]));
  }

  @Test
  public void binarySearch() throws Exception {
    assertThat(demo.binarySearch(sortArr, target[0], 0, sortArr.length - 1), is(result[0]));
  }

  /**
   * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
   * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
   *
   * @throws Exception
   */
  @Test
  public void maxSubArray() throws Exception {
    int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertThat(demo.maxSubArray(input), is(6));
  }
}
