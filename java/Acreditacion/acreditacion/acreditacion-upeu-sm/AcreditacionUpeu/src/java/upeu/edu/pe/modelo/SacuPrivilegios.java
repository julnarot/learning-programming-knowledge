/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_PRIVILEGIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuPrivilegios.findAll", query = "SELECT s FROM SacuPrivilegios s")})
public class SacuPrivilegios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRIVILEGIO")
    private String idPrivilegio;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private SacuUsuario idUsuario;
    @JoinColumn(name = "ID_ACCESO", referencedColumnName = "ID_ACCESO")
    @ManyToOne(optional = false)
    private SacuAcceso idAcceso;

    public SacuPrivilegios() {
    }

    public SacuPrivilegios(String idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public SacuPrivilegios(String idPrivilegio, String estado, Date fechaAlta) {
        this.idPrivilegio = idPrivilegio;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
    }

    public String getIdPrivilegio() {
        return idPrivilegio;
    }

    public void setIdPrivilegio(String idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public SacuUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SacuUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SacuAcceso getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(SacuAcceso idAcceso) {
        this.idAcceso = idAcceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrivilegio != null ? idPrivilegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuPrivilegios)) {
            return false;
        }
        SacuPrivilegios other = (SacuPrivilegios) object;
        if ((this.idPrivilegio == null && other.idPrivilegio != null) || (this.idPrivilegio != null && !this.idPrivilegio.equals(other.idPrivilegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuPrivilegios[ idPrivilegio=" + idPrivilegio + " ]";
    }
    
}
