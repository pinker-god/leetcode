package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
  public int[] insertSort(int[] number) {
    int j, temp;
    for (int i = 1; i < number.length; i++) {
      temp = number[i];
      for (j = i - 1; j >= 0 && temp < number[j]; j--) {
        System.out.print(j + "->");
        System.out.println(number[j] + "->" + number[j + 1]);
        number[j + 1] = number[j];
      }
      number[j + 1] = temp;
    }
    return number;
  }

  public int[] selectSort(int[] number) {
    int min, temp;
    for (int i = 0; i < number.length - 1; i++) {
      min = number[i];
      for (int j = i; j < number.length; j++) {
        if (min > number[j]) {
          temp = number[j];
          number[j] = min;
          min = temp;
        }
      }
      number[i] = min;
    }
    return number;
  }

  /**
   * 分治法
   *
   * @param number
   * @return
   */
  public int[] quickSort(int[] number) {
    return divideConquer(number);
  }

  private int[] divideConquer(int[] number) {
    List<Integer> list = new ArrayList();
    for (int i = 0; i < number.length; i++) {
      list.add(number[i]);
    }
    quickSortWithList(list);
    int result[] = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }

  /**
   * 典型的分治法,取元素采用取中间的那个.也可以取首个.但是注意一定要把次元素从中移除!
   *
   * @param list
   * @return
   */
  private List<Integer> quickSortWithList(List<Integer> list) {
    if (list.size() <= 1)
      return list;
    int pivotIndex = (int) Math.floor(list.size() * 1.0 / 2);
    int pivot = list.remove(pivotIndex);
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < pivot)
        left.add(list.get(i));
      else
        right.add(list.get(i));
    }
    quickSortWithList(left);
    quickSortWithList(right);
    list.clear();
    list.addAll(left);
    list.add(pivot);
    list.addAll(right);
    return list;
  }

  /**
   * 思路比较简单,先分开再归并.
   * 分开依据分治法,几路归并就分几路;
   * 合并考虑两个有序队列的合并即可.
   * 感觉思路很简单,写起来老出错.尤其不要用类似这样的写法.mid++ +1
   *
   * @param num
   * @return
   */

  public int[] mergeSort(int[] num) {
    sort(num, 0, num.length - 1);
    return num;
  }

  private void sort(int[] num, int start, int end) {
    if (start >= end)
      return;
    int mid = (end + start) / 2;
    sort(num, start, mid);
    sort(num, mid + 1, end);
    merge(num, start, mid, end);
  }

  private void merge(int[] a, int left, int mid, int right) {
    int start = left;
    int r = mid + 1;
    int temp[] = new int[right - left + 1];
    int i = 0;
    while (left <= mid && r <= right) {
      if (a[left] <= a[r])
        temp[i++] = a[left++];
      else
        temp[i++] = a[r++];
    }
    while (left <= mid) {
      temp[i++] = a[left++];
    }
    while (r <= right) {
      temp[i++] = a[r++];
    }
    System.arraycopy(temp, 0, a, start, temp.length);
  }

  public void test(int[] num, int left, int right, String str) {
    left = 100;
    right = 1000;
    Arrays.sort(num);
    str = "ys";
    System.out.println(Arrays.toString(num) + "->" + left + "->" + right + "->" + str);
  }

  public static void main(String[] args) {
    Object[] num = new Object[]{1, 2, 3, 4};
    Integer[] num1 = Arrays.asList(num).toArray(new Integer[num.length]);
    Integer[] num2 = Arrays.copyOf(num, num.length, Integer[].class);
    Integer[] num3 = Arrays.asList(num).toArray(new Integer[num.length]);
    System.out.println(Arrays.toString(num1));
    System.out.println(Arrays.toString(num2));
    System.out.println(Arrays.toString(num3));
    Object[] str = new Object[]{"hs", "ys", "Zs"};
    String[] str1 = Arrays.asList(str).toArray(new String[str.length]);
    String[] str2 = Arrays.copyOf(str, str.length, String[].class);
    String[] str3 = Arrays.asList(str).toArray(new String[0]);
    System.out.println(Arrays.asList(str1));
    System.out.println(Arrays.asList(str2));
    System.out.println(Arrays.asList(str3));


  }
}
