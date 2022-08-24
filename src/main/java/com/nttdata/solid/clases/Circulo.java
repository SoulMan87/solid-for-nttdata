package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;

public class Circulo implements Figura {

    private final int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }
}
