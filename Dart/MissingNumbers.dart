// Q2. Find out the missing number in N Natural Numbers
// e.g List<int> list = [1,2,5,7,3,6];
// Missing Number : 4
// TC :O(N)
void main(List<String> args) {
  List<int> list = [1, 2, 5, 7, 3, 6];
  int count = 0;
  List<int> listCount = new List.filled(list.length + 1, 0);
  for (int i = 0; i < list.length; i++) {
    listCount[list[i] - 1] = listCount[list[i] - 1] + 1;
  }
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < listCount.length; i++) {
    sb.write(listCount[i]);
    sb.write(" ");
  }
  print(sb);
  for (int i = 0; i < listCount.length; i++) {
    if (listCount[i] == 0) {
      print("The Missing Number is ${i + 1}");
      break;
    }
  }
}
// Output
// 1 1 1 0 1 1 1 
// The Missing Number is 4