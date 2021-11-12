package timeDate;

import java.util.Scanner;

public class GrowableArrayUsingResuction {
	//applied recusion(method call by method) in array to make array as growable
	//but there is no use because older data will be erased
public static void main(String[] args) {
	GrowableArrayUsingResuction call=new GrowableArrayUsingResuction();
	call.enterDetails();
}int length=1;
 int n=0;
void enterDetails() {
Scanner sc=new Scanner(System.in);	
int i=length+n;
int a[][]=new int[i][3];
System.out.println("enter values: ");
	for(int j=0;j<3;j++) {
		a[n][j]=sc.nextInt();
	}System.out.println("for first row :"+n); //for check purpose
	System.out.println("enter ok to continue OR enter any other key to exit: ");
	String s=sc.next();
	if(s.equals("ok")) {
		System.out.println("enter next set of data");
		n=n+1;
		enterDetails();
	}else {
		for(int k=0;k<i;k++) { // to view list data in array
			for(int m=0;m<3;m++) {
				System.out.print(a[k][m]+" ");
			}System.out.println();
		}
	}
}
}
/**
 RESULT:
 enter values: 
1
2
3
for first row :0
enter ok to continue OR enter any other key to exit: 
ok
enter next set of data
enter values: 
4
5
6
for first row :1
enter ok to continue OR enter any other key to exit: 
ok
enter next set of data
enter values: 
7
8
9
for first row :2
enter ok to continue OR enter any other key to exit: 
ok
enter next set of data
enter values: 
9
5
1
for first row :3
enter ok to continue OR enter any other key to exit: 
E
0 0 0 
0 0 0 
0 0 0 
9 5 1 
 */


