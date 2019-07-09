/**
 *  Program #2c
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date 05/29/18
 *  @author  Youssef Iraqi
  */
import java.lang.Math;
public class Calculator {

	public static String getIdentificationString() {
		return "Program 1, Youssef iraqi";
	}
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int squared(int num1) {
        return num1 * num1;
    }

    public double squareRoot(double num1) {
        double squareRoot = Math.sqrt(num1);
        return squareRoot;
    }

    public double power(double num1, double num2) {
        double toThePower = Math.pow(num1, num2);
        return toThePower;
    }
    
    public static void main(String [] args) {
    	
    		Calculator app = new Calculator();
    		
    		System.out.println(app.add(50,50));
    		System.out.println(app.subtract(100,50));
    		System.out.println(app.divide(50,10));
    		System.out.println(app.multiply(10,100));
    		System.out.println(app.squared(12));
    		System.out.println(app.squareRoot(16));
    		
    		System.out.println(app.power(2,7));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
  
}
	

	
	