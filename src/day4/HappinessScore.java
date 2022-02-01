package day4;
import java.util.*;
public class HappinessScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter the full name");
		
		String name= sc.next().toLowerCase();
		
		for(int i=0;i<name.length();i++)
		{
			int ascii=name.charAt(i);
			sum+=ascii;
			
		}
		System.out.println(sum);
	}

		
	}
