package com.myConsumer;

public class Vehicle {
    private Long id;
    private String model;
    private Long kmDriven;
    private String regCountry;
    private String language;

    public String getLanguage() {
        return language;
    }

    public String getRegCountry() {
        return regCountry;
    }

    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Vehicle(Long id, String model, Long kmDriven) {
        this.id = id;
        this.model = model;
        this.kmDriven = kmDriven;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(Long kmDriven) {
        this.kmDriven = kmDriven;
    }

}
