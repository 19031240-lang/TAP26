package controller;

import model.Personaje;
import model.*;
import view.PersonajeView;

public class PersonajeController {

    private PersonajeView view = new PersonajeView();

    public Personaje crearPersonaje(String tipo, Habilidad[] habilidades) {

        PersonajeBuilder builder = PersonajeFactory.crearBuilder(tipo);

        builder.configurarTipo();
        builder.configurarEstadisticas();

        for (Habilidad h : habilidades) {
            builder.agregarHabilidad(h);
        }

        return builder.construir();
    }

    public void mostrarPersonaje(Personaje personaje) {
        view.mostrarFicha(personaje);
        view.ejecutarHabilidades(personaje);
    }
}