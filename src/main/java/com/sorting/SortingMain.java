package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMain {
    public static void main(String[] args) {

        SortingMain sortingMain= new SortingMain();
        sortingMain.listSorting();
        sortingMain.objSorting();








    }

    private void objSorting() {
        List<Animal> animalList=new ArrayList<>();
        animalList.add(new Animal("Monkey"));
        animalList.add(new Animal("Dog"));
        animalList.add(new Animal("Cow"));

        MyObjectComparator myObjectComparator= new MyObjectComparator();
        /*Collections.sort(animalList,myObjectComparator);
        animalList.stream().forEach(System.out::println);*/
        Collections.sort(animalList,(o1, o2) ->{
                    Animal a1= (Animal)o1;
                    Animal a2= (Animal) o2;
                    return a1.getName().compareTo(a2.getName());
                }
                );
        animalList.stream().forEach(System.out::println);

    }

    private void listSorting() {
        MyComparator myComparator= new MyComparator();
        List<Integer> integerList= new ArrayList<>();
        integerList.add(12);
        integerList.add(1);
        integerList.add(234);
        integerList.add(15);
        integerList.add(26);
        integerList.add(74);


        //Collections.sort(integerList,myComparator);
        /*Collections.sort(integerList,(num1,num2)->{
            if (num1<num2) return 1;
            if (num1.equals(num2)) return 0;
            return -1;
        });*/
        Collections.sort(integerList,(num1,num2)-> num1.compareTo(num2));



        integerList.stream().forEach(System.out::println);
    }
}
