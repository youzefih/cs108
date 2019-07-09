/** MyArrayList
 *  
 *  Students should complete all methods in the interface MyList.
 *  
 *  Add helper methods (private/protected) where useful. 
 *  Suggestions:  shiftUp, shiftDown, checkIndexRange, etc.
 *
 */
public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {

	protected E[] array;
	protected static final int INITIAL_CAPACITY = 10;
	protected int size;
	
	public MyArrayList() {
		this(INITIAL_CAPACITY);
	}

	public MyArrayList(int initialCapacity) {
		super();
		array = (E[])new Object[initialCapacity]; // let fail if bad parameter
		size = 0;
	}

//	public static void main (String [] args) throws Exception {
//		
//		MyArrayList list = new MyArrayList();
//		list.add("One");
//		list.add("Two");
//		list.add("Three");
//		list.add("Four");
//		list.add("Five");
//		list.add("Six");
//		list.add("Seven");
//		list.add("Eight");
//		list.add("Nine");
//		list.add("Ten");
//		list.add("3,hi");
//		for( int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println(list.toString());
//	}
	
public String getIdentificationString() {
	return "Program 7a, Youssef Iraqi";
}
	
	@Override
	public boolean add(E data) {
		
		verifyCapacity(size+1);
		
		
		array[size++] = data;
		return true;
	}
	
	
	
	
	public void verifyCapacity(int need) {
		if(need>=array.length) {
			resize();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Appends the specified Object to the list at the specified index
	 * 
	 * @param index
	 *            position to insert data
	 * @param data
	 *            element to insert
	 * @return boolean success
	 */
	@Override
	public boolean add(int index,E data) {
		verifyCapacity(size);
		for(int i=size;i>index;i--) {
			array[i] = array[i-1];
		}
		array[index] = data;
		size++;
		return true;
	}

	/**
	 * Let the garbage collector do the heavy lifting!
	 */
	// @SuppressWarnings("unchecked")
	public void clear() {
		for (int i=0; i<size;i++) {
			array[i] = null;
		}
	}

	@Override
	public boolean contains(E data) {
		for(int i = 0; i<size; i++) {
			if (array[i].equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		return this.size==0; 
	}

	/**
	 * Returns the Object at the specified position in this list
	 * 
	 * @param index
	 * @return Object
	 * @throws Exception
	 *             if index out of range
	 */
	@Override
	public E get(int index) {
		E data = (E) array[index];
		return data;
	}
	
	public int size() {
		return this.size;
	}

	
	@Override
	public E remove(int index) {
		E temp =(E) array[index];
		for(int i=index+1;i<array.length;i++) {
			array[i-1] = array[i];
		}
		size--;
		return temp;
	}

	/**
	 * Returns the index of the first occurrence of the specified Object in this
	 * list, or -1 if this list does not contain the Object
	 * 
	 * @param data
	 *            element to search for
	 * @return int position of data if found, else -1
	 */
	@Override
	public int indexOf(E data) {
		for(int i=0; i<size;i++) {
			if(array[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(E data) {
		for(int i = size; i<=0;i--) {
			if(array[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public void trimToSize() {
		for(int i = 0; i<size;i++) {
			if(array[i]==null) {
				size--;
			}
		}
		
	}
	
	@Override
	public String toString() {

		String arr ="[";
		for(int i=0;i<size;i++) {
			if(i<=size-2) {
				arr+=array[i]+", "; 
			}
			else arr+=array[i];
		}
		arr+="]";
		return arr;
	}

	/**
	 * Grow array
	 */
	@SuppressWarnings("unchecked")
	private void resize() {
		try {
			this.array = (E[]) this.doubleArraySizeAndCopy();
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
		}
	}

	/**
	 * Double size and copy elements.  
	 * @return Object[]
	 */
	// @SuppressWarnings("unchecked") // uncomment for generic type
	private E[] doubleArraySizeAndCopy() {
		E[] temp = (E[]) new Object[this.array.length * 2];
		for (int i = 0; i < this.array.length; i++) {
			temp[i] = this.array[i];
		}
		/* Alternately, could  use:
		 *    temp = Arrays.copyOf(array, temp.length);
		 */
		return temp;
	}

	private boolean checkRange(int index) throws Exception {
		if (index < 0)
			throw new IllegalArgumentException("Index cannot be negative");
		if (index >= this.size)
			throw new IndexOutOfBoundsException(
					"Cannot access " + index + " element");
		return true;
	}	

}
