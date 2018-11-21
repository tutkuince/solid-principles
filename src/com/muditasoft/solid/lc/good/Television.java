package com.muditasoft.solid.lc.good;

public class Television implements Remotable {

    @Override
    public void on() {
        System.out.println("TV is opened");
    }

    @Override
    public void off() {
        System.out.println("TV is closed");
    }
}
