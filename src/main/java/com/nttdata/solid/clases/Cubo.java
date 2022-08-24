package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;
import com.nttdata.solid.interfaces.FiguraDeTresDimensiones;

public class Cubo implements Figura, FiguraDeTresDimensiones {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volumen() {
        return 0;
    }
}
