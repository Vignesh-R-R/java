public class PalindeomeNumber{
void palindeomeNo(String m,long checkNo){
	long rem=0;
	long sum=0;
while(checkNo>0){
	rem=checkNo%10;
	sum=sum*10+rem;
	checkNo=checkNo/10;
}
System.out.println(m+":"+sum);
}
void reverseNo(String m,long checkNo){
	palindeomeNo(m,checkNo);//same process can use for reverse number
}

 public static void main(String[]args){
PalindeomeNumber call=new PalindeomeNumber();
call.palindeomeNo("test1",45454L);
call.palindeomeNo("test2",12345678987654321L);
call.reverseNo("test with random number",256314L);
}}

/*keeping rem as byte or short :rem is storing one digit value only 
	for byte=====PalindeomeNumber.java:6: error: incompatible types: possible lossy conversion from int to byte
	rem=(byte)checkNo%10;
	for short=====PalindeomeNumber.java:6: error: incompatible types: possible lossy conversion from int to short
	rem=(short)checkNo%10;
for int======9130219_8987654321()
range of byte -128 to 127,short -32768 to 32767,int -2147483648 to 2147483647
*/

/*Result::	
		test1:45454
		test2:12345678987654321
		test with random number:413652


*/
