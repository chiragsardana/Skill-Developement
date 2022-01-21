// 3. Palindrome String
// input : nitin
// output: Palindrome String
import 'dart:io';

void main(List<String> args) {
  print("Enter Input");
  String? input = stdin.readLineSync();
  if (input != null) {
    StringBuffer sb = new StringBuffer();
    for (int i = input.length - 1; i >= 0; i--) {
      sb.write(input[i]);
    }
    print(sb);
  } else {
    print("Input is Null");
  }
}
// Output
// Enter Input
// Chirag19CSU071
// 170USC91garihC