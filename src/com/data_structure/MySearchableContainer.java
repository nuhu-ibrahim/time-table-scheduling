package com.data_structure;

public class MySearchableContainer extends MyContainer implements SearchableContainer {
	
	private int findIndex(Comparable target){
		int index = 0;
		while(index < count && !array[index].equals(target)) 
			index++;

		if(index < count)  //then target is found
			return index;
		else
			return -1;
	}
	
	public void withdraw(Comparable target){
		int index = findIndex(target);
		if(index != -1) {  //the target exists
			for (int i = index; i<count-1; i++)
				array[i] = array[i+1];        // shift each element from index to count -1 

			count--;
		}
	}
	//returns the reference to the target if found, null otherwise 
	public Comparable find(Comparable target) {
            // to be implemented by students
	    if(isMember(target)){
                int index=findIndex(target);
                return array[index];
            }
            return null;
	}
    //returns true if target is in the container, false otherwise.	
	public boolean isMember(Comparable target) {
		// to be implemented by students
		int index=findIndex(target);
                if(index!=-1)
                    return true;
                return false;
	}
}			