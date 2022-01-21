void main() {
  //Might be contain null value
  int? a;
  print(a);
  print("Data Type of a is $a.runtimeType");
  print("\n");
  a = 100;
  print(a);
  print(a.runtimeType);
  print(a.runtimeType.runtimeType);
  print("\n");
  double b = 100.21;
  print(b);
  print(b.runtimeType);
  print(b.runtimeType.runtimeType);
  print(b.isFinite);
  print(b.isInfinite);
  int f = b.toInt();
  // a = int.parse(b);
  print("f is $f");
  print("\n");
  bool c = false;
  print(c);
  print(c.runtimeType);
  print("\n");
  String d = "Chirag";
  print(d);
  print(d.runtimeType);
  print("\n");
  dynamic e = 100;
  print(e);
  print(e.runtimeType);
  print("\n");
  e = "String <-- Integer";
  print(e);
  print(e.runtimeType);
}
