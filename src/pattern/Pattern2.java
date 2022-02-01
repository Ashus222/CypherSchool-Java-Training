package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of lines u want:");
	        int n=sc.nextInt();
	        int i,j,k=0,o=2;
	        for(i=n;i>=1;i--)
	        {
	            for(j=0;j<i;j++)
	            {
	                if(i%2!=0)
	                {
	                System.out.print('#'+" ");
	                }
	                else
	                {
	                    System.out.print('*'+" ");
	                }
	            }
	            System.out.println();
	            
	            for(int h=0;h<k+o;h++)
	            {
	               System.out.print(" ");
	            }
	            o++;
	            k++;
	        }
	    }

}
