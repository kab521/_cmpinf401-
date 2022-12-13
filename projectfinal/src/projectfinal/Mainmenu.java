package projectfinal;

public class Mainmenu {
	
//private constructors
private String name;
private desserts Desserts;
private entrees Entrees;
private salads Salads;
private sides Sides;
	
public Mainmenu(String name) {
this.name = name;
}

public Mainmenu(String name, entrees Entrees, sides Sides) {
this.name = name;
this.Entrees = Entrees;
this.Sides = Sides;	
}

public Mainmenu(String name, entrees Entrees, sides Sides, salads Salads, desserts Desserts) {
this.name = name;
this.Desserts = Desserts;
this.Entrees = Entrees;
this.Sides = Sides;
this.Salads = Salads;
this.Sides = Sides;
}

//establishing calories for each menu item/ constructors
//accepting null, 0, or undefined just in case 
public int totcals() {
int bears = 0;

int entreecals = this.Entrees == null?0:
this.Entrees.getCalories();

int sidecals = this.Sides == null?0:
this.Sides.getCalories();

int salcals = this.Salads == null?0:
this.Salads.getCalories();

int descals = this.Desserts == null?0:
this.Desserts.getCalories();

bears = ((entreecals) + (salcals) + (descals) + (sidecals));
return bears;
}

//establishing the prices per item/ constructors
public double totprice() {
double bears = 0.0;

double pren = this.Entrees == null?0:
this.Entrees.getPrice();

double pride = this.Sides == null?0:
this.Sides.getPrice();

double palad = this.Salads == null?0:
this.Salads.getPrice();

double pert = this.Desserts == null?0:
this.Desserts.getPrice();

bears = ((pren) + (pride) + (palad) + (pert));
return bears;
}

public String description() {
String dentre = this.Entrees == null? "Entree: ???":
"Entree: " + this.Entrees.getName() + "-" + this.Entrees.getDescription() + "       ";

String dede = this.Desserts == null? "Dessert: ???":
"Dessert: " + this.Desserts.getName() + "-" + this.Desserts.getDescription() + "       ";

String delad = this.Salads == null? "Salad: ???":
"Salad: " + this.Salads.getName() + "-" + this.Salads.getDescription() + "       ";

String deside = this.Sides == null? "Side: ???":
"Side: " + this.Sides.getName() + "-" + this.Sides.getDescription() + "       ";

String bears = ((dentre) + (dede) + (delad) + (deside));
return bears;
}

//MORE getters and setters
//Name
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//Sides
public sides getSide() {
	return Sides;
}
	public void setSide(sides Sides) {
	this.Sides = Sides;
}

//Entrées
public entrees getEntree() {
	return Entrees;
}
	public void setEntree(entrees Entrees) {
	this.Entrees = Entrees;
}

//Desserts
public desserts getDessert() {
	return Desserts;
}
	public void setDessert(desserts Desserts) {
	this.Desserts = Desserts;
}

//Salads
public salads getSalad() {
	return Salads;
}
	public void setSalad(salads Salads) {
	this.Salads = Salads;
}

//menu separator border
public String toString() {
String K = (("═══════✰°") + (this.name) + ("°✰═══════"));
return K;
}
}