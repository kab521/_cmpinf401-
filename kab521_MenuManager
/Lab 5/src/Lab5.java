//Lab 5: Rolling Dice

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab5 {

	public static void main(String[] args) {

	Random r = new Random();
		while(true) {
			String input = JOptionPane.showInputDialog("Please enter a number for how many times you want to roll the two dice:");
			if(!CheckingIfPositive(input)|| input == null||input.equals("")) {
				JOptionPane.showMessageDialog(null, "Please only enter a number this time:");
				continue;
			}
			int n = Integer.valueOf(input);
			if(n==0) {
				JOptionPane.showMessageDialog(null, "Please enter number bigger than zero:");
				continue;
			}
			rollDice(n,r);
			String ask = JOptionPane.showInputDialog("Please write 'yes' to roll again, or enter anything else to stop.");
			if(!ask.equalsIgnoreCase("yes")||ask == null||ask.equals("")) {
				break;
			}
		}

	}

	static void rollDice(int n, Random r) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int d1 = r.nextInt(1,7);
			int d2 = r.nextInt(1,7);
			int sum = d1 + d2;
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum, 1);
			}
		}
		String output1 = String.format("The result of rolling two dice "+n+" times:\n %-8s%-18s%-13s%-19s%n"
				,"Value","Number Of Times Rolled","Fraction","Guessed Fraction");
		String output2 = "";
		for(int i = 2; i<13 ; i++) {
			if(map.containsKey(i)) {
				double f = (double)map.get(i)/n;
				double ef = 0.0;
				if(i<=7) {
					ef = (i-1.0)/36.0;
				}else {
					ef = (13.0-i)/36.0;
				}
				String add = String.format("%-17d%-21d%-20.3f%-19.3f%n", i,map.get(i),f,ef);
				output2 += add;
			}
		}
		String output3 = String.format("The result of rolling the dice "+n+" times:\n %-17s%-22s%-16s%-19s%n"
				,"Value","Times Rolled","Fraction","Guessed Fraction");
		System.out.print(output3+output2+"\n");
		JOptionPane.showMessageDialog(null, output1+output2);
	}

	static boolean CheckingIfPositive(String in) {
		char[] inChar = in.toCharArray();
		for(char i : inChar) {
			int num = (int) i ;
			if(num<48||num>57) {
				return false;
			}
		}
		return true;
	}

}

