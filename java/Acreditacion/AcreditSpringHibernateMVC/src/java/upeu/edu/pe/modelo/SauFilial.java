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
@Table(name = "SAU_FILIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauFilial.findAll", query = "SELECT s FROM SauFilial s")})
public class SauFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FILIAL")
    private String idFilial;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "NUM_TELEFONO")
    private String numTelefono;
    @Basic(optional = false)
    @Column(name = "NUM_CELULAR")
    private String numCelular;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "CATEGORIA")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<SauEap> sauEapCollection;
    @JoinColumn(name = "ID_INSTITUCION", referencedColumnName = "ID_INSTITUCION")
    @ManyToOne(optional = false)
    private SauInstitucion idInstitucion;

    public SauFilial() {
    }

    public SauFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public SauFilial(String idFilial, String direccion, String numTelefono, String numCelular, String email, String descripcion, String categoria, String representante, String estado) {
        this.idFilial = idFilial;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.numCelular = numCelular;
        this.email = email;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.representante = representante;
        this.estado = estado;
    }

    public String getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SauEap> getSauEapCollection() {
        return sauEapCollection;
    }

    public void setSauEapCollection(Collection<SauEap> sauEapCollection) {
        this.sauEapCollection = sauEapCollection;
    }

    public SauInstitucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(SauInstitucion idInstitucion) {
        this.idInstitucion = idInstitucion;
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
        if (!(object instanceof SauFilial)) {
            return false;
        }
        SauFilial other = (SauFilial) object;
        if ((this.idFilial == null && other.idFilial != null) || (this.idFilial != null && !this.idFilial.equals(other.idFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauFilial[ idFilial=" + idFilial + " ]";
    }
    
}
