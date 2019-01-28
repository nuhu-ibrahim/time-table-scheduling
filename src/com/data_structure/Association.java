package com.data_structure;

public class Association implements Comparable{
    protected Comparable key;
    protected Object value;

    public Association(Comparable comparable, Object obj){
        key = comparable;
        value = obj;
    }

    public Association(Comparable comparable){
        this(comparable, null);
    }

    public Comparable getKey(){
        return key;
    }

    public Object getValue(){
        return value;
    }
    
    public void setKey(Comparable key){
    	this.key = key;
    }
    
    public void setValue(Object value){
    	this.value = value;
    }

    public int compareTo(Object obj){
        Association association = (Association)obj;
        return key.compareTo(association.getKey());
    }

    public boolean equals(Object obj){
    	return compareTo(obj) == 0;
    }
    
    public String toString(){
        String s = "{ " + key;
        if(value != null)
            s = s + " ,   " + value;
        return s + " }";
    }
}