package assignment1;

//imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

//Making an array and maybe method for Entrees?
public static ArrayList <Entree> readEntrees(String fileName) throws Exception {
ArrayList <Entree> enArr = new ArrayList<Entree>();
FileReader fr = new FileReader(fileName);
BufferedReader bf = new BufferedReader(fr);
String line = null;
	while((line = bf.readLine()) != null) {
		Entree en = new Entree();
		String[] box = line.split("@@");
			if(box.length == 3) {
				en.setName(box[0]);
				en.setDescription(box[1]);
				en.setCalories(Integer.parseInt(box[2]));
				enArr.add(en);
					}
				else {
					System.out.println("This is the exception. try again.");
				}
			}
bf.close();
fr.close();
	return enArr;
		}

//Sides
public static ArrayList <Side> readSides(String fileName) throws Exception {
ArrayList <Side> sidesArr = new ArrayList<Side>();
FileReader fr = new FileReader(fileName);
BufferedReader bf = new BufferedReader(fr);
String line = null;
	while((line = bf.readLine()) != null) {
		Side en = new Side();
		String[] box = line.split("@@");
		en.setName(box[0]);
		en.setDescription(box[1]);
		en.setCalories(Integer.parseInt(box[2]));
		sidesArr.add(en);
			}
bf.close();
fr.close();
	return sidesArr;
		}

//Salad
public static ArrayList<Salad> readSalads(String fileName) throws Exception{
ArrayList <Salad> saladsArr = new ArrayList<Salad>();	
FileReader fr = new FileReader(fileName);
BufferedReader bf = new BufferedReader(fr);
String line = null;
	while((line = bf.readLine()) != null) {
		Salad en = new Salad();
		String[] box = line.split("@@");
		en.setName(box[0]);
		en.setDescription(box[1]);
		en.setCalories(Integer.parseInt(box[2]));
		saladsArr.add(en);
			}
bf.close();
fr.close();
return saladsArr;
		}

//Dessert
public static ArrayList<Dessert> readDesserts(String fileName) throws Exception{
ArrayList <Dessert> desArr = new ArrayList<Dessert>();
FileReader fr = new FileReader(fileName);
BufferedReader bf = new BufferedReader(fr);
String line = null;
	while((line = bf.readLine()) != null) {
		Dessert en = new Dessert();
		String[] box = line.split("@@");
		en.setName(box[0]);
		en.setDescription(box[1]);
		en.setCalories(Integer.parseInt(box[2]));
		desArr.add(en);
			}
bf.close();
fr.close();
return desArr;
		}
	}	
