package old.base;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xd031 on 2017/7/11.
 * Arrays主要提供的方法有sort,fill,binarysearch,toString,copyOf,copyOfRange;
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

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));
    int[] arr= new int[]{1, 2, 3, 4, 5};
    String str = Arrays.toString(arr);
    String str2=str.substring(1,str.length()-1);
    String[] result = str2.split(", ");
    for (String str1 : result) {
      System.out.print(str1);
    }
  }
}
