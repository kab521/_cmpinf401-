package kab521_MenuManager_v2;
public class Menu1 {
private Salad salad;
private Dessert dessert; 
private Side side;	
private String name;
private Entree entree;
public Menu1(String name)
{
this.name = name;
}
public Menu1(String name, Entree entree, Side side)
{
this.name = name;
this.entree = entree;
this.side = side;
}
public Menu1(String name, Entree entree, Side side, Salad salad, Dessert dessert)
{
this.name = name;
this.entree = entree;
this.side = side;
this.salad = salad;
this.dessert = dessert;
}
public int totalCalories()
{
int menyu = 0;
int calEn = this.entree == null?0:this.entree.getCalories();
int calSide = this.side == null?0:this.side.getCalories();
int calSalad = this.salad == null?0:this.salad.getCalories();
int calDessert = this.dessert == null? 0:this.dessert.getCalories();
menyu = calEn + calSide + calSalad + calDessert;
return menyu;
}
public String description()
{
//output and order 
String stringEntree = this.entree == null? "Entree: ":"Entree: " + 
this.entree.getName() + " " + this.entree.getDescription() + "\n";

String stringSide = this.side == null? "Side: ":"Side: " +
this.side.getName() + " " + this.side.getDescription() + "\n";

String stringSalad = this.salad == null? "Salad: ":"Salad: " + 
this.salad.getName() + " " + this.salad.getDescription() + "\n";

String stringDessert = this.dessert == null? "Dessert: ": "Dessert: " +
this.dessert.getName() + " " + this.dessert.getDescription() + "\n";

String hello = stringEntree + stringSide + stringSalad + stringDessert;
return hello;
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public Entree getEntree() 
{
return entree;
}
public void setEntree(Entree entree) 
{
this.entree = entree;
}
public Salad getSalad() 
{
return salad;
}
public void setSalad(Salad salad) 
{
this.salad = salad;
}
public Side getSide() 
{
return side;
}
public void setSide(Side side) 
{
this.side = side;
}
public Dessert getDessert()
{
return dessert;
}	
public void setDessert(Dessert dessert) 
{		
this.dessert = dessert;
}
//managing menus, and not the randomizer 
public String toString() 
{
String nameofmenu = " --- " + this.name + " ---" + "\n";
nameofmenu += "Total Calories: " + this.totalCalories() + "\n";
nameofmenu += this.description();
return nameofmenu;
}
}