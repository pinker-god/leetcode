package package1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/18.
 */
public class Solution3Test {


  private Solution3 solution;

  @Before
  public void setup() {
    solution = new Solution3();
  }

  @Test
  public void reverseWords() throws Exception {
    String input = "Let's take LeetCode contest";
    assertThat(solution.reverseWords(input), is("s'teL ekat edoCteeL tsetnoc"));
  }

  /**
   * Input:
   * nums =
   * [[1,2],
   * [3,4]]
   * r = 1, c = 4
   * Output:
   * [[1,2,3,4]]
   *
   * @throws Exception
   */
  @Test
  public void matrixReshape() throws Exception {
    int inputs[][] = new int[][]{{1, 2}, {3, 4}};
    int row = 1;
    int column = 4;
    assertThat(solution.matrixReshape(inputs, row, column), is(new int[][]{{1, 2, 3, 4}}));
  }
}
