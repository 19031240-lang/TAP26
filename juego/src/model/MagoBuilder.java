package model;

public class MagoBuilder extends PersonajeBuilder {

    @Override
    public void configurarTipo() {
        personaje.setTipo("Mago");
    }

    @Override
    public void configurarEstadisticas() {
        personaje.setFuerza(3);
        personaje.setInteligencia(10);
        personaje.setVelocidad(6);
        personaje.setResistencia(6);
    }
}