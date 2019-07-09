
//import statements
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCSV {

	
	 public static String getIdentificationString() { 
		return "Program 5a, Youssef Iraqi";
	}
	 public static void main(String[] args) {
// Grading program needs hardcoded filename. Oh, well. "
String inputFilename = "coords.txt";
String outputFilename = changeFileExtToCsv(inputFilename);

// Open files
// call method to open input file
Scanner input = openInput(inputFilename);

// call method to open output file
PrintWriter output = openOutput(outputFilename);

// Read input line, replace all spaces with commas,
// and write output line
while (input.hasNextLine()) {

/*
* this section is used to erase the complete content
* and write the new content as new to the file output.print(""); output.close();
*/
// store every lines from the file to string
String nextLine = input.nextLine();

// replace the empty spaces from the file to comma
String content = nextLine.replaceAll(" ", ",");

// write to the new file
output.println(content);
}
// close streams
output.close();
System.out.println("The file" + outputFilename + "has been created");
}

/**
* Changes file extension to ".csv"
*
* @param filename
* @return
*/
public static String changeFileExtToCsv(String filename) {
return filename.substring(0, filename.lastIndexOf('.')) + ".csv";
}

/**
* Open input for reading
*
* @param filename
* @return
*/
public static Scanner openInput(String filename) {
Scanner in = null;
  
//surround the next two lines with a try block
File infile = new File(filename);
try {
in = new Scanner(infile);
} catch (FileNotFoundException e) {
e.printStackTrace();
System.out.println(filename + " could not be found");
System.exit(0);
}

return in;
}

/**
* Open output for writing
*
* @param filename
* @return
*/
public static PrintWriter openOutput(String filename) {
PrintWriter printWriter = null;
try {
printWriter = new PrintWriter(new FileOutputStream(
new File(filename),
true));
} catch (FileNotFoundException e) {
e.printStackTrace();
}
return printWriter;
}
}

