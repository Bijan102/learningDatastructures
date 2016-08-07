package adt;

public abstract class Counter {
	
	private String name = null;
	private int value = 0;
	
	
	public Counter(String str)
	{
		this.name = str;
	}
	
	public void increment() {value++;}
	
	public int getCurrentValue() {return value;}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + ": " + value;
	}
	
	
}
