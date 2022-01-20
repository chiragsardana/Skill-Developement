import 'dart:io';

void main() {
  print("Enter your name");
  String? name = stdin.readLineSync(); //null or value
  if (name != null) {
    print(name);
  }
}
