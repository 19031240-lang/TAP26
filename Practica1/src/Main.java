import Controller.EmpleadoController;
import View.EmpleadoView;

public class Main {

    public static void main(String[] args) {

        EmpleadoView vista = new EmpleadoView();
        EmpleadoController controlador = new EmpleadoController(vista);

        controlador.iniciar();
    }
}
