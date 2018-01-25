package stringlike;

import java.util.LinkedList;
import java.util.List;

/**
 * @author pinker on 2018/1/23
 */
public class LeftShift {
  void StringReverse(char[] strs, int start, int end) {
    char tmp;
    while (end > start) {
      tmp = strs[start];
      strs[start++] = strs[end];
      strs[end--] = tmp;
    }
  }

  public String stringShiftLeft(String str, int m) {
    char[] strs = str.toCharArray();
    m %= str.length();
    StringReverse(strs, 0, m - 1);
    StringReverse(strs, m, str.length() - 1);
    StringReverse(strs, 0, str.length() - 1);
    return new String(strs);
  }


  Node listReverse(Node root, int start, int end) {
    if(start>end||start<1){
      return root;
    }
    List<Integer> list = new LinkedList<>();
    int walk = start;
    Node node, pre = null;
    while (walk-- > 0) {
      pre = root;
      root = root.next;
    }
    while (root != null && end-- - start > 0) {
      node = root.next;
      root.next = pre;
      pre = root;
      root = node;
    }
    root = pre;
    return root;
  }
  public Node reverseBetween(Node head, int m, int n) {
    if (head == null){ return null;}
    Node dummy = new Node(0);
    // create a dummy node to mark the head of this list
    dummy.next = head;
    Node pre = dummy;
    // make a pointer pre as a marker for the node before reversing
    for (int i = 0; i < m - 1; i++) {pre = pre.next;}

    Node start = pre.next;
    // a pointer to the beginning of a sub-list that will be reversed
    Node then = start.next;
    // a pointer to a node that will be reversed

    // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
    // dummy-> 1 -> 2 -> 3 -> 4 -> 5

    for (int i = 0; i < n - m; i++) {
      start.next = then.next;
      then.next = pre.next;
      pre.next = then;
      then = start.next;
    }

    // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
    // second rever
    //
    return dummy.next;
  }
  public Node listRotate(Node root, int walk) {
    listReverse(root, 0, walk - 1);
    listReverse(root, walk, Integer.MAX_VALUE);
    return root;
  }

}

class Node {
  int value;
  Node next;

  Node(int value) {
    this.value = value;
  }
}
