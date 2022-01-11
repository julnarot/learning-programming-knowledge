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
@Table(name = "SACU_AREA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuArea.findAll", query = "SELECT s FROM SacuArea s")})
public class SacuArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AREA")
    private String idArea;
    @Basic(optional = false)
    @Column(name = "NOMBRE_AREA")
    private String nombreArea;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea")
    private Collection<SacuAsignacionEvidencia> sacuAsignacionEvidenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea")
    private Collection<SacuResponsable> sacuResponsableCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea")
    private Collection<SacuAreaFactor> sacuAreaFactorCollection;

    public SacuArea() {
    }

    public SacuArea(String idArea) {
        this.idArea = idArea;
    }

    public SacuArea(String idArea, String nombreArea, String descripcion, String estado) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
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
    public Collection<SacuAsignacionEvidencia> getSacuAsignacionEvidenciaCollection() {
        return sacuAsignacionEvidenciaCollection;
    }

    public void setSacuAsignacionEvidenciaCollection(Collection<SacuAsignacionEvidencia> sacuAsignacionEvidenciaCollection) {
        this.sacuAsignacionEvidenciaCollection = sacuAsignacionEvidenciaCollection;
    }

    @XmlTransient
    public Collection<SacuResponsable> getSacuResponsableCollection() {
        return sacuResponsableCollection;
    }

    public void setSacuResponsableCollection(Collection<SacuResponsable> sacuResponsableCollection) {
        this.sacuResponsableCollection = sacuResponsableCollection;
    }

    @XmlTransient
    public Collection<SacuAreaFactor> getSacuAreaFactorCollection() {
        return sacuAreaFactorCollection;
    }

    public void setSacuAreaFactorCollection(Collection<SacuAreaFactor> sacuAreaFactorCollection) {
        this.sacuAreaFactorCollection = sacuAreaFactorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuArea)) {
            return false;
        }
        SacuArea other = (SacuArea) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuArea[ idArea=" + idArea + " ]";
    }
    
}
