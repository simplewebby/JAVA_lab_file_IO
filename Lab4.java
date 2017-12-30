/*Tsagan Garyaeva
 * COMP-271
 * Lab 4 12.15 pg 490
 * File I/O
 */


//package java271;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab4 {
	public static void main (String[] args ) throws IOException {
		//Create random numbers
		Random rand =  new Random();
		int num = 101;
		java.io.File file= new java.io.File("Exercise12_15.txt");
		//if (!file.exists()) {
		//	System.out.println("The file  does not exist. ");
		//	System.exit(1);
		//}
		//create a file 
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		// Write the numbers to the file
		try {

			for (int i = 1; i< num; i++) {
				int ranNum = rand.nextInt(num);
				output.print(ranNum + " " );
			}
			output.close();

		}
		catch(Exception ex) {
			System.out.println("Error:" + ex.getMessage());
		}
		// Print the numbers from the file
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		List<Integer> integers = new ArrayList<>();
		while(scan.hasNext()) {
			// no need for the following if statement and the else
			// the logic in the else would never execute.
			//if (scan.hasNext()) {
				integers.add(scan.nextInt());
				//Collections.sort(integers);

			//}
			//else {
			//	scan.next();
			//}
		}
		// only sort once -  after all the integers have been read in
		Collections.sort(integers);
		System.out.println(integers + " ");
	}


}






	
	
	


