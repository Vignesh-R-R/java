package javapractise;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap {
public static void main(String[] args) {
Hashmap obj=new Hashmap();
obj.classPractise();
obj.assignment();
}
private void assignment() {
	 HashMap hm= new HashMap();
	 hm.put("Tamil", 2);
	 hm.put("Tamil2", 3);
	 hm.put("English 1", 2);
	 hm.put("English 2", 1);
	 hm.put("Mathematics",4);
	 hm.put("Science", 5);
	 hm.put("Social Science", 3);
	
	 Set s2=hm.entrySet();
		Iterator i=s2.iterator();
		boolean b=i.hasNext();
		String sFirstSubject="";
		String sLastSubject="";
		String part1Subject="";
		String part2Subject="";
		while(b==true){
		 Object o=i.next();					
			Map.Entry entry=(Map.Entry)o;
Object o2=entry.getKey();
String st1=(String)o2;

if('S'==st1.charAt(0)){
	sFirstSubject=entry.getKey()+" , "+sFirstSubject;
}
if('s'==st1.charAt(st1.length()-1)){
	sLastSubject = entry.getKey()+" , "+sLastSubject;
}
if('1'==st1.charAt(st1.length()-1)){
	part1Subject=entry.getValue()+" pm, "+part1Subject;
}
if('2'==st1.charAt(st1.length()-1)){
	part2Subject=entry.getValue()+" pm, "+part2Subject;
}
b=i.hasNext();
	 }System.out.println("s starting subject are: "+sFirstSubject);
	 System.out.println("s ending subject are: "+sLastSubject);
	 System.out.println("timing for part 1 exams: "+part1Subject);
	 System.out.println("timing for part 2 exams: "+part2Subject);	
}

/*
 --------------------------------------------------RESULT:
 s starting subject are: Social Science , Science , 
s ending subject are: Mathematics , 
timing for part 1 exams: 2 pm, 
timing for part 2 exams: 1 pm, 3 pm, 
 */

void classPractise(){
	 HashMap hm= new HashMap();
	 hm.put("Tamil", 9);
	 hm.put("Tamil2", 9);
	 hm.put("English 1", 9);
	 hm.put("English 2", 9);
	 hm.put("Mathematics",2);
	 System.out.println(hm);		//datas printed in map formate {}
	 
	Set s=hm.keySet();
	System.out.println(s);  
	
	Collection c=hm.values();
	System.out.println(c+" collection");
	
	Set s1=hm.entrySet(); 	// datas printed in entry formate []
	System.out.println(s1);
	System.out.println(hm);
	
	Set s2=hm.entrySet();
	Iterator i=s2.iterator();
	boolean b=i.hasNext();
	while(b==true){
		//{System.out.println(i.next());}	//one by one output by iterator
											//only one next() can use other wish nosuchelement exception will occur 
		Object o=i.next();					
		Map.Entry entry=(Map.Entry)o;
		System.out.println(entry.getKey()+"this is for that"+ entry.getValue());
		Object o2=entry.getKey();
		String st1=(String)o2;
		Object o3=entry.getValue();
		Integer st2=(Integer)o3;
		if(st1.equals("Mathematics")){	
			System.out.println(" yes there mathematics at tomorrow "+entry.getValue());
		}
		if(st2.equals(2)){
			System.out.println(" yes at 2am "+entry.getKey());
		}
		b=i.hasNext();		
	}}}
/*
 ----------------------------------------RESULT:
 {Mathematics=2, English 1=9, Tamil=9, Tamil2=9, English 2=9}
[Mathematics, English 1, Tamil, Tamil2, English 2]
[2, 9, 9, 9, 9] collection
[Mathematics=2, English 1=9, Tamil=9, Tamil2=9, English 2=9]
{Mathematics=2, English 1=9, Tamil=9, Tamil2=9, English 2=9}
Mathematicsthis is for that2
 yes there mathematics at tomorrow 2
 yes at 2am Mathematics
English 1this is for that9
Tamilthis is for that9
Tamil2this is for that9
English 2this is for that9
 
 */


