package base;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xd031 on 2017/7/11.
 */
public class HandleArray {
  public <T> T[] ArraySort(T[] arr) {
    Arrays.sort(arr);
    return arr;
  }

  public <T> T[] ArrayInsert(T[] arr, T ele, int index) {
    Object[] result = new Object[arr.length + 1];
    System.arraycopy(arr, 0, result, 0, index);
    result[index] = ele;
    System.arraycopy(arr, index, result, index + 1, arr.length - index);
    return (T[]) result;
  }

  public String[] ArrayFill(String[] arr, String ele, int start, int end) {
    Arrays.fill(arr, start, end, ele);
    return arr;
  }
}
