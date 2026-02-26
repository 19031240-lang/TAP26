package model;

public class DocumentoPDF implements Modelo {
    private String contenido;
    private int numeroPaginas;

    public DocumentoPDF(String contenido, int numeroPaginas) {
        this.contenido = contenido;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documento PDF ");
        System.out.println("Contenido: " + contenido);
        System.out.println("Numero de Paginas: " + numeroPaginas);
    }

    @Override
    public String getTipo() {
        return "PDF";
    }
}