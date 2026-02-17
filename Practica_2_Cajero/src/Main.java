import controller.CajeroController;
import model.*;
import view.CajeroView;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.agregarUsuario(new Usuario("1234", "Juan", 1000));
        banco.agregarUsuario(new Usuario("5678", "Maria", 2500));

        CajeroView vista = new CajeroView();
        CajeroController controller = new CajeroController(banco, vista);

        controller.iniciar();
    }
}
