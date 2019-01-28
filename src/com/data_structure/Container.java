package com.data_structure;

public interface Container {
    int getCount ();
    boolean isEmpty ();
    boolean isFull ();
    void purge ();
    void accept (Visitor visitor);
    Iterator iterator ();
}