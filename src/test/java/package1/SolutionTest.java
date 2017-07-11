package package1;

import config.Appconfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Appconfig.class)
public class SolutionTest {
  @Autowired
  private Solution solution;

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
