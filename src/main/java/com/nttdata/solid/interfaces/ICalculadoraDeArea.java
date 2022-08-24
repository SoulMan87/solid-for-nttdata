package com.nttdata.solid.interfaces;

import com.nttdata.solid.clases.*;

import java.util.List;

public interface ICalculadoraDeArea {

    int suma(List<Figura> figuras);

    class Main {
        public static void main(String[] args) {
            ICalculadoraDeArea calculadoraDeArea = new CalculadoraDeArea();
            ICalculadoraDeArea calculadoraDeAreaV2 = new CalculadoraDeAreaV2();
            Circulo circulo = new Circulo(10);
            Cuadrado cuadrado = new Cuadrado(10);
            Cubo cubo = new Cubo();
            Rectangulo rectangulo = new Rectangulo();
            ImpresoraDeFiguras impresora = new ImpresoraDeFiguras(calculadoraDeAreaV2);
            Figura sinfigura = new SinFigura();

            List<Figura> figuras = List.of(cubo,circulo, cuadrado, rectangulo);

            int suma = calculadoraDeArea.suma(figuras);

            System.out.println(impresora.json(figuras));
            System.out.println(impresora.csv(figuras));

            System.out.println(suma);

        }
    }
}
