package kab521_MenuManager_v3;

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
public static ArrayList<MenuItem> readItems(String fileName) {
	ArrayList<MenuItem> itemsArr = new ArrayList<MenuItem>();
	FileReader filereader;
	try {
		filereader = new FileReader(fileName);
		BufferedReader buffreader = new BufferedReader(filereader);
		String line = null;
		while ((line = buffreader.readLine()) != null) {
			String[] menyu = line.split("@@");
			if (menyu.length == 5) {
				String type = menyu[1];
				if (type.equalsIgnoreCase("entree")) {
					Entree item = new Entree();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					itemsArr.add(item);
					}
				if (type.equalsIgnoreCase("Dessert")) {
					Dessert item = new Dessert();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					itemsArr.add(item);
					}
				if (type.equalsIgnoreCase("Salad")) {
					Salad item = new Salad();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					itemsArr.add(item);
					}
				if (type.equalsIgnoreCase("Side")) {
					Side item = new Side();
					item.setName(menyu[0]);
					item.setDescription(menyu[2]);
					item.setCalories(Integer.parseInt(menyu[3]));
					item.setPrice(Double.parseDouble(menyu[4]));
					itemsArr.add(item);
					}
					} 
				else {
					}
					}
					buffreader.close();
					filereader.close();
				} catch (Exception e) {
					System.out.println("somehow, a mistake has been made");
					}
				
				  return itemsArr;
					}

public static void writeMenu(String fileName, ArrayList<Menu> menus) {
try {
	File phil = new File(fileName);
	phil.delete();
	FileWriter writtenfile = new FileWriter(fileName, true);
	BufferedWriter buffwriter = new BufferedWriter(writtenfile);
		for (int i = 0; i < menus.size(); i++) {
			Menu menu = menus.get(i);
				if(i == menus.size()-1) {
					String s = menu.toString();
					s += "Entree is: " + menu.getEntree().toString() + menu.getEntree().getDescription() + ". Calories: " + menu.getEntree().getCalories() + " Price: " + menu.getEntree().getPrice() + "\n";
					s += "Side is: " + menu.getSide().toString() + menu.getSide().getDescription() + ". Calories: " + menu.getSide().getCalories() + " Price: " + menu.getSide().getPrice() + "\n";
					s += "Salad is: " + menu.getSalad().toString() + menu.getSalad().getDescription() + ". Calories: "	+ menu.getSalad().getCalories() + " Price: " + menu.getSalad().getPrice() + "\n";
					s += "Dessert is: " + menu.getDessert().toString() + menu.getDessert().getDescription() + ". Calories: " + menu.getDessert().getCalories() + " Price: " + menu.getDessert().getPrice() + "\n";
					s += "Menu Total Cals: " + menu.totalCalories() + "\tMenu Total Price: " + menu.totalPrice();
					buffwriter.write(s);
				}else {
					String s = menu.toString();
					s += "Entree is: " + menu.getEntree().toString() + menu.getEntree().getDescription() + ". Calories: " + menu.getEntree().getCalories() + " Price: " + menu.getEntree().getPrice() + "\n";
					s += "Side is: " + menu.getSide().toString() + menu.getSide().getDescription() + ". Calories: " + menu.getSide().getCalories() + " Price: " + menu.getSide().getPrice() + "\n";
					s += "Salad is: " + menu.getSalad().toString() + menu.getSalad().getDescription() + ". Calories: " + menu.getSalad().getCalories() + " Price: " + menu.getSalad().getPrice() + "\n";
					s += "Dessert is: " + menu.getDessert().toString() + menu.getDessert().getDescription() + ". Calories: " + menu.getDessert().getCalories() + " Price: " + menu.getDessert().getPrice() + "\n";
					s += "Menu Total Cals: " + menu.totalCalories() + "\tMenu Total Price: " + menu.totalPrice()+"\n";
					buffwriter.write(s);
				}
			}
		buffwriter.close();
		writtenfile.close();
		} catch (IOException e) {
			System.out.println("somehow, a mistake has been made");
		}

	}
}