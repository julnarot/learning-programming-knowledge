/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.domain;

/**
 *
 * @author USUARIO
 */
public class ActividadTo {

    private String idActividad;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String tipo;
    private String estado;
    private double costo;
    private String mes;
    private String codigo;
    private PresupuestoTo presupuestoTo;
    private String idPresupuesto;
    private UsuarioTo usuarioTo;
    private String idUsuario;
    private DepartamentoTo departamentoTo;
    private String idDepartamento;
    private FacultadTo facultadTo;
    private String idFacultad;

    public ActividadTo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public DepartamentoTo getDepartamentoTo() {
        return departamentoTo;
    }

    public void setDepartamentoTo(DepartamentoTo departamentoTo) {
        this.departamentoTo = departamentoTo;
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

    public FacultadTo getFacultadTo() {
        return facultadTo;
    }

    public void setFacultadTo(FacultadTo facultadTo) {
        this.facultadTo = facultadTo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PresupuestoTo getPresupuestoTo() {
        return presupuestoTo;
    }

    public void setPresupuestoTo(PresupuestoTo presupuestoTo) {
        this.presupuestoTo = presupuestoTo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UsuarioTo getUsuarioTo() {
        return usuarioTo;
    }

    public void setUsuarioTo(UsuarioTo usuarioTo) {
        this.usuarioTo = usuarioTo;
    }
}
