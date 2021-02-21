package com.mapExample;

public class Animal {
    private Integer noOfLegs;
    private Boolean wild;
    private String eatingHabbit;

    public Animal(Integer legs,Boolean wd,String eating){
        this.eatingHabbit=eating;
        this.noOfLegs=legs;
        this.wild=wd;

    }

    public Integer getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(Integer noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Boolean getWildOrDomestic() {
        return wild;
    }

    public void setWildOrDomestic(Boolean wildOrDomestic) {
        this.wild = wildOrDomestic;
    }

    public String getEatingHabbit() {
        return eatingHabbit;
    }

    public void setEatingHabbit(String eatingHabbit) {
        this.eatingHabbit = eatingHabbit;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                ", wild=" + wild +
                ", eatingHabbit='" + eatingHabbit + '\'' +
                '}';
    }
}
