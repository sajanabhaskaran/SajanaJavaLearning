package com.lambdaCollectionIterarte;

public class School {
    private String schoolName;
    private String schoolAddress;
    private Integer totalStudents;

    public School(String name,String address,Integer total){
        schoolName= name;
        schoolAddress= address;
        totalStudents= total;

    }
    public School(String name){
        schoolName=name;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }
}
