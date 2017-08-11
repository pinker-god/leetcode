package Sort;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/8/11.
 */
public class SolutionTest {
  private Solution demo;

  @Before
  public void setUp() {
    demo = new Solution();
  }

  @Test
  public void merge() throws Exception {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(15, 18));
    List<Interval> list = demo.merge(intervals);
    list.forEach(System.out::println);

    List<Interval> list1 = new ArrayList<>();
    list1.add(new Interval(2, 3));
    list1.add(new Interval(4, 5));
    list1.add(new Interval(6, 7));
    list1.add(new Interval(8, 9));
    list1.add(new Interval(1, 10));
    List<Interval> list2 = demo.merge(list1);
    list2.forEach(System.out::println);
  }
}
