package com.muditasoft.solid.lc.bad;

public class RemoteControl {
    private Television tv = new Television();

    public void tvOn(){
        tv.on();
    }
    public void tvOff(){
        tv.off();
    }
}
