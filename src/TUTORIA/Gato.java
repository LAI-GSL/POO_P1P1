/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIA;

/**
 *
 * @author familia
 */
public class Gato extends MASCOTAS {
    
    Gato(){
        super();
    }
    protected String Maullido;
    protected String raza;

    public String getMaullido() {
        return Maullido;
    }

    public void setMaullido(String Maullido) {
        this.Maullido = Maullido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Corre() {
        System.out.println("Corre a una gran velocidad con sus 4 patas");
    }
    
}
