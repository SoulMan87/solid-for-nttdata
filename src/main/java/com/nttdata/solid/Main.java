package com.nttdata.solid;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File archivo = crearArchivo("src/archivo.txt");

        escribirArchivo(archivo, true);

        try {
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void escribirArchivo(File archivo, boolean adjuntar) {
        try (
                FileWriter escribirArchivo = new FileWriter(archivo, adjuntar);
                PrintWriter escribir = new PrintWriter(escribirArchivo)
        ) {
            escribir.println("Jamón");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File crearArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            return archivo;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
