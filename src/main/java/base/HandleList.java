package base;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;

/**
 * Created by xd031 on 2017/7/11.
 * List本身提供交集(retainAll),差集(removeAll),并集(addAll),本例的批量删除也很好!
 * 注意list由于值传递(提供了改变自身方法的特性)的原因,许多情况下可以用void来做返回值.
 * Collection提供了reverse(StringBuilder,StringBuffer),unmodifiableXXX,synchronizedXXX,
 * sort,binarySearch,copy,fill,index,indexOfSubList,rotate
 */
public class HandleList {

  public List setUnmodifiable(List list) {
    List<Integer> sublist = Arrays.asList(5, 6);
    int index = Collections.indexOfSubList(list, sublist);
    System.out.println(index);
    int lastIndex = Collections.lastIndexOfSubList(list, sublist);
    System.out.println(lastIndex);
    System.out.println(list);
    for (int i = 0; i < 3; i++) {
      Collections.rotate(list,3);
      System.out.println(list);
    }
    return Collections.unmodifiableList(list);
  }


  public List removeBatchFromList(List list, int start, int end) {
    list.subList(start, end).clear();
    return list;
  }

  //好用的栈!
  public String StringReverserThroughStack(String str) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      stack.push(str.charAt(i));
    }
    char[] chars = new char[str.length()];
    int j = 0;
    while (!stack.empty()) {
      chars[j++] = stack.pop();
    }
    return new String(chars);
  }

  public void removeRangeThroughQueue() {
    LinkedList<Integer> queue = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      queue.add(i);
    }
    System.out.println(queue);
    queue.subList(2, 5).clear();
    System.out.println(queue + "->" + queue.size());
    /*while (!queue.isEmpty())
      System.out.println(queue.poll());*/

    int len = queue.size();
    for (int i = 0; i < len; i++) {
      System.out.println(queue.poll());
    }
  }

  public static void main(String[] args) {
    new HandleList().removeRangeThroughQueue();
    List list = new HandleList().setUnmodifiable(new ArrayList<Integer>() {
      {
        for (int i = 0; i < 10; i++) {
          add(i);
        }
        add(5);
        add(6);
      }
    });
  }
}
