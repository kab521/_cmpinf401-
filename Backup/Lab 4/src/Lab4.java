//Lab 4: Logarithms

import javax.swing.JOptionPane;

class Lab4 {

	public static int logk(int N)
	{
			
		String userInput2= JOptionPane.showInputDialog("Please enter base:");
		int k = Integer.parseInt(userInput2);	
		
		int result = (int)(Math.log(N) / Math.log(k));

		return result;
	}

	public static void main(String[] args)
	{

		String userInput = JOptionPane.showInputDialog("Please enter your x:");
		int N = Integer.parseInt(userInput);
		
		System.out.println("Log " + N + " to the base you entered equals: " + logk(N));
	}
}


