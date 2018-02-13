package old.package1;

import java.util.*;

/**
 * Created by xd031 on 2017/7/18.
 */
public class Solution3 {
  public String reverseWords(String s) {
    String[] strs = s.split(" +");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < strs.length; i++) {
      strs[i] = new StringBuilder(strs[i]).reverse().toString();
      builder.append(strs[i] + " ");
    }
    return builder.toString().trim();
  }

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    if (r * c != nums.length * nums[0].length)
      return nums;
    int[][] results = new int[r][c];
    int row = 0;
    int column = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        if (column == c) {
          column = 0;
          row++;
        }
        results[row][column++] = nums[i][j];
      }
    }
    return results;
  }

  public String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  public int distributeCandies(int[] candies) {
    int size = candies.length;
    Set<Integer> set = new HashSet() {
      {
        for (int ele : candies) {
          add(ele);
        }
      }
    };
    int nums = set.size();
    if (nums >= size / 2)
      return size / 2;
    else
      return nums;
  }

  /**
   * Fizz-three
   * Buzz -five
   * FizzBuzz-three*five
   *
   * @param n
   * @return
   */
  public List<String> fizzBuzz(int n) {
    List<String> list = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i + "");
      if (i % 3 == 0)
        list.set(i - 1, "Fizz");
      if (i % 5 == 0)
        list.set(i - 1, "Buzz");
      if (i % 15 == 0)
        list.set(i - 1, "FizzBuzz");
    }
    return list;
  }

  /**
   * @param grid
   * @return
   */
  public int islandPerimeter(int[][] grid) {
    return 1;
  }
}
