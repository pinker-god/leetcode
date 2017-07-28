package package1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by xd031 on 2017/7/28.
 */
@RunWith(Parameterized.class)
public class DivideConquerTest {

  private int[] expression;
  private int[] index;
  private int[] ele;
  private DivideConquer demo;

  public DivideConquerTest(int[] expression, int[] ele, int[] index) {
    this.expression = expression;
    this.ele = ele;
    this.index = index;
  }

  private static final int[][][] samples = {
    {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5}, new int[]{4}},
    {new int[]{1, 3, 4, 4, 5, 6, 7, 9, 9}, new int[]{3}, new int[]{1}},
    {new int[]{1, 3, 4, 5, 23, 45, 73, 79}, new int[]{73}, new int[]{6}},
  };

  @Parameterized.Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(samples);
  }

  @Before
  public void setUp() {
    demo = new DivideConquer();
  }

  @Test
  public void bianrySearch() throws Exception {
    assertThat(demo.bianrySearch(expression, ele[0], expression.length), is(index[0]));
  }

  @Test
  public void binarySearchRecursive() throws Exception {
    assertThat(demo.binarySearchRecursive(expression, ele[0], 0, expression.length - 1), is(index[0]));
  }
}
