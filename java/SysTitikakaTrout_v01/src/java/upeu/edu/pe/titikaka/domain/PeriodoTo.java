/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class PeriodoTo {
    
    private String idPeriodo;
    private String nombre;
    private String tipoPeriodo;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private PeriodoAnualTo periodoAnualTo;
    private String idPeriodoAnual;
    private CampaniaTo campaniaTo;
    private String idCampania;

    public PeriodoTo() {
    }

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setTipoPeriodo(String tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public CampaniaTo getCampaniaTo() {
        return campaniaTo;
    }

    public void setCampaniaTo(CampaniaTo campaniaTo) {
        this.campaniaTo = campaniaTo;
    }

    public String getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(String idCampania) {
        this.idCampania = idCampania;
    }

    
}
