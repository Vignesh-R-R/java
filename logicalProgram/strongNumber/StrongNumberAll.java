package javaPratise;

public class StrongNumberAll {
public static void main(String[] args) {
	StrongNumberAll call=new StrongNumberAll();
	System.out.println("STRONG NUMBER:");
	call.strongNo(1000000000);
	
}

private void strongNo(int number) {
	int i=0;
	while(number>i) {int x=i;		//number not to change while split up for x provided 
	int resultAdd=0;	//to add all factorial and result to compare line
	while(x>0) { 		//should not, Number*0=0
		int rem=x%10; 	//number separating
		x=x/10;			//x reducing and its support for rem to choose next no.
		int multipler=1;//store the individual factorial
		while(rem>0) {	//condition for make factorial
			multipler=multipler*rem;//1*4,4*3,3*2,2*1
		rem--;}						//4,3,2,1
		resultAdd=multipler+resultAdd;//add all separate factorial numuber
	}if(resultAdd==i) {		//condition for check the result
		System.out.println(i);
	}
i++;}}}
/*
 RESULT:
STRONG NUMBER:
0
1
2
145
40585

 */



