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
public class Cliente extends Usuario {

    protected String NumCliente;
    protected String NumSolicitud;


    public String getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(String NumCliente) {
        this.NumCliente = NumCliente;
    }

    public String getNumSolicitud() {
        return NumSolicitud;
    }

    public void setNumSolicitud(String NumSolicitud) {
        this.NumSolicitud = NumSolicitud;
    }

}
