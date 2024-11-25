package com.example.demodevice;

public class Device {

    public Device() {

    }

    public enum Type {
        SMARTPHONE, LAPTOP, TABLET
    }

    private Type type;
    private String name;
    private double price;
    private double weight;

    // Parameterized constructor to initialize the attributes
    public Device(Type type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Getters and Setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // ToString method to display device details
    @Override
    public String toString() {
        return "Device [type=" + type + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
    }
}
