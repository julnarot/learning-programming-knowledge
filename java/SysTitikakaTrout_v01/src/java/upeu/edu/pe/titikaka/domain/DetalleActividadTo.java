/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class DetalleActividadTo {

    private String idDetalleActividad;
    private String dia;
    private String descripcion;
    private double importe;
    private ActividadTo actividadTo;
    private String idActividad;

    public DetalleActividadTo() {
    }

    public ActividadTo getActividadTo() {
        return actividadTo;
    }

    public void setActividadTo(ActividadTo actividadTo) {
        this.actividadTo = actividadTo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public String getIdDetalleActividad() {
        return idDetalleActividad;
    }

    public void setIdDetalleActividad(String idDetalleActividad) {
        this.idDetalleActividad = idDetalleActividad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
