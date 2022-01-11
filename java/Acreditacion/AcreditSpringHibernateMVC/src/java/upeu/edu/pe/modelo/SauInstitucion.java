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
@Table(name = "SAU_INSTITUCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauInstitucion.findAll", query = "SELECT s FROM SauInstitucion s")})
public class SauInstitucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_INSTITUCION")
    private String idInstitucion;
    @Basic(optional = false)
    @Column(name = "SAZON_SOCIAL")
    private String sazonSocial;
    @Basic(optional = false)
    @Column(name = "RUC")
    private String ruc;
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
    @Column(name = "PAGINAWEN")
    private String paginawen;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "REPRESENTANTE")
    private String representante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstitucion")
    private Collection<SauFilial> sauFilialCollection;

    public SauInstitucion() {
    }

    public SauInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public SauInstitucion(String idInstitucion, String sazonSocial, String ruc, String direccion, String numTelefono, String numCelular, String email, String paginawen, String descripcion, String representante) {
        this.idInstitucion = idInstitucion;
        this.sazonSocial = sazonSocial;
        this.ruc = ruc;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.numCelular = numCelular;
        this.email = email;
        this.paginawen = paginawen;
        this.descripcion = descripcion;
        this.representante = representante;
    }

    public String getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getSazonSocial() {
        return sazonSocial;
    }

    public void setSazonSocial(String sazonSocial) {
        this.sazonSocial = sazonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getPaginawen() {
        return paginawen;
    }

    public void setPaginawen(String paginawen) {
        this.paginawen = paginawen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @XmlTransient
    public Collection<SauFilial> getSauFilialCollection() {
        return sauFilialCollection;
    }

    public void setSauFilialCollection(Collection<SauFilial> sauFilialCollection) {
        this.sauFilialCollection = sauFilialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInstitucion != null ? idInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauInstitucion)) {
            return false;
        }
        SauInstitucion other = (SauInstitucion) object;
        if ((this.idInstitucion == null && other.idInstitucion != null) || (this.idInstitucion != null && !this.idInstitucion.equals(other.idInstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauInstitucion[ idInstitucion=" + idInstitucion + " ]";
    }
    
}
