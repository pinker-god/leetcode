package algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CircleAction {
  public boolean judgeCircle(String moves) {
    method2(moves);
    return method1(moves);
  }

  private static void method2(String moves) {
    Arrays.stream(moves.split("")).sorted().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting())).forEach((x, y) -> System.out.println(x + "->" + y));
//    Arrays.stream(moves.split(" +")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((x, y) -> System.out.println(x + "->" + y));
  }

  public static void main(String[] args) {
    method2("i love i , me you me , zhong guo");
  }

  private boolean method1(String moves) {
    char[] bytes = moves.toCharArray();
    int lr = 0, ud = 0;
    for (char c : bytes) {
      switch (c) {
        case 'R': {
          lr++;
          break;
        }
        case 'L': {
          lr--;
          break;
        }
        case 'U': {
          ud++;
          break;
        }
        case 'D': {
          ud--;
          break;
        }
        default:
      }
    }
    if (lr == 0 && ud == 0)
      return true;
    else return false;
  }
}
