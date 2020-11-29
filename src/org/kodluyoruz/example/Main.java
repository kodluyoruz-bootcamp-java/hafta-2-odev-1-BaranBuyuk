package org.kodluyoruz.example;

import org.kodluyoruz.example.model.*;
import org.kodluyoruz.example.model.enums.MemoryEnum;
import org.kodluyoruz.example.model.enums.ScreenSizeTypeEnum;

public class Main {

    public static void main(String[] args) {
        Phone apple = new Apple("123456",
                new VersionNumber("A101-234"),
                new Memory(1000, MemoryEnum.MB),
                new ScreenSize(5.4f, ScreenSizeTypeEnum.INC));
        System.out.println(apple.toString());

        apple.open();
        apple.share();
        apple.writeSomething("Apple writing");
        apple.sendMessage("Baran","Test");
        apple.close();

        Phone samsung = new Samsung("B1234-2234",
                new VersionNumber("A101-234"),
                new Memory(16, MemoryEnum.GB),
                new ScreenSize(6.8f, ScreenSizeTypeEnum.INC));

        System.out.println(samsung.toString());

        samsung.open();
        samsung.share();
        samsung.writeSomething("Apple writing");
        samsung.sendMessage("Baran","Test");
        samsung.close();

    }
}
