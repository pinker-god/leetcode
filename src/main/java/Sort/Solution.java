package Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

  public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() <= 1)
      return intervals;
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    List<Interval> result = new ArrayList<>();
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;
    for (Interval interval : intervals) {
      //overlapping interval
      if (interval.start <= end)
        end = Math.max(end, interval.end);
      else {
        result.add(new Interval(start, end));
        start = interval.start;
        end = interval.end;
      }
    }
    result.add(new Interval(start, end));
    return result;
  }
}

class Interval {
  int start;
  int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String toString() {
    return "Interval{" +
      "start=" + start +
      ", end=" + end +
      '}';
  }
}
