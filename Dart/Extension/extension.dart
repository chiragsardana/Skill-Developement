void main() {
  String str = "My Name is Chirag";
  print(str.reverseWords());
}

extension ReverseWords on String {
  // Reversing the Words
  String reverseWords() {
    StringBuffer sb = new StringBuffer();
    for (int i = this.split(" ").length - 1; i >= 0; i--) {
      sb.write(this.split(" ")[i]);
      sb.write(" ");
    }
    return sb.toString();
  }
}
