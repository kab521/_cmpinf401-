public class task1	{
	// The user has to edit the number within the code if they want to change the number entered
			static int sum_of_digit(int n)
			{
				if (n == 0)
					return 0;
				return (n % 10 + sum_of_digit(n / 10));	}
			public static void main(String args[]) {
				int num = 3252;
				int result = sum_of_digit(num);
				System.out.println("You entered " + num + ", which equals " + result);
			}
		}