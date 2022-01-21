void main(List<String> args) {
  // Immutable
  String filter = "db.products.find({";
  filter += "'Location': 'Delhi'";
  filter += "})";
  print("The String is $filter");
  // Mutable Sting
  StringBuffer sb = new StringBuffer();
  sb.write("db.products.find({");
  sb.write("'Location': 'Delhi'");
  sb.write("})");
  print("The String using String Buffer is $sb.toString()");
}
