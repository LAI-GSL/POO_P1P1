
package POO1;

import java.util.Scanner;


public class Main5 {

    private static int posición;
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        Tarea5[]tarea5;
        tarea5 = new Tarea5[10];
    System.out.println("--------------Dame 10 numeros------------ ");
        for (int i = 0; i < tarea5.length; i++) {
            tarea5[i] = new Tarea5();
            System.out.print("Numero "+ (i + 1)+": ");
            tarea5[i].setNum(sc.nextInt());
            posición =0; 
        }
        int resp;
        System.out.print("¿De qué número quiere solicitar la posición?: "); 
        resp=sc.nextInt();
        for (int i = 0; i < tarea5.length; i++) {
            if (tarea5[i].getNum ()== resp) { 
                posición = i;
            }
        }
        if (posición== 0) {
            System.out.println("-1");
        }
       
        else{
            
            System.out.println("La posición del valor "+ resp + " es: " + posición); 
    }
    }
}    
