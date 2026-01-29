package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ainicial=0,afinal=0,contador=0;
        System.out.println("Ingresa el año inicial");
        ainicial=in.nextInt();
        System.out.println("Ingresa el año final");
        afinal=in.nextInt();
        for(int i=ainicial;i<afinal;i++){
            if(i%4==0 && i%100!=0 || i%400==0){
                contador++;
            }
        }
        System.out.println(contador+" años bisiestos");
    }
}