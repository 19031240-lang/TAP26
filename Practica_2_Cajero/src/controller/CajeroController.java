package controller;

import model.*;
import view.CajeroView;

public class CajeroController {

    private Banco banco;
    private CajeroView vista;

    public CajeroController(Banco banco, CajeroView vista) {
        this.banco = banco;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarMensaje("=== Bienvenido al Cajero ===");

        Usuario usuario = null;
        int intentos = 0;

        while (intentos < 3 && usuario == null) {
            String pin = vista.pedirPin();
            usuario = banco.autenticar(pin);

            if (usuario == null) {
                vista.mostrarMensaje("PIN incorrecto.");
                intentos++;
            }
        }

        if (usuario == null) {
            vista.mostrarMensaje("Demasiados intentos fallidos. Adiós.");
            return;
        }

        vista.mostrarMensaje("Bienvenido, " + usuario.getNombre());

        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    vista.mostrarMensaje("Saldo actual: $" + usuario.getSaldo());
                    break;

                case 2:
                    double retiro = vista.pedirCantidad("Cantidad a retirar: ");
                    if (usuario.retirar(retiro)) {
                        vista.mostrarMensaje("Retiro exitoso.");
                    } else {
                        vista.mostrarMensaje("Fondos insuficientes.");
                    }
                    break;

                case 3:
                    double deposito = vista.pedirCantidad("Cantidad a depositar: ");
                    usuario.depositar(deposito);
                    vista.mostrarMensaje("Depósito exitoso.");
                    break;

                case 4:
                    salir = true;
                    vista.mostrarMensaje("Gracias por usar el cajero.");
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
}
