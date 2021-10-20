package javaPratise;

public class NumbersProgram {
	public static void main(String[] args) {
		NumbersProgram call=new NumbersProgram();
		System.out.println("number program");
		call.try1();
		System.out.println("----------");
		call.try2();
		System.out.println("----------");
		//call.try3();
		System.out.println("----------");
		call.try4();
	
	}

		void try1() {
		for(int i=5;i>=1;--i) {
			for(int j=5;j>=i;--j) {
				System.out.print(j+" ");
			}System.out.println();
		}}
		void try2() {
			for(int i=1;i<=5;++i) {
				for(int j=1;j<=i;++j) {
					System.out.print(j+" ");
				}System.out.println();
			}}
	
		private void try4() {
		/*	int end =1;
	for(int i=1;i<=4;i++) {
		for(int j=i;j<=end;j++) {
			System.out.print(j+" ");
		}System.out.println();
		end+=2;*/							//another view
	for(int i=1;i<=5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(i+j+" ");
		}System.out.println();
	
		}	System.out.println("---------");
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i*j+" ");
		}System.out.println();
		
		
		
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
  

 */