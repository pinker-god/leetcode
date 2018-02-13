package old.base;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xd031 on 2017/8/8.
 */
@RunWith(Parameterized.class)
public class SortTest {

  private int[] numbers;
  private int[] result;
  private Sort sort;

  public SortTest(int[] numbers, int[] result) {
    this.numbers = numbers;
    this.result = result;
  }

  public static final int[][][] tests = {
    {new int[]{1, 4, 6, 8, 0, 2, 5, 3, 7}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}},
    {new int[]{1}, new int[]{1}},
    {new int[]{}, new int[]{}},
    {new int[]{1, 4, 6, 8, 10, 2, 5, 3, 7}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}}
  };

  @Parameters
  public static Iterable<Object[]> samples() {
    return Arrays.asList(tests);
  }

  @Before
  public void setUp() {
    sort = new Sort();
  }

  @Test
  public void insertSort() throws Exception {
    assertThat(sort.insertSort(numbers), is(result));
  }

  @Test
  public void selectSort() throws Exception {
    assertThat(sort.selectSort(numbers), is(result));
  }

  @Test
  public void quickSort() throws Exception {
    assertThat(sort.quickSort(numbers), is(result));

  }

  @Test
  public void mergeSort() throws Exception {
    assertThat(sort.mergeSort(numbers), is(result));
  }
}
