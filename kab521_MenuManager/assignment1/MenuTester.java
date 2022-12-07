package assignment1;

public class MenuTester {

	public static void main(String[] args) throws Exception {
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu1 myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
								myMenu.totalCalories());
	}
	
}