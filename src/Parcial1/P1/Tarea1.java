package Parcial1.P1;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        System.out.println("       -Piramide de asteriscos-");

        System.out.print("¿Cuantas filas va a tener la piramide? R= ");
        tamaño = sc.nextInt();

        for (int i = 0; i < tamaño; i++) {
            for (int l = 0; l < i + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
    
   
