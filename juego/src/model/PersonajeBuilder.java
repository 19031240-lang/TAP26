package model;

public abstract class PersonajeBuilder {

    protected Personaje personaje;

    public PersonajeBuilder() {
        personaje = new Personaje();
    }

    public abstract void configurarTipo();
    public abstract void configurarEstadisticas();

    public void agregarHabilidad(Habilidad habilidad) {
        personaje.agregarHabilidad(habilidad);
    }

    public Personaje construir() {
        return personaje;
    }
}