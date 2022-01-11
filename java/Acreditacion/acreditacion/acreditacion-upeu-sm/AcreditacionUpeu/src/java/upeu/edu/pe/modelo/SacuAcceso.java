/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "SACU_ACCESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuAcceso.findAll", query = "SELECT s FROM SacuAcceso s")})
public class SacuAcceso implements Serializable {
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
    @Column(name = "NRO_ODEN")
    private BigInteger nroOden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private Collection<SacuPrivilegios> sacuPrivilegiosCollection;
    @JoinColumn(name = "ID_MENU", referencedColumnName = "ID_MENU")
    @ManyToOne(optional = false)
    private SacuMenu idMenu;

    public SacuAcceso() {
    }

    public SacuAcceso(String idAcceso) {
        this.idAcceso = idAcceso;
    }

    public SacuAcceso(String idAcceso, String nombre, String descripcion, String url, String estado, BigInteger nroOden) {
        this.idAcceso = idAcceso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.estado = estado;
        this.nroOden = nroOden;
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

    public BigInteger getNroOden() {
        return nroOden;
    }

    public void setNroOden(BigInteger nroOden) {
        this.nroOden = nroOden;
    }

    @XmlTransient
    public Collection<SacuPrivilegios> getSacuPrivilegiosCollection() {
        return sacuPrivilegiosCollection;
    }

    public void setSacuPrivilegiosCollection(Collection<SacuPrivilegios> sacuPrivilegiosCollection) {
        this.sacuPrivilegiosCollection = sacuPrivilegiosCollection;
    }

    public SacuMenu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(SacuMenu idMenu) {
        this.idMenu = idMenu;
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
        if (!(object instanceof SacuAcceso)) {
            return false;
        }
        SacuAcceso other = (SacuAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
