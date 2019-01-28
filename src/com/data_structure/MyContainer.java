package com.data_structure;

public class MyContainer extends AbstractContainer {
	private final int SIZE = 100; 
	protected Comparable[] array = new Comparable[SIZE];
	
	public boolean isFull() {
		return count == SIZE;
	}
	
	public void purge() {
		for (int i=0; i<count; i++)
			array[i] = null;
		count = 0;
	}
	
	public int getSize(){
		return SIZE;
	}
	
	public Iterator iterator() {
		
		return new Iterator () {
			
			private int pos = 0;
			
			public boolean hasNext() {
				return pos < count;
			}
			
			public Object next() {
				Comparable element = array[pos];
				pos++;
				return element;
			}
		};
	}
	
	public void insert(Comparable object) {
		if(isFull())
		  throw new ContainerFullException();
		else{
		  array[count] = object;
		  count++;
	    }
	}
}			