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
@Table(name = "SACU_CRITERIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuCriterio.findAll", query = "SELECT s FROM SacuCriterio s")})
public class SacuCriterio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CRITERIO")
    private String idCriterio;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "NRO_ORDEN")
    private BigInteger nroOrden;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCriterio")
    private Collection<SacuEstandar> sacuEstandarCollection;
    @JoinColumn(name = "ID_FACTOR", referencedColumnName = "ID_FACTOR")
    @ManyToOne(optional = false)
    private SacuFactor idFactor;

    public SacuCriterio() {
    }

    public SacuCriterio(String idCriterio) {
        this.idCriterio = idCriterio;
    }

    public SacuCriterio(String idCriterio, String nombre, String descripcion, BigInteger nroOrden, String estado) {
        this.idCriterio = idCriterio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nroOrden = nroOrden;
        this.estado = estado;
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

    public BigInteger getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(BigInteger nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SacuEstandar> getSacuEstandarCollection() {
        return sacuEstandarCollection;
    }

    public void setSacuEstandarCollection(Collection<SacuEstandar> sacuEstandarCollection) {
        this.sacuEstandarCollection = sacuEstandarCollection;
    }

    public SacuFactor getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(SacuFactor idFactor) {
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
        if (!(object instanceof SacuCriterio)) {
            return false;
        }
        SacuCriterio other = (SacuCriterio) object;
        if ((this.idCriterio == null && other.idCriterio != null) || (this.idCriterio != null && !this.idCriterio.equals(other.idCriterio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuCriterio[ idCriterio=" + idCriterio + " ]";
    }
    
}
