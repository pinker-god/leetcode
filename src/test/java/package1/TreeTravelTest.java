package package1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/26.
 */
@RunWith(MockitoJUnitRunner.class)
public class TreeTravelTest {
  private TreeNode root;
  @Spy
  private TreeTravel travel;

  @Before
  public void initTree() {
    root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
  }

  //1,2,3,4,5,6,7
  @Test
  public void levelTraverse() throws Exception {
    assertThat(travel.levelTraverse(root), is("1,2,3,4,5,6,7"));
  }

  //1,2,4,5,3,6,7
  @Test
  public void preOrder() throws Exception {
    assertThat(travel.PreOrder(root), is("1,2,4,5,3,6,7"));
  }

  //4,2,5,1,6,3,7
  @Test
  public void inOrder() throws Exception {
    assertThat(travel.InOrder(root), is("4,2,5,1,6,3,7"));
  }

  //4,5,2,6,7,3,1
  @Test
  public void postOrder() throws Exception {
    assertThat(travel.PostOrder(root), is("4,5,2,6,7,3,1"));
  }
}
