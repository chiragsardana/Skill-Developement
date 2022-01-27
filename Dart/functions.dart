void main(List<String> args) {
  // int c = add(2, 3);
  // print(c);
  Map<String, Function> map = Math(100); // addition is local

// ! Bang is that we are giving assurity that no null value are going here
  int result = map["add"]!(1, 2);
  print("The Result is $result");
  int result1 = map["sub"]!(2, 1);
  print("The Result is $result1");
}

// Simple Way, Function Defination Style [ Top Level ]
int add(int x, int y) {
  // Scope: Library [Dart]
  return x + y;
}

// Function Return Function
List<Function> Math1() {
  int a = 10;
  Function add = (int x, int y) {
    return x + y; //Local Variables
  };
  Function sub = (int x, int y) {
    return x - y; //Local Variables
  };
  // return add; //Math is a function which return add as a function
  return [add, sub];
}

Map<String, Function> Math2() {
  int a = 10;
  Function add = (int x, int y) {
    return x + y;
  };
  Function sub = (int x, int y) {
    return x - y;
  };
  // return add; //Math is a function which return add as a function
  return {"add": add, "sub": sub};
}

// Lexical Scope
Map<String, Function> Math(int b) {
  int a = 10;
  Function add = (int x, int y) {
    return x + y + b + a;
  };
  Function sub = (int x, int y) {
    return x - y - b - a;
  };
  // return add; //Math is a function which return add as a function
  return {"add": add, "sub": sub};
}
// Entire Thing
// It is called Closure