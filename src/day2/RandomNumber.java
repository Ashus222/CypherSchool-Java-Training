package day2;
import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
		
		System.out.println("Computer Choice :"+computerChoice);
		
		for(int i = 1;i<=6;i++) {
		System.out.println("Guss any number of your choice b/w 0 and 20: ");
		int userChoice = sc.nextInt();
		
		if(userChoice >computerChoice) {
			System.out.println("Your guess is too long");
			

		}
		else if (userChoice<computerChoice) {
			System.out.println("Your guess is too low");
		}
		else
			System.out.println("Your guess is right !!!!!");
			break;
		}
	}

}
