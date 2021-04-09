package POO1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainP {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto[] proyecto;
        int tamaño;

        System.out.println("OoOoOoOo" + "____" + "TIENDAS LOXXO" + "____" + "oOoOoOoOoO");
        System.out.println("                            ");
        System.out.print("¿Cual es el tamaño de la cartera? R= ");
        tamaño = sc.nextInt();
        proyecto = new Proyecto[tamaño];
        for (int i = 0; i < proyecto.length; i++) {
            proyecto[i] = new Proyecto();
        }
        int op1 = 0;
        int op2 = 0;

        while (op1 != 4) {
            System.out.println("------------------------------------------");
            System.out.println("El tamaño de la cartera es: " + tamaño);
            System.out.println("El espacio en la cartera es de: " + tamaño);
            System.out.println("1)Agregar cliente");
            System.out.println("2)Mostrar clientes");
            System.out.println("3)Buscar cliente");
            System.out.println("4)Cerrar sistema");
            System.out.print("Elige una opcion--------> ");
            op1 = sc.nextInt();

            switch (op1) {

                case 1:

                    System.out.println("------------Agregar cliente-----------");

                    System.out.println("----Puede registrar hasta " + tamaño + " clientes----");
                    int w = 0;
                    try {
                        do {
                            System.out.println("----------------------------------------");
                            System.out.println("Cliente " + (w + 1));
                            System.out.println("----------------------------------------");
                            System.out.print("Codigo del cliente: ");
                            proyecto[w].setCodigoCliente(sc.nextInt());
                            System.out.print("El nombre es: ");
                            proyecto[w].setNombre(bf.readLine());
                            System.out.print("El apellido paterno es: ");
                            proyecto[w].setApellidoPaterno(bf.readLine());
                            System.out.print("El apeliido materno es: ");
                            proyecto[w].setApellidoMaterno(bf.readLine());
                            System.out.print("El numero de telefono es: ");
                            proyecto[w].setTelefono(bf.readLine());
                            System.out.print("La dirección es: ");
                            proyecto[w].setDireccion(bf.readLine());
                            System.out.print("La edad es: ");
                            proyecto[w].setEdad(sc.nextInt());

                            w++;
                        } while (w > proyecto.length);
                        System.out.println("Ya solo puede registrar " + (tamaño - 1) + " clientes");

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("------------Mostrar clientes---------------");

                    for (int j = 0; j < proyecto.length; j++) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Cliente: " + (j + 1));
                        System.out.println("---------------------------------------------");
                        System.out.println("Codigo: " + proyecto[j].getCodigoCliente());
                        System.out.println("Nombre: " + proyecto[j].getNombre());
                        System.out.println("Apellido paterno: " + proyecto[j].getApellidoPaterno());
                        System.out.println("Apellido materno: " + proyecto[j].getApellidoMaterno());
                        System.out.println("Telefono: " + proyecto[j].getTelefono());
                        System.out.println("Dirección: " + proyecto[j].getDireccion());
                        System.out.println("Edad: " + proyecto[j].getEdad());
                        System.out.println("------------------------------------------------");
                    }

                    break;
                case 3:
                    while (op2 != 3) {
                        System.out.println("----------------------Menu de busqueda--------------------");
                        System.out.println("1)Buscar por codigo");
                        System.out.println("2)Buscar por nombre");
                        System.out.println("3)Regresar al menu principal");
                        System.out.print("Elige una opción-----> ");
                        op2 = sc.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("....Buscar por codigo.....");

                                int codigo;
                                System.out.println("Ingrese el codigo que quiere buscar: ");
                                codigo = sc.nextInt();
                                int k = 0;
                                if (proyecto[k].getCodigoCliente() == codigo) {
                                    System.out.println("!Codigo encontrado¡ ");
                                    System.out.println("Codigo: " + proyecto[k].getCodigoCliente());
                                    System.out.println("Nombre: " + proyecto[k].getNombre());
                                    System.out.println("Apellido Paterno: " + proyecto[k].getApellidoPaterno());
                                    System.out.println("Apellido Materno: " + proyecto[k].getApellidoMaterno());
                                    System.out.println("Telefono: " + proyecto[k].getTelefono());
                                    System.out.println("Direccion: " + proyecto[k].getDireccion());
                                    System.out.println("Edad: " + proyecto[k].getEdad());

                                } else {
                                    System.out.println("Ese codigo no existe ");
                                }

                                break;
                            case 2:
                                System.out.println(".....Buscar por nombre.....");
                                int l = 0;
                                String nombre;
                                System.out.println("Ingrese el nombre de la persona que sera buscada: ");
                                nombre = bf.readLine();
                                if (proyecto[l].getNombre().equals(nombre)) {
                                    System.out.println("Nombre encontrado: ");
                                    System.out.println("Codigo: " + proyecto[l].getCodigoCliente());
                                    System.out.println("Nombre: " + proyecto[l].getNombre());
                                    System.out.println("Apellido Paterno: " + proyecto[l].getApellidoPaterno());
                                    System.out.println("Apellido Materno: " + proyecto[l].getApellidoMaterno());
                                    System.out.println("Telefono: " + proyecto[l].getTelefono());
                                    System.out.println("Direccion: " + proyecto[l].getDireccion());
                                    System.out.println("Edad: " + proyecto[l].getEdad());

                                } else {
                                    System.out.println("Ese nombre no existe ");
                                }

                                break;
                            case 3:
                                System.out.println("De vuelta al menu principal");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("----------SISTEMA CERRADO------------");
                    break;
            }
        }
    }
}
