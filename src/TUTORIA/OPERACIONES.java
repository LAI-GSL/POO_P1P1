/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIA;

import java.util.Scanner;

/**
 *
 * @author familia
 */
public class OPERACIONES {
     
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
     double a, b;
     double base, altura;
     double baseMayor, baseMenor;
    
    
        System.out.print("Dame a: ");
        a=sc.nextDouble();
        System.out.print("Dame b: ");
        b=sc.nextDouble();
        double suma = a + b;
        System.out.println("El resultado de la suma es: "+ suma);
        
        System.out.print("Dame a: ");
        a=sc.nextDouble();
        System.out.print("Dame b: ");
        b=sc.nextDouble();
        double resta = a - b;
        System.out.println("El resultado de la resta es: "+ resta);
   
        System.out.print("Dame base: ");
        base=sc.nextDouble();
        System.out.print("Dame altura: ");
        altura=sc.nextDouble();
        double area1 = base * altura;
        System.out.println("El resultado de la area es: "+ area1);
        
        System.out.print("Dame base mayor: ");
        baseMayor=sc.nextDouble();
        System.out.print("Dame base menor: ");
        baseMenor=sc.nextDouble();
        double area2 = (baseMayor + baseMenor)/2;
        System.out.println("El resultado de la area es: "+ area2);
   } 
}
