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
@Table(name = "SACU_DETALLE_EVIDENCIA_CAMBIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDetalleEvidenciaCambio.findAll", query = "SELECT s FROM SacuDetalleEvidenciaCambio s")})
public class SacuDetalleEvidenciaCambio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_CAMBIO")
    private String idDetalleCambio;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "NUEVO_CODIGO")
    private String nuevoCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA_CAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechaCambio;
    @JoinColumn(name = "ID_ASIGNACION_EVIDENCIA", referencedColumnName = "ID_ASIGNACION_EVIDENCIA")
    @ManyToOne(optional = false)
    private SacuAsignacionEvidencia idAsignacionEvidencia;

    public SacuDetalleEvidenciaCambio() {
    }

    public SacuDetalleEvidenciaCambio(String idDetalleCambio) {
        this.idDetalleCambio = idDetalleCambio;
    }

    public SacuDetalleEvidenciaCambio(String idDetalleCambio, String descripcion, String nuevoCodigo, Date fechaCambio) {
        this.idDetalleCambio = idDetalleCambio;
        this.descripcion = descripcion;
        this.nuevoCodigo = nuevoCodigo;
        this.fechaCambio = fechaCambio;
    }

    public String getIdDetalleCambio() {
        return idDetalleCambio;
    }

    public void setIdDetalleCambio(String idDetalleCambio) {
        this.idDetalleCambio = idDetalleCambio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNuevoCodigo() {
        return nuevoCodigo;
    }

    public void setNuevoCodigo(String nuevoCodigo) {
        this.nuevoCodigo = nuevoCodigo;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
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
        hash += (idDetalleCambio != null ? idDetalleCambio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDetalleEvidenciaCambio)) {
            return false;
        }
        SacuDetalleEvidenciaCambio other = (SacuDetalleEvidenciaCambio) object;
        if ((this.idDetalleCambio == null && other.idDetalleCambio != null) || (this.idDetalleCambio != null && !this.idDetalleCambio.equals(other.idDetalleCambio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDetalleEvidenciaCambio[ idDetalleCambio=" + idDetalleCambio + " ]";
    }
    
}
