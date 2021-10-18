

public class First20Prime {
public static void main(String[] args) {
	First20Prime x=new First20Prime();
	x.first20Prime();
}

private void first20Prime() {
	int i=2;
	int j;
	int count=0;
	boolean checker=true;
	while(i>=count) {
		j=2;
		while(i>j) {
	checker=true;
	if(i%j==0) {
		checker=false;
		break;
	}
	j++;}
if(checker==true) {
	count++;
	if(count==1) {
	System.out.println(count+"st prime number is "+ +i);
}
	else if(count==2) {
		System.out.println(count+"nd prime number is "+ +i);
	}
	else if(count==3) {
		System.out.println(count+"rd prime number is "+ +i);
	}
	else {
		System.out.println(count+"th prime number is "+ +i);
	}
if(count==20) {
	break;
}
	}
	
i++;}}}

/*
1st  prime number is 2
2nd  prime number is 3
3rd  prime number is 5
4th  prime number is 7
5th  prime number is 11
6th  prime number is 13
7th  prime number is 17
8th  prime number is 19
9th  prime number is 23
10th prime number is 29
11th prime number is 31
12th prime number is 37
13th prime number is 41
14th prime number is 43
15th prime number is 47
16th prime number is 53
17th prime number is 59
18th prime number is 61
19th prime number is 67
20th prime number is 71
 */






