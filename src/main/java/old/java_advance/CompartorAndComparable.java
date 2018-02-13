package old.java_advance;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pinker on 2017/11/20
 */
public class CompartorAndComparable {

  public static void main(String[] args) {
    IpKey key = new IpKey(16777216L, 16777471L);
    System.out.println(key.compareTo(16777219L));//0
    System.out.println(key.compareTo(16777216L));//0
    System.out.println(key.compareTo(16777214L));//-1
    System.out.println(key.compareTo(16777470L));//0
    System.out.println(key.compareTo(16777471L));//0
    System.out.println(key.compareTo(16777472L));//1
  }
}

@Data
@AllArgsConstructor
class IpKey implements Comparable<Long> {
  private long ipStartNum;
  private long ipEndNum;

  @Override
  public int compareTo(Long o) {
    int result;
    if (o < ipStartNum) {
      result = -1;
    } else if (o > ipEndNum) {
      result = 1;
    } else {
      result = 0;
    }
    return result;
  }
}
