package kab521_MenuManager_v2;
//imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

public static ArrayList <Entree> readEntrees(String name) throws Exception {
ArrayList <Entree> array2 = new ArrayList<Entree>();
FileReader flrdr = new FileReader(name);
BufferedReader buffreader = new BufferedReader(flrdr);
String line = null;
	while((line = buffreader.readLine()) != null) {
		Entree en = new Entree();
		String[] box = line.split("@@");
			if(box.length == 3) {
				en.setName(box[0]);
				en.setDescription(box[1]);
				en.setCalories(Integer.parseInt(box[2]));
				array2.add(en);
					}
				else {
				}
			}
buffreader.close();
flrdr.close();
	return array2;
		}

//Sides
public static ArrayList <Side> readSides(String name) throws Exception {
ArrayList <Side> arraysside = new ArrayList<Side>();
FileReader flrdr = new FileReader(name);
BufferedReader buffreader = new BufferedReader(flrdr);
String line = null;
	while((line = buffreader.readLine()) != null) 
	{
	Side en = new Side();
	String[] box = line.split("@@");
	en.setName(box[0]);
	en.setDescription(box[1]);
	en.setCalories(Integer.parseInt(box[2]));
	arraysside.add(en); }
buffreader.close();
flrdr.close();
return arraysside;
}

//Salad
public static ArrayList<Salad> readSalads(String name) throws Exception{
ArrayList <Salad> saladsArr = new ArrayList<Salad>();	
FileReader flrdr = new FileReader(name);
BufferedReader buffreader = new BufferedReader(flrdr);
String line = null;
	while((line = buffreader.readLine()) != null) 
	{
	Salad en = new Salad();
	String[] box = line.split("@@");
	en.setName(box[0]);
	en.setDescription(box[1]);
	en.setCalories(Integer.parseInt(box[2]));
	saladsArr.add(en);
	}
buffreader.close();
flrdr.close();
return saladsArr;
		}

//Dessert
public static ArrayList<Dessert> readDesserts(String name) throws Exception{
ArrayList <Dessert> array = new ArrayList<Dessert>();
FileReader flrdr = new FileReader(name);
BufferedReader buffreader = new BufferedReader(flrdr);
String line = null;
	while((line = buffreader.readLine()) != null) {
		Dessert en = new Dessert();
		String[] box = line.split("@@");
		en.setName(box[0]);
		en.setDescription(box[1]);
		en.setCalories(Integer.parseInt(box[2]));
		array.add(en);
			}
buffreader.close();
flrdr.close();
return array;
		}
	}	