import 'dart:io';

void main() {
  print("Hello Dart");
  int a = 100;
  int b = 200;
  int c = a + b;
  print("sum is ${a * b}");
  print("Sum is " + (a + b).toString());
  print(a.toString() + " is the value of a");
  stdout.writeln(c.toString() +
      " and " +
      a.toString()); //Same Line mai print kerts h pr new line add ker deta h
  stdout.write("Hello Chirag");
  print("\n\n");
}
