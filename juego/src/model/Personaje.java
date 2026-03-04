package model;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String tipo;
    private int fuerza;
    private int inteligencia;
    private int velocidad;
    private int resistencia;

    private List<Habilidad> habilidades = new ArrayList<>();

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public void setResistencia(int resistencia) { this.resistencia = resistencia; }

    public String getTipo() { return tipo; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getVelocidad() { return velocidad; }
    public int getResistencia() { return resistencia; }

    public void agregarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }
}