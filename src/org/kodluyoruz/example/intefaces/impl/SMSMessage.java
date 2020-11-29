package org.kodluyoruz.example.intefaces.impl;

import org.kodluyoruz.example.intefaces.Message;

public class SMSMessage implements Message {
    @Override
    public void send(String to, String message) {
        System.out.printf("[%s] -> send to %s", message, to);
    }
}
