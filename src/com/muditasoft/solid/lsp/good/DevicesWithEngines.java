package com.muditasoft.solid.lsp.good;

public class DevicesWithEngines extends TrasportationDevice {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Engine is started");
    }
}