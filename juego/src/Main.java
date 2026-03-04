import controller.PersonajeController;
import model.Personaje;
import model.*;

public class Main {

    public static void main(String[] args) {

        PersonajeController controller = new PersonajeController();
        Personaje guerrero = controller.crearPersonaje(
                "guerrero",
                new Habilidad[]{
                        new AtaqueEspadazo(),
                        new DefensaEscudo()
                }
        );

        controller.mostrarPersonaje(guerrero);

        Personaje mago = controller.crearPersonaje(
                "mago",
                new Habilidad[]{
                        new AtaqueBolaDeFuego(),
                        new CuracionMagica()
                }
        );

        controller.mostrarPersonaje(mago);
    }
}