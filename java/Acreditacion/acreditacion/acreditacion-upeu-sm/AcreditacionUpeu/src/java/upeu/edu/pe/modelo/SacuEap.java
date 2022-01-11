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
@Table(name = "SACU_EAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEap.findAll", query = "SELECT s FROM SacuEap s")})
public class SacuEap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EAP")
    private String idEap;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "CELULAR")
    private String celular;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SacuEvaluador> sacuEvaluadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SacuDetalleEap> sacuDetalleEapCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection;
    @JoinColumn(name = "ID_FACULTAD", referencedColumnName = "ID_FACULTAD")
    @ManyToOne(optional = false)
    private SacuFacultad idFacultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEap")
    private Collection<SacuResponsable> sacuResponsableCollection;

    public SacuEap() {
    }

    public SacuEap(String idEap) {
        this.idEap = idEap;
    }

    public SacuEap(String idEap, String nombre, String telefono, String celular, String estado) {
        this.idEap = idEap;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SacuEvaluador> getSacuEvaluadorCollection() {
        return sacuEvaluadorCollection;
    }

    public void setSacuEvaluadorCollection(Collection<SacuEvaluador> sacuEvaluadorCollection) {
        this.sacuEvaluadorCollection = sacuEvaluadorCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleEap> getSacuDetalleEapCollection() {
        return sacuDetalleEapCollection;
    }

    public void setSacuDetalleEapCollection(Collection<SacuDetalleEap> sacuDetalleEapCollection) {
        this.sacuDetalleEapCollection = sacuDetalleEapCollection;
    }

    @XmlTransient
    public Collection<SacuEstandarEvaluacionEap> getSacuEstandarEvaluacionEapCollection() {
        return sacuEstandarEvaluacionEapCollection;
    }

    public void setSacuEstandarEvaluacionEapCollection(Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection) {
        this.sacuEstandarEvaluacionEapCollection = sacuEstandarEvaluacionEapCollection;
    }

    public SacuFacultad getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(SacuFacultad idFacultad) {
        this.idFacultad = idFacultad;
    }

    @XmlTransient
    public Collection<SacuResponsable> getSacuResponsableCollection() {
        return sacuResponsableCollection;
    }

    public void setSacuResponsableCollection(Collection<SacuResponsable> sacuResponsableCollection) {
        this.sacuResponsableCollection = sacuResponsableCollection;
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
        if (!(object instanceof SacuEap)) {
            return false;
        }
        SacuEap other = (SacuEap) object;
        if ((this.idEap == null && other.idEap != null) || (this.idEap != null && !this.idEap.equals(other.idEap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEap[ idEap=" + idEap + " ]";
    }
    
}
