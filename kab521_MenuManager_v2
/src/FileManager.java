//Class File Manager
//@author : Kathryn Bager
//@created: 11/04/2022



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class FileManager {

	public static ArrayList<Entree> readEntree(String fileName) throws Exception {
		ArrayList<Entree> enArr = new ArrayList();
		FileReader fr = new FileReader(fileName);
		BufferedReader bf = new BufferedReader(fr);
		String line = null;
		while((line = bf.readLine()) != null) {
			Entree en = new Entree();
			String[] box = line.split("@@");
			if(box.length==3) {
				en.setName(box[0]);
				en.setDescription(box[1]);
				en.setCalories(Integer.parseInt(box[2]));
				enArr.add(en);
			}else {
				System.out.println("Data exception.");
			}
			
		}
		bf.close();
		fr.close();
		return enArr;
	}

	public static ArrayList<Side> readSide(String fileName) throws Exception {
		ArrayList<Side> sideArr = new ArrayList();
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
		return sideArr;
	}

	public static ArrayList<Salad> readSalad(String fileName) throws Exception{
		ArrayList<Salad> saladArr = new ArrayList();
		FileReader fr = new FileReader(fileName);
		BufferedReader bf = new BufferedReader(fr);
		String line = null;
		while((line = bf.readLine()) != null) {
			Salad en = new Salad();
			String[] box = line.split("@@");
			en.setName(box[0]);
			en.setDescription(box[1]);
			en.setCalories(Integer.parseInt(box[2]));
			saladArr.add(en);
		}
		bf.close();
		fr.close();
		return saladsArr;
	}

	public static ArrayList<Dessert> readDessert(String fileName) throws Exception{
		ArrayList<Dessert> desArr = new ArrayList<Dessert>();
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
}