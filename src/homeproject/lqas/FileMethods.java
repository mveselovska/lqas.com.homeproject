package homeproject.lqas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FileMethods {

	public static ArrayList<Vehicle> readFileToArrayList(String fileToRead) throws FileNotFoundException{
		File file = new File(fileToRead);
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	    Scanner in = new Scanner(file);
	    while (in.hasNextLine()){
	    	Vehicle v = new Vehicle();
	    	String[] data = in.nextLine().split(","); 
    		v.model = data[0].trim();
    		v.year = Integer.valueOf(data[1].trim());
    		v.price = Double.valueOf(data[2].trim());
	        list.add(v);
	        
	    }
	    in.close();
	     return list;
}
	public static <T> void printFile(ArrayList<T> arrayListFromFile){
		for (T c : arrayListFromFile){
			System.out.println(c);
				}
}
	public static class Vehicle implements Comparator<Vehicle>{
		String model;
		int year;
		double price;
		
		public String toString() {
	        return "M: " + model + ", Y: " + year + ", P: " + price;
	    }

		@Override
		public int compare(Vehicle V1, Vehicle V2){
			if (V1.price < V2.price)
				return -1;
			else if (V1.price == V2.price)
				return 0;
			return 1;
			}

		}
	 	
	
	}

