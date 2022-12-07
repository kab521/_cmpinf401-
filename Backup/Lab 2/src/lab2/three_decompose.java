//3
//Decomposing money

package lab2;
import javax.swing.JOptionPane;

public class three_decompose {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a value between 1 dollar to 9999 dollars:");
		int userInputNum = Integer.parseInt(userInput);	
//calculating
		var diGrand = (userInputNum/1000);
		var grands = (diGrand % 1000);
		System.out.println("Grands: " + grands);
		
		var diBennies = (userInputNum /100);
		var bennies = (diBennies % 10);
		System.out.println("Benjamins: " + bennies);
		
		var diSaw = (userInputNum/10);
		var saw = (diSaw % 10);
		System.out.println("Sawbucks: " + saw);
		
		var diBuck = (userInputNum/1);
		var bucks = (diBuck % 10);
		System.out.println("Buck: " + bucks);

	}		

}