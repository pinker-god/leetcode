package old.package2;

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
 * @author pinker on 2018/1/21
 */
@RunWith(Parameterized.class)
public class FindDuplicateTest {
  public static final Object[][] tests = {
    {new int[]{1, 3, 4, 2, 2}, 2},
    {new int[]{1, 3, 4, 2, 1}, 1}
  };
  @Parameter
  public int[] input;
  @Parameter(1)
  public int output;

  private FindDuplicate solution;

  @Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() {
    solution = new FindDuplicate();
  }

  @Test
  public void findDuplicate() throws Exception {
    assertThat(solution.findDuplicate(input), is(output));
  }
}
