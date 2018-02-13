/**
 * Created by xd031 on 2017/7/27.
 */
function bubleSort(arr) {
  for (var i = 0; i < arr.length; i++) {
    var temp;
    for (var j = i; j < arr.length - 1; j++) {
      if (arr[j] < arr[j + 1]) {
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
      exchange(arr[j], arr[j + 1]);
    }
  }
};
function exchange(a, b) {
  var temp;
  temp = a;
  a = b;
  b = temp;
}
