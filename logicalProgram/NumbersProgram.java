package javaPratise;

public class NumbersProgram {
	public static void main(String[] args) {
		NumbersProgram call=new NumbersProgram();
		System.out.println("number program");

	call.try1();
		System.out.println("----------");
	call.try2();
		System.out.println("----------");
	call.try4();
		System.out.println("----------");
	call.try5();

	
	}

		void try1() {

		for(int row=5;row>=1;--row) {
			for(int col=5;col>=row;--col) {
				System.out.print(col+" ");
			}System.out.println();
		}}
		void try2() {
			for(int row=1;row<=5;++row) {
				for(int col=1;col<=row;++col) {
					System.out.print(col+" ");
				}System.out.println();
			}}	

	
		private void try4() {
							
	for(int row=1;row<=5;row++) {
		for(int col=0;col<row;col++) {
			System.out.print(row+col+" ");
		}System.out.println();
	
		}	System.out.println("---------");
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(row*col+" ");
		}System.out.println();	
		}
	}
		void try5() {
		for(int row=1;row<=5;++row) {
			for(int col=1;col<=row;++col) {
				System.out.print(col+" ");
			}for(int c=1;c<=5-row;++c) {
				System.out.print("*"+" ");}
			System.out.println();
		}
		
	
			
		}
		}
		
		
/*RESULT:
number program
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
----------
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
----------

1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
---------
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 

----------
1 * * * * 
1 2 * * * 
1 2 3 * * 
1 2 3 4 * 
1 2 3 4 5 

  

 */
