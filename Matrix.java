package javaPratise;

import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
	Matrix call=new Matrix();
	call.total();
}

	void total() {
Scanner sc=new Scanner(System.in);
System.out.print("enter the matrix row and coloumn with space: ");
	int totalRow =sc.nextInt(),totalCol =sc.nextInt();
	int matrix[][]=new int[totalRow][totalCol];
	int total=0,total1=0;
	int col1=matrix.length-1;
	System.out.println("enter value from matrix in order of row by row with space: ");
	for(int row=0;row<matrix.length;row++) {
		int total2=0,total3=0;
		for(int col=0;col<matrix[row].length;col++) {
			matrix[row][col]=sc.nextInt();		//instilization of value into array of matrix
			if(row==col) {
				total =total+matrix[row][col];} //this for left cross triangle 1+5+9
	total2=total2+matrix[row][col];		//adding the row order
	total3=total3+matrix[col][row];		//adding the coloum order
		}
			{
			total1=total1+matrix[row][col1]; //this for right cross triangle 7+3+5 
			col1--;	
		}
			System.out.println("adding the row "+row+"     : "+total2);	
	System.out.println("adding the coloumn "+row+" : "+ total3);
	}
	transfer(matrix);
	System.out.print("left cross triangles addition matrix : "+total);
	System.out.println();
	System.out.print("right cross triangle addition matrix : "+total1);
}
void transfer(int[][] matrix) {
	System.out.println("original matrix  :  transfer matrix");
	for(int row=0;row<matrix.length;row++) {
	for(int col=0;col<matrix[row].length;col++) {
		 System.out.print(matrix[row][col] +" " );
	}System.out.print(" : ");
	for(int col=0;col<matrix[row].length;col++) {
		 System.out.print(matrix[col][row] +" " );
	}System.out.println();

	}


}}

/*
 ----------------------console input----------------------
enter the matrix row and coloumn with space: 3 3
enter value from matrix in order of row by row with space: 
1 2 3 4 5 6 7 8 9
--------------------------RESULT--------------------------
adding the row 0     : 6
adding the coloumn 0 : 1
adding the row 1     : 15
adding the coloumn 1 : 7
adding the row 2     : 24
adding the coloumn 2 : 18

original matrix  :  transfer matrix
1 2 3  : 1 4 7 
4 5 6  : 2 5 8 
7 8 9  : 3 6 9 
left cross triangles addition matrix : 15
right cross triangle addition matrix : 15

*/
