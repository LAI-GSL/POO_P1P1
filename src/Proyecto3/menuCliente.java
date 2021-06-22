/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;



/**
 *
 * @author familia
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class menuCliente {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Cliente> lista = new ArrayList<>();

        int op1 = 0;

        while (op1 != 5) {

            System.out.println("------------------------------------------");
            System.out.println("1)Agregar cliente");
            System.out.println("2)Eliminar clientes");
            System.out.println("3)Buscar cliente por nombre");
            System.out.println("4)Mostrar clientes");
            System.out.println("5)Salir del sistema ");
            System.out.print("Elige una opcion--------> ");
            op1 = sc.nextInt();

            switch (op1) {

                case 1:
            System.out.println("------------------------------------------");
                    System.out.print("Ingresa el ID: ");
                    int ID = sc.nextInt();

                    System.out.print("Ingresa el nombre: ");
                    String nombre = bf.readLine();

                    System.out.print("Ingresa la edad: ");
                    String edad = bf.readLine();

                    System.out.print("Ingresa el correo: ");
                    String correo = bf.readLine();

                    System.out.print("Ingresa el telefono: ");
                    String telefono = bf.readLine();
                    Cliente datos = new Cliente(ID, nombre, edad, correo, telefono);
                    lista.add(datos);
             System.out.println("------------------------------------------");
                    System.out.println("Numero de clientes registrados: " + lista.size());
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    int valor;
                    System.out.println("Ingresa numero de cliente a eliminar: ");
                    valor = sc.nextInt();
                    lista.remove(valor);
                    System.out.println("Cliente " + valor + " eliminado");
                    System.out.println("------------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    String n;
                    System.out.println("Ingresa el nombre del cliente que quieres buscar: ");
                    n = bf.readLine();
                    int b = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        if (n.equals(lista.get(i).getNombre())) {
                            System.out.println("Cliente encontrado");
                            System.out.println("ID: " + lista.get(i).getID());
                            System.out.println("Nombre: " + lista.get(i).getNombre());
                            System.out.println("Edad: " + lista.get(i).getEdad());
                            System.out.println("Correo: " + lista.get(i).getCorreo());
                            System.out.println("Telefono: " + lista.get(i).getTelefono());
                            b = 1;
                        }

                    }
                    if (b == 0) {
                        System.out.println("No se encontro un cliente con ese nombre");
                    }
                   System.out.println("------------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("ID: " + lista.get(i).getID());
                        System.out.println("Nombre: " + lista.get(i).getNombre());
                        System.out.println("Edad: " + lista.get(i).getEdad());
                        System.out.println("Correo: " + lista.get(i).getCorreo());
                        System.out.println("Telefono: " + lista.get(i).getTelefono());
                    }
                    System.out.println("------------------------------------------");
                    break;
                case 5:
                    System.out.println("Ha salido del sistema de cartera de clientes");
                    break;

            }

        }
    }
}
