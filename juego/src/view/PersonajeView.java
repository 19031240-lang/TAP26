package view;

import model.Personaje;
import model.Habilidad;

import java.util.List;

public class PersonajeView {

    public void mostrarFicha(Personaje personaje) {

        System.out.println("= FICHA DEL PERSONAJE =");
        System.out.println("Tipo: " + personaje.getTipo());
        System.out.println("Fuerza: " + personaje.getFuerza());
        System.out.println("Inteligencia: " + personaje.getInteligencia());
        System.out.println("Velocidad: " + personaje.getVelocidad());
        System.out.println("Resistencia: " + personaje.getResistencia());

    }
    public void ejecutarHabilidades(Personaje personaje) {

        System.out.println(">>> Ejecutando habilidades:");

        List<Habilidad> lista = personaje.getHabilidades();

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).usar();
        }
    }
}