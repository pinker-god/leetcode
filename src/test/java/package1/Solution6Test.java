package package1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/31.
 */
@RunWith(Parameterized.class)
public class Solution6Test {

  private int[] arr1;
  private int[] arr2;
  private int[] outArr;
  private Solution6 solution;

  public Solution6Test(int[] arr1, int[] arr2, int[] outArr) {
    this.arr1 = arr1;
    this.arr2 = arr2;
    this.outArr = outArr;
  }

  private static final int[][][] samples = {
    {new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}},
    {new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}}
  };

  /**
   * 需要给别人用,所以应该为public
   *
   * @return
   */
  @Parameters
  public static Iterable<Object[]> tests() {
    return Arrays.asList(samples);
  }

  //public
  @Before
  public void setUp() {
    solution = new Solution6();
  }


  @Test
  public void addTwoNumbers() throws Exception {
    ListNode num1 = new ListNode(2);
    num1.next = new ListNode(4);
    num1.next.next = new ListNode(3);

    ListNode num2 = new ListNode(5);
    num2.next = new ListNode(6);
    num2.next.next = new ListNode(4);

    ListNode expect = new ListNode(7);
    expect.next = new ListNode(0);
    expect.next.next = new ListNode(8);

    ListNode result = solution.addTwoNumbers(num1, num2);
   /* while (result != null) {
      System.out.print(result.val + "\t");
      result = result.next;
    }*/
    while (expect != null || result != null) {
      assertThat(result.val, is(expect.val));
      expect = expect.next;
      result = result.next;
    }
  }

}
