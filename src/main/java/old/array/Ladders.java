package old.array;

import java.util.*;

/**
 * @author pinker on 2017/11/30
 */
public class Ladders {

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    if (!wordList.contains(beginWord) || !wordList.contains(endWord)) {
      return null;
    }
    List<Integer> diff = new ArrayList<>();
    for (int i = 0; i < beginWord.length(); i++) {
      if (beginWord.charAt(i) != endWord.charAt(i)) {
        diff.add(i);
      }
    }
    for (Integer num : diff) {
      for (int i = 97; i < 123; i++) {
        if (beginWord.charAt(num) == i) {
          continue;
        }
//        if (beginWord.replace(beginWord.charAt(num, )))
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    long[] num = new long[n];
    for (int i = 0; i < m; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int k = in.nextInt();
      for (int j = a - 1; j <= b - 1; j++) {
        num[j] += k;
      }
    }
    in.close();
    Arrays.sort(num);
    System.out.println(num[n - 1]);
  }
}
