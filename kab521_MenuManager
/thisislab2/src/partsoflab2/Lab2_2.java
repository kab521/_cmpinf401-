//Area and Perimeter of a Circle

package partsoflab2;
import javax.swing.JOptionPane;

public class Lab2_2 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter the radius of your circle:");
		int userInputNum = Integer.parseInt(userInput);	
//start of area solving
		var pwr1 = Math.pow(userInputNum ,2);
		var mult = (Math.PI *(pwr1));
		var last = (Math.round(mult));

//start of perimeter solving 
		var pie = (Math.PI *(userInputNum));
		var times = (pie * 2);
		var round = (Math.round(times));
		
//making a sentence
		System.out.println("The circle with radius " + userInputNum + ", has an area of " + last + ", and a perimeter of " + round);
//not rounded & exact values
		System.out.println("____");
		System.out.println("Here are the exact numbers:");
		System.out.println("Radius: " + userInputNum);
		System.out.println("Area: " + mult);
		System.out.println("Perimeter: " + times);
	}		

}