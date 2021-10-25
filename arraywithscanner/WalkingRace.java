package javaPratise;

import java.util.Scanner;

public class WalkingRace {
public static void main(String[]args) {
WalkingRace call=new WalkingRace();
//call.raceSelection();
call.withScanner();
  }

private void withScanner() {
	Scanner sc=new Scanner(System.in);
	System.out.print("number of player participated ");
	int No=sc.nextInt();
	String[] players=new String[No];
	float[] mintues=new float[No];
	for(int i=0;i<players.length;i++) {
		for(int j=i;j<players.length;j++) {
		if(i==0) {
			System.out.print("player name ");
			players[j]=sc.next();
			System.out.print("finishing time ");
			mintues[j]=sc.nextFloat();
		}
			if(mintues[i]>mintues[j]) {
				float temprovary=mintues[j];
				mintues[j]=mintues[i];
				mintues[i]=temprovary;
				
				String temprovary1=players[j];
				players[j]=players[i];
				players[i]=temprovary1;
			}}
	}for(int i=0;i<mintues.length;i++) {
		System.out.print("rank"+(i+1)+" "+players[i]);
		System.out.println(" "+mintues[i]+" sec");
}String ok="ok";
boolean again=true;
while(again==true) {
	System.out.print("enter word 'ok' to see using rank for indivdual result :");
String access1=sc.next();
if(ok.equals(access1)) {
	System.out.print(" put rank number ");	//rank start from zero
	int x=sc.nextInt();
	System.out.println(players[x]+" "+mintues[x]);
}else {again=false;}
}
	}
/*console input:
 number of player participated 6
player name arun	
finishing time 16.3
player name vikram
finishing time 17.4
player name karthi
finishing time 13.2
player name vijay
finishing time 18.9
player name surya
finishing time 16
player name kamal
finishing time 15
--------------------------------
RESULT:OUTPUT
---------------------------------
rank1 karthi 13.2 sec
rank2 kamal 15.0 sec
rank3 surya 16.0 sec
rank4 arun 16.3 sec
rank5 vikram 17.4 sec
rank6 vijay 18.9 sec
enter word 'ok' to see using rank for indivdual result :ok
 put rank number 0
karthi 13.2
enter word 'ok' to see using rank for indivdual result :ok
 put rank number 1
kamal 15.0
enter word 'ok' to see using rank for indivdual result :ok
 put rank number 5
vijay 18.9
enter word 'ok' to see using rank for indivdual result :enter any key to exit
 
 
 
 
 */




	

private void raceSelection() {
String []players= {"arun","vikram","karthi","kamal","surya","vijay"};	
float []mintues= {16.3f,17.4f,13.2f,18.9f,16,15.6f};
for(int i=0;i<mintues.length;i++) {
	for(int j=i;j<mintues.length;j++) {
	if(mintues[i]>mintues[j]) {
		float tempervory=mintues[j];
		mintues[j]=mintues[i];
		mintues[i]=tempervory;
		
		String tempervory1=players[j];
		players[j]=players[i];
		players[i]=tempervory1;
	}}
}for(int i=0;i<mintues.length;i++) {
	System.out.print("rank"+(i+1)+" "+players[i]);
	System.out.println(" "+mintues[i]+" sec");

}

}
}
