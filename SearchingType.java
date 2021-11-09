package searchingAndSorting;
import java.util.Scanner;
public class SearchingType {
Scanner sc=new Scanner(System.in);
	int getNumber,listOfNumber[],numberOfTime;
public static void main(String[] args) {
	SearchingType obj=new SearchingType();
    obj.listOfValues();
	obj.linearSearch();
	obj.binarySearch();
	}

 void listOfValues(){
	 System.out.print("enter the length of the number : ");
	listOfNumber=new int[sc.nextInt()];
	for(int i=0;i<listOfNumber.length;i++){
		listOfNumber[i]=i;
	}
}
 void linearSearch() {
	int count=0;   				//for check the number is there or not
	numberOfTime=0;				
	System.out.print("enter number to search: ");
	getNumber=sc.nextInt();
	System.out.println("----------linearSearch--------");
	for(int i=0;i<listOfNumber.length;i++){				//linearSearch: it search orderly one by one 
		numberOfTime++;
		if(getNumber==listOfNumber[i]){
		System.out.println("number is avaiable");
		break;
	}else{count++;}
	}System.out.print("number of steps: "+numberOfTime);
	if(count==listOfNumber.length){
		System.out.println("number is not avaiable");
	}System.out.println();}
/*Result
 enter number to search: 88
number is not avaiable
 */

void binarySearch(){
	System.out.println("---------binarySearch----------");
	int min =0,max=listOfNumber.length;
	numberOfTime=0;
	for(int i=0;i<listOfNumber.length;i++){
		numberOfTime++;
		int mid=(min+max)/2;
		if(listOfNumber[mid]==getNumber){
			System.out.println("number is available");
			break;}
		else if(listOfNumber[mid]>getNumber){
			max=mid-1;
		}else if(listOfNumber[mid]<getNumber){
			min=mid+1;
		}
	}System.out.println("number of steps: "+numberOfTime);
}}
/*
 RESULT:
enter the length of the number : 9999999
enter number to search: 512463
----------linearSearch----------
number is avaiable
number of steps: 512464
---------binarySearch----------
number is available
number of steps: 17
 */






