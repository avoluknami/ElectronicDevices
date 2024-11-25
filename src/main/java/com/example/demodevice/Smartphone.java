package com.example.demodevice;

public class Smartphone extends Device {

    private double screenSize;
    private double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super();
        setScreenSize(Type.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    private void setScreenSize(Type type, String name, double price, double weight) {
    }

    // Getters and setters for new attributes
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + ", screenSize=" + screenSize + ", cameraResolution=" + cameraResolution;
    }
}
