package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        int i,j,c=0;
	        for(i=1;i<=4;i++)
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
