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
@Table(name = "mw_acceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwAcceso.findAll", query = "SELECT m FROM MwAcceso m"),
    @NamedQuery(name = "MwAcceso.findByAccesoId", query = "SELECT m FROM MwAcceso m WHERE m.accesoId = :accesoId"),
    @NamedQuery(name = "MwAcceso.findByPagina", query = "SELECT m FROM MwAcceso m WHERE m.pagina = :pagina"),
    @NamedQuery(name = "MwAcceso.findByNombre", query = "SELECT m FROM MwAcceso m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "MwAcceso.findByOrden", query = "SELECT m FROM MwAcceso m WHERE m.orden = :orden")})
public class MwAcceso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "acceso_id")
    private String accesoId;
    @Basic(optional = false)
    @Column(name = "pagina")
    private String pagina;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "orden")
    private String orden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accesoId")
    private Collection<MwPrivilegio> mwPrivilegioCollection;
    @JoinColumn(name = "menu_id", referencedColumnName = "menu_id")
    @ManyToOne(optional = false)
    private MwMenu menuId;

    public MwAcceso() {
    }

    public MwAcceso(String accesoId) {
        this.accesoId = accesoId;
    }

    public MwAcceso(String accesoId, String pagina, String nombre, String orden) {
        this.accesoId = accesoId;
        this.pagina = pagina;
        this.nombre = nombre;
        this.orden = orden;
    }

    public String getAccesoId() {
        return accesoId;
    }

    public void setAccesoId(String accesoId) {
        this.accesoId = accesoId;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @XmlTransient
    public Collection<MwPrivilegio> getMwPrivilegioCollection() {
        return mwPrivilegioCollection;
    }

    public void setMwPrivilegioCollection(Collection<MwPrivilegio> mwPrivilegioCollection) {
        this.mwPrivilegioCollection = mwPrivilegioCollection;
    }

    public MwMenu getMenuId() {
        return menuId;
    }

    public void setMenuId(MwMenu menuId) {
        this.menuId = menuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accesoId != null ? accesoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwAcceso)) {
            return false;
        }
        MwAcceso other = (MwAcceso) object;
        if ((this.accesoId == null && other.accesoId != null) || (this.accesoId != null && !this.accesoId.equals(other.accesoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwAcceso[ accesoId=" + accesoId + " ]";
    }

}
