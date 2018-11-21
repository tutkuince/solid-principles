package com.muditasoft.solid.isp.good;

public class DemoApp {
    public static void main(String[] args) {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);

        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);

        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}
