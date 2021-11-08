package searchingAndSorting;

import java.util.Random;
import java.util.Scanner;

public class GameUsingRandomNumber {
	int length,i;
	int unknownNumber1,myNumber1;
Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		GameUsingRandomNumber obj=new GameUsingRandomNumber();
		obj.insertInArray(obj.unknownNumber(),obj.myNumber());
		}
	
	void insertInArray(int unknownNumber,int myNumber){
		unknownNumber1=unknownNumber;
		myNumber1=myNumber;		// inserting the value for compare in compare method
		int unknownNumberArray[]=new int[length];
		int myNumberArray[]=new int[length];
		for(i=length-1;i>=0;i--){		//i start from reverse because reminder start from last number
		unknownNumberArray[i]=unknownNumber%10;
		unknownNumber =unknownNumber/10;
				myNumberArray[i]=myNumber%10;
				myNumber=myNumber/10;}
		compare(unknownNumberArray,myNumberArray);}
	
	void compare(int[] unknownNumberArray,int[] myNumberArray){			//to compare the unknown number and given my number

		for(i=0;i<length;i++){
			int count=0;
			if(unknownNumberArray[i]==myNumberArray[i]){
				System.out.print("c");
				unknownNumberArray[i]=-1;
				continue;
			}
			for(int j=0;j<length;j++){
				if(myNumberArray[i]==unknownNumberArray[j]){
					System.out.print("p");
					unknownNumberArray[j]=-1;
					break;
				}else{
					count++;
				}}if(count==length){
					System.out.print("x");}}
		System.out.println();
		if(unknownNumber1!=myNumber1){
	System.out.print("enter the number for try again: ");
	myNumber1=sc.nextInt();
	insertInArray(unknownNumber1, myNumber1);
	}else{System.out.print("victory");}
		}
	
	int unknownNumber(){
		System.out.print("enter min value range: ");
		int min=sc.nextInt();
		System.out.print("enter max value range: ");
		int max=sc.nextInt();
		int unknownNumber=new Random().ints(min, max).findFirst().getAsInt();
		length =String.valueOf(unknownNumber).length();
		return unknownNumber;
	}
	int myNumber(){
		System.out.print("enter your number: ");
		int myNumber=sc.nextInt();
		return myNumber;
	}}
/*
 RESULT:
 enter min value range: 1000
enter max value range: 9999
enter your number: 5124
pxxc
enter the number for try again: 1111
xxxx
enter the number for try again: 2222
xxxx
enter the number for try again: 3333
cxxx									    //3 is 1st place form left side
enter the number for try again: 4444
pxxx										//4 is inside the number
enter the number for try again: 5555
pxxx										//5 is inside the number
enter the number for try again: 6666
xxxx
enter the number for try again: 7777
pxxx										//7 is inside the number
enter the number for try again: 8888
xxxx
enter the number for try again: 9999
xxxx
enter the number for try again: 0000
xxxx
enter the number for try again: 3457
cpcp
enter the number for try again: 3754
cccc
victory
 */
 
				
