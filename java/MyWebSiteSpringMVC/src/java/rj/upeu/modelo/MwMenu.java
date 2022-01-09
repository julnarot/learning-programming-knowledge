/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author @JONATAN
 */
@Entity
@Table(name = "mw_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwMenu.findAll", query = "SELECT m FROM MwMenu m"),
    @NamedQuery(name = "MwMenu.findByMenuId", query = "SELECT m FROM MwMenu m WHERE m.menuId = :menuId"),
    @NamedQuery(name = "MwMenu.findByNombre", query = "SELECT m FROM MwMenu m WHERE m.nombre = :nombre")})
public class MwMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "menu_id")
    private String menuId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuId")
    private Collection<MwAcceso> mwAccesoCollection;

    public MwMenu() {
    }

    public MwMenu(String menuId) {
        this.menuId = menuId;
    }

    public MwMenu(String menuId, String nombre) {
        this.menuId = menuId;
        this.nombre = nombre;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<MwAcceso> getMwAccesoCollection() {
        return mwAccesoCollection;
    }

    public void setMwAccesoCollection(Collection<MwAcceso> mwAccesoCollection) {
        this.mwAccesoCollection = mwAccesoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwMenu)) {
            return false;
        }
        MwMenu other = (MwMenu) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwMenu[ menuId=" + menuId + " ]";
    }

}
