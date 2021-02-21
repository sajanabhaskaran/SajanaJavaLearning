package com.lambdaCollectionIterarte;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        TestMain testMain= new TestMain();
        testMain.processSchoolList();
        testMain.processSchoolListMap();






    }

    private void processSchoolListMap() {
        List<String> stringList= new ArrayList<>();

        stringList.add("TUPS");
        stringList.add("SGHS");
        stringList.add("MHS");
        List<School> schools= stringList.stream().map(s -> {
            return new School(s);
        }).collect(Collectors.toList());

        schools.stream().forEach(s-> System.out.println(s.getSchoolName()));





    }

    private void processSchoolList() {
        List<School> schoolList= new ArrayList<>();
        schoolList.add(new School("ISGR","Wavr",1000));
        schoolList.add(new School("UNY","Pabgd",1000));
        schoolList.add(new School("WEDR","Uvdf",1000));

        schoolList.stream().forEach(school -> {
            System.out.println(school.getSchoolName());});
    }

}
