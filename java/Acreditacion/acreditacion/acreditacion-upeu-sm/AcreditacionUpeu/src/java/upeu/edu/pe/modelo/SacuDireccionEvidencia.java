/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_DIRECCION_EVIDENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDireccionEvidencia.findAll", query = "SELECT s FROM SacuDireccionEvidencia s")})
public class SacuDireccionEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DIRECCION")
    private String idDireccion;
    @Basic(optional = false)
    @Column(name = "FECHA_SUBIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSubida;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_ASIGNACION_EVIDENCIA", referencedColumnName = "ID_ASIGNACION_EVIDENCIA")
    @ManyToOne(optional = false)
    private SacuAsignacionEvidencia idAsignacionEvidencia;

    public SacuDireccionEvidencia() {
    }

    public SacuDireccionEvidencia(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public SacuDireccionEvidencia(String idDireccion, Date fechaSubida, String url, String estado) {
        this.idDireccion = idDireccion;
        this.fechaSubida = fechaSubida;
        this.url = url;
        this.estado = estado;
    }

    public String getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SacuAsignacionEvidencia getIdAsignacionEvidencia() {
        return idAsignacionEvidencia;
    }

    public void setIdAsignacionEvidencia(SacuAsignacionEvidencia idAsignacionEvidencia) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDireccionEvidencia)) {
            return false;
        }
        SacuDireccionEvidencia other = (SacuDireccionEvidencia) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDireccionEvidencia[ idDireccion=" + idDireccion + " ]";
    }
    
}
