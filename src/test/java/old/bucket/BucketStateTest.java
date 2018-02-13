package old.bucket;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

/**
 * Created by xd031 on 2017/7/14.
 */
public class BucketStateTest {
  /* @Test
   public void setWaterByTransferState() throws Exception {
     BucketState state1 = new BucketState(3, 5, 0);
     BucketTransfer transfer = new BucketTransfer(Bucket.bucket1, Bucket.bucket3);
     BucketTransfer transfer1 = new BucketTransfer(Bucket.bucket2, Bucket.bucket3);
     transfer.setWaterByTransferState(state1, transfer);
     transfer1.setWaterByTransferState(state1, transfer1);
     assertThat(transfer.getWater(), is(3));
     assertThat(transfer1.getWater(), is(3));
   }*/
  @Test
  public void setWaterByTransferState() throws Exception {
    BucketState state1 = new BucketState(8, 0, 0);
    BucketTransfer transfer1 = new BucketTransfer(Bucket.bucket1, Bucket.bucket3);
    BucketTransfer transfer2 = new BucketTransfer(Bucket.bucket1, Bucket.bucket2);
    BucketTransfer transfer3 = new BucketTransfer(Bucket.bucket2, Bucket.bucket3);
    BucketTransfer transfer4 = new BucketTransfer(Bucket.bucket2, Bucket.bucket1);
    BucketTransfer transfer5 = new BucketTransfer(Bucket.bucket3, Bucket.bucket2);
    BucketTransfer transfer6 = new BucketTransfer(Bucket.bucket3, Bucket.bucket1);
    transfer1.setWaterByTransferState(state1, transfer1);
    transfer2.setWaterByTransferState(state1, transfer2);
    transfer3.setWaterByTransferState(state1, transfer3);
    transfer4.setWaterByTransferState(state1, transfer4);
    transfer5.setWaterByTransferState(state1, transfer5);
    transfer6.setWaterByTransferState(state1, transfer6);
    System.out.println(transfer1.getWater());
    System.out.println(transfer2.getWater());
    System.out.println(transfer3.getWater());
    System.out.println(transfer4.getWater());
    System.out.println(transfer5.getWater());
    System.out.println(transfer6.getWater());
  }
}
