package old.package1;

import java.util.Arrays;

/**
 * Created by xd031 on 2017/7/28.
 */
public class DivideConquer {

  //非递归版
  int bianrySearch(int[] arr, int ele, int arrCount) {
    Arrays.sort(arr);
    int low = 0;
    int high = arrCount - 1;
    int mid = (low + high) / 2;
    while (low < high) {
      if (arr[mid] == ele)
        return mid;
      else if (arr[mid] < ele)
        low = mid + 1;
      else
        high = mid - 1;
      mid = (low + high) / 2;
    }
    return -1;
  }

  //递归版
  int binarySearchRecursive(int[] arr, int ele, int start, int end) {
    Arrays.sort(arr);
    int mid = (end + start) / 2;
    if (arr[mid] == ele)
      return mid;
    else if (arr[mid] < ele && start < end)
      return binarySearchRecursive(arr, ele, mid + 1, end);
    else if (arr[mid] > ele && start < end)
      return binarySearchRecursive(arr, ele, start, mid - 1);
    return -1;
  }

  //Arrays.equal判断数组相等!
  public static void main(String[] args) {
    int test[] = new int[]{2, 3, 5, 1, 8, 6};
    int test1[] = Arrays.copyOf(test, test.length);
//    test[0] = 100;
    System.out.println(Arrays.toString(test));
    System.out.println(Arrays.toString(test1));
    System.out.println(test == test1);
    System.out.println(Arrays.equals(test, test1));
    System.out.println(test.hashCode() + "\t" + test1.hashCode());
  }
}
