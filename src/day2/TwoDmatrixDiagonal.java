package day2;

import java.util.Scanner;

public class TwoDmatrixDiagonal {

	public static void main(String[] args) {
//		Write a program to input 2D square matrix and display primary
//		diagonal
//		Input: 
//		 6 9 7
//		 4 7 8
//		 9 4 6
//		Output: 6 7 6
		
		Scanner sc = new Scanner(System.in);
		 
        int i,j,row,col,sum=0;
System.out.println("Enter the number of rows:");
row = sc.nextInt();
System.out.println("Enter the number of columns:");
col = sc.nextInt();

int[][] mat = new int[row][col];

    System.out.println("Enter the elements of the matrix") ;
    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
         mat[i][j] = sc.nextInt();
    }
}

    System.out.println("The elements of the matrix") ;
    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
       System.out.print(mat[i][j]+"\t");
    }
      System.out.println("");
}

    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
if(i==j) //this condition checks for diagonal
{
sum = sum + mat[i][j];
}
    }
}

    System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
} 
}