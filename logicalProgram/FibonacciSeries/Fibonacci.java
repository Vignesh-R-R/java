public class Fibonacci{
int firstNo=0,secondNo=1,i,sumOfBoth;
void sumOf(){
	System.out.print("Fibonacci number printed upto 30 : "+"0,1" );//0 and 1 are the starting sum of number

for(i=0;i<30;i++){
sumOfBoth=firstNo+secondNo;
firstNo =secondNo;
secondNo=sumOfBoth;
	System.out.print(","+sumOfBoth);
 }}

	public static void main(String[]args){
Fibonacci addMeNext =new Fibonacci();
addMeNext.sumOf();
}}

// RESULT:: Fibonacci number printed upto 30 : 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,
//1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269
