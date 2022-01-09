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
@Table(name = "SAU_DIMENSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauDimension.findAll", query = "SELECT s FROM SauDimension s")})
public class SauDimension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DIMENSION")
    private String idDimension;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDimension")
    private Collection<SauFactor> sauFactorCollection;

    public SauDimension() {
    }

    public SauDimension(String idDimension) {
        this.idDimension = idDimension;
    }

    public SauDimension(String idDimension, String nombre, String estado) {
        this.idDimension = idDimension;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getIdDimension() {
        return idDimension;
    }

    public void setIdDimension(String idDimension) {
        this.idDimension = idDimension;
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
    public Collection<SauFactor> getSauFactorCollection() {
        return sauFactorCollection;
    }

    public void setSauFactorCollection(Collection<SauFactor> sauFactorCollection) {
        this.sauFactorCollection = sauFactorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDimension != null ? idDimension.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauDimension)) {
            return false;
        }
        SauDimension other = (SauDimension) object;
        if ((this.idDimension == null && other.idDimension != null) || (this.idDimension != null && !this.idDimension.equals(other.idDimension))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauDimension[ idDimension=" + idDimension + " ]";
    }
    
}
