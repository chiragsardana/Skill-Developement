void main(List<String> args) {
  String name = "Chirag";
  String name2 = 'Sardana';
  String message = 'Hello '
      'Chirag '
      'Sardana';
  print(message);
  // Multi Line String
  String message2 = '''
  Sardana
  Boy
  Kanu
  ''';
  print(message2);
  String message3 = "Hello \nChirag";
  print(message3.codeUnits);
  print(message3.codeUnitAt(0));
  print(message3.runtimeType);
  print(message3 is String);

  // Method and Properties in String
  int age = 10;
  String newMessage = "Age is $age";
  print(newMessage);
  print(newMessage.startsWith("Age"));
  print(newMessage.endsWith("Age"));
  print(newMessage.contains("Age"));
  print(newMessage.padLeft(100));
  print(newMessage.isEmpty);
  print(newMessage.indexOf("Age"));
  print(newMessage.substring(2, 3));
  print(newMessage.split(" "));
  print(message.trimLeft());
  print(message.runes);
}
