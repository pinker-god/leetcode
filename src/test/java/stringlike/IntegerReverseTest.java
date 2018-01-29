package stringlike;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author pinker on 2018/1/26
 */
public class IntegerReverseTest {
  private IntegerReverse solution;

  @Before
  public void setUp() throws Exception {
    solution = new IntegerReverse();
  }

  @Test
  public void reverseInteger() throws Exception {
    assertThat(solution.reverseInteger(123), is(321));
    assertThat(solution.reverseInteger(-123), is(-321));
    assertThat(solution.reverseInteger(-12300), is(-321));
  }

}
