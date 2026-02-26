package controller;

import factory.ModeloFactory;
import model.Modelo;

public class ControladorGenerico<T extends Modelo> {

    public void procesarCreacionModelo(String tipo, String dato1, String dato2) {
        System.out.println("Controlador: Creando " + tipo + "...");

        Modelo modelo = ModeloFactory.crearModelo(tipo, dato1, dato2);

        if (modelo != null) {
            modelo.mostrarDetalles();
        } else {
            System.out.println("Error: Tipo de documento no válido");
        }

        System.out.println("Controlador: Listo!\n");
    }
}