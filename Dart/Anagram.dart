// Q3. Anagram String
// input:1 silent
// input2: listen
// Output : yes Anagram String

import 'dart:io';

void main(List<String> args) {
  String? str1 = stdin.readLineSync();
  String? str2 = stdin.readLineSync();
  if (str1?.length != str2?.length) {
    print("No Chance of Anagram");
  } else {
    List<String>? list1 = str1?.split('');

    List<String>? list2 = str2?.split('');

    list1?.sort();
    list2?.sort();
    print(list1);
    print(list2);
    bool flag = false;
    // List<int>? listCount = new List.filled(((list1?.length) ?? 0), 0);
    for (int i = 0; i < ((list1?.length) ?? 0); i++) {
      if (list1?[i] != list2?[i]) {
        flag = true;
        break;
      }
    }
    if (flag) {
      print("Not an Anagram");
    } else {
      print("Anagram");
    }
  }
}

/* 
Output
chirag
hirach
[a, c, g, h, i, r]
[a, c, h, h, i, r]
Not an Anagram


chirag
hiragc
[a, c, g, h, i, r]
[a, c, g, h, i, r]
Anagram

*/