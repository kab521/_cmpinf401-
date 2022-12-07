/**
	 * Class Menu2
 	 * author : kathryn bager
	 * created: 10/17/2022
	 */

package assignment1;
public class Menu2 {
	
public static void main(String[] args) {
		
Entree e1 = new Entree("Sirloin Steak","A delicious piece of 1/2" + " pound of our carefully selected meat grilled and seasoned.",600);
Entree e2 = new Entree("N/A", null, 20);
Side side1 = new Side("N/A", null, 50);
Salad salad1 = new Salad("N/A", null, 67);
Salad salad2 = new Salad("N/A", null, 321);
Dessert d1 = new Dessert("N/A", null, 157);
Menu1 m1 = new Menu1("Menu 1");
m1.setEntree(e1);
m1.setSalad(salad1);
Menu1 m2 = new Menu1("Menu 2", e2, side1, salad2, d1);
System.out.print(m1);
System.out.print(m2);	
	}
}