/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.domain;

/**
 *
 * @author USUARIO
 */
public class PresupuestoTo {

    private String idPresupuesto;
    private String nombre;
    private double saldoFinal;
    private double saldoInicial;
    private String tipoMoneda;
    private String estado;
    private String fechaInicio;
    private String fechaFin;
    private String tipo;
    private PeriodoTo periodoTo;
    private String idPeriodo;
    private String descripcion;
    private SedeTo sedeTo;
    private String idSede;
    private PresupuestoAnualTo presupuestoAnualTo;
    private String idPresupuestoAnual;

    public PresupuestoTo() {
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

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public String getIdPresupuestoAnual() {
        return idPresupuestoAnual;
    }

    public void setIdPresupuestoAnual(String idPresupuestoAnual) {
        this.idPresupuestoAnual = idPresupuestoAnual;
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

    public PeriodoTo getPeriodoTo() {
        return periodoTo;
    }

    public void setPeriodoTo(PeriodoTo periodoTo) {
        this.periodoTo = periodoTo;
    }

    public PresupuestoAnualTo getPresupuestoAnualTo() {
        return presupuestoAnualTo;
    }

    public void setPresupuestoAnualTo(PresupuestoAnualTo presupuestoAnualTo) {
        this.presupuestoAnualTo = presupuestoAnualTo;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public SedeTo getSedeTo() {
        return sedeTo;
    }

    public void setSedeTo(SedeTo sedeTo) {
        this.sedeTo = sedeTo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}
