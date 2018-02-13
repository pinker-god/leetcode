package old.bucket;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/14.
 */
public class BucketTransferTest {
  @Test
  public void transferState() throws Exception {
    BucketState state1 = new BucketState(3, 5, 0);
    BucketTransfer transfer1 = new BucketTransfer(Bucket.bucket1, Bucket.bucket3);
    BucketTransfer transfer = new BucketTransfer(Bucket.bucket2, Bucket.bucket3);
    transfer.setWaterByTransferState(state1, transfer);
//    transfer1.setWaterByTransferState(state1, transfer1);
    System.out.println(transfer);
    System.out.println(transfer1);
    BucketState next = transfer.transferState(state1, transfer);
    assertThat(next, is(new BucketState(3, 2, 3)));
  }

  @Test
  public void checkValid() throws Exception {
    BucketState state1 = new BucketState(3, 5, 0);
    BucketTransfer transfer1 = new BucketTransfer(Bucket.bucket1, Bucket.bucket3);
    BucketTransfer transfer2 = new BucketTransfer(Bucket.bucket1, Bucket.bucket2);
    BucketTransfer transfer3 = new BucketTransfer(Bucket.bucket2, Bucket.bucket3);
    BucketTransfer transfer4 = new BucketTransfer(Bucket.bucket2, Bucket.bucket1);
    BucketTransfer transfer5 = new BucketTransfer(Bucket.bucket3, Bucket.bucket2);
    BucketTransfer transfer6 = new BucketTransfer(Bucket.bucket3, Bucket.bucket1);
    boolean t1 = transfer1.checkValid(state1, transfer1);
    boolean t2 = transfer2.checkValid(state1, transfer2);
    boolean t3 = transfer3.checkValid(state1, transfer3);
    boolean t4 = transfer4.checkValid(state1, transfer4);
    boolean t5 = transfer5.checkValid(state1, transfer5);
    boolean t6 = transfer6.checkValid(state1, transfer6);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
    System.out.println(t5);
    System.out.println(t6);
  }

}
