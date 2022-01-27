import 'dart:io';

void main(List<String> args) {
  int n;
  print("Enter the Range");
  n = int.parse(stdin.readLineSync().toString());
  loop(n, evenOdd);
  loop(n, sqaure);
  loop(n, cube);
}

void loop1(int n) {
  for (int i = 1; i <= n; i++) {
    print(cube(i));
  }
}

void loop2(int n, int choice) {
  for (int i = 1; i <= n; i++) {
    if (choice == 1) {
      print(cube(i));
    }
  }
}

void loop(int n, Function fn) {
  for (int i = 1; i <= n; i++) {
    print(fn(i));
  }
}

int cube(int num) {
  return num * num * num;
}

int sqaure(int num) {
  return num * num;
}

String evenOdd(int num) {
  if (num % 2 == 0) {
    return "Even";
  }
  return "Odd";
}
