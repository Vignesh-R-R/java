package creater;
import java.math.*;
public class SyllabusProgram1 {
public static void main(String[] args) {
SyllabusProgram1 twoVariable =new SyllabusProgram1();
twoVariable.swappingNumber();
twoVariable.number();
twoVariable.decimalToBinary();
twoVariable.binaryToDecimal();
}

	private void binaryToDecimal() {
	
}

	private void decimalToBinary() {
int i=19;
String rem="";
while(i>0) {
	rem=rem+i%2;
i=i/2;
}System.out.print(rem);
//11001	
}

	private void number() {
	// 1 8 27 64 
	for(int i=1;i<=4;i++) {
int j=(int) Math.pow(i, 3);
		System.out.print(j+" ");
	}
	System.out.println();
	
	//another view
	for(int i=1;i<=4;i++) {
		int value = 1;
		for(int j=0;j<3;j++) {
		value=value*i;	
		}
		System.out.print(value+" ");
	}
	System.out.println();
//--------------------------------------------	
	//1 4 9 16 25 36 49 64 81 100
	for(int i=1;i<=10;i++) {
		System.out.print((int)Math.pow(i, 2)+" ");
	}
	System.out.println();
//----------------------------------------------
	// 1 4 27 256
	for(int i=1;i<=4;i++) {
		System.out.print((int)Math.pow(i, i)+"  ");
	}System.out.println();
//------------------------------------------------
	//printing only multiples of 3 or 5
	for(double i=1;i<100;i++) {
		if((int)i/5==i/5) {
			System.out.print((int)i+" ");
		}}System.out.println();
	//another view
	for(int i=1;i<100;i++) {
		if(i%5==0) {
			System.out.print(i+" ");
		}}System.out.println();
//-------------------------------------------------
	//printing 5! 4! 3! 2! 1! 
	for(int i=5;i>0;--i) {
		int factorial=1;
		for(int j=1;j<=i;j++) {
			factorial=j*factorial;
		}
		System.out.print(factorial+" ");
	}System.out.println();
//-------------------------------------------------
	//Smallest Divisor of an integer
	int value=425;
	for(int i=2;i<=value;i++) {
		if(value/i==(double)value/i) {
			System.out.print(i);
			break;
		}}System.out.println();
//------------------------------------------------
	//Greatest Common Divisor of two integers
	int []value1= {512,435};
	for(int no=0;no<2;no++) {
	for(int i=value1[no]-1;i>=0;--i) {
		if(value1[no]/i==(double)value1[no]/i) {
			System.out.print(i+"   ");
			break;
		}}}System.out.println();
	}
	
	void swappingNumber() {
//Swapping two variables without using third variable
	//idea:(convert into one and split it out)
int a=10;
int b=21;
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
//21  10
a=a*b;
b=a/b;
a=a/b;
System.out.println(a+"  "+b);
//10 21
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+"  "+b);
//21 10
}
	
}
