package com.mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        MapMain mapMain= new MapMain();
        mapMain.addMapContent();
        mapMain.iterateMap();

    }

    private void iterateMap() {
        Map<Integer,Animal> animalMap= new HashMap<>();
        animalMap.put(1,new Animal(2,false,"Herbavorous"));
        animalMap.put(2,new Animal(4,true,"Carnavorous"));
        // entrySet method in the Map returns a set which contains an entry. An Entry represents 'Map.Entry<K,V>' class.
        Set<Map.Entry<Integer,Animal>> setEntry= animalMap.entrySet();
        setEntry.stream().forEach(integerAnimalEntry -> {
            System.out.println(integerAnimalEntry.getValue().toString());
            System.out.println(integerAnimalEntry.getKey());
        });
    }

    private void addMapContent() {
        Map<Integer,Animal> animalMap= new HashMap<>();
        animalMap.put(1,new Animal(2,false,"Herbavorous"));
        animalMap.put(2,new Animal(4,true,"Carnavorous"));
        Set<Integer> keySet =animalMap.keySet();
        for(Integer key:keySet){
            System.out.println(animalMap.get(key).toString());
        }

    }
}
