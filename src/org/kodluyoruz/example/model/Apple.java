package org.kodluyoruz.example.model;


import org.kodluyoruz.example.intefaces.Callable;
import org.kodluyoruz.example.intefaces.impl.*;
import org.kodluyoruz.example.model.enums.BrandEnum;

import java.util.HashMap;
import java.util.Map;


public class Apple extends Phone {

    private final String imei;
    private final VersionNumber versionNumber;
    private final Memory memory;
    private final ScreenSize screenSize;

    public Apple(String imei,
                 VersionNumber versionNumber,
                 Memory memory, ScreenSize screenSize) {
        super(BrandEnum.APPLE, addCallables(), new SMSMessage(), new ScreenShare()
                , new TouchableKeyboard());
        this.imei = imei;
        this.versionNumber = versionNumber;
        this.memory = memory;
        this.screenSize = screenSize;

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

    public static Map<Class<?>, Callable> addCallables() {
        Map<Class<?>, Callable> callableMap = new HashMap<>();
        callableMap.put(VoiceCall.class, new VoiceCall());
        callableMap.put(VideoCall.class, new VoiceCall());
        return callableMap;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand=" + getBrand() +
                ", imei='" + imei + '\'' +
                ", versionNumber=" + versionNumber +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                '}';
    }
}
