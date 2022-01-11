/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_AREAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauAreas.findAll", query = "SELECT s FROM SauAreas s")})
public class SauAreas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AREAS")
    private String idAreas;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreas")
    private Collection<SauResponsables> sauResponsablesCollection;

    public SauAreas() {
    }

    public SauAreas(String idAreas) {
        this.idAreas = idAreas;
    }

    public SauAreas(String idAreas, String nombre, String descripcion, String estado) {
        this.idAreas = idAreas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(String idAreas) {
        this.idAreas = idAreas;
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

    @XmlTransient
    public Collection<SauResponsables> getSauResponsablesCollection() {
        return sauResponsablesCollection;
    }

    public void setSauResponsablesCollection(Collection<SauResponsables> sauResponsablesCollection) {
        this.sauResponsablesCollection = sauResponsablesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreas != null ? idAreas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauAreas)) {
            return false;
        }
        SauAreas other = (SauAreas) object;
        if ((this.idAreas == null && other.idAreas != null) || (this.idAreas != null && !this.idAreas.equals(other.idAreas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauAreas[ idAreas=" + idAreas + " ]";
    }
    
}
