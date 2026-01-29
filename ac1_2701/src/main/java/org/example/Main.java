package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String op = "";
        double valor, resultado;
        Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("ingresa el valor de dolar");
        valor = teclado.nextDouble();
        resultado = (valor * 0.834) / 1;
        System.out.printf("El resultado es: " + resultado);
        System.out.println("");

        );
    }

}