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
@Table(name = "mw_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwUsuario.findAll", query = "SELECT m FROM MwUsuario m"),
    @NamedQuery(name = "MwUsuario.findByUsuarioId", query = "SELECT m FROM MwUsuario m WHERE m.usuarioId = :usuarioId"),
    @NamedQuery(name = "MwUsuario.findByEstado", query = "SELECT m FROM MwUsuario m WHERE m.estado = :estado"),
    @NamedQuery(name = "MwUsuario.findByFechaacces", query = "SELECT m FROM MwUsuario m WHERE m.fechaacces = :fechaacces"),
    @NamedQuery(name = "MwUsuario.findByClave", query = "SELECT m FROM MwUsuario m WHERE m.clave = :clave"),
    @NamedQuery(name = "MwUsuario.findByFechaalta", query = "SELECT m FROM MwUsuario m WHERE m.fechaalta = :fechaalta"),
    @NamedQuery(name = "MwUsuario.findByAlias", query = "SELECT m FROM MwUsuario m WHERE m.alias = :alias")})
public class MwUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usuario_id")
    private String usuarioId;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "fechaacces")
    private String fechaacces;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "fechaalta")
    private String fechaalta;
    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private Collection<MwPrivilegio> mwPrivilegioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private Collection<MwColaborador> mwColaboradorCollection;

    public MwUsuario() {
    }

    public MwUsuario(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public MwUsuario(String usuarioId, String estado, String fechaacces, String clave, String fechaalta, String alias) {
        this.usuarioId = usuarioId;
        this.estado = estado;
        this.fechaacces = fechaacces;
        this.clave = clave;
        this.fechaalta = fechaalta;
        this.alias = alias;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaacces() {
        return fechaacces;
    }

    public void setFechaacces(String fechaacces) {
        this.fechaacces = fechaacces;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @XmlTransient
    public Collection<MwPrivilegio> getMwPrivilegioCollection() {
        return mwPrivilegioCollection;
    }

    public void setMwPrivilegioCollection(Collection<MwPrivilegio> mwPrivilegioCollection) {
        this.mwPrivilegioCollection = mwPrivilegioCollection;
    }

    @XmlTransient
    public Collection<MwColaborador> getMwColaboradorCollection() {
        return mwColaboradorCollection;
    }

    public void setMwColaboradorCollection(Collection<MwColaborador> mwColaboradorCollection) {
        this.mwColaboradorCollection = mwColaboradorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwUsuario)) {
            return false;
        }
        MwUsuario other = (MwUsuario) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwUsuario[ usuarioId=" + usuarioId + " ]";
    }

}
