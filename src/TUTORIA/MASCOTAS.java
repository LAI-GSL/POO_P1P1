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
public abstract class MASCOTAS {
    protected String Nombre;
    protected String Color;
    protected String Años;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAños() {
        return Años;
    }

    public void setAños(String Años) {
        this.Años = Años;
    }
    
    
}
