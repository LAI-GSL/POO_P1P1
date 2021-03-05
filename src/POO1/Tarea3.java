package POO1;

import java.util.Arrays;
import java.util.Scanner;

public class Tarea3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("   -Números en orden-");
        int[] N;
        int numeros;
        System.out.print("¿Cuántos numeros quieres imprimir? R= ");
        numeros = sc.nextInt();

        N = new int[numeros];
        for (int i = 0; i < numeros; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            N[i] = sc.nextInt();

        }
        Arrays.sort(N);

        System.out.println("-LOS NUMEROS SON-");
        for (int i = 0; i < N.length; i++) {

            System.out.println("Numero " + (i + 1) + ": " + N[i]);
        }

    }

}
