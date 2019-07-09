import java.util.Arrays;

/**
       *  Program #2
       *  1-2 Line Description of class/program
       *  CS108-1 
       *  Due Date  05/30/18
       *  @author  Youssef Iraqi
       */

public class LatAndLong {
	public static final double EARTH_RADIUS_KM = 6371;
	
	
	
	
	public static String getIdentificationString() {
		return "Program 2, Youssef Iraqi";
		
	}
	
	public static Double[] printArrays(Double[] array1, Double[] array2) { 
		for (int i = 0 ; i<array1.length;i++) {
			
		System.out.format("%10.6f\t%10.6f\n", array1[i], array2[i]);
			}
		return array1;
	}
	
	
	
	
	
	
	
	public static double distanceFrom(double x1, double y1, double x2, double y2) {
        double lat1 = Math.toRadians(x1);
        double long1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double long2 = Math.toRadians(y2);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        System.out.println("Distance in kilometers: " + arcLength * EARTH_RADIUS_KM);
        System.out.println("");
        

        return arcLength * EARTH_RADIUS_KM;
        
        
        
    }



	
	
	
	
	
	
	public static void main(String[] args) {

		//System.out.print(getIdentificationString());
	
		Double[] latitude = { 48.858093, -3.070000, 27.173891, 51.501476, -22.9519 };
		Double [] longitude = { 2.294694, 37.349998, 78.042068, -0.140634, -43.2104 };
		printArrays(latitude,longitude);
		System.out.println("");
		//System.out.print(distanceFrom(latitude[2],longitude[2],latitude[4],longitude[4]));
		distanceFrom(latitude[1],longitude[1],latitude[3],longitude[3]);
		Arrays.sort(latitude);
		printArrays(latitude,longitude);
		

		
		
		
	}

}
