

public class PrimeFromFibonnaciSeries {
	//boolean checker;
	
	public static void main(String[]args){
	PrimeFromFibonnaciSeries findOutMe =new PrimeFromFibonnaciSeries();
	findOutMe.fibonnaci(10);
	}
void checkprime(int x) {
	if(x==0||x==1) {
		System.out.print("	not prime number	");
	}
else {int y=2;
	boolean checker=true;
	while(x>y){
		if(x%y==0) {
		checker=false;
		System.out.print("	not prime number	");
		break;
		}
		y++;}
	if(checker==true) {
			System.out.print("	its prime number	");
		}}
System.out.println(" ");}
	
private void fibonnaci(int range) {
		int a=-1;
		int x=0;
		int b=1;
		int i=0;
		System.out.println("fibonnaci series : ");
		while(i<=range) {
			System.out.print(a+b+" ");
			b=a+b;
			a=b-a;
			x=b;
			checkprime(x);
		i++;}
	}
}

/*RESULT:
fibonnaci series : 
0 	not prime number	 
1 	not prime number	 
1 	not prime number	 
2 	its prime number	 
3 	its prime number	 
5 	its prime number	 
8 	not prime number	 
13 	its prime number	 
21 	not prime number	 
34 	not prime number	 
55 	not prime number
*/





