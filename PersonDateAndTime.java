package searchingAndSorting;

import java.util.Scanner;

public class PersonDateAndTime {
	int length,details;
	Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	PersonDateAndTime obj=new PersonDateAndTime();
	obj.insertData();
	
}
void insertData(){
	System.out.print("how many person to add: ");
	length=sc.nextInt();								//length means number of person
	details=5; 											//number details
	String [][]document=new String[length][details];  
	for(int person=0;person<length;person++){
		for(int j=0;j<details;j++){							// j is particular person detail
			if(j==0){System.out.print("Name: ");}
			else if(j==1){System.out.print("Date of birth: ");}
			else if(j==2){System.out.print("Death Date: ");}
			else if(j==4){System.out.print("Role: ");}
			else if(j==3){System.out.print("Death Time: ");}
			document[person][j]=sc.next();
		
		}System.out.println();}
	search(document);
}
void search(String[][] document){
	int count=0;
	System.out.println("search the name: ");
	String searchName=sc.next();
	for(int i=0;i<length;i++){
	if(searchName.equals(document[i][0])){
		
		for(int j=0;j<details;j++){
			if(j==0){System.out.print("Name: ");}
			else if(j==1){System.out.print("Date of birth: ");}
			else if(j==2){System.out.print("Death Date: ");}
			else if(j==4){System.out.print("Role: ");}
			else if(j==3){System.out.print("Death Time: ");}
		System.out.print(document[i][j]);
		System.out.println();
		}
	}else{count++;}			//count and length are equal then count does not affected by any other same relation
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
/*RESULT: ----------------------------------------input
  how many person to add: 3
Name: ram
Date of birth: 12/july/1941
Death Date: 1/jun/2041
Death Time: 12.51pm
Role: freeGuy

Name: krish
Date of birth: 13/jan/1951
Death Date: 02/jan/2051
Death Time: 01.21pm
Role: IndianPresident

Name: watch
Date of birth: 13/march/2000
Death Date: 14/jun/3000
Death Time: 12.45pm
Role: armySpy
--------------------------------------------------output
search the name: arun
person not found,TRY AGAIN

search the name: king
person not found,TRY AGAIN

search the name: ram

Name: ram
Date of birth: 12/july/1941
Death Date: 1/jun/2041
Death Time: 12.51pm
Role: freeGuy
enter 'ok' to search other name and press any key to exit: ok

search the name: krishna
person not found,TRY AGAIN

search the name: watch

Name: watch
Date of birth: 13/march/2000
Death Date: 14/jun/3000
Death Time: 12.45pm
Role: armySpy
enter 'ok' to search other name and press any key to exit: exit
---------THANK YOU---------
 
 */
