package com.collectionSaj;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet maintains objects in Sorted order defined by either Comparable or Comparator method in Java
        TreeSetExample treeSetExample= new TreeSetExample();
        treeSetExample.integeradd();
        treeSetExample.objectAdd();




    }

    private void objectAdd() {
        Train train= new Train(12,"TTR");
        Set<Train> trainSet= new TreeSet<>();
        trainSet.add(new Train(23,"DER"));
        trainSet.add(new Train(34,"OYR"));
        trainSet.add(new Train(45,"QWS"));
        trainSet.add(new Train(1,"WED"));
        trainSet.add(new Train(42,"AWS"));
        trainSet.stream().forEach(o->{
            System.out.println(o);
        });


    }

    private void integeradd() {
        Set<Integer> integerSet= new TreeSet<>();
        integerSet.add(45);
        integerSet.add(2);
        integerSet.add(234);
        integerSet.add(12);
        integerSet.add(23);
        integerSet.add(123);
        integerSet.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
