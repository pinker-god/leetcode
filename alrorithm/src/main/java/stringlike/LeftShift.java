package stringlike;

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

  /**
   * 利用头指针来做链表的翻转.
   *
   * @param root  头节点
   * @param start 开始位置
   * @param end   结束位置
   * @return 返回翻转后的链表头节点
   */
  Node listReverse(Node root, int start, int end) {
    Node head = new Node(0);
    head.next = root;
    Node pre = head;
    for (int i = 0; i < start - 1; i++) {
      pre = pre.next;
    }
    Node node = pre.next;
    Node post = node.next;
    for (int i = 0; i < end - start; i++) {
      node.next = post.next;
      post.next = pre.next;
      pre.next = post;
      post = node.next;
    }
    return head.next;
  }

  public Node listRotate(Node root, int walk) {
    Node node = root;
    int len = 0;
    while (node != null) {
      len++;
      node = node.next;
    }
    root = listReverse(root, 1, walk);
    root = listReverse(root, walk + 1, len);
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
