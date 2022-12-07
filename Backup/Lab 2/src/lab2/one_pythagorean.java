//1
//Pythagorean Theorem

package lab2;
import javax.swing.JOptionPane;

public class one_pythagorean {
////////////asking for user inputs
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a number for A:");
		String userInput2= JOptionPane.showInputDialog("Please enter a number for B:");
		int userInputNum = Integer.parseInt(userInput);
		int userInputNum2 = Integer.parseInt(userInput2);		
//solving
		var pwr1 = Math.pow(userInputNum, 2);
		var pwr2 = Math.pow(userInputNum2, 2);
		var total = (pwr1 + pwr2);
		var offical = (Math.sqrt(total));
		var last = (Math.round(offical));
		System.out.println("Your hypotenuse is: " + offical);
		System.out.println("Your hypotenuse is rounded to: " + last);

		}		

		}
