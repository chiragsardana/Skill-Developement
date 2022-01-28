void main() {
  List<int> prices = [];
  prices.add(10); // At the end
  prices.insert(0, 11);
  prices.insert(0, 12);
  prices.insert(0, 13);
  // prices.remove(0);
  // prices.removeAt(1);
  // prices.removeRange(0, 1);
  prices.removeWhere((int price) => price <= 10);
  prices[0] = 100;
  print(prices.elementAt(0));
  print(prices);
  prices.forEach((int price) {
    print(price);
  });
  print(prices.contains(100) ? "Found" : "Not");
  List<int> subList = prices.sublist(1);
  print(subList);
  prices.skip(2).forEach((int price) {
    print(price);
  });
  Iterable<int> itr = prices.skip(1);
  Iterator i = itr.iterator;
  print("Using Iterator");
  while (i.moveNext()) {
    print(i.current);
  }

  print("using Iterable");
  itr.forEach((int price) {
    print(price);
  });
  String res = prices.join("=>");
  print(res);
  print("Multiplying Prices without changes");
  prices.map((int price) => price * price).forEach((int price) {
    print(price);
  });
  // Sum of Prices
  int totalSum = prices.fold(0, (int previousValue, int element) {
    print("The Previous value is $previousValue and the element is $element");
    return previousValue + element;
  });
  print("The Total SUm is $totalSum");
  // Descending
  prices.sort((int first, int second) {
    if (first > second) {
      return -1;
    } else if (second > first) {
      return 1;
    }
    return 0;
  });
  // Accending
  prices.sort((int first, int second) => first.compareTo(second));
  print(prices);
  // Accending
  List<String> listS = ["Sardana", "Boy", "Kanu"];
  listS.sort((String a, String b) => a.compareTo(b));

  print("The Sorted List of Name is : $listS");
  // Descending
  listS.sort((String a, String b) => b.compareTo(a));
  print("The Sorted List of Name is : $listS");
  print("The Prices Greator than 50 is : ");
  prices.where((int price) => price > 50).forEach((int price) {
    print(price);
  });

  print("The First Price Greator than 50 is ");
  print(prices.firstWhere((int price) => price > 10));
  // If not found it gives an error

  bool pricesGreator = prices.every((int prices) => prices >= 10);
  print("All the values are greator than or equal to 10 is: $pricesGreator");
  bool oneCondition = prices.any((int price) => price < 10);
  print("Any element satisfies condition : $oneCondition");

  // Property
  print(prices.length);
  print(prices.isEmpty);
  print(prices.reversed);
  print(prices.first);
  print(prices.last);
}
