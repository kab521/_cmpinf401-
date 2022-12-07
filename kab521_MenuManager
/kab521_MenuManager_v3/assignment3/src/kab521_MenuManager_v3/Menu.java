package kab521_MenuManager_v3;

public class Menu {

//separating each subclass from the menu
private String name;
private Entree entree;
private Salad salad;
private Side side;	
private Dessert dessert;

public Menu(String name) {
this.name = name; }
public Menu(String name, Entree entree, Side side) {
this.name = name;
this.entree = entree;
this.side = side; }

public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
this.name = name;
this.entree = entree;
this.side = side;
this.salad = salad;	
this.dessert = dessert; }

//forming cals from subclasses
public int totalCalories() {
int hello = 0;
int caloentre = this.entree == null ? 0 : this.entree.getCalories();
int caloside = this.side == null ? 0 : this.side.getCalories();
int calad = this.salad == null ? 0 : this.salad.getCalories();
int calert = this.dessert == null ? 0 : this.dessert.getCalories();
hello = caloentre + caloside + calad + calert;
return hello;
}

//forming prices into subclasses
public double totalPrice() {
double set = 0;
double prentre = this.entree == null ? 0 : this.entree.getPrice();
double pride = this.side == null ? 0 : this.side.getPrice();
double pralad = this.salad == null ? 0 : this.salad.getPrice();
double prissert = this.dessert == null ? 0 : this.dessert.getPrice();
set = prentre + pride + pralad + prissert;	
return set;
	}

//forming desc from subclasses
public String description() {
	String dentre = this.entree == null ? "Entree:?\n" : "Entree: " + this.entree.getName() + ". " + this.entree.getDescription() + "\n";
	String dide = this.side == null ? "Side:?\n" : "Side: " + this.side.getName() + ". " + this.side.getDescription() + "\n";
	String dalad = this.salad == null ? "Salad:?\n" : "Salad: " + this.salad.getName() + ". " + this.salad.getDescription() + "\n";
	String ddessert = this.dessert == null ? "Dessert:?\n" : "Dessert: " + this.dessert.getName() + ". " + this.dessert.getDescription() + "\n";
	String des = dentre + dide + dalad + ddessert;
		return des; }

//getters n setters
public String getName() {
return name; }
public void setName(String name) {
this.name = name; }
public Entree getEntree() {
return entree; }
public void setEntree(Entree entree) {
this.entree = entree; }
public Salad getSalad() {
return salad; }
public void setSalad(Salad salad) {
this.salad = salad; }
public Side getSide() {
return side; }
public void setSide(Side side) {
this.side = side; }
public Dessert getDessert() {
return dessert; }
public void setDessert(Dessert dessert) {
this.dessert = dessert; }

public String toString() {
String s = "___________________________" + this.name + "___________________________\n";
	return s;
	}
}
