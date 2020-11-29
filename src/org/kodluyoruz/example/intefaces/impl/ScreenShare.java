package org.kodluyoruz.example.intefaces.impl;

import org.kodluyoruz.example.intefaces.Share;

public class ScreenShare implements Share {
    @Override
    public void share() {
        System.out.println("Screen sharing...");
    }
}
