/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author familia
 */
public class Trapecio extends Cuadrilatero {

    Trapecio() {
        super();
    }

    @Override
    public double Area() {
        return (((AX * BY) + (BX * CY) + (CX * DY) + (DX * AY)) - ((BY * AY) + (CX * BY) + (DX * CY) + (AX * DY))) / 2;

    }

}
