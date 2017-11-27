package algorithm;

/**
 * Created by xd031 on 2017/7/11.
 */
public class TowerOfHanoi {
  public void move(int disks, char from, char to) {
    System.out.println("the " + disks + " disks moved from " + from + " to" + to);
  }

  public void hanoi(int disk, char from, char inter, char to) {
    if (disk == 1)
      move(1, from, to);
    else {
      hanoi(disk - 1, from, to, inter);
      move(disk, from, to);
      hanoi(disk - 1, inter, from, to);
    }
  }

  public void test() {

  }
}
