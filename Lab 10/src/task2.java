
public class task2 {

public static void main(String[] args) {
//User has to change what elements they want on the line below:
	int[] a = {1,2,3,4,5,6,7,8,9};
	printArrayElements(a,0); }
	
public static void printArrayElements(int[] a, int index) {
	System.out.println(a[index]);
	if(index == a.length-1) {
		return;
	}
	printArrayElements(a,index+1);
}
}
