package divideconquer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.ParentRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/8/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class DifferentWayComputeTest {
  public static final Object[][] tests = {
    {"2-1-1", Arrays.asList(0, 2)},
    {"2*3-4*5", Arrays.asList(-34, -14, -10, -10, 10)}
  };
  @Parameter
  public String input;
  @Parameter(1)
  public List<Integer> result;
  private DifferentWayCompute demo;

  @Before
  public void setUp() {
    demo = new DifferentWayCompute();
  }

  @Test
  public void diffWaysToCompute() throws Exception {
  }
}
