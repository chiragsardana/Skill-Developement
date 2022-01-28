void main() {
  Map<String, int> phoneNo = {"Chirag": 8684076590, "Sardana Ji": 70158};
  Map<String, List<int>> multiplePhoneNo = {
    "Chirag": [8684076590]
  };
  print(phoneNo);
  print(multiplePhoneNo);
  phoneNo.putIfAbsent("chirag", () => 8684076950);
  print(phoneNo);
  String result = phoneNo.containsKey("Chirag") ? "Present" : "not";
  print(result);
  phoneNo.remove("Sardana Ji");
  print(phoneNo);
  print(phoneNo["Chirag"]);
}
