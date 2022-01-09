/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author @JONATAN
 */
@Entity
@Table(name = "mw_privilegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwPrivilegio.findAll", query = "SELECT m FROM MwPrivilegio m"),
    @NamedQuery(name = "MwPrivilegio.findByPrivilegioId", query = "SELECT m FROM MwPrivilegio m WHERE m.privilegioId = :privilegioId"),
    @NamedQuery(name = "MwPrivilegio.findByEstado", query = "SELECT m FROM MwPrivilegio m WHERE m.estado = :estado"),
    @NamedQuery(name = "MwPrivilegio.findByFechaalta", query = "SELECT m FROM MwPrivilegio m WHERE m.fechaalta = :fechaalta")})
public class MwPrivilegio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "privilegio_id")
    private String privilegioId;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "fechaalta")
    private String fechaalta;
    @JoinColumn(name = "acceso_id", referencedColumnName = "acceso_id")
    @ManyToOne(optional = false)
    private MwAcceso accesoId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private MwUsuario usuarioId;

    public MwPrivilegio() {
    }

    public MwPrivilegio(String privilegioId) {
        this.privilegioId = privilegioId;
    }

    public MwPrivilegio(String privilegioId, String estado, String fechaalta) {
        this.privilegioId = privilegioId;
        this.estado = estado;
        this.fechaalta = fechaalta;
    }

    public String getPrivilegioId() {
        return privilegioId;
    }

    public void setPrivilegioId(String privilegioId) {
        this.privilegioId = privilegioId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public MwAcceso getAccesoId() {
        return accesoId;
    }

    public void setAccesoId(MwAcceso accesoId) {
        this.accesoId = accesoId;
    }

    public MwUsuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(MwUsuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (privilegioId != null ? privilegioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwPrivilegio)) {
            return false;
        }
        MwPrivilegio other = (MwPrivilegio) object;
        if ((this.privilegioId == null && other.privilegioId != null) || (this.privilegioId != null && !this.privilegioId.equals(other.privilegioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwPrivilegio[ privilegioId=" + privilegioId + " ]";
    }

}
