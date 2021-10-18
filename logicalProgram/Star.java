package javaPratise;

public class Star {
public static void main(String[] args) {
Star cal=new Star();
cal.me();
cal.me2();
	
}

private void me2() {
	for(int row=5;row>=0;row--) {
		for (int col=1;col<=row;col++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

private void me() {
for(int row=1;row<=5;row++) {
	for(int col=5;col>=row;col--) {
		System.out.print(col);
	}
	System.out.println();
}	
}


}



