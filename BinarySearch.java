package javaPratise;

import java.util.Scanner;

public class BinarySearch {
	static	Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	BinarySearch call=new BinarySearch();
	call.storingArrangingNo();
	
}
	void storingArrangingNo() {
	System.out.print("total number want to store  :");
	int storeNo[]=new int[sc.nextInt()];
	int order[]=new int[storeNo.length];
	System.out.print("put all number to store in list  :");
	for(int num=0;num<order.length;num++) {
		for(int check=num;check<order.length;check++) {
			if(num==0) {
				storeNo[check]=sc.nextInt();
				order[check]=storeNo[check];
		 	   }
			
			if(order[num]>order[check]) {
				int temp=order[check];
				order[check]=order[num];
				order[num]=temp;	
			binarySearching(order);	
			   }}}}
	
	
	
	
	void binarySearching(int[] order) {
		int min=0;
		int max=order.length-1;
		System.out.println(order.length);
int searchValue=0;
	int i=0;
	if(i==0) System.out.print("number search here  :");
	searchValue=sc.nextInt();
	
		while(true) {	
			int mid=(min+max)/2;
			if(order[mid]==searchValue) {
				System.out.println("given number is available in list");
			break;
				
			}
			else if(searchValue>order[mid]&&searchValue<order[order.length-1]) {
				min=mid+1;

			}
			else if(searchValue<order[mid]&&searchValue>order[0]) {
				max=mid-1;
			}else{
				System.out.println("given number not available in list");
			
				break;
			}
			
		}
		
		
}}

/*
RESULT:
 total number want to store  :10
put all number to store in list  :55
66
22
555
44
33
11
25
63
14
---------------------------------------
number search here  :63
given number is available in list
number search here  :1000
given number not available in list
number search here  :10
given number not available in list
------------------------------------------


//pending need to restrict not available numbers in between index value
//bring continous search
 */


