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
@Table(name = "SAU_CRITERIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauCriterio.findAll", query = "SELECT s FROM SauCriterio s")})
public class SauCriterio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CRITERIO")
    private String idCriterio;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCriterio")
    private Collection<SauEstandar> sauEstandarCollection;
    @JoinColumn(name = "ID_FACTOR", referencedColumnName = "ID_FACTOR")
    @ManyToOne(optional = false)
    private SauFactor idFactor;

    public SauCriterio() {
    }

    public SauCriterio(String idCriterio) {
        this.idCriterio = idCriterio;
    }

    public SauCriterio(String idCriterio, String nombre, String estado, BigInteger nroOrden) {
        this.idCriterio = idCriterio;
        this.nombre = nombre;
        this.estado = estado;
        this.nroOrden = nroOrden;
    }

    public String getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(String idCriterio) {
        this.idCriterio = idCriterio;
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

    @XmlTransient
    public Collection<SauEstandar> getSauEstandarCollection() {
        return sauEstandarCollection;
    }

    public void setSauEstandarCollection(Collection<SauEstandar> sauEstandarCollection) {
        this.sauEstandarCollection = sauEstandarCollection;
    }

    public SauFactor getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(SauFactor idFactor) {
        this.idFactor = idFactor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCriterio != null ? idCriterio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauCriterio)) {
            return false;
        }
        SauCriterio other = (SauCriterio) object;
        if ((this.idCriterio == null && other.idCriterio != null) || (this.idCriterio != null && !this.idCriterio.equals(other.idCriterio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauCriterio[ idCriterio=" + idCriterio + " ]";
    }
    
}
