/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA2;

/**
 *
 * @author familia
 */
public abstract class Persona implements METODOS{

    protected String Nombre;
    protected String Apellido;
    protected String Edad; 
    protected String Administrar;
    protected String Registrar;
    protected String Almacenar;
 
     public Persona() {

    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    @Override
    public String getAdministrar() {
         return Administrar;
    }

    @Override
    public void setAdministrar(String Administrar) {
         this.Administrar = Administrar;
    }

    @Override
    public String getRegistrase() {
         return Registrar;
    }

    @Override
    public void setRegistrarse(String Registrarse) {
          this.Registrar = Registrarse;
    }

    @Override
    public String getAlmacenar() {
       return Almacenar;
    }

    @Override
    public void setAlmacenar(String Almacenar) {
      this.Almacenar = Almacenar;
    }

   


}
