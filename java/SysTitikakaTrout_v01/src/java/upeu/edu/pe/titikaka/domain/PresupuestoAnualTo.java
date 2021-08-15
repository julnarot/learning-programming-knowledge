/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class PresupuestoAnualTo {

    private String idPresupuestoAnual;
    private String nombre;
    private double monto;
    private String descripcion;
    private PeriodoAnualTo periodoAnualTo;
    private String idPeriodoAnual;
    private String estado;

    public PresupuestoAnualTo() {
    }

    public String getIdPresupuestoAnual() {
        return idPresupuestoAnual;
    }

    public void setIdPresupuestoAnual(String idPresupuestoAnual) {
        this.idPresupuestoAnual = idPresupuestoAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PeriodoAnualTo getPeriodoAnualTo() {
        return periodoAnualTo;
    }

    public void setPeriodoAnualTo(PeriodoAnualTo periodoAnualTo) {
        this.periodoAnualTo = periodoAnualTo;
    }

    public String getIdPeriodoAnual() {
        return idPeriodoAnual;
    }

    public void setIdPeriodoAnual(String idPeriodoAnual) {
        this.idPeriodoAnual = idPeriodoAnual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
