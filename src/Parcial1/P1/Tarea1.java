
        package Parcial1.P1;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Scanner;


        public class Tarea1 {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        private int tamaño;


        public  Tarea1(){
        System.out.println("       -Piramide de asteriscos-");

        }
        public  void Piramide(){

            System.out.print("¿Cuantas filas va a tener la piramide? ");
            tamaño=sc.nextInt();
            for(int i=0; i<=tamaño; i++ ){

                 for(int j=1; j<=tamaño-i; j++ ){
                     System.out.print("");
                }
                 for(int aster=1;aster<=(i+1); aster++){
                          System.out.print("*");
                     }
                 System.out.println();
        }

        }
        }

    
   
