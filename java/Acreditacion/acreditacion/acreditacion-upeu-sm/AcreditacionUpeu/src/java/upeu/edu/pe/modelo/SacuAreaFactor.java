/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_AREA_FACTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuAreaFactor.findAll", query = "SELECT s FROM SacuAreaFactor s")})
public class SacuAreaFactor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AREA_FACTOR")
    private String idAreaFactor;
    @Basic(optional = false)
    @Column(name = "FECHA_ASIGNACION")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreaFactor")
    private Collection<SacuDetalleCambioFa> sacuDetalleCambioFaCollection;
    @JoinColumn(name = "ID_FACTOR", referencedColumnName = "ID_FACTOR")
    @ManyToOne(optional = false)
    private SacuFactor idFactor;
    @JoinColumn(name = "ID_AREA", referencedColumnName = "ID_AREA")
    @ManyToOne(optional = false)
    private SacuArea idArea;

    public SacuAreaFactor() {
    }

    public SacuAreaFactor(String idAreaFactor) {
        this.idAreaFactor = idAreaFactor;
    }

    public SacuAreaFactor(String idAreaFactor, Date fechaAsignacion) {
        this.idAreaFactor = idAreaFactor;
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getIdAreaFactor() {
        return idAreaFactor;
    }

    public void setIdAreaFactor(String idAreaFactor) {
        this.idAreaFactor = idAreaFactor;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @XmlTransient
    public Collection<SacuDetalleCambioFa> getSacuDetalleCambioFaCollection() {
        return sacuDetalleCambioFaCollection;
    }

    public void setSacuDetalleCambioFaCollection(Collection<SacuDetalleCambioFa> sacuDetalleCambioFaCollection) {
        this.sacuDetalleCambioFaCollection = sacuDetalleCambioFaCollection;
    }

    public SacuFactor getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(SacuFactor idFactor) {
        this.idFactor = idFactor;
    }

    public SacuArea getIdArea() {
        return idArea;
    }

    public void setIdArea(SacuArea idArea) {
        this.idArea = idArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreaFactor != null ? idAreaFactor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuAreaFactor)) {
            return false;
        }
        SacuAreaFactor other = (SacuAreaFactor) object;
        if ((this.idAreaFactor == null && other.idAreaFactor != null) || (this.idAreaFactor != null && !this.idAreaFactor.equals(other.idAreaFactor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuAreaFactor[ idAreaFactor=" + idAreaFactor + " ]";
    }
    
}
