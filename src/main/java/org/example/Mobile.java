package org.example;

public class Mobile {
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public DisplayFeatures getDisplayFeatures() {
        return displayFeatures;
    }

    public Mobile(int i, String brand, String name, DisplayFeatures displayFeatures) {
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }

}
