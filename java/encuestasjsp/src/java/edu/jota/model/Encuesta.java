/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jota.model;

import java.util.Date;

/**
 *
 * @author jota
 */

public class Encuesta {
    String IdEncuesta, Pregunta;
    Date FechaAlta;
    
    public String getIdEncuesta() {
        return IdEncuesta;
    }

    public void setIdEncuesta(String IdEncuesta) {
        this.IdEncuesta = IdEncuesta;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    
    
}
