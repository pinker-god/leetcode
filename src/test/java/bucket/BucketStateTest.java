package bucket;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by xd031 on 2017/7/14.
 */
public class BucketStateTest {
  @Test
  public void setWaterByTransferState() throws Exception {
    BucketState state1 = new BucketState(3, 5, 0);
    BucketTransfer transfer = new BucketTransfer(Bucket.bucket1, Bucket.bucket3);
    BucketTransfer transfer1 = new BucketTransfer(Bucket.bucket2, Bucket.bucket3);
    transfer.setWaterByTransferState(state1, transfer);
    transfer1.setWaterByTransferState(state1, transfer1);
    assertThat(transfer.getWater(), is(3));
    assertThat(transfer1.getWater(), is(3));

  }
}
