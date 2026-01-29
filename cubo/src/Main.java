import java.util.Scanner;
import java.math.MathContext;

import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("ingresa un numero");
        Scanner a = new Scanner(System.in);
        int numero = a.nextInt();

        int cuadrado = numero * numero;
        int cubo = numero * numero * numero;

        System.out.println("\n numero | cuadrado | cubo");
        System.out.println("-----------------");
        System.out.println(numero+" " + cuadrado+" "+ cubo);



    }
}