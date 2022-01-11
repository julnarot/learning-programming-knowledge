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
@Table(name = "SAU_EAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEap.findAll", query = "SELECT s FROM SauEap s")})
public class SauEap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EAP")
    private String idEap;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID_FILIAL")
    @ManyToOne(optional = false)
    private SauFilial idFilial;
    @JoinColumn(name = "ID_FACULTAD", referencedColumnName = "ID_FACULTAD")
    @ManyToOne(optional = false)
    private SauFacultad idFacultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SauEapRepresentante> sauEapRepresentanteCollection;

    public SauEap() {
    }

    public SauEap(String idEap) {
        this.idEap = idEap;
    }

    public SauEap(String idEap, String nombre, String estado) {
        this.idEap = idEap;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getIdEap() {
        return idEap;
    }

    public void setIdEap(String idEap) {
        this.idEap = idEap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SauFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(SauFilial idFilial) {
        this.idFilial = idFilial;
    }

    public SauFacultad getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(SauFacultad idFacultad) {
        this.idFacultad = idFacultad;
    }

    @XmlTransient
    public Collection<SauEstandarEvaluacion> getSauEstandarEvaluacionCollection() {
        return sauEstandarEvaluacionCollection;
    }

    public void setSauEstandarEvaluacionCollection(Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection) {
        this.sauEstandarEvaluacionCollection = sauEstandarEvaluacionCollection;
    }

    @XmlTransient
    public Collection<SauEapRepresentante> getSauEapRepresentanteCollection() {
        return sauEapRepresentanteCollection;
    }

    public void setSauEapRepresentanteCollection(Collection<SauEapRepresentante> sauEapRepresentanteCollection) {
        this.sauEapRepresentanteCollection = sauEapRepresentanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEap != null ? idEap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEap)) {
            return false;
        }
        SauEap other = (SauEap) object;
        if ((this.idEap == null && other.idEap != null) || (this.idEap != null && !this.idEap.equals(other.idEap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEap[ idEap=" + idEap + " ]";
    }
    
}
