package package2;

/**
 * @author pinker on 2018/1/23
 */
public class RangeBitwiseAnd {
  /**
   * 举例分析:
   * 1. 5&6&7&8
   * 0101
   * 0110
   * 0111
   * 1000
   *
   * @param m 下限
   * @param n 上限
   * @return result
   */
  public int rangeBitwiseAnd(int m, int n) {
    if (m == 0) {
      return 0;
    }
    int moveFactor = 1;
    while (m != n) {
      m >>= 1;
      n >>= 1;
      moveFactor <<= 1;
    }
    return m * moveFactor;
  }
}
