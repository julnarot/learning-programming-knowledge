/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_FACTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauFactor.findAll", query = "SELECT s FROM SauFactor s")})
public class SauFactor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FACTOR")
    private String idFactor;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
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
    private SauDimension idDimension;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactor")
    private Collection<SauResponsables> sauResponsablesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactor")
    private Collection<SauCriterio> sauCriterioCollection;

    public SauFactor() {
    }

    public SauFactor(String idFactor) {
        this.idFactor = idFactor;
    }

    public SauFactor(String idFactor, String nombre, String estado, BigInteger nroOrden) {
        this.idFactor = idFactor;
        this.nombre = nombre;
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

    public SauDimension getIdDimension() {
        return idDimension;
    }

    public void setIdDimension(SauDimension idDimension) {
        this.idDimension = idDimension;
    }

    @XmlTransient
    public Collection<SauResponsables> getSauResponsablesCollection() {
        return sauResponsablesCollection;
    }

    public void setSauResponsablesCollection(Collection<SauResponsables> sauResponsablesCollection) {
        this.sauResponsablesCollection = sauResponsablesCollection;
    }

    @XmlTransient
    public Collection<SauCriterio> getSauCriterioCollection() {
        return sauCriterioCollection;
    }

    public void setSauCriterioCollection(Collection<SauCriterio> sauCriterioCollection) {
        this.sauCriterioCollection = sauCriterioCollection;
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
        if (!(object instanceof SauFactor)) {
            return false;
        }
        SauFactor other = (SauFactor) object;
        if ((this.idFactor == null && other.idFactor != null) || (this.idFactor != null && !this.idFactor.equals(other.idFactor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauFactor[ idFactor=" + idFactor + " ]";
    }
    
}
