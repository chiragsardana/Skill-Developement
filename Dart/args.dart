void main() {
  int result = add(x: 9, y: 1);
  print(result);
  print(add());
  print(add(y: 10));
  print(adder(x: 1));
}

// Optional Postitional Arguement
int add1([int x = 0, int y = 0]) {
  return x + y;
}

// Optional Name Agruement
int add({int x = 0, int y = 0}) {
  return x + y;
}

int adder({required int x, int y = 0, int z = 0, int w = 0}) {
  return x;
}
