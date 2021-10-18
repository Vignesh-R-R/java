package javaPratise;

public class StrongNumber {
public static void main(String[] args) {
	StrongNumber call=new StrongNumber();
	System.out.println("STRONG NUMBER:");
	call.strongNo(145);
	call.strongNo(148);
	call.strongNo(1);
}

private void strongNo(int number) {
	int x=number;		//number not to change while split up for x provided 
	int resultAdd=0;	//to add all factorial and result to compare line
	while(x>0) { 		//should not, Number*0=0
		int rem=x%10; 	//number separating
		x=x/10;			//x reducing and its support for rem to choose next no.
		int multipler=1;//store the individual factorial
		while(rem>0) {	//condition for make factorial
			multipler=multipler*rem;//1*4,4*3,3*2,2*1
		rem--;}						//4,3,2,1
		resultAdd=multipler+resultAdd;//add all separate factorial numuber
	}if(resultAdd==number) {		//condition for check the result
		System.out.println(number);
	}
}}
/*
 RESULT:
 	STRONG NUMBER:
	145
	1
 */



