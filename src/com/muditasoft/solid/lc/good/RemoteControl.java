package com.muditasoft.solid.lc.good;

public class RemoteControl implements Remotable {

    private Remotable remotable;

    public RemoteControl(Remotable remotable) {
        this.remotable = remotable;
    }

    @Override
    public void on() {
        remotable.on();
    }

    @Override
    public void off() {
        remotable.off();
    }
}
