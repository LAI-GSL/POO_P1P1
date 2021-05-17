/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author familia
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        Trapecio tra = new Trapecio();
        Cuadrado cua = new Cuadrado();
        Rectangulo rec = new Rectangulo();

        System.out.println("------------Área de un cuadrado------------");
        System.out.print("Vertice 1 en x: ");
        cua.setAX(sc.nextDouble());
        System.out.print("En y: ");
        cua.setAY(sc.nextDouble());
        System.out.print("Vertice 2 en x: ");
        cua.setBX(sc.nextDouble());
        System.out.print("En y: ");
        cua.setBY(sc.nextDouble());
        System.out.print("Vertice 3 en x: ");
        cua.setCX(sc.nextDouble());
        System.out.print("En y: ");
        cua.setCY(sc.nextDouble());
        System.out.print("Vertice 4 en x: ");
        cua.setDX(sc.nextDouble());
        System.out.print("En y: ");
        cua.setDY(sc.nextDouble());
        System.out.println("El area es: " + cua.Area());

        System.out.println("------------Área de un rectangulo-----------");
        System.out.print("Vertice 1 en x: ");
        rec.setAX(sc.nextDouble());
        System.out.print("En y: ");
        rec.setAY(sc.nextDouble());
        System.out.print("Vertice 2 en x: ");
        rec.setBX(sc.nextDouble());
        System.out.print("En y: ");
        rec.setBY(sc.nextDouble());
        System.out.print("Vertice 3 en x: ");
        rec.setCX(sc.nextDouble());
        System.out.print("En y: ");
        rec.setCY(sc.nextDouble());
        System.out.print("Vertice 4 en x: ");
        rec.setDX(sc.nextDouble());
        System.out.print("En y: ");
        rec.setDY(sc.nextDouble());
        System.out.println("El area es: " + rec.Area());

        System.out.println("------------Área de un trapecio-----------");
        System.out.print("Vertice 1 en x: ");
        tra.setAX(sc.nextDouble());
        System.out.print("En y: ");
        tra.setAY(sc.nextDouble());
        System.out.print("Vertice 2 en x: ");
        tra.setBX(sc.nextDouble());
        System.out.print("En y: ");
        tra.setBY(sc.nextDouble());
        System.out.print("Vertice 3 en x: ");
        tra.setCX(sc.nextDouble());
        System.out.print("En y: ");
        tra.setCY(sc.nextDouble());
        System.out.print("Vertice 4 en x: ");
        tra.setDX(sc.nextDouble());
        System.out.print("En y: ");
        tra.setDY(sc.nextDouble());
        System.out.println("El area es: " + tra.Area());
    }
}
