/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_ACCESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauAcceso.findAll", query = "SELECT s FROM SauAcceso s")})
public class SauAcceso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ACCESO")
    private String idAcceso;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "NRO_ORDEN")
    private BigInteger nroOrden;
    @JoinColumn(name = "ID_MENU", referencedColumnName = "ID_MENU")
    @ManyToOne(optional = false)
    private SauMenu idMenu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private Collection<SauPrivilegios> sauPrivilegiosCollection;

    public SauAcceso() {
    }

    public SauAcceso(String idAcceso) {
        this.idAcceso = idAcceso;
    }

    public SauAcceso(String idAcceso, String nombre, String descripcion, String url, String estado, BigInteger nroOrden) {
        this.idAcceso = idAcceso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.estado = estado;
        this.nroOrden = nroOrden;
    }

    public String getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(String idAcceso) {
        this.idAcceso = idAcceso;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(BigInteger nroOrden) {
        this.nroOrden = nroOrden;
    }

    public SauMenu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(SauMenu idMenu) {
        this.idMenu = idMenu;
    }

    @XmlTransient
    public Collection<SauPrivilegios> getSauPrivilegiosCollection() {
        return sauPrivilegiosCollection;
    }

    public void setSauPrivilegiosCollection(Collection<SauPrivilegios> sauPrivilegiosCollection) {
        this.sauPrivilegiosCollection = sauPrivilegiosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauAcceso)) {
            return false;
        }
        SauAcceso other = (SauAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
