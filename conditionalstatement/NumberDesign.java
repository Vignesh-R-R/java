package javaPratise;

public class NumberDesign {
public static void main(String[] args) {
	NumberDesign call= new NumberDesign();
	call.numbersUpto5();
	call.numbers5to9();
}


private void numbersUpto5() {
	/*
			 * * *
			 *   *
			 * * *
	 */
	for(int row=3;row>=1;--row) {
		for(int col=3;col>=1;col--) {
			if(row>=1&&(col!=2||row!=2)) {
				System.out.print("* ");
			}if(row==2&&col==2) {
				System.out.print("  ");
			}
		}System.out.println();
	}System.out.println("--------------------->0");
	
/* 
		  *
		* *
		  *
		  *
		*****
	*/
for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
		if(col<=2&&row<=4) {
			if(row==2&col==1) {
				System.out.print("*");
			}
			else {	
			System.out.print(" ");
		}}
	if(col==3&&row<=4||row==5) {
		System.out.print("*");
	}
	}System.out.println();
}
System.out.println("-----------------------------1");
/*
	 * * * *
	       * 
	 * * * * 
	 *
	 * * * *
 */
for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
		if(row==1||row==3||row==5) {
			System.out.print("*");
		}
		else {
			if(row==2&&col==5||row==4&&col==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}System.out.println();
}
System.out.println("---------------------------2");
/*
 * * * *
       *
 * * * *
       *
 * * * *      

 */
for(int row=1;row<=5;row++) {
	for(int col=1;col<=4;col++) {
	if(row==1||row==3||row==5) {
		System.out.print("* ");
	}else {
		if(row==2&&col==4||row==4&&col==4) {
			System.out.print("*");
		}else {
			System.out.print("  ");
		}
	}}System.out.println();
}
System.out.println("------------3");

/*
    *
    *   *
    * * * * * 
        *
        *   
 */

for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
		if(row==3||col==3&&row>=2||col==1&&row<=2) {   
			System.out.print("*");
		}
			if(row>=4&&(col==2||col==1)||col==2&&row==2) {        //can use this way also or col<=2
				System.out.print(" ");
			
		}
	}System.out.println();}
System.out.println("-------------------->4");

/*
 	****
 	*
 	****
 	   *
 	****
 */
for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
		if(row==1||row==3||row==5||row==2&&col==1||row==4&&col==5) {
			System.out.print("*");
		}
		if(row==4&&col<=4) {
			System.out.print(" ");
		}
	}System.out.println();}
System.out.println("-------------->5");
}

private void numbers5to9() {
	/*	 *
		 *
		 * * *
		 *   *
		 * * *
	 */
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=3;col++) {
			if(row<=5&&col==1||row==3||row==5||row==4&&col==3) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
				
			}
		}System.out.println();
	}
	System.out.println("---------------->6");
	
	/*
		     * * * *
			      *
			   * * *
			    *
			   *
	 */
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=4;col++) {
			if(row==1||row==3&&col>=2||row==5&&col==2) {
				System.out.print("* ");
			}
			if(row==3&&col==1||row==2&&col<=2||col==1&&row>=4) {
				System.out.print("  ");
			}
			if(row==2&&col==3||row==4&&col==2) {
				System.out.print(" *");
			}
		}System.out.println();
	}
	System.out.println("--------------------->7");
	
/*
 		* * * *
 		*	  *
 		* * * *
 		*     *
 		* * * *

 */
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=4;col++) {
			if(row%2!=0||row%2==0&&(col==1||col==4)) {		//row%2!=0 direct way otherwise row==1,3,5
				System.out.print("* ");
			}
			if(row%2==0&&col<=3&&col!=1) {				//it relation is row 2,4 is divisible by 2
				System.out.print("  ");
			}
				
		}System.out.println();
	}
	System.out.println("----------------------->8");
	
	/*
	 		* * * *
	 		*     *
	 		* * * *
	 		      *
	 		      *
	 		      * 
	 */
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=4;col++) {
			if(row<=3&&(col==1||row!=2)||row==2&&col==4||row>=3&&col==4) {
				System.out.print("* ");
			}
if(row==2&&col>=2||row>=4&&col<=3) {
	System.out.print("  ");
}		
		}System.out.println();
	}
	
	
}









}
