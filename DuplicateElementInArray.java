package javaProgram;

public class DuplicateElementInArray {
public static void main(String[] args) {
	DuplicateElementInArray obj=new DuplicateElementInArray();
	obj.duplicateElements();
}
void duplicateElements(){
	int original[]={1,2,3,1,5,6,2,4,4,1};  			 //store value
	int frequency[]=new int[original.length];		//store frequency
	System.out.print("duplicate elements : ");
	for(int i=0;i<original.length;i++){				//for frequency insilization and change repeative element as -1
		int count=1;
		for(int j=i+1;j<original.length;j++){
			if(original[i]==original[j]){
				original[j]=-1; 
				count++;}
		}frequency[i]=count;
	if(count>1&&original[i]>0){System.out.print(original[i]+" ");}		//for list out the duplicate elements	
	}System.out.println();
	System.out.println("element : frequency");			//for show out put
	for(int i=0;i<original.length;i++){
		if(original[i]>0){
		System.out.println(original[i]+" : "+frequency[i]);
		}}}
/*Result
 duplicate elements : 1 2 4 
element : frequency
1 : 3
2 : 2
3 : 1
5 : 1
6 : 1
4 : 2 */



}
