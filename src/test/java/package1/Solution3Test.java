package package1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by xd031 on 2017/7/18.
 */
@RunWith(MockitoJUnitRunner.class)
public class Solution3Test {


  @Spy
  Solution3 solution;

  /*@Before
  public void setUp() {
    solution = new Solution3();
  }*/

  /**
   * [[0,1,0,0],
   * [1,1,1,0],
   * [0,1,0,0],
   * [1,1,0,0]]
   *
   * @throws Exception
   */
/*
  @Test
  public void islandPerimeter() throws Exception {
    int grid[][] = new int[][]{
      {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
    };
    int len = solution.islandPerimeter(grid);
    assertThat(len, is(16));
  }
*/

  @Test
  public void fizzBuzz() throws Exception {
    int input = 15;
    List<String> result = solution.fizzBuzz(input);
    assertThat(result, is(Arrays.asList("1",
      "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")));
    verify(solution).fizzBuzz(input);
  }

  /**
   * Input: candies = [1,1,2,2,3,3]
   * Output: 3
   *
   * @throws Exception
   */
  @Test
  public void distributeCandies() throws Exception {
    int[] cadies = new int[]{1, 1, 2, 2, 3, 3};
    int[] cadies1 = new int[]{1, 1, 2, 3};
    int result = solution.distributeCandies(cadies);
    int result1 = solution.distributeCandies(cadies1);
    assertThat(result, is(3));
    assertThat(result1, is(2));
  }

  @Test
  public void reverseString() throws Exception {
    String test = "hello";
    assertThat(solution.reverseString(test), is("olleh"));
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
