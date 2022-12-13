package projectfinal;

//imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

//formulating a list using an array
public static ArrayList <MenuItem> readItems(String nameoffile) {
ArrayList <MenuItem> listings = new ArrayList <MenuItem>();
FileReader filereader;
try {
	filereader = new FileReader(nameoffile);
	BufferedReader buffreader = new BufferedReader(filereader);
	String line = null;
		while ((line = buffreader.readLine()) != null) {
			String[] menyu = line.split("@@");
			if (menyu.length == 5) {
				String type = menyu[1];
				if (type.equalsIgnoreCase("entree")) {
					entrees item = new entrees();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					listings.add(item);
					}
				if (type.equalsIgnoreCase("Dessert")) {
					desserts item = new desserts();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					listings.add(item);
					}
				if (type.equalsIgnoreCase("Salad")) {
					salads item = new salads();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					listings.add(item);
					}
				if (type.equalsIgnoreCase("Side")) {
					sides item = new sides();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					listings.add(item);
					}
					} 
				else {
					}
					}
					buffreader.close();
					filereader.close();
				} catch (Exception e) {
					}
				  return listings;
					}

public static void writeMenu(String nameoffile, ArrayList<Mainmenu> menus) {
try {
	File phil = new File(nameoffile);
	phil.delete();
	FileWriter writtenfile = new FileWriter(nameoffile, true);
	BufferedWriter buffwriter = new BufferedWriter(writtenfile);
		for (int i = 0; i < menus.size(); i++) {
			Mainmenu menu = menus.get(i);
				if(i == menus.size()-1) {
					String foodtype = menu.toString();
					foodtype += "Entree is: " + menu.getEntree().toString() + menu.getEntree().getDescription() + 
					". Calories: " + menu.getEntree().getCalories() + 
					" Price: " + menu.getEntree().getPrice() + "\n";
					foodtype += "Side is: " + menu.getSide().toString() + menu.getSide().getDescription() + 
					". Calories: " + menu.getSide().getCalories() + 
					" Price: " + menu.getSide().getPrice() + "\n";
					foodtype += "Salad is: " + menu.getSalad().toString() + menu.getSalad().getDescription() +
					". Calories: "	+ menu.getSalad().getCalories() +
					" Price: " + menu.getSalad().getPrice() + "\n";
					foodtype += "Dessert is: " + menu.getDessert().toString() + menu.getDessert().getDescription() +
					". Calories: " + menu.getDessert().getCalories() +
					" Price: " + menu.getDessert().getPrice() + "\n";
					
					foodtype += "Menu Total Cals: " + menu.totcals() + "\tMenu Total Price: " + menu.totprice();
					buffwriter.write(foodtype);
				}else {
					String foodtype = menu.toString();
					foodtype += "Entree is: " + menu.getEntree().toString() + menu.getEntree().getDescription() + 
					". Calories: " + menu.getEntree().getCalories() + 
					" Price: " + menu.getEntree().getPrice() + "\n";
					foodtype += "Side is: " + menu.getSide().toString() + menu.getSide().getDescription() + 
					". Calories: " + menu.getSide().getCalories() + 
					" Price: " + menu.getSide().getPrice() + "\n";
					foodtype += "Salad is: " + menu.getSalad().toString() + menu.getSalad().getDescription() + 
					". Calories: " + menu.getSalad().getCalories() + 
					" Price: " + menu.getSalad().getPrice() + "\n";
					foodtype += "Dessert is: " + menu.getDessert().toString() + menu.getDessert().getDescription() + 
					". Calories: " + menu.getDessert().getCalories() + 
					" Price: " + menu.getDessert().getPrice() + "\n";
					foodtype += "Menu Total Cals: " + menu.totcals() + "\tMenu Total Price: " + menu.totprice()+"\n";
					buffwriter.write(foodtype);
				}
			}
		buffwriter.close();
		writtenfile.close();
		} catch (IOException e) {
			System.out.println("somehow, a mistake has been made");
		}

	}
}