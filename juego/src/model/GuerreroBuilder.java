package model;

public class GuerreroBuilder extends PersonajeBuilder {

    @Override
    public void configurarTipo() {
        personaje.setTipo("Guerrero");
    }

    @Override
    public void configurarEstadisticas() {
        personaje.setFuerza(10);
        personaje.setInteligencia(2);
        personaje.setVelocidad(8);
        personaje.setResistencia(8);
    }
}