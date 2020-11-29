package org.kodluyoruz.example.intefaces.impl;

import org.kodluyoruz.example.intefaces.Keyboard;

public class TouchableKeyboard implements Keyboard {
    @Override
    public void writeSomething(String something) {
        System.out.println("Writing -> " + something);
    }
}
