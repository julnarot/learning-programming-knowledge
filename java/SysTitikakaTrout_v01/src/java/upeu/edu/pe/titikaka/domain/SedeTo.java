/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class SedeTo {
    
    private String idSede;
    private String nombre;
    private String descripcion;
    private String tipoSede;
    private FilialTo filialTo;
    private String idFilial;
    private String direccion;

    public SedeTo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public FilialTo getFilialTo() {
        return filialTo;
    }

    public void setFilialTo(FilialTo filialTo) {
        this.filialTo = filialTo;
    }

    public String getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoSede() {
        return tipoSede;
    }

    public void setTipoSede(String tipoSede) {
        this.tipoSede = tipoSede;
    }
    
    
    
    
    
}
