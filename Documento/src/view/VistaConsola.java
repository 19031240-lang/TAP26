package view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println(" MENU PRINCIPAL ");
        System.out.println("1. Crear documento PDF");
        System.out.println("2. Crear documento WORD");
        System.out.println("3. Salir");
        System.out.print("Elige una opcion: ");
        return scanner.nextInt();
    }

    public String pedirContenido() {
        scanner.nextLine();
        System.out.print("Ingresa el contenido del documento: ");
        return scanner.nextLine();
    }

    public int pedirNumeroPaginas() {
        System.out.print("Ingresa el número de paginas: ");
        return scanner.nextInt();
    }

    public String pedirAutor() {
        scanner.nextLine();
        System.out.print("Ingresa el nombre del autor: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}