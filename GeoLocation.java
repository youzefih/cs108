/**
 *  Program #2
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date 05/29/18
 *  @author  Youssef Iraqi
  */
public class GeoLocation {
	
	
	public static String getIdentificationString() {
		
		return "Program 1, Youssef Iraqi";
	}

	/**
+ distanceFrom( o : GeoLocation) : double
*/
private double EARTH_RADIUS_MILES = 3963.1676;
private double latitude;
private double longitude;

public GeoLocation () {
	latitude = 0;
	longitude = 0;
}
	public GeoLocation(double lat, double lon) { 
		latitude = lat;
		longitude = lon;
	}
	
	public void setLatitude(double lat) {
		latitude+=lat;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double lon) {
		longitude= lon;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	 public double distanceFrom(GeoLocation o) {
		 return latitude;
	 }
	
	
	public static void main(String[] args) {
		
		
		
	}

}
