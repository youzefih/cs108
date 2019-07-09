import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *  Program #9a
 *  1-2 Line Description of class/program
 *  CS108-1
 *  Date
 *  @author  Youssef Iraqi
  */
public class GenMethods {
	public String getIdentificationString() {
		return "Program 9a, Youssef Iraqi";
	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> usedList = new ArrayList<E>();
		ArrayList<E> newList = new ArrayList<E>();

		for(int i = 0; i < list.size(); i++){

		E object = list.get(i);

		if(! usedList.contains(object))
		{
		usedList.add(object);
		newList.add(object);
		}
		}

		return newList;
		}
	
	public static <E> void shuffle (ArrayList<E> list) { 
	    Random rand = new Random(340L); 
	    for(int i = 0; i < 30; i++) { 
	        int a = rand.nextInt(list.size()); // nextInt is inclusive to 0 but not the bound
	        int b = rand.nextInt(list.size()); // so in this case it's 0 - 3
	             
	        E tmp = list.get(a); 
	        list.set(a, list.get(b)); // BTW because no reordering of the list was needed this is actually faster
	        list.set(b, tmp); // We also don't have to deal with what the new indexes are ;)
	        

	    } 
	}
	        
	       
		
		/** (2) Write the following method that shuffles an ArrayList. It should do this specifically
		 *  by swapping two indexes determined by the use of the random class (use Random rand = new Random(340L); ),
		 *  and it should do 30 of these swaps (this number was chosen arbitrarily by us for testing purposes).*/
	
	
	 //Write the following method that returns the largest element in an ArrayList:

	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max= list.get(0);
		
	for (int i=1;i<list.size();i++) {
		
		if( list.get(i).compareTo(max)>0) {
			max = list.get(i);
		}
		
	}
	return max;
	

	}
	
	
	
	//(4) Implement the following generic method for linear search.


	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		
		int index=-1;
		for(int i=0; i<list.length;i++) {
			if(key == list[i]) {
			index = i;
			return index;
			}
			
		}
		return index;
		
	}
	//(5) Implement the following method that returns the maximum element in an array:


	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
        for (int i = 1; i<list.length; i++)
            if (list[i].compareTo(max) > 0) 
                max = list[i];
        return max;
            
        
	}
	//(6) Implement a generic method that returns the maximum element in a two-dimensional array.

	public static <E extends Comparable<E>> E max(E[][] list) {
		
		E max= list[0][0];
		for(int i= 0; i<list.length;i++) 
			for(int j=0;j<list[i].length;j++) 
				if(list[i][j].compareTo(max)>0) 
					max = list[i][j];
					return max;
						

	}

	public static <E> void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.print("what is n");
		int n = scan.nextInt(); //number of elements in the lists
		
		Integer [] list = new Integer[n];
		LinkedList<Integer> linked = new LinkedList<>();
		
		
		for (int i=0; i<n;i++) {
			//System.out.println("Enter next n ");
			
			list[i] = scan.nextInt();
			linked.add(list[i]);
		}
		
		System.out.println(Arrays.toString(list));
		System.out.println(linked);
		//System.out.println("");
		
		//System.out.println("enter key");
		int k = scan.nextInt();
		
		int resultLinear = linearSearch(list,k);	
		if (resultLinear>=0) {
			System.out.println("Key "+ k + " was found at position " + resultLinear);
		} 
		else {
			System.out.println("Key " + k + " was not found");
		}
	
		int resultMax = max(list);
		System.out.println(resultMax + " is the max element");
		
		//System.out.println("enter first element of array");
		int m = scan.nextInt();
		//System.out.println("enter second element of array");
		int p = scan.nextInt();
		Integer [][] list2 = new Integer[m][p];
		
		//System.out.println("enter all elements of array"); 
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<p;j++) {
				list2[i][j] = scan.nextInt();
			}
		}
		 for (int i = 0; i < list2.length; i++) { 
				for(int j=0; j<list2[i].length;j++) {
			            System.out.print((list2[i][j]) + " "); 
				}
				System.out.println("");
				}
		
		int result = max(list2);
		System.out.println("");

		System.out.println(result+" is the max element");
		
		ArrayList<Integer> alist = new ArrayList<>(linked);
		System.out.println(alist);
		
		//not working 
		alist = removeDuplicates(alist);
		System.out.println(alist);
		
		
	//	 make this work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		shuffle(alist);
	System.out.println(alist);
		
		// issue here printing [ on array when it shouldnt also commas , !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		int res = max(alist);
		System.out.println(res + " is the max element");
		
	}
}


