package old.base;

/**
 * Created by xd031 on 2017/8/15.
 */
public class TailRecursive {
  public long tailFactorial(long n,long total) {
    if (n == 1) return total;
    return tailFactorial(n - 1, n * total);
  }

  private long factorial(long n) {
    return tailFactorial(n, 1);
  }

  public static void main(String[] args) {
    System.out.println(new TailRecursive().factorial(5));
  }
}
