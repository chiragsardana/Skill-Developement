// 2. input : Hello How are You
// Output : Word Count  = 4
import 'dart:io';

void main(List<String> args) {
  print("Enter Input: ");
  String? input = stdin.readLineSync();
  if (input != null) {
    List<String> list = input.split(" ");
    print("The Number of Words is : ${list.length}");
  } else {
    print("Input is Null");
  }
}
// Output
// Enter Input: 
// heLLo HOW aRE yOU
// The Number of Words is : 4