	/**
 *  Program #2
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date 06/01/18
 *  @author  Youssef Iraqi
  */

public class Place {
	
	public  String getIdentificationString() { 
		
		return "Program 4, Youssef Iraqi";
	}
	

	GeoLocation geo = new GeoLocation();
private String name;
private String description;
private GeoLocation location;
//this is wrong possibly !!!
//GeoLocation geo = new GeoLocation();
//this is wrong possibly !!!
	
	
     public Place ( String name, String desc, double latitude, double longitude) {
    	 this.name = name;
    	 this.description = desc;
    
    	geo.setLatitude(latitude);
 	geo.setLongitude(longitude);
 	
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
	
	
	public int compareTo(Place otherPlace) {
		return name.compareTo(otherPlace.getName());
	}
	
	public boolean equals(Place otherPlace) {
		return getLocation().equals(otherPlace.getLocation());
		
	}
	
	
	
}
	
