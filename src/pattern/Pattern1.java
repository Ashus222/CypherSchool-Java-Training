package pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
	        System.out.println("Enter the number of lines u want:");
	        int n=sc.nextInt();
	        int i,j,c=0;
	        for(i=n;i>=1;i--)
	        {
	            for(j=0;j<i;j++)
	            {
	                c++;
	                System.out.print(c+" ");
	            }
	            System.out.println();
	            c=0;
	        }

	}

}
