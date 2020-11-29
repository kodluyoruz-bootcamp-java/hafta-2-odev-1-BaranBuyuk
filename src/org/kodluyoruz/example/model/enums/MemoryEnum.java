package org.kodluyoruz.example.model.enums;

public enum MemoryEnum {

    KB("Kilobyte"),
    MB("Megabyte"),
    GB("Gigabyte"),
    TB("Terabyte");

    private final String name;

    private MemoryEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
