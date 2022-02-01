package day3;
import java.util.Scanner;

public class test1 {

		double celcius(double fah)
	    {
	        double cel=(fah-32)*5/9;
	        return cel;
	    }
	    public static void main(String[]args)throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        test1 ob = new test1();
	        
	        System.out.println("Enter the fahrenhit value");
	        
	        double fah=sc.nextFloat();
	        double c=ob.celcius(fah);
	        
	        System.out.println("The celcius is :"+" "+c);
	    }
	            
	    
	}