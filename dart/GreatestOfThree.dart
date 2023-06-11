import 'dart:io';

int main() {
  print("Enter three numbers: ");
  int? a = int.parse(stdin.readLineSync()!);
  int? b = int.parse(stdin.readLineSync()!);
  int? c = int.parse(stdin.readLineSync()!);
  if (a > b && a > c) {
    print('$a' "is the greatest number");
  } else if (b > a && b > c) {
    print('$b' " is the greatest number");
  } else if (a > b && a > c) {
    print('$c' ' is the greatest number');
  } else
    () {
      print("all numbers are same");
    };
  return 0;
}
