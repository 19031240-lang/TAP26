package model;

public class PersonajeFactory {

    public static PersonajeBuilder crearBuilder(String tipo) {

        switch (tipo.toLowerCase()) {
            case "guerrero":
                return new GuerreroBuilder();
            case "mago":
                return new MagoBuilder();
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }
    }
}