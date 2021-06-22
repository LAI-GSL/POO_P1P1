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
public class main {
    
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
           
           Conejo cone = new Conejo();
           Gato gat = new Gato();
           
           cone.Corre();
           gat.Corre();
     }
      
    
}
