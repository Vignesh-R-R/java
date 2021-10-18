
public class First15Armstrong {
public static void main(String[] args) {
	First15Armstrong find=new First15Armstrong();
	System.out.println("amstrong numbers");
	find.armstrongNo(15);
	
}

private void armstrongNo(int fixedCount) {
	int rem;
	int i=0;
	int count=1;
	double calPlace;
	while(count<=fixedCount){
		int power=0;
		int value=i;
		int secondUser=value;
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
		System.out.print(value); 
		count++; //for compartion line No16
	}
i++;}
	}

}
/*
RESULT:
amstrong numbers
0
1
2
3
4
5
6
7
8
9
153
370
371
407
1634

 */
