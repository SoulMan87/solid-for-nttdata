package com.nttdata.solid.clases;

import com.nttdata.solid.interfaces.Figura;
import com.nttdata.solid.interfaces.ICalculadoraDeArea;

import java.util.List;

public class ImpresoraDeFiguras {

    private final ICalculadoraDeArea calculadoraDeArea;

    public ImpresoraDeFiguras(ICalculadoraDeArea calculadoraDeArea) {
        this.calculadoraDeArea = calculadoraDeArea;
    }

    public String json(List<Figura> figuras) {
        return "{sumatoria_de_figuras: %s}".formatted(calculadoraDeArea.suma(figuras));
    }

    public String csv(List<Figura> figuras) {
        return "sumatoria_figuras,%s".formatted(calculadoraDeArea.suma(figuras));
    }
}
