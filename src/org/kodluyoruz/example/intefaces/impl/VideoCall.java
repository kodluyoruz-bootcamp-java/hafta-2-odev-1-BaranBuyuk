package org.kodluyoruz.example.intefaces.impl;

import org.kodluyoruz.example.intefaces.Callable;

public class VideoCall implements Callable {
    @Override
    public void call() {
        System.out.println("Calling video to any number..");
    }
}
