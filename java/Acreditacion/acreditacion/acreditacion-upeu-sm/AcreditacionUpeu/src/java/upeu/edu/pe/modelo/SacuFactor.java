/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_FACTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuFactor.findAll", query = "SELECT s FROM SacuFactor s")})
public class SacuFactor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FACTOR")
    private String idFactor;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "NRO_ORDEN")
    private BigInteger nroOrden;
    @JoinColumn(name = "ID_DIMENSION", referencedColumnName = "ID_DIMENSION")
    @ManyToOne(optional = false)
    private SacuDimension idDimension;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactor")
    private Collection<SacuAreaFactor> sacuAreaFactorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactor")
    private Collection<SacuCriterio> sacuCriterioCollection;

    public SacuFactor() {
    }

    public SacuFactor(String idFactor) {
        this.idFactor = idFactor;
    }

    public SacuFactor(String idFactor, String nombre, String descripcion, String estado, BigInteger nroOrden) {
        this.idFactor = idFactor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.nroOrden = nroOrden;
    }

    public String getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(String idFactor) {
        this.idFactor = idFactor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public BigInteger getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(BigInteger nroOrden) {
        this.nroOrden = nroOrden;
    }

    public SacuDimension getIdDimension() {
        return idDimension;
    }

    public void setIdDimension(SacuDimension idDimension) {
        this.idDimension = idDimension;
    }

    @XmlTransient
    public Collection<SacuAreaFactor> getSacuAreaFactorCollection() {
        return sacuAreaFactorCollection;
    }

    public void setSacuAreaFactorCollection(Collection<SacuAreaFactor> sacuAreaFactorCollection) {
        this.sacuAreaFactorCollection = sacuAreaFactorCollection;
    }

    @XmlTransient
    public Collection<SacuCriterio> getSacuCriterioCollection() {
        return sacuCriterioCollection;
    }

    public void setSacuCriterioCollection(Collection<SacuCriterio> sacuCriterioCollection) {
        this.sacuCriterioCollection = sacuCriterioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactor != null ? idFactor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuFactor)) {
            return false;
        }
        SacuFactor other = (SacuFactor) object;
        if ((this.idFactor == null && other.idFactor != null) || (this.idFactor != null && !this.idFactor.equals(other.idFactor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuFactor[ idFactor=" + idFactor + " ]";
    }
    
}
