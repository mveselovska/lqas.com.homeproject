package homeproject.lqas;



import homeproject.lqas.FileMethods.Vehicle;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;




public class FilesManipulations {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> file = FileMethods.readFileToArrayList("Cars");
		Collections.sort(file, new Vehicle());
		FileMethods.printFile(file);
//		System.out.println(file);
		}
			}

		
	