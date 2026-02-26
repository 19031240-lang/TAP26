package factory;
import model.*;

public class ModeloFactory {

    public static Modelo crearPDF(String contenido, int paginas) {
        return new DocumentoPDF(contenido, paginas);
    }

    public static Modelo crearDOCX(String contenido, String autor) {
        return new DocumentoDOCX(contenido, autor);
    }

    public static Modelo crearModelo(String tipo, String dato1, String dato2) {
        if (tipo.equalsIgnoreCase("PDF")) {
            int paginas = Integer.parseInt(dato2);
            return crearPDF(dato1, paginas);
        }
        else if (tipo.equalsIgnoreCase("DOCX")) {
            return crearDOCX(dato1, dato2);
        }
        else {
            return null;
        }
    }
}