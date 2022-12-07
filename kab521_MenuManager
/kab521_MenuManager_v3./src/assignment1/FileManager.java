package assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {


	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> itemsArr = new ArrayList();
		FileReader fr;
		try {
			fr = new FileReader(fileName);
			BufferedReader bf = new BufferedReader(fr);
			String line = null;
			while ((line = bf.readLine()) != null) {
				String[] box = line.split("@@");
				if (box.length == 5) {
					String type = box[1];
					if (type.equalsIgnoreCase("entree")) {
						Entree item = new Entree();
						item.setName(box[0]);
						item.setDescription(box[2]);
						item.setCalories(Integer.parseInt(box[3]));
						item.setPrice(Double.parseDouble(box[4]));
						itemsArr.add(item);
					}
					if (type.equalsIgnoreCase("Dessert")) {
						Dessert item = new Dessert();
						item.setName(box[0]);
						item.setDescription(box[2]);
						item.setCalories(Integer.parseInt(box[3]));
						item.setPrice(Double.parseDouble(box[4]));
						itemsArr.add(item);
					}
					if (type.equalsIgnoreCase("Salad")) {
						Salad item = new Salad();
						item.setName(box[0]);
						item.setDescription(box[2]);
						item.setCalories(Integer.parseInt(box[3]));
						item.setPrice(Double.parseDouble(box[4]));
						itemsArr.add(item);
					}
					if (type.equalsIgnoreCase("Side")) {
						Side item = new Side();
						item.setName(box[0]);
						item.setDescription(box[2]);
						item.setCalories(Integer.parseInt(box[3]));
						item.setPrice(Double.parseDouble(box[4]));
						itemsArr.add(item);
					}

				} else {
					System.out.println("Data exception happened. Please check your data file");
				}

			}
			bf.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File Reading Exception Happens!");
			e.printStackTrace();
		}

		return itemsArr;
	}

	public static void writeMenu(String fileName, ArrayList<Menu1> menu1s) {

		try {
			File fl = new File(fileName);
			fl.delete();
			FileWriter fw = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < menu1s.size(); i++) {
				Menu1 menu1 = menu1s.get(i);
				if(i == menu1s.size()-1) {
					String s = menu1.toString();
					s += "Entree: " + menu1.getEntree().toString() + menu1.getEntree().getDescription() + ". Calories: "
							+ menu1.getEntree().getCalories() + " Price: " + menu1.getEntree().getPrice() + "\n";
					s += "Side: " + menu1.getSide().toString() + menu1.getSide().getDescription() + ". Calories: "
							+ menu1.getSide().getCalories() + " Price: " + menu1.getSide().getPrice() + "\n";
					s += "Salad: " + menu1.getSalad().toString() + menu1.getSalad().getDescription() + ". Calories: "
							+ menu1.getSalad().getCalories() + " Price: " + menu1.getSalad().getPrice() + "\n";
					s += "Dessert: " + menu1.getDessert().toString() + menu1.getDessert().getDescription() + ". Calories: "
							+ menu1.getDessert().getCalories() + " Price: " + menu1.getDessert().getPrice() + "\n";
					s += "Menu1 Total Calories: " + menu1.totalCalories() + "\tMenu Total Price: " + menu1.totalPrice();
					bw.write(s);
				}else {
					String s = menu1.toString();
					s += "Entree: " + menu1.getEntree().toString() + menu1.getEntree().getDescription() + ". Calories: "
							+ menu1.getEntree().getCalories() + " Price: " + menu1.getEntree().getPrice() + "\n";
					s += "Side: " + menu1.getSide().toString() + menu1.getSide().getDescription() + ". Calories: "
							+ menu1.getSide().getCalories() + " Price: " + menu1.getSide().getPrice() + "\n";
					s += "Salad: " + menu1.getSalad().toString() + menu1.getSalad().getDescription() + ". Calories: "
							+ menu1.getSalad().getCalories() + " Price: " + menu1.getSalad().getPrice() + "\n";
					s += "Dessert: " + menu1.getDessert().toString() + menu1.getDessert().getDescription() + ". Calories: "
							+ menu1.getDessert().getCalories() + " Price: " + menu1.getDessert().getPrice() + "\n";
					s += "Menu1 Total Calories: " + menu1.totalCalories() + "\tMenu Total Price: " + menu1.totalPrice()+"\n";
					bw.write(s);
				}
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
