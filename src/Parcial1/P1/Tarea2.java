
package Parcial1.P1;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  -Piramide con una mejor estructura-");
        int n;
        System.out.print("¿Cual es la cantidad de filas que desea? R= ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
