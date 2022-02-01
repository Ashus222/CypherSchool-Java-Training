package day2;

import java.util.Scanner;

public class bikeSpeed {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int speed;
		boolean bday;
		
		System.out.println("Enter speed");
		speed = sc.nextInt();
		System.out.println("Is today your birthday: true/false ?");
		bday = sc.nextBoolean();
		
		if(bday) {
			speed = speed - 5;
		}
		
		if(speed > 80) {
			System.out.println("High Ticket raised");
		}
		else if(speed >= 60 && speed <=80) {
			System.out.println("Mid Ticket raised");
		}else {
			System.out.println("No Ticket raised");
		}
	}

}

