/**
 *  Program #2
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date 06/01/18
 *  @author  Youssef Iraqi
  */
public class Attraction extends Place { 
	
	private int type;
	private double price;
	

	public Attraction() {
	//  ok.setName("ok");
	// ok.setDescription("no");
	//	ok.setLocation(0,0);
		price = 0.0;
		type = 0;	
		
	} 
	public Attraction(String name, String desc, double latitude, double longitude, double price, int type) {
		
			setName(name);
			setLocation(latitude,longitude);
			this.price = price;
			this.type = type;
			setDescription(desc);
		/**	if (this.type == 0) {
			  setDescription("amusement park");
		}
			else 	if(this.type ==1) {
				setDescription("aquarium");
		}
			else    if (this.type == 2 ) {
				setDescription("zoo");
		}  */
			
		
	}
	
	
	
	public double getPrice() {
		return this.price;
	}
	
	public int getType() {
		return this.type;
	}
	public boolean hasAnimals() {
		if(type == 2 || type == 1 ) {
			return true;
		}
		else 
			return false;
	}
	@Override
	public String toString() {
		
		if(hasAnimals() == true) { 
			return  String.format( getName() +" (" + getLocation() +")" +"%n" +"	Tickets average $"+ getPrice() + "0 and feature exciting animals");
			
		}
		else
				return String.format( getName() +" (" + getLocation() +")" +"%n" +"	Tickets average $"+ getPrice()+"0");
		
	}
	
	

}
