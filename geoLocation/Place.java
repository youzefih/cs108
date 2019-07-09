/**
 *  Program #6b
 *  CS108-1
 *  Date 06/01/18
 *  @author  Youssef Iraqi
  */

public class Place implements Comparable<Place> {
	
	public  String getIdentificationString() { 
		
		return "Program 6b, Youssef Iraqi";
	}
	

	GeoLocation geo = new GeoLocation();
private String name;
private String description;
private GeoLocation location;

	
	
     public Place ( String name, String desc, double latitude, double longitude) {
    	 this.name = name;
    	 this.description = desc;
    
    	geo.setLatitude(latitude);
 	geo.setLongitude(longitude);
 	
     }
	
	public Place() {
		
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		
		return name;
	}
	public void setDescription(String description) {
		this.description = description;
		
	}
	public String getDescription() {
		
		return description;
	}
	
	
	public void setLocation(double latitude, double longitude) {
		geo.setLatitude(latitude);
		geo.setLongitude(longitude);
	}
	
	public void setLocation(GeoLocation location) {
		geo = location;
	}
	
	public GeoLocation getLocation() {
		return geo;
	}
	public String toString() {
		return "" + getName() + "," + getDescription() + "," + geo.toString();
	}
	
	// Compare method used to comparing against otherPlace's name

	public int compareTo(Place otherPlace) {
		return name.compareTo(otherPlace.getName());
	}
	// comparing location of place with otherPlace
	
	public boolean equals(Place otherPlace) {
		return getLocation().equals(otherPlace.getLocation());
		
	}
	
	
	
	
	
}
	
