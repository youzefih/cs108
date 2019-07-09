import java.util.ArrayList;




// ToDo: Test Birch Aquarium and SD Zoo types, print true or false

public class Destinations {

    public static void main(String[] args) {
        ArrayList<Place> places = initList(); 
        
        							// Printing each place below:
       for( Place one: places) {
    	   System.out.println(one);
       }
       
       						// For each Eatery printing getRating and ratingToStars
       
       for( Place two: places) {
    	   if(two instanceof Eatery) {
    		   Eatery three = (Eatery)two;
    		   System.out.print(three.getRating());
    		   System.out.print(" " + three.ratingToStars());
    		   System.out.println("");
     	   }
       }
       						//For each instance of Attraction ,printing name + description

       for( Place four:places) {
    	   if( four instanceof Attraction)
    	   System.out.println(four.getName() + " " +  ((Attraction)four).getDescription()); 
    	   		
       } 
    

       
       			// setting up tea Station and tender Greens and pancake for later.
       Eatery pancake = (Eatery)places.get(0);
       Eatery teaStation = (Eatery)places.get(1);
       Eatery tenderGreens = (Eatery)places.get(2);
       
       //Comparing both and printing true or false
       
       		if(teaStation.equals(tenderGreens)) {
       			System.out.println("true");
       		}
       		else System.out.println("false");
       
       	// Comparing Pancake with tendergreens cuisine
       		
       		if(pancake.getCuisine().equals(tenderGreens.getCuisine())) {
       			System.out.println("true");
       		} else  System.out.println("false");
       		
       	// ToDo: Test Birch Aquarium and SD Zoo types, print true or false

       	Attraction birchAquarium = (Attraction)places.get(4);
       	Attraction sdZoo = (Attraction)places.get(5);
       		if(birchAquarium.equals(sdZoo)) {
       			System.out.println("true");
       		} else  System.out.println("false");
    
    }
    private static ArrayList<Place> initList() {
        ArrayList<Place> list = new ArrayList<>();
        Eatery[] restaurants = {
                new Eatery("Original Pancake House","Breakfast",32.815274,-117.1546500,"casual dining",14.0,4),
                new Eatery("Tea Station","Asian cafe with tea drinks",32.76049,-117.06739,"casual dining",8.0,3),
                new Eatery("Tender Greens","2400 Historic Decatur Rd",32.73547,-177.21601,"casual dining",26.0,4)
        };
        Attraction[] fun = {
                new Attraction("PetCo Park","Padres Baseball",32.708129,-117.157036,37.0,0),
                new Attraction("Birch Aquarium at Scripps Institution of Oceanography",
                        "Fish Aquarium",32.865776,-117.250518, 18.50, 1),
                new Attraction("San Diego Zoo","Animal Park",32.735316,-117.149046,52.0,2)
        };
        for (Eatery e : restaurants)
            list.add(e);
        for (Attraction a : fun)
            list.add(a);

        return list;
    }
public String getIdentificationString() {
		
		return "Program 6a, Youssef Iraqi";
	}
}