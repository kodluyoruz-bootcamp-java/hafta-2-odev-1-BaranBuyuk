package org.kodluyoruz.example.model;

import org.kodluyoruz.example.intefaces.Callable;
import org.kodluyoruz.example.intefaces.impl.*;
import org.kodluyoruz.example.model.enums.BrandEnum;

import java.util.HashMap;
import java.util.Map;

public class Samsung extends Phone {

    private final String imei;
    private final VersionNumber versionNumber;
    private final Memory memory;
    private final ScreenSize screenSize;

    public Samsung(String imei,
                   VersionNumber versionNumber,
                   Memory memory,
                   ScreenSize screenSize) {
        super(BrandEnum.SAMSUNG, addCallables(), new SMSMessage(), new FileShare()
        ,new Keypad());
        this.imei = imei;
        this.versionNumber = versionNumber;
        this.memory = memory;
        this.screenSize = screenSize;
        this.message = new SMSMessage();
    }

    private static Map<Class<?>, Callable> addCallables() {
        Map<Class<?>, Callable> callableMap = new HashMap<>();
        callableMap.put(VideoCall.class, new VoiceCall());
        return callableMap;
    }

    @Override
    protected String imei() {
        return imei;
    }

    @Override
    protected VersionNumber versionNumber() {
        return versionNumber;
    }

    @Override
    protected Memory memory() {
        return memory;
    }

    @Override
    protected ScreenSize screenSize() {
        return screenSize;
    }

    @Override
    public void share() {
        super.share.share();
    }


    @Override
    public void sendMessage(String to, String message) {
        super.message.send(to, message);
    }

    @Override
    public void writeSomething(String message) {
        super.keyboard.writeSomething(message);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand=" + getBrand() +
                ", imei='" + imei + '\'' +
                ", versionNumber=" + versionNumber +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                '}';
    }
}
