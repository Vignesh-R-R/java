package javapractise;
import java.util.LinkedHashSet;


public class Stock {
int id,Quantity;
double stockPrice;
String name,companyName;
public Stock(int id, String name, String companyName, double stockPrice, int Quantity) {
	this.id=id;
	this.name=name;
	this.companyName=companyName;
	this.stockPrice= stockPrice;
	this.Quantity=Quantity;
	
	
}
public static void main(String[] args) {
	LinkedHashSet<Stock> ls=new LinkedHashSet<Stock>();
	Stock obj1=new Stock(21,"arun","ssm ltd",121.51,200);
	Stock obj2=new Stock(22,"saas","mmm ltd",151.21,100);
	Stock obj3=new Stock(22,"fsd","afsd ltd",15,10);
	Stock obj4=new Stock(21,"arun","ssm ltd",121.51,200); 		//obj1=obj4
	Stock obj5=new Stock(51,"arun","ssm ltd",15,51);
ls.add(obj1);
ls.add(obj2);
ls.add(obj3);
ls.add(obj4);
ls.add(obj5);
for(Stock cal:ls){
	System.out.println(cal.id+" "+cal.name+" "+cal.companyName+" "+cal.stockPrice+" "+cal.Quantity);
}
}}
/*
 RESULT:
 21 arun ssm ltd 121.51 200
22 saas mmm ltd 151.21 100
22 fsd afsd ltd 15.0 10
21 arun ssm ltd 121.51 200			//obj1=obj4 duplicate object
51 arun ssm ltd 15.0 51

 */
