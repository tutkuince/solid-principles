package com.muditasoft.solid.lsp.bad;

public class Bicycle extends TrasportationDevice {
    @Override
    public void startEngine() {
        super.startEngine();    // Problem
    }
}
