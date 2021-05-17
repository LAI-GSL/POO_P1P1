/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import static java.lang.Math.sqrt;

/**
 *
 * @author familia
 */
public class Rectangulo extends Cuadrilatero {

    Rectangulo() {
        super();
    }

    @Override
    public double Area() {
        return sqrt(Math.pow(BX - AX, 2) + Math.pow(BY - AY, 2)) * sqrt(Math.pow(CX - BX, 2) + Math.pow(CY - BY, 2));
    }

}
