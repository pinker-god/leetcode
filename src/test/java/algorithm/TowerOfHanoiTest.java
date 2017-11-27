package algorithm;

import org.junit.Test;

/**
 * Created by xd031 on 2017/7/11.
 */

public class TowerOfHanoiTest {
  @Test
  public void test1() throws Exception {

  }

  @Test
  public void hanoi() throws Exception {
    TowerOfHanoi tower=new TowerOfHanoi();
    tower.hanoi(3,'A','B','C');
  }

}
