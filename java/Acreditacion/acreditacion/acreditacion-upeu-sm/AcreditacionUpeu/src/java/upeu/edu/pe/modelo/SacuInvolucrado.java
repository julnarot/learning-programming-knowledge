/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SACU_INVOLUCRADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuInvolucrado.findAll", query = "SELECT s FROM SacuInvolucrado s")})
public class SacuInvolucrado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_INVOLUCRADO")
    private String idInvolucrado;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInvolucrado")
    private Collection<SacuEstandarInvolucrado> sacuEstandarInvolucradoCollection;

    public SacuInvolucrado() {
    }

    public SacuInvolucrado(String idInvolucrado) {
        this.idInvolucrado = idInvolucrado;
    }

    public SacuInvolucrado(String idInvolucrado, String nombre, String descripcion) {
        this.idInvolucrado = idInvolucrado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getIdInvolucrado() {
        return idInvolucrado;
    }

    public void setIdInvolucrado(String idInvolucrado) {
        this.idInvolucrado = idInvolucrado;
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

    @XmlTransient
    public Collection<SacuEstandarInvolucrado> getSacuEstandarInvolucradoCollection() {
        return sacuEstandarInvolucradoCollection;
    }

    public void setSacuEstandarInvolucradoCollection(Collection<SacuEstandarInvolucrado> sacuEstandarInvolucradoCollection) {
        this.sacuEstandarInvolucradoCollection = sacuEstandarInvolucradoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvolucrado != null ? idInvolucrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuInvolucrado)) {
            return false;
        }
        SacuInvolucrado other = (SacuInvolucrado) object;
        if ((this.idInvolucrado == null && other.idInvolucrado != null) || (this.idInvolucrado != null && !this.idInvolucrado.equals(other.idInvolucrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuInvolucrado[ idInvolucrado=" + idInvolucrado + " ]";
    }
    
}
