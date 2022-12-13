package kab521_MenuManager_v2;
public class Menu2 {

public static void main(String[] args) {

Entree entree = new Entree("Roasted Chicken.", "(Fresh)",600);
Entree entree2 = new Entree("Roast Beef", "(The best beef)", 20);

Side side = new Side("Applesauce.", "(Goes with Anything)", 50);
Side side2 = new Side("Bread rolls.", "(Served with butter)", 50);


Salad salad = new Salad("Fruit Salad", "(Still counts as salad)", 67);
Salad salad2 = new Salad("Colorful Salad", "(Colorful toppings)", 321);

Dessert dessert = new Dessert("Lemon tarts", "(Lemon flavor)", 157);
Dessert dessert2 = new Dessert("Flan", "(Caramel flavor)", 157);

Menu1 menyu = new Menu1("Menu 1");
menyu.setEntree(entree);
menyu.setSalad(salad);
menyu.setSide(side2);
menyu.setDessert(dessert2); 


Menu1 menyu2 = new Menu1("Menu 2", entree2, side, salad2, dessert);
System.out.print(menyu);
System.out.print(menyu2);	
}
}