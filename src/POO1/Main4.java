
package POO1;

import java.util.Scanner;

public class Main4 {

  private static double suma;
  private static double promedio;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Tarea4[]tarea4;
        tarea4 = new Tarea4[10];
           System.out.println("                 Ingresa 10 numeros");
           System.out.println("------------------------------------------------------");
          for (int i = 0; i < tarea4.length; i++) {
           tarea4[i] = new Tarea4();
            System.out.print("Numero " + (i + 1) + ": ");
            tarea4[i].setNumero(sc.nextInt());
            suma = tarea4[i].getNumero() + suma;
        }
          promedio = (suma / 10);
        System.out.println("El promedio total de los numeros es: " + promedio);
    }
}
