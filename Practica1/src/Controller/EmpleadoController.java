package Controller;

import Model.Empleado;
import View.EmpleadoView;

public class EmpleadoController {

    private EmpleadoView vista;

    public EmpleadoController(EmpleadoView vista) {
        this.vista = vista;
    }

    public void iniciar() {
        Empleado empleado = vista.capturarDatos();
        vista.mostrarResultado(empleado);
        vista.cerrarScanner();
    }
}
