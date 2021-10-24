package javaPratise;

public class PatternProgram {
public static void main(String[] args) {
	PatternProgram call= new PatternProgram();
	call.rightUpTriangle();
	call.leftUpTriangle();
	call.rightDownTriangle();
	call.leftDownTriangle();


}



private void rightUpTriangle() {
	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	 */
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
	}System.out.println();
}System.out.println("----------");
 /* 
	1 
	2 3 
	3 4 5 
	4 5 6 7 						
 */
for(int i=1;i<5;++i) {
	for(int j=0;j<i;++j) {
		System.out.print(i+j+" ");
	}System.out.println();}
System.out.println("-------------");

/*
	1 * * * * 
	1 2 * * * 
	1 2 3 * * 
	1 2 3 4 * 
	1 2 3 4 5
 */
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
	}for(int star=5-i;star>=1;--star) {
		System.out.print("*"+" ");
	}
	System.out.println();
}System.out.println("------------");}

		
private void leftUpTriangle() {
	/*
	* * * * 1 
	* * * 1 2 
	* * 1 2 3 
	* 1 2 3 4 
	1 2 3 4 5 
	 */
	 for(int i=1;i<=5;++i) {
		for(int j=5-i;j>=1;--j) {
			System.out.print("*"+" ");
		}for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}System.out.println();
	}System.out.println("---------");
	
}

private void rightDownTriangle() {
	/*
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	 */
	for(int i=5;i>=1;--i) {
		for(int j=1;j<=i;++j) {
			System.out.print(j+" ");
		}System.out.println();
	}System.out.println("---------");
	/*
	5 6 7 8 9 
	4 5 6 7 * 
	3 4 5 * * 
	2 3 * * * 
	1 * * * * 
	 */
	for(int i=5;i>=1;--i) {
		int j=0;
		for(;j<i;++j) {
			System.out.print(j+i+" ");}
		for(j=5;j>i;--j) {
			System.out.print("*"+" ");
		}System.out.println();
	}System.out.println("---------");
	}

private void leftDownTriangle() {
	/*
	5 6 7 8 9 
	* 4 5 6 7 
	* * 3 4 5 
	* * * 2 3 
	* * * * 1 
	 */
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=5-i;j++) {
			System.out.print("*"+" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print(i+j+" ");
		}System.out.println();
	}}


}
