// Q1. Find Duplicate Element in List of Elements , List Element are Unique or not.
// Hint: List<int> list = [1,2,3,5,1];
// TC : O(N)

void main(List<String> args) {
  // Assumption Made that the Elements contains values are less than or equal to the lenght of List
  List<int> list = [1, 2, 3, 5, 1];
  int max = 0;
  List<int> listCount = new List.filled(list.length, 0);
  for (int i = 0; i < list.length; i++) {
    listCount[list[i] - 1] = listCount[list[i] - 1] + 1;
  }
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < listCount.length; i++) {
    sb.write(listCount[i]);
    sb.write(" ");
  }
  print(sb);
  bool flag = false;
  for (int i = 0; i < listCount.length; i++) {
    if (listCount[i] > 1) {
      flag = true;
      break;
    }
  }
  if (flag) {
    print("Duplicate Founded");
  } else {
    print("Duplicate Not Founded");
  }
}
// Output
// 2 1 1 0 1 
// Duplicate Founded
