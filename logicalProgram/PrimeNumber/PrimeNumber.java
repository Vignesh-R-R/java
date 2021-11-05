public class PrimeNumber{
void usingWhileLoop(){
int i=2;     					//i is a dividend
int j;							//j is a divisor
boolean checker; 				//to identify the prime number
int count=0;					//total number of prime number
while(i<100){					//to check prime number upto 1000
		j=2;					//divisor reset place and reset to 2
		checker=true;			//checker reset place and always reset to true
while(j<i){						//check condition
	if(i%j==0){					//trap for "not prime number"
		checker=false;			
		break;					//if founded not prime number then exit the loop
		}
		j++;}					//adding +1 with divisor
	if(checker==true){			//place to enter only for prime number
		System.out.print(i+",");  //print the prime numbers present in dividend
		//return i;
		//compareResult(i);
		count++;
	}				
		i++;}					//adding +1 with dividend
		System.out.println("number of prime number between 0 to "+i+":  "+count);
}


void usingForLoop(){
boolean checker=true;               
int count=0;
int i;

	for(i=2;i<100;i++){
		
	for(int j=2;j<i;j++){
		checker=true;
	if(i%j==0){
		checker=false;
		break;}
		}
	if(checker==true){
		
		System.out.print(i+",");
		count++;
		
	}
}System.out.println("number of prime number between 0 to "+i+":  "+count);
}
	/*void compareResult(int x,int i){
		System.out.println(x+" : "+i);
	}*/
	public static void main(String[]args){
		PrimeNumber obj1=new PrimeNumber();
		obj1.usingWhileLoop();
		obj1.usingForLoop();
	}}

/* RESULT ::
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,number of prime number between 0 to 100 : 25
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,number of prime number between 0 to 99  :  25
*/
