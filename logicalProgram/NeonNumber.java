
public class NeonNumber {
public static void main(String[] args) {
	NeonNumber call=new NeonNumber();
	call.neonNo(9);
	call.allNeonNo(10000000000000000l);
}

private void neonNo(int number) {
	int n=number*number;        //multiplying 81
	int rem;
	int x=0;
	while(n>0) {                //spliting digits 8+1
		rem=n%10;
		x=rem+x;
		n=n/10;
	}if(number==x) {            //comparition between 8+1 and original number 9
		System.out.println("neon number is "+number);
	}
}
private void allNeonNo(long number2) {
	long i=0;
	long x;
	while(number2>i) {	//condition check upto given number
	long n=i*i;
	x=0;
	while(n>0){         //spliting original number into 8,1 to add
		long rem=n%10;
		 x=rem+x;
		n=n/10;}        //removing last number (decimal number to int(8.5-->8)) 
	if(i==x) {          //comaprition
		System.out.println(i);
	}
	i++;
	}

}
}
/*RESULT:
  neon number is 9
  0
  1
  9
 */



