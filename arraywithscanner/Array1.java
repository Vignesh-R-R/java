package javaPratise;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {

Array1 call=new Array1();
call.minMax();

}
	
	void minMax() {
		Scanner sc= new Scanner(System.in);
		System.out.print("number of times to pay : ");
		int timesOfPay=sc.nextInt();
	int []list =new int[timesOfPay];
	int minAmount=0;
	int maxAmount=0;
	
for(int count=0;count<list.length;count++) {
	System.out.print("amount :");
	list[count]=sc.nextInt();
	if(count==0) {
minAmount=list[0];
maxAmount=list[0];
	}
	if(minAmount>list[count]) {				//minimum value list out
		minAmount=list[count];
	}
	if(maxAmount<=list[count]) {			//list out maximum value
		maxAmount=list[count];
	}}
int total=0;
int month=2;
for(int count=0;count<list.length;count++) {
	System.out.println("month "+ month +": ₹ "+ list[count]);
	total=total+list[count];		//total
	month=month+2;
}
System.out.println("total amount to pay for "+month+": ₹ "+total);
System.out.println("lowest amount of the"+month+    " : ₹ "+minAmount);
System.out.println("highest amount of the"+month   +" : ₹ "+ maxAmount);
	
	}}

/*INPUT 
	 
number of times to pay  : 6
amount :1200
amount :1100
amount :1300
amount :2000
amount :1800
amount :1700
--------------------------RESULT: OUTPUT
month 2: ₹ 1200
month 4: ₹ 1100
month 6: ₹ 1300
month 8: ₹ 2000
month 10: ₹ 1800
month 12: ₹ 1700
total amount of pay in a year : ₹ 9100
lowest amount of the year     : ₹ 1100
highest amount of the year    : ₹ 2000
	 
	 */
	
	








	
