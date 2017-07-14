package bucket;

/**
 * Created by xd031 on 2017/7/14.
 */
public class BucketTransfer {
  private Bucket fromBucket;
  private Bucket toBucket;
  private int water;

  public BucketTransfer(Bucket fromBucket, Bucket toBucket) {
    this.fromBucket = fromBucket;
    this.toBucket = toBucket;
  }

  public Bucket getFromBucket() {
    return fromBucket;
  }

  public Bucket getToBucket() {
    return toBucket;
  }

  public void setWater(int water) {
    this.water = water;
  }

  public int getWater() {
    return water;
  }

  public BucketState transferState(BucketState initState, BucketTransfer transfer) {
    boolean flag = checkValid(initState, transfer);
    if (flag)
      return null;
    else {
      if (transfer.getFromBucket() == Bucket.bucket1)
        initState.setBucket1(initState.getBucket1() - transfer.getWater());
      if (transfer.getFromBucket() == Bucket.bucket2)
        initState.setBucket2(initState.getBucket2() - transfer.getWater());
      if (transfer.getFromBucket() == Bucket.bucket3)
        initState.setBucket3(initState.getBucket3() - transfer.getWater());

      if (transfer.getToBucket() == Bucket.bucket1)
        initState.setBucket1(initState.getBucket1() + transfer.getWater());
      if (transfer.getToBucket() == Bucket.bucket2)
        initState.setBucket2(initState.getBucket2() + transfer.getWater());
      if ((transfer.getToBucket() == Bucket.bucket3))
        initState.setBucket3(initState.getBucket3() + transfer.getWater());
    }
    return initState;
  }

  boolean checkValid(BucketState initState, BucketTransfer transfer) {
    //怎么重构这段代码!
    return false;
  }

  //可以设置是因为只能有两种情况,要么把from的谁全部倒掉,要么把to倒满.
  public void setWaterByTransferState(BucketState initState, BucketTransfer transfer) {
    //设置初值为把from的最大值.
    if (transfer.getFromBucket() == Bucket.bucket1)
      transfer.setWater(initState.getBucket1());
    else if (transfer.getFromBucket() == Bucket.bucket2)
      transfer.setWater(initState.getBucket2());
    else
      transfer.setWater(initState.getBucket3());
    //确保water值加过去后不会超过另一个桶的最大量.
    if (transfer.getToBucket() == Bucket.bucket2) {
      if (transfer.getWater() + initState.getBucket2() > 5)
        transfer.setWater(5 - initState.getBucket2());
    }
    if (transfer.getToBucket() == Bucket.bucket3) {
      if (transfer.getWater() + initState.getBucket3() > 3)
        transfer.setWater(3 - initState.getBucket3());
    }
  }

  @Override
  public String toString() {
    return "BucketTransfer{" +
      "fromBucket=" + fromBucket +
      ", toBucket=" + toBucket +
      ", water=" + water +
      '}';
  }
}
