package day2;

import java.util.Scanner;

public class CalculatorSwitch {
//Write a program to implement simple calculator using switch case
	
	 // Program to implement simple command line calculator using switch case
	 // eg : Enter 2 operands :
	 // 6 4
	 // Enter your choice:
	 // 1 : Add
	 // 2 : Subtract
	 // 3 : Multiply
	 // 4 : Divide
	 // 5 : Mod
	 // 4
	 // The quotient is 1.5
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 2 operands : ");
	 int a =sc.nextInt();
	 int b=sc.nextInt();
	 System.out.println("Enter your choice:");
	 System.out.println("1 : Add");
	 System.out.println("2 : Subtract");
	 System.out.println("3 : Multiply");
	 System.out.println("4 : Divide");
	 System.out.println("5 : Mod");
	 int choice = sc.nextInt();
	 switch (choice) {
	 case 1 : System.out.println("Sum is "+(a+b));break;
	 case 2 : System.out.println("Difference is "+(a-b));break;
	 case 3 : System.out.println("Product is "+(a*b));break;
	 case 4 : System.out.println("Quotient is "+(a/b)*1.0);break;
	 case 5 : System.out.println("Result is "+(a%b));break;
	 default : System.out.println("Invalid choice");
	 }
}
}
