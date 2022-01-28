void main(List<String> args) {
  // Impersive vs Declarative
  List<int> prices = [12, 34, 5334]; //Without Tax

  // Imperative Approach
  // With Tax
  List<int> prices_with_gst = [];
  for (int i = 0; i < prices.length; i++) {
    int currentPrice = prices[i];
    int tax = (currentPrice * .18).toInt();
    int priceWithTax = currentPrice + tax;
    prices_with_gst.add(priceWithTax);
  }
  print(prices);
  print(prices_with_gst);
  // Declarative Approach
// Map - Traverse the Original Array and makes a copy of the org array and on the logic u will write it returns the new array
  List<int> priceWithGST = prices
      .map((int currentPrice) => currentPrice + (currentPrice * 0.18).toInt())
      .toList();
  print(priceWithGST);
}
