package com.muditasoft.solid.lc.good;

public class DemoApp {
    public static void main(String[] args) {
        Remotable remotable = new Television();
        RemoteControl remoteControl = new RemoteControl(remotable);

        remotable.on();
        remotable.off();
    }
}
