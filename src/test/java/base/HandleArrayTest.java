package base;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/11.
 * Arrays主要提供的方法有sort,fill,binarysearch,toString,copyOf,copyOfRange;
 *
 */
public class HandleArrayTest {


  @Test
  public void arrayFill() throws Exception {
    String[] arrs = new String[6];
    HandleArray array = new HandleArray();
    array.ArrayFill(arrs, "HS", 0, arrs.length);
    assertThat(arrs, is(new String[]{"HS", "HS", "HS", "HS", "HS", "HS"}));
    array.ArrayFill(arrs, "ys", 3, 6);
    assertThat(arrs, is(new String[]{"HS", "HS", "HS", "ys", "ys", "ys"}));
  }

  @Test
  public void arrauInsert() throws Exception {
    Integer array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
    Arrays.sort(array);
    int index = Arrays.binarySearch(array, 1);
    int newIndex = -index - 1;
    HandleArray arrays = new HandleArray();
    assertThat(newIndex, is(5));
    assertThat(arrays.ArrayInsert(array, 1, newIndex), is(new Integer[]{-9, -7, -3, -2, 0, 1, 2, 4, 5, 6, 8}));
  }

  @Test
  public void arraySort() throws Exception {
    Integer array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
    HandleArray arrays = new HandleArray();
    Integer[] arr = arrays.ArraySort(array);
    Integer arrs[] = {-9, -7, -3, -2, 0, 2, 4, 5, 6, 8};
    Assert.assertThat(arr, is(arrs));
  }
}
