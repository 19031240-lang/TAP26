import controller.ControladorGenerico;
import model.Modelo;
import view.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorGenerico<Modelo> controlador = new ControladorGenerico<>();

        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch(opcion) {
                case 1:
                    String contenidoPDF = vista.pedirContenido();
                    int paginas = vista.pedirNumeroPaginas();
                    controlador.procesarCreacionModelo(
                            "PDF",
                            contenidoPDF,
                            String.valueOf(paginas)
                    );
                    break;

                case 2:
                    String contenidoWORD = vista.pedirContenido();
                    String autor = vista.pedirAutor();
                    controlador.procesarCreacionModelo(
                            "DOCX",
                            contenidoWORD,
                            autor
                    );
                    break;

                case 3:
                    vista.mostrarMensaje("Hasta luego");
                    break;

                default:
                    vista.mostrarMensaje("Opcion no valida");
            }

        } while(opcion != 3);
    }
}