/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jota.model;

/**
 *
 * @author jota
 */
public class Opcion {
    String  IdOpcion, IdEncuesta,  Opcion,Votos;   

    public String getIdOpcion() {
        return IdOpcion;
    }

    public void setIdOpcion(String IdOpcion) {
        this.IdOpcion = IdOpcion;
    }

    public String getIdEncuesta() {
        return IdEncuesta;
    }

    public void setIdEncuesta(String IdEncuesta) {
        this.IdEncuesta = IdEncuesta;
    }

    public String getOpcion() {
        return Opcion;
    }

    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }

    public String getVotos() {
        return Votos;
    }

    public void setVotos(String Votos) {
        this.Votos = Votos;
    }
    
}
