void main() {
  Set<int> set = {2, 32, 323, 3};
  set.add(23);
  var set2 = {3, 43, 455, 4}; //Type Inference
  print("The Element in the Set is: ");
  set.forEach((element) {
    print(element);
  });
  print("The set 2 is : $set2");
  Set<int> diffSet = set.difference(set2);
  print("The Set differnce is: ");
  print(diffSet);
  print("the Intersection of two set is ");
  print(set.intersection(set2));
  print("the Union of two set is ");
  print(set.union(set2));
  print("This Element is skiped");
  set.skipWhile((value) => value > 1).forEach((element) {
    print(element);
  });
  print("This Element is Take");
  set.takeWhile((value) => value > 1).forEach((element) {
    print(element);
  });
}
