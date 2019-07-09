import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadCSV {	
	
	public String getIdentificationString() {
		 return"Program 9b, Youssef Iraqi";
	 }
	public static void main(String args []) {
		
		
		        //Taking input from user
		        Scanner scanner = new Scanner(System.in);
		        //System.out.println("Enter file name");
		        String fileName = scanner.next();
		        int colSize;
		        ArrayList<Marker> locations = new ArrayList<>();


		        BufferedReader bufferedReader;
		        try {
		            //Creating buffered reader
		            bufferedReader = new BufferedReader(new FileReader(fileName));
		            ArrayList<String> headerItems = CsvParser.parseLine(bufferedReader.readLine());
		            //Conditions to handle if file is of incorrect format
		            if(headerItems.size() < 2){
		                System.out.println("Incorrect file format: must have at least two columns in the CSV file");
		                System.exit(1);
		            }else if(headerItems.size() != 2 && headerItems.size() != 3 && headerItems.size() != 5){
		                System.out.println("Incorrect file format: must have 2, 3, or 5 columns in the CSV file.");
		                System.exit(1);
		            }else{
		                //Create a marker and insert it into an arraylist
		                colSize = headerItems.size();
		                ArrayList<String> data;
		                String lineRead;
		                Marker location;
		                while((lineRead = bufferedReader.readLine()) != null){
		                    if(colSize == 2){
		                        location = new Marker(false, false);
		                    }else if(colSize == 3){
		                        location = new Marker(true, false);
		                    }else{
		                        location = new Marker(true, true);
		                    }

		                    location.fillMarker(CsvParser.parseLine(lineRead));
		                    locations.add(location);
		                }
		            }

		        } catch (FileNotFoundException e) {
		            System.err.println("File not found");
		            System.exit(1);
		        }
		        catch (IOException e){
		            e.printStackTrace();
		            System.exit(1);
		        }

		        //Print the whole arraylist
		        System.out.println(locations.toString());

		    }
		
		   }