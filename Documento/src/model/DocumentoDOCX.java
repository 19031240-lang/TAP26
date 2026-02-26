package model;

public class DocumentoDOCX implements Modelo {
    private String contenido;
    private String autor;

    public DocumentoDOCX(String contenido, String autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documento Word (DOCX)");
        System.out.println("Contenido: " + contenido);
        System.out.println("Autor: " + autor);
    }

    @Override
    public String getTipo() {
        return "DOCX";
    }
}