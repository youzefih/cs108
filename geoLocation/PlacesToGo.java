import java.util.ArrayList;
import java.util.Collections;

/**
 *  Program #6b
 *  CS108-1
 *  Date
 *  @author  Youssef iraqi
  */
public class PlacesToGo {
	public String getIdentificationString() {
		return "Program 6b, Youssef Iraqi";
	}
	
	public static void main (String [] args) {
								//Arraylist of all places
		
		ArrayList<Place> list = new ArrayList<Place>();

		// Adding them to a list
		
		list.add(new Place("New York", "One very large city", 100.2, 150.1283));
		list.add(new Place("Los Angeles", "City of angels", 54.89, -100.30));
		list.add(new Eatery("Chilis", "American sized food", 36.265, 127.387, "American", 30, 3));
		list.add(new Eatery("Panda Express", "My Favorite Place", -117.479, -27.968, "Chinese", 10, 4));
		list.add(new Attraction("County Fair", "Janky rides", -23.27, 237.387, 25, 3));
		list.add(new Attraction("San Diego Zoo", "Harambe lives in our hearts", -45.27, 28.39, 40, 1));
		
		// printing the list using an enhanced for loop
		for(Object print: list) {
			System.out.println(print);
		}
		// extra empty line
	System.out.println("");
	// sorting the list 
	
	 Collections.sort(list);
	 // testing again 
	 for(Object print: list) {
			System.out.println(print);
		}
		
	}

}
