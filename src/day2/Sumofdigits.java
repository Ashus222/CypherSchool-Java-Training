package day2;
import java.util.Scanner;
public class Sumofdigits {

	public static void main(String[] args) {
//Write a program to calculate the sum of digits of a given number.
//		Input: 467
//		Output: 17
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		
		while(num>0) {
			int r = num%10;
			sum =sum + r;
			num = num/10;
			
			
		}
		System.out.println("The sum is: "+sum);
		
		
			
		}
		
	

}
