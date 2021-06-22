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
public class Conejo extends MASCOTAS{
    
    Conejo(){
        
        super();
    }
    protected String Brinca;

    public String getBrinca() {
        return Brinca;
    }

    public void setBrinca(String Brinca) {
        this.Brinca = Brinca;
    }

    @Override
    public void Corre() {
        System.out.println("Corre en dos patas ");
    }
    
    
}
