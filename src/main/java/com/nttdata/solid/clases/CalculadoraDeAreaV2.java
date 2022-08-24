package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;
import com.nttdata.solid.interfaces.ICalculadoraDeArea;

import java.util.List;

public class CalculadoraDeAreaV2 implements ICalculadoraDeArea {
    @Override
    public int suma(List<Figura> figuras) {
        int suma = 0;

        for (Figura figura : figuras) {
            suma += figura.area();
        }

        return suma;
    }
}
