
public abstract class MyAbstractList<E> implements MyList<E> {
	public String getIdentificationString() {
		return "Program 7a,Youssef Iraqi";
	}

	protected int size;
	
	public MyAbstractList() {
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

}
