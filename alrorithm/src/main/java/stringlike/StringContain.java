package stringlike;

/**
 * @author pinker on 2018/1/25
 */
public class StringContain {
  /**
   * 非常不错的一种HashTable 算法,实现了O(n)的时间复杂度,O(1)的空间复杂度
   *
   * @param str1 长字符串
   * @param str2 短字符串
   * @return str2是否全部在str1里面
   */
  boolean stringContain(String str1, String str2) {
    int hash = 0;
    String str = str1.toUpperCase();
    for (int i = 0; i < str.length(); i++) {
      hash |= (1 << (str.charAt(i) - 'A'));
    }
    str = str2.toUpperCase();
    for (int i = 0; i < str2.length(); i++) {
      if ((hash & (1 << (str.charAt(i) - 'A'))) == 0) {
        return false;
      }
    }
    return true;
  }
}
