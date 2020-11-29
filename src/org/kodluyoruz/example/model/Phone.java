package org.kodluyoruz.example.model;


import org.kodluyoruz.example.intefaces.Callable;
import org.kodluyoruz.example.intefaces.Keyboard;
import org.kodluyoruz.example.intefaces.Message;
import org.kodluyoruz.example.intefaces.Share;
import org.kodluyoruz.example.intefaces.impl.VideoCall;
import org.kodluyoruz.example.intefaces.impl.VoiceCall;
import org.kodluyoruz.example.model.enums.BrandEnum;
import org.kodluyoruz.example.model.enums.CallTypeEnum;
import org.kodluyoruz.example.model.enums.PhoneStatusEnum;

import java.util.Map;

public abstract class Phone {

    private final BrandEnum brand;

    protected abstract String imei();

    protected abstract VersionNumber versionNumber();

    protected abstract Memory memory();

    protected abstract ScreenSize screenSize();

    private PhoneStatusEnum phoneStatus = PhoneStatusEnum.CLOSE;

    protected Map<Class<?>, Callable> callables;
    protected Message message;
    protected Share share;
    protected Keyboard keyboard;


    public Phone(BrandEnum brand,
                 Map<Class<?>, Callable> callables,
                 Message message,
                 Share share,
                 Keyboard keyboard) {
        this.brand = brand;
        this.keyboard = keyboard;
        this.callables = callables;
        this.message = message;
        this.share = share;
    }


    public void open() {
        if (phoneStatus.equals(PhoneStatusEnum.CLOSE)) {
            System.out.println("Phone is opening..");
            this.phoneStatus = PhoneStatusEnum.OPEN;
            System.out.println("Phone is opened..");
        } else if (phoneStatus.equals(PhoneStatusEnum.OPEN)) {
            System.out.println("Phone is already open, you can not open the phone..");
        }
    }

    public void close() {
        if (phoneStatus.equals(PhoneStatusEnum.OPEN)) {
            System.out.println("Phone is closing..");
            this.phoneStatus = PhoneStatusEnum.CLOSE;
            System.out.println("Phone is closed..");
        } else if (phoneStatus.equals(PhoneStatusEnum.CLOSE)) {
            System.out.println("Phone is already close, you can not close the phone..");
        }
    }

    protected void call(CallTypeEnum callTypeEnum) {
        if (getPhoneStatus().equals(PhoneStatusEnum.OPEN)) {
            if (callTypeEnum.equals(CallTypeEnum.VIDEO)) {
                callables.get(VideoCall.class).call();
            } else if (callTypeEnum.equals(CallTypeEnum.VOICE)) {
                callables.get(VoiceCall.class).call();
            } else {
                throw new UnsupportedOperationException("Unsupported call operation");
            }
        } else {
            System.out.println("Phone is close, please open the phone..");
        }
    }

    public abstract void share();

    public abstract void sendMessage(String to, String message);

    public abstract void writeSomething(String message);

    public BrandEnum getBrand() {
        return brand;
    }

    protected PhoneStatusEnum getPhoneStatus() {
        return phoneStatus;
    }
}
