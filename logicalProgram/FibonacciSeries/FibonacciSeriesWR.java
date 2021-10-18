public class FibonacciSeriesWR{//fibonacci series with reqution
int count=10;
int number1=0;
int number2=1;
int sum;
void withReqution(int count){
	if(count>0){
sum = number1+number2;
	System.out.print(","+sum);
number1=number2;
number2=sum;
withReqution(count-1);
}}

public static void main(String[]args){
FibonacciSeriesWR call=new FibonacciSeriesWR();
System.out.print("Fibonacci series with reqution: 0,1");
call.withReqution(call.count-2);

}}

//RESULT:: Fibonacci series with reqution: 0,1,1,2,3,5,8,13,21,34
