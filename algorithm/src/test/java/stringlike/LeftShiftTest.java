package stringlike;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author pinker on 2018/1/23
 */
public class LeftShiftTest {
    private LeftShift solution;

    @Before
    public void setUp() {
        solution = new LeftShift();
    }

    @Test
    public void stringShiftLeft() throws Exception {
        assertThat(solution.stringShiftLeft("abcdefg", 3), is("defgabc"));
        assertThat(solution.stringShiftLeft("abcdefg", 8), is("bcdefga"));
        assertThat(solution.stringShiftLeft("abcdefg", 14), is("abcdefg"));
    }

    @Test
    public void listRotate() throws Exception {
        Node root = new Node(1);
        Node node = new Node(2);
        root.next = node;
        node.next = new Node(3);
        node = node.next;
        node.next = new Node(4);
        node = node.next;
        node.next = new Node(5);
        node = node.next;
        node.next = new Node(6);
        assertThat(solution.listRotate(root, 2).value, is(2));
        assertThat(solution.listRotate(root, 3).value, is(3));
        assertThat(solution.listRotate(root, 4).value, is(4));
    }

    @Test
    public void listReverse() throws Exception {
        Node root = new Node(1);
        Node node = new Node(2);
        root.next = node;
        node.next = new Node(3);
        node = node.next;
        node.next = new Node(4);
        node = node.next;
        node.next = new Node(5);
        node = node.next;
        node.next = new Node(6);
        node=solution.listReverse(root, 0, 10);
        assertThat(node.value, is(6));
        node=solution.listReverse(root,2,4);
        System.out.println(node.value);
    }
}
