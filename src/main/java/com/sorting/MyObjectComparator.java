package com.sorting;

import java.util.Comparator;

public class MyObjectComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal a1= (Animal) o1;
        Animal a2= (Animal) o2;
        return a2.getName().compareTo(a1.getName());

    }
}
