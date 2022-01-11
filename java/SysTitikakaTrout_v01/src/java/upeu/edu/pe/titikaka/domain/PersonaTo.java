/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class PersonaTo {
    
    private String idPersona;
    private String nombres;
    private String apellPatern;
    private String apellMatern;
    private String sexo;
    private String direccion;
    private String dni;
    private String estado;
    private String celular;

    public PersonaTo() {
    }

    public String getApellMatern() {
        return apellMatern;
    }

    public void setApellMatern(String apellMatern) {
        this.apellMatern = apellMatern;
    }

    public String getApellPatern() {
        return apellPatern;
    }

    public void setApellPatern(String apellPatern) {
        this.apellPatern = apellPatern;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
}
