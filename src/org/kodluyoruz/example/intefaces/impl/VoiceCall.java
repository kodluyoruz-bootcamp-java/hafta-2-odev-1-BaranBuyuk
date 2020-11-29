package org.kodluyoruz.example.intefaces.impl;

import org.kodluyoruz.example.intefaces.Callable;

public class VoiceCall implements Callable {
    @Override
    public void call() {
        System.out.println("Calling voice to any number..");
    }
}
