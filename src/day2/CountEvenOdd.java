package day2;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		//Wap to take 4 digit number and count number of odd,even,zeros digit

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter four digit number:");
		int num = sc.nextInt();
		int temp = num;
		
		 int zero=0,even=0,odd=0;
		 
		 if(Integer.toString(num) .length() >4) {
			 
			 System.out.println("The digits are greater than 4 ");
		 }
		 else {
			while(num>0)
			{
			    int x=num%10;
			    if(x==0)
			    zero++;
			    else if(x%2==0)
			    even++;
			    else
			    odd++;
			    num=num/10;
			    
			}
			System.out.println("Zero "+zero+" Even "+even+" Odd "+odd);

			}
		 }

}
