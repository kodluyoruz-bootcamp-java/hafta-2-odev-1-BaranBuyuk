package org.kodluyoruz.example.model.enums;

public enum BrandEnum {

    SAMSUNG("Samsung"),
    APPLE("Apple");

    private final String name;

    BrandEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
