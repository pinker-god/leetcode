package old.bucket;

/**
 * Created by xd031 on 2017/7/14.
 */
public class BucketState {
  private int bucket1;
  private int bucket2;
  private int bucket3;

  public BucketState(int bucket1, int bucket2, int bucket3) {
    this.bucket1 = bucket1;
    this.bucket2 = bucket2;
    this.bucket3 = bucket3;
  }

  public int getBucket1() {
    return bucket1;
  }

  public void setBucket1(int bucket1) {
    this.bucket1 = bucket1;
  }

  public int getBucket2() {
    return bucket2;
  }

  public void setBucket2(int bucket2) {
    this.bucket2 = bucket2;
  }

  public int getBucket3() {
    return bucket3;
  }

  public void setBucket3(int bucket3) {
    this.bucket3 = bucket3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BucketState that = (BucketState) o;

    if (bucket1 != that.bucket1) return false;
    if (bucket2 != that.bucket2) return false;
    return bucket3 == that.bucket3;
  }

  @Override
  public int hashCode() {
    int result = bucket1;
    result = 31 * result + bucket2;
    result = 31 * result + bucket3;
    return result;
  }

  @Override
  public String toString() {
    return "BucketState{" +
      "bucket1=" + bucket1 +
      ", bucket2=" + bucket2 +
      ", bucket3=" + bucket3 +
      '}';
  }
}
