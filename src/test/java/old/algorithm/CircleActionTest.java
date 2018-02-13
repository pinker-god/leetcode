package old.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;

/**
 * Created by xd031 on 2017/8/18.
 */

@RunWith(Parameterized.class)
public class CircleActionTest {
  public static final String[][] tests = {
    {"UD", "true"},
    {"UDD", "false"},
    {"LL", "false"},
    {"LRRL", "true"}
  };
  @Parameter
  public String input;
  @Parameter(1)
  public String result;
  private CircleAction demo;

  @Parameters(name = "test{index}:{0}==>{1}")
  public static Iterable<String[]> sample() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() {
    demo = new CircleAction();
  }

  @Test
  public void judgeCircle() throws Exception {
    Assert.assertThat(demo.judgeCircle(input), is(Boolean.parseBoolean(result)));
  }
}
