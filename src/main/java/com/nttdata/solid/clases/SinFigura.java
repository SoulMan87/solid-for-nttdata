package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;

public class SinFigura implements Figura {
    @Override
    public double area() {
        throw new IllegalStateException("No se puede calcular el area");
    }
}
