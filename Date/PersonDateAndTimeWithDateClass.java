package javatpoint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonDateAndTimeWithDateClass {
	 int length,details;
	 Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		PersonDateAndTimeWithDateClass obj=new PersonDateAndTimeWithDateClass();
		obj.insertData();
	}
	void insertData() throws ParseException{
		 System.out.print("how many person to add: ");
		 length=sc.nextInt();        //length means number of person
		 details=4;            //number details
		 String [][]document=new String[length][details];  
		 for(int person=0;person<length;person++){
		  for(int j=0;j<details;j++){       // j is particular person detail
		   if(j==0){System.out.print("Name: ");}
		   else if(j==1){System.out.print("Role: ");}
		   else if(j==2){System.out.print("Date of birth and time dd-mmm-yyyy hh:mm:ss : ");}
		   else if(j==3){System.out.print("Death Date and time dd-mmm-yyyy hh:mm:ss : ");}
		   document[person][j]=sc.nextLine();
		  }System.out.println();}
		 search(document);
		}
	void search(String[][] document) throws ParseException{
		 int count=0;
		 System.out.println("search the name: ");
		 String searchName=sc.next();
		 for(int i=0;i<length;i++){
		 if(searchName.equals(document[i][0])){
		  
		  for(int j=0;j<details;j++){
		   if(j==0){System.out.print("Name: ");}
		   else if(j==2){System.out.print("Date of birth and time : ");}
		   else if(j==3){System.out.print("Death Date and time : ");}
		   else if(j==1){System.out.print("Role: ");}
		  if(j<=1){System.out.print(document[i][j]);}
		  else{Date var=new SimpleDateFormat("dd-mmm-yyyy hh:mm:ss").parse(document[i][j]);
		  System.out.print(var);}
		  System.out.println();
		  }
		 }else{count++;}   //count and length are equal then count does not affected by any other same relation
		 }if(count==length){
		  System.out.print("person not found,TRY AGAIN");
		  System.out.println();
		  search(document);
		 }else{System.out.print("enter 'ok' to search other name and press any key to exit: ");
		  String again=sc.next();
		  if(again.equals("ok")){
		   search(document);
		  }else{System.out.println("---------THANK YOU---------");}
		 }
		 }}
	
	
/*RESULT:
 how many person to add: 1
 Name: Role: 
 ----------------------------but out should like this
 how many person to add: 1
 Name: 
 */ 
 */

