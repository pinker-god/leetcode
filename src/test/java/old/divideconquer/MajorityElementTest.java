package old.divideconquer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/8/3.
 */
@RunWith(Parameterized.class)
public class MajorityElementTest {
  @Parameter
  public int[] input;
  @Parameter(1)
  public int[] result;
  private MajorityElement demo;

  public static final int[][][] tests = {
    {new int[]{1, 2, 3, 4, 4, 4, 4}, new int[]{4}},
    {new int[]{1, 9, 3, 3, 4, 3, 3}, new int[]{3}},
    {new int[]{1, 1, 2, 2, 1, 1, 2, 2, 2}, new int[]{2}}
  };

  @Parameters(name = "{index}:methodTested")
  public static Iterable<Object[]> iterable() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() {
    demo = new MajorityElement();
  }

  @Test
  public void majorityElement() throws Exception {
    assertThat(demo.majorityElement(input), is(result[0]));
  }
  @Test
  public void majorityElement1() throws Exception {
    assertThat(demo.majorityElement1(input), is(result[0]));
  }
}
