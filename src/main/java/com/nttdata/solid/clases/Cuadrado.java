package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;

public class Cuadrado implements Figura {

    private final int longitud;

    public Cuadrado(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }


    @Override
    public double area() {
        return Math.pow(getLongitud(), 2);
    }
}
