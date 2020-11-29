package org.kodluyoruz.example.model;

public class VersionNumber {

    private final String number;

    public VersionNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "VersionNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
