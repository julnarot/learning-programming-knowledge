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
@Table(name = "SACU_FILIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuFilial.findAll", query = "SELECT s FROM SacuFilial s")})
public class SacuFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FILIAL")
    private String idFilial;
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
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "CATEGORIA")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<SacuFacultad> sacuFacultadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<SacuDetalleFilial> sacuDetalleFilialCollection;
    @JoinColumn(name = "ID_INSTITUCION", referencedColumnName = "ID_INSTITUCION")
    @ManyToOne(optional = false)
    private SacuInstitucion idInstitucion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<SacuUsuarioFilial> sacuUsuarioFilialCollection;

    public SacuFilial() {
    }

    public SacuFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public SacuFilial(String idFilial, String nombre, String telefono, String celular, String direccion, String email, String estado, String categoria) {
        this.idFilial = idFilial;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
        this.estado = estado;
        this.categoria = categoria;
    }

    public String getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(String idFilial) {
        this.idFilial = idFilial;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Collection<SacuFacultad> getSacuFacultadCollection() {
        return sacuFacultadCollection;
    }

    public void setSacuFacultadCollection(Collection<SacuFacultad> sacuFacultadCollection) {
        this.sacuFacultadCollection = sacuFacultadCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleFilial> getSacuDetalleFilialCollection() {
        return sacuDetalleFilialCollection;
    }

    public void setSacuDetalleFilialCollection(Collection<SacuDetalleFilial> sacuDetalleFilialCollection) {
        this.sacuDetalleFilialCollection = sacuDetalleFilialCollection;
    }

    public SacuInstitucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(SacuInstitucion idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @XmlTransient
    public Collection<SacuUsuarioFilial> getSacuUsuarioFilialCollection() {
        return sacuUsuarioFilialCollection;
    }

    public void setSacuUsuarioFilialCollection(Collection<SacuUsuarioFilial> sacuUsuarioFilialCollection) {
        this.sacuUsuarioFilialCollection = sacuUsuarioFilialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFilial != null ? idFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuFilial)) {
            return false;
        }
        SacuFilial other = (SacuFilial) object;
        if ((this.idFilial == null && other.idFilial != null) || (this.idFilial != null && !this.idFilial.equals(other.idFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuFilial[ idFilial=" + idFilial + " ]";
    }
    
}
