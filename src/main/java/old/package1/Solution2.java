package old.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by xd031 on 2017/7/17.
 */
public class Solution2 {
  public int[] twoSum(int[] nums, int target) {
    int index[] = new int[2];
    List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
    System.out.println(list);
    for (int i = 0; i < list.size(); i++) {
      int last = list.lastIndexOf(target - list.get(i));
      if (last > i) {
        index[0] = i;
        index[1] = last;
        break;
      }
    }
    return index;
  }
}
