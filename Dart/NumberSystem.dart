// 1. Write following Functions
// These Functions are working on NumberSystem
// a) Decimal Number - Binary Conversion  1
// b) Binary Number - Decimal Conversion        1
// c) Decimal Number - Octal Conversion   2
// d) Octal number - Decimal Conversion         2
// e) Octal Number - Binary Conversion
// f) Decimal Number - Hexa Conversion    3
// g) Hexa Number - Decimal Conversion          3
// h) Hexa Number - Binary Conversion
import 'dart:math';
import 'dart:io';

void main() {
  int base = 2; //Depending upon the Conversion
  // print(decimalToBinary("10110"));
  print("""
    Welcome to Number System Program!
    There are Following Functionality in our Program,
    Starting From 
    1. Decimal Number - Binary Conversion 
    2. Binary Number - Decimal Conversion
    3. Decimal Number - Octal Conversion
    4. Octal number - Decimal Conversion
    5. Octal Number - Binary Conversion
    6. Decimal Number - Hexa Conversion
    7. Hexa Number - Decimal Conversion
    8. Hexa Number - Binary Conversion

    Now Enter the Input: 
  """);

  int num = int.parse(stdin.readLineSync().toString());
  int methodNo = -1;
  switch (num) {
    case 1:
      {
        base = 2;
        methodNo = 1;
        break;
      }
    case 2:
      {
        base = 2;
        methodNo = 2;
        break;
      }
    case 3:
      {
        base = 8;
        methodNo = 1;
        break;
      }
    case 4:
      {
        base = 8;
        methodNo = 2;
        break;
      }
    case 5:
      {
        base = 8; //Double Conversion
        methodNo = 3;
        break;
      }
    case 6:
      {
        base = 16;
        methodNo = 1;
        break;
      }
    case 7:
      {
        base = 16;
        methodNo = 2;
        break;
      }
    case 8:
      {
        base = 16; //Double Conversion
        methodNo = 3;
        break;
      }
    default:
      {
        base = -1;
        print("Wrong Input is added,");
        break;
      }
  }

  if (base == -1) {
    return;
  }
  Function numberSystem = NumberSystem(base, methodNo);
  print("Now Enter the Number for Selected Conversion");
  int value = int.parse(stdin.readLineSync().toString());
  print(numberSystem(value));
  print("The value of base is $base");
  print("The End");
}

Function NumberSystem(int base, int methodNo) {
  String decimalToAnyDependsOnBase(int num) {
    StringBuffer sb = new StringBuffer();
    sb.write("");
    while (num > 0) {
      sb.write(num % base);
      num = (num ~/ base); //~ what is the use of ~ in dart?
    }
    return toReverse(sb.toString());
  }

  String AnyBaseToDecimal(int num1) {
    String num = toReverse(num1.toString());
    int answer = 0;
    // print(num);
    for (int i = 0; i < num.length; i++) {
      answer = answer + (pow(base, i)).toInt() * int.parse(num[i]);
    }
    // print("the answer is $answer");
    return answer.toString();
  }

  String multipleConversion(int num) {
    String decimalNo = AnyBaseToDecimal(num);
    base = 2;
    return decimalToAnyDependsOnBase(int.parse(decimalNo));
  }

  if (methodNo == 1) {
    return decimalToAnyDependsOnBase;
  } else if (methodNo == 2) {
    return AnyBaseToDecimal;
  }
  return multipleConversion;
}

String toReverse(String str) {
  StringBuffer sb = new StringBuffer();
  for (int i = str.length - 1; i >= 0; i--) {
    sb.write(str[i]);
  }
  return sb.toString();
}
