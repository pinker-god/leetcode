package old.package1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/11.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setup() {
    solution = new Solution();
  }

  @Test
  public void findWords() throws Exception {
    String[] input = new String[]{"Hello", "Alaska", "Dad", "Peace"};
    assertThat(solution.findWords(input), is(new String[]{"Alaska", "Dad"}));
  }


  @Test
  public void findComplement() throws Exception {
    Assert.assertThat(solution.findComplement(5), is(2));
    Assert.assertThat(solution.findComplement(1), is(0));
  }

}
