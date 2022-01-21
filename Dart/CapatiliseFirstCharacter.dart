// 1. Enter a String
// input : heLLo HOW aRE yOU
// output : Hello How Are You

import 'dart:io';

void main(List<String> args) {
  print("Enter Input: ");
  String? input = stdin.readLineSync();
  if (input != null) {
    input = input.toLowerCase();
    List<String> list = input.split(" ");
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < list.length; i++) {
      sb.write(list[i][0].toUpperCase());
      sb.write(list[i].substring(1));
      sb.write(" ");
    }
    print("The Output String is $sb");
  } else {
    print("Input is Null");
  }
}
// Output
// Enter Input: 
// heLLo HOW aRE yOU
// The Output String is Hello How Are You 