/**
 *  Program #2
 *  1-2 Line Description of class/program
 *  CS108-1
 *  05/25/18
 *  @author Youssef Iraqi
  */

public class ArrayMethods {
	
	public static String getIdentificationString() {
		return "Program 1, Youssef Iraqi";
	}
	public int findMin(int[] array) {
		int answer = 999;
		for (int i=0; i<array.length;i++) {
			if(answer>array[i]) {
				answer = array[i];
			}		
		}
	return answer;
	}
	
	public int findMinIndex(int [] array) {
		int answer = 999;
		int realAnswer = 999;
		for(int i=0; i<array.length;i++) {
			if (answer > array[i]) {
				answer= array[i];
				realAnswer = i;
			} 
		} 
		return realAnswer;	
	}
	
	public int[] reverse(int[] array) {
		int tmp;
		for (int i = 0; i<array.length/2;i++) {
			tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] =tmp;
			
		}
		return array;
	}
	
	
	public boolean shiftUp(int [] array) {
		if (array.length >= 11) {
		for (int i = 0; i<10;i++) {
			array[i] = array[i+1];
		}return true; } 
		
		else 
			return false;
		
		
		
		
	}
	
	public boolean shiftDown(int [] array) {
		if(array.length >= 11) { 
		int[] tmp = new int[array.length];
		for ( int i=0; i<array.length;i++) {
			tmp[i] = array[i];
		}
				for(int x=1; x<11;x++) {
				array[x] = tmp[x-1];
				
				
			}
		
	return true;	}
		else
			return false;
		
		
			
	}
	
	
	public static void main(String[] args) {
		

		 
		

	}

}
