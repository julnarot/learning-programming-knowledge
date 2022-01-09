/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nancy
 */
@Entity
@Table(name = "SACU_CARGAR_ARCHIVO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuCargarArchivo.findAll", query = "SELECT s FROM SacuCargarArchivo s"),
    @NamedQuery(name = "SacuCargarArchivo.findByIdDireccion", query = "SELECT s FROM SacuCargarArchivo s WHERE s.idDireccion = :idDireccion"),
    @NamedQuery(name = "SacuCargarArchivo.findByUrl", query = "SELECT s FROM SacuCargarArchivo s WHERE s.url = :url"),
    @NamedQuery(name = "SacuCargarArchivo.findByFechaSubida", query = "SELECT s FROM SacuCargarArchivo s WHERE s.fechaSubida = :fechaSubida"),
    @NamedQuery(name = "SacuCargarArchivo.findByFechaAsignacion", query = "SELECT s FROM SacuCargarArchivo s WHERE s.fechaAsignacion = :fechaAsignacion"),
    @NamedQuery(name = "SacuCargarArchivo.findByPeriodo", query = "SELECT s FROM SacuCargarArchivo s WHERE s.periodo = :periodo")})
public class SacuCargarArchivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_DIRECCION")
    @Id
    private String idDireccion;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "FECHA_SUBIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSubida;
    @Basic(optional = false)
    @Column(name = "FECHA_ASIGNACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;

    public SacuCargarArchivo() {
    }

    public String getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
