package com.equalsChecking;

import java.util.Objects;

public class Human {
    private String type;
    private String name;
    private String personalNum;
    private Integer age;

    public Human(String type, String name, String personalNum, Integer age) {
        this.type = type;
        this.name = name;
        this.personalNum = personalNum;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(String personalNum) {
        this.personalNum = personalNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return personalNum.equals(human.personalNum);
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
