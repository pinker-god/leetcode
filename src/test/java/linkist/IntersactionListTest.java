package linkist;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author pinker on 2017/11/28
 */
public class IntersactionListTest {
  private IntersactionList solution;

  @Before
  public void setUp() {
    solution = new IntersactionList();
  }

  @Test
  public void generateParenthesis() throws Exception {
    List<String> result = solution.generateParenthesis(4);
    System.out.println(result);
  }
}

