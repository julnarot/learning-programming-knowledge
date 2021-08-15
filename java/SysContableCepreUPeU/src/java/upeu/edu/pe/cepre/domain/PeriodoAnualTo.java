/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.domain;

/**
 *
 * @author USUARIO
 */
public class PeriodoAnualTo {

    private String idPeriodoAnual;
    private String nombrePeriodoAnual;
    private String fechaInicio;
    private String fechaFin;
    private FilialTo filialTo;
    private String idFilial;
    private String estado;

    public PeriodoAnualTo() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    public String getIdPeriodoAnual() {
        return idPeriodoAnual;
    }

    public void setIdPeriodoAnual(String idPeriodoAnual) {
        this.idPeriodoAnual = idPeriodoAnual;
    }

    public String getNombrePeriodoAnual() {
        return nombrePeriodoAnual;
    }

    public void setNombrePeriodoAnual(String nombrePeriodoAnual) {
        this.nombrePeriodoAnual = nombrePeriodoAnual;
    }
}
