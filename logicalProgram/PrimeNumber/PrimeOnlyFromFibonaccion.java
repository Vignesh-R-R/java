package javaPratise;

public class PrimeOnlyFromFibonaccion {
	public static void main(String[]args){
		PrimeOnlyFromFibonaccion findOutMe =new PrimeOnlyFromFibonaccion();
		findOutMe.fibonnaci(10);
		}
	void checkprime(int x) {
	boolean checker=true;
	int y=2;
	while(x>y) {
		if(x%y==0) {
			checker=false;
			break;
		}
	y++;}if(checker==true&&x>=2) {
		System.out.println(x);
	}
	
	
	}
		
	private void fibonnaci(int range) {
			int a=-1;			
			int b=1;
			int i=0;
			System.out.println("prime present in fibonacci series : ");
			while(i<=range) {
				b=a+b;
				checkprime(b);
				a=b-a;
			i++;}
		}
}

/*
 fibonnaci series : 
prime present in fibonacci series : 
2
3
5
13	 



*/