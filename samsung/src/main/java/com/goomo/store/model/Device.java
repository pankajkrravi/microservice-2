package com.goomo.store.model;

public class Device {
    private String name;
    private String type;

    public Device() {
    }

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
