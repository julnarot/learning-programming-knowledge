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
@Table(name = "SACU_MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuMenu.findAll", query = "SELECT s FROM SacuMenu s")})
public class SacuMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MENU")
    private String idMenu;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "ALIAS")
    private String alias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMenu")
    private Collection<SacuAcceso> sacuAccesoCollection;

    public SacuMenu() {
    }

    public SacuMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public SacuMenu(String idMenu, String nombre, String estado, String alias) {
        this.idMenu = idMenu;
        this.nombre = nombre;
        this.estado = estado;
        this.alias = alias;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @XmlTransient
    public Collection<SacuAcceso> getSacuAccesoCollection() {
        return sacuAccesoCollection;
    }

    public void setSacuAccesoCollection(Collection<SacuAcceso> sacuAccesoCollection) {
        this.sacuAccesoCollection = sacuAccesoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuMenu)) {
            return false;
        }
        SacuMenu other = (SacuMenu) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuMenu[ idMenu=" + idMenu + " ]";
    }
    
}
