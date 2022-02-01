package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        int i,j,c=0;
	        System.out.println("Enter the string:");
	        String s=sc.next();
	        char ch[]=new char[s.length()];
	        for(i=0;i<s.length();i++)
	        {
	            ch[i]=s.charAt(i);
	        }
	        for(i=1;i<=s.length();i++)
	        {
	            for(j=0;j<i;j++)
	            {
	                System.out.print(ch[c]+" ");
	                c++;
	            }
	            System.out.println();
	            c=0;
	        }

	}

}
