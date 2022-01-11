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
@Table(name = "SACU_DETALLE_CAMBIO_FA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDetalleCambioFa.findAll", query = "SELECT s FROM SacuDetalleCambioFa s")})
public class SacuDetalleCambioFa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE")
    private String idDetalle;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA_CAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechaCambio;
    @JoinColumn(name = "ID_AREA_FACTOR", referencedColumnName = "ID_AREA_FACTOR")
    @ManyToOne(optional = false)
    private SacuAreaFactor idAreaFactor;

    public SacuDetalleCambioFa() {
    }

    public SacuDetalleCambioFa(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public SacuDetalleCambioFa(String idDetalle, String descripcion, Date fechaCambio) {
        this.idDetalle = idDetalle;
        this.descripcion = descripcion;
        this.fechaCambio = fechaCambio;
    }

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public SacuAreaFactor getIdAreaFactor() {
        return idAreaFactor;
    }

    public void setIdAreaFactor(SacuAreaFactor idAreaFactor) {
        this.idAreaFactor = idAreaFactor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDetalleCambioFa)) {
            return false;
        }
        SacuDetalleCambioFa other = (SacuDetalleCambioFa) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDetalleCambioFa[ idDetalle=" + idDetalle + " ]";
    }
    
}
