/**
 *  Program #2
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date 06/01/18
 *  @author  Youssef Iraqi
  */

public class Eatery extends Place{
	private double cost;
	private String cuisine;
	private int starRating;
	public Eatery() { }
	public Eatery (String name, String desc, double latitude, double longitude, String cuisine, double cost, int starRating) {
		setName(name);
		setDescription(desc);
		setLocation(latitude,longitude);
		this.cuisine = cuisine;
		this.cost = cost;
		this.starRating = starRating;
	}
	public double getCost() {
		return this.cost;
	}
	public String getCuisine() {
		return this.cuisine;
	}
	public int getRating() {
		return this.starRating;
	}
	public String ratingToStars() {
		if( this.starRating == 1 ) {
			return "*";
		}
		else if( this.starRating == 2 ) {
			return "**";
		}
		else if( this.starRating == 3 ) {
			return "***";
		}
		else if( this.starRating == 4 ) {
			return "****";
		}
		
		else return "*****";
		
	}
	public String getCostToSymbols() {
		if(cost<25.0) {
			return "$";
		}
		else if(cost<50.0) {
			return "$$";
		}
		else if (cost<75.0) {
			return "$$$";
		}
		else if (cost<100.0) {
			return "$$$$";
		}
		else 
			return "$$$$+";
	}
	@Override
	public String toString() {
		return String.format( getName() +" (" + getLocation() +")" +"%n" + "	Price: " + getCostToSymbols() + "%n" + "	Rating: " + ratingToStars());
	}
	
public  String getIdentificationString() { 
	
	return "Program 4, Youssef Iraqi";
}
}