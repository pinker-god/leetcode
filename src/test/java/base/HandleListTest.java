package base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/11.
 */
public class HandleListTest {
  @Test
  public void stringReverserThroughStack() throws Exception {
    String str="i love you";
    HandleList handleList=new HandleList();
    assertThat(handleList.StringReverserThroughStack(str),is("uoy evol i"));
  }

  @Test
  public void removeBatchFromList() throws Exception {
    List<Integer> list = new ArrayList();
    for (int i = 0; i < 10; i++)
      list.add(i);
    HandleList handle = new HandleList();
    List result = handle.removeBatchFromList(list, 1, 4);
    assertThat(result,is(Arrays.asList(0, 4, 5, 6, 7, 8, 9)));
  }
}
