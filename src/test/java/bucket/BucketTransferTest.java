package bucket;

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
  }

}
