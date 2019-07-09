import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;


public class RandomArray {
  
   public static int[] createXArray(int x) {
       if(x < 0) {
           throw new ArrayIndexOutOfBoundsException();
       }
       int[] array = new int[x];
       for(int i=0; i<x; i++)
           array[i] = x - i;
       return array;
   }
   
   public static int[] createYArray(int y, int[] xArray) {
       if(y < 1) {
           throw new ArrayIndexOutOfBoundsException();
       }
       Random r = new Random(123L);
       int[] array = new int[y];
       for(int i=0; i<y; i++)
           array[i] = xArray[r.nextInt(xArray.length)];
      
       return array;      
   }
   public static void printArray(int[] array) throws FileNotFoundException {
	   PrintWriter out = new PrintWriter("output.txt");
	   for(int n: array) {
           out.print(n + " ");
       }
       out.println("");
   }
   
   public static String getIdentificationString() {
	   Random r = new Random(123L);
	   return r.nextInt() + ", Youssef Iraqi";
	   
   }

   public static void main(String[] args) throws FileNotFoundException {
       int x = 20, y = 10;
       int [] xArray = createXArray(x);
       printArray(xArray);
      
       int [] yArray = createYArray(y, xArray);
       printArray(yArray);
       System.out.print(getIdentificationString());
       
   }

}
