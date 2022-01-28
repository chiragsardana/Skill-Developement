void main() {
  int result = add0(1, 2);
  print(result);
  Function add1 = (int x, int y) {
    return x + y;
  };
  result = add1(2, 3);
  print(result);
  var add2 = (int x, int y) {
    return x + y;
  };
  print(add2(9, 1));
  Function add = (int x, int y) => x + y;

  final Function concate = (x, y) => x + y;
}

int add0(int x, int y) {
  return x + y;
}
