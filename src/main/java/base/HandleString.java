package base;

/**
 * Created by xd031 on 2017/7/10.
 * String 本身提供的主要方法有indexOf,lastIndexOf,regionMatches(true)(true表示忽略大小写!)
 */
public class HandleString {
  public String reverseString(String input) {
    String reverse = new StringBuffer(input).reverse().toString();
    return reverse;
  }

  public int findStringIndex(String input, String str) {
    return input.indexOf(str);
  }

  public int findStringLastIndex(String input, String str) {
    return input.lastIndexOf(str);
  }

  public boolean matchStringRegion(String first, int offset1, String second, int offset2, int len) {
    return first.regionMatches(offset1, second, offset2, len);
  }

  public boolean matchStringRegionIngoreCase(String first, int offset1, String second, int offset2, int len) {
    return first.regionMatches(true, offset1, second, offset2, len);
  }
}

