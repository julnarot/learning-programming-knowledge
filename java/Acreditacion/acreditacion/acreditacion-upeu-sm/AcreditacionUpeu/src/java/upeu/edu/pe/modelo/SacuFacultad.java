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
@Table(name = "SACU_FACULTAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuFacultad.findAll", query = "SELECT s FROM SacuFacultad s")})
public class SacuFacultad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FACULTAD")
    private String idFacultad;
    @Basic(optional = false)
    @Column(name = "DESCRIPCIOM")
    private String descripciom;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID_FILIAL")
    @ManyToOne(optional = false)
    private SacuFilial idFilial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFacultad")
    private Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFacultad")
    private Collection<SacuEap> sacuEapCollection;

    public SacuFacultad() {
    }

    public SacuFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public SacuFacultad(String idFacultad, String descripciom, String nombre, String estado, String telefono) {
        this.idFacultad = idFacultad;
        this.descripciom = descripciom;
        this.nombre = nombre;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getDescripciom() {
        return descripciom;
    }

    public void setDescripciom(String descripciom) {
        this.descripciom = descripciom;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public SacuFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(SacuFilial idFilial) {
        this.idFilial = idFilial;
    }

    @XmlTransient
    public Collection<SacuDetalleFacultad> getSacuDetalleFacultadCollection() {
        return sacuDetalleFacultadCollection;
    }

    public void setSacuDetalleFacultadCollection(Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection) {
        this.sacuDetalleFacultadCollection = sacuDetalleFacultadCollection;
    }

    @XmlTransient
    public Collection<SacuEap> getSacuEapCollection() {
        return sacuEapCollection;
    }

    public void setSacuEapCollection(Collection<SacuEap> sacuEapCollection) {
        this.sacuEapCollection = sacuEapCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacultad != null ? idFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuFacultad)) {
            return false;
        }
        SacuFacultad other = (SacuFacultad) object;
        if ((this.idFacultad == null && other.idFacultad != null) || (this.idFacultad != null && !this.idFacultad.equals(other.idFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuFacultad[ idFacultad=" + idFacultad + " ]";
    }
    
}
