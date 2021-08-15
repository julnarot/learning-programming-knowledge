/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.domain;

/**
 *
 * @author USUARIO
 */
public class FacultadTo {

    private String idFacultad;
    private String nombre;
    private String descripcion;
    private String estado;
    private FilialTo filialTo;
    private String idFilial;

    public FacultadTo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public FilialTo getFilialTo() {
        return filialTo;
    }

    public void setFilialTo(FilialTo filialTo) {
        this.filialTo = filialTo;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
