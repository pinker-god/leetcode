package package1;

import java.util.Arrays;

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
}
