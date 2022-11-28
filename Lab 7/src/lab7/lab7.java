//Lab 7: Arrays

package lab7;
import java.util.Random;
import javax.swing.JOptionPane;
public class lab7 {
public static void main(String[] args) {
	String num = "";
	while(true) {
	//	num = JOptionPane.showInputDialog("Please enter the size of an array:");
//If the user doesn't enter a positive integer 	
		if(!checkPositiveInteger(num)) {
				JOptionPane.showMessageDialog(null, "Please enter a number instead");
				continue;
			}
//Storing the number 
			int n = Integer.valueOf(num);
double[] data = new double[n];
Random r = new Random();
String s = "[";
for(int i = 0; i < n; i++) {
data[i] = r.nextDouble(-100.00,100.01);
		if(i==n-1) {
			s +=data[i]+"]";
		}else {
			s += data[i]+", ";
			}
			}
//The data itself
double max = max(data);
double mini = min(data);
double add = sum(data);
double avg = avg(data);

//Printing the data
JOptionPane.showMessageDialog(null, "The array with a size of "+n+" is:\n"+s
+"\nThe maximum value is:\\n" + max + "\\nThe minimum value is:\n" + mini +
"\nThe sum value would be:\n" + add + "\nThe average value is:\n" + avg);
		}
	}
	
//Calculating Array
public static double max(double[] data) {
double max = data[0];
for(int i = 0; i < data.length;i++) {
		max = data[i] > max? data[i]:max;
		}
		return max;
	}
public static double min(double[] data) {
double min = data[0];
for(int i = 0; i < data.length;i++) {
		min = data[i] < min? data[i]:min;
		}
	return min;
	}
public static double sum(double[] data) {
double sum = 0.00;
for(int i = 0;i < data.length;i++) {
		sum += data[i];
		}
	return sum;
	}
public static double avg(double[] data) {
double avg = sum(data)/data.length;
return avg;
	}
	
public static boolean checkPositiveInteger(String in) {
char[] inChar = in.toCharArray();
	for(char i : inChar) {
		int num = (int) i ;
		if(num < 49 || num > 57) {
			return false;
			}
		}
		return true;
	}
}










