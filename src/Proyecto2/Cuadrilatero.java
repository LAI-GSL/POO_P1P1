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
public abstract class Cuadrilatero {

    protected double AX,AY,BX,BY,CX,CY,DX,DY;


    public double getAX() {
        return AX;
    }

    public void setAX(double AX) {
        this.AX = AX;
    }

    public double getAY() {
        return AY;
    }

    public void setAY(double AY) {
        this.AY = AY;
    }

    public double getBX() {
        return BX;
    }

    public void setBX(double BX) {
        this.BX = BX;
    }

    public double getBY() {
        return BY;
    }

    public void setBY(double BY) {
        this.BY = BY;
    }

    public double getCX() {
        return CX;
    }

    public void setCX(double CX) {
        this.CX = CX;
    }

    public double getCY() {
        return CY;
    }

    public void setCY(double CY) {
        this.CY = CY;
    }

    public double getDX() {
        return DX;
    }

    public void setDX(double DX) {
        this.DX = DX;
    }

    public double getDY() {
        return DY;
    }

    public void setDY(double DY) {
        this.DY = DY;
    }

    public abstract double Area();
}
