
public class Armstrong {
public static void main(String[] args) {
	Armstrong find=new Armstrong();
	System.out.println("amstrong numbers");
	find.armstrongNo(153);
	find.armstrongNo(152);
	find.armstrongNo(0);
	find.armstrongNo(9);
 }

private void armstrongNo(int value) {
	int power=0;
	int rem;
	int secondUser=value;
	double calPlace;
	while(value>0) {		//find the how many digits are present in original number by help of power++
		value=value/10;
power++;
	}
	value=secondUser;	//replacing the value for compare with second user in line No28
	calPlace=0;
	while(secondUser>0) {		
		rem=secondUser%10;		//split the original number
		calPlace=Math.pow(rem,power)+calPlace;
		secondUser=secondUser/10;	//removing of last number using decimal(double) to int(15.8 converted to 15)
	}if(calPlace==value) {
		System.out.println(value); 
	}
	
		
	
}

}
/*
RESULTP:
amstrong numbers
153
0
9

 */
