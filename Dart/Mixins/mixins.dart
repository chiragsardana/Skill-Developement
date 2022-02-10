mixin Rectangle {
  String shape() {
    return "This is Rectangle";
  }
}
mixin Square {
  String shape() {
    return "This is Square";
  }
}
// We can use class rather than mixin
mixin Cube {
  String shape() {
    return "This is Cube";
  }
}

class Shape with Cube, Square, Rectangle {
  // This Overrides all the methods
  // String shape() {
  //   return "This is Shape.";
  // }
}

void main() {
  Shape shape = new Shape();
  print(shape.shape());
}
