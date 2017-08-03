package divideconquer;

/**
 * Created by xd031 on 2017/8/2.
 * 主要练习分治法,要求全都用分治法来实现
 */
public class BinarySearch {
  //普通方法
  public int binarySearch(int sortedArr[], int target, int start, int end) {
    if (sortedArr.length == 0)
      return -1;
    if (start > end)
      return -1;
    int mid;
    while (start <= end) {
      mid = (start + end) / 2;
      int temp = sortedArr[mid];
      if (sortedArr[mid] == target)
        return mid;
      else if (sortedArr[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return -1;
  }

  //分治法
  public int binarySearchWithDivideConquer(int sortedArr[], int target, int start, int end) {
    if (sortedArr.length == 0)
      return -1;
    if (start > end)
      return -1;
    int mid = (end + start) / 2;
    if (sortedArr[mid] == target)
      return mid;
    else if (sortedArr[mid] > target)
      return binarySearchWithDivideConquer(sortedArr, target, start, mid - 1);
    else if (sortedArr[mid] < target)
      return binarySearchWithDivideConquer(sortedArr, target, mid + 1, end);
    return -1;
  }

  /**
   * 暴力的方法求最大子区间
   *
   * @param nums
   * @return
   */
  public int maxSubArray(int[] nums) {
    int max = 0x80000000;
    int begin = 0, end = 0;
    for (int i = 0; i < nums.length; i++) {
      int tempSum = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        tempSum += nums[j];
        if (max < tempSum) {
          begin = i;
          end = j;
          max = tempSum;
        }
      }
    }
    for (int i = begin; i < end; i++) {
      System.out.print(nums[i] + "\t");
    }
    return max;
  }


}
