// Practices

import java.util.Scanner;

public class Operations {
  public static void main(String[] args) {
    int n = 10, m;
    System.out.println(n); // result: 10
    n++; // n+1
    System.out.println(n); // result: 11
    m=n--; // n-1
    System.out.println(n); // result: 9
    System.out.println(m); // result: 11
    int a = 3, b;
    b=++a; // 1+a
    System.out.println(b); // result: 4
    b=--a; // a-1
    System.out.println(b); // result: 3
    b=a+3; // a-1
    System.out.println(b); // result: 6
    // Char
    char ch = 'A';
    int num = ch;
    System.out.println(ch); // result: A
    ch++;
    System.out.println(ch); // result: B
    System.out.println(num); // result: 65
    //Operator conditional
    Scanner scan = new Scanner(System.in);
    System.out.println("input score: ");
    double number = scan.nextDouble();
    String str;
    str = (number >= 50)? "Pass":"Failed";
    System.out.println("result : "+ str);

  }


}
