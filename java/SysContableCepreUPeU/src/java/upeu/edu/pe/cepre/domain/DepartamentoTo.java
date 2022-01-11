/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.domain;

/**
 *
 * @author USUARIO
 */
public class DepartamentoTo {

    private String idDepartamento;
    private String nombre;
    private String descripcion;
    private String estado;
    private FilialTo filialTo;
    private String idFilial;

    public DepartamentoTo() {
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

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
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
