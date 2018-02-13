package old.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pinker on 2017/11/30
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false
 */
public class WordSearchTest {
  private WordSearch solution;
  char[][] input;
  String word1, word2, word3;

  @Before
  public void setUp() {
    solution = new WordSearch();
    input = new char[][]{{'A', 'B', 'C', 'D'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    word1 = "ABCCED";
    word2 = "SEE";
    word3 = "ABCB";
  }

  @Test
  public void exist() throws Exception {
    assertTrue(solution.exist(input, word1));
    assertTrue(solution.exist(input, word2));
    assertFalse(solution.exist(input, word3));
  }

}
