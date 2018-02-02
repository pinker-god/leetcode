package stringlike;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/25
 */
public class StringContainTest {
  private StringContain solution;

  @Before
  public void setUp() throws Exception {
    solution = new StringContain();
  }

  @Test
  public void stringContain() throws Exception {
    assertTrue(solution.stringContain("abcdefg", "acg"));
    assertTrue(solution.stringContain("abcdefg", "abc"));
    assertFalse(solution.stringContain("abcdefg", "acgh"));
  }
}
