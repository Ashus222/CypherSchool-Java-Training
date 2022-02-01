package day2;

import java.util.Scanner;

public class twoDArrayNXNsum {

	public static void main(String[] args) {

		//Write a program to calculate sum of each row of M*N matrix.
		Scanner sc=new Scanner(System.in);
		 int m,n;
		 System.out.println("Enter values for m and n: ");
		 m =sc.nextInt();
		 n =sc.nextInt();
		 int[][] arr = new int[m][n];
		 int[][] sum = new int[m][1];
		 System.out.println("Enter the values :");
		 for(int i=0;i<m;i++)
		 for(int j=0;j<n;j++)
		 arr[i][j]=sc.nextInt();
		 System.out.println("The Matrix :");
		 for(int i=0;i<m;i++) {
		 for (int j = 0; j < n; j++)
		 System.out.print(arr[i][j] + "\t");
		 System.out.println();
		 }
		 for(int i=0;i<m;i++) {
		 sum[i][0] = 0;
		 for (int j = 0; j < n; j++)
		 sum[i][0] += arr[i][j];
		 }
		 //Printing output
		 System.out.println("The sum matrix :");
		 for(int i=0;i<m;i++)
		 System.out.println(sum[i][0]);
		 }

}
