/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_PRIVILEGIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauPrivilegios.findAll", query = "SELECT s FROM SauPrivilegios s")})
public class SauPrivilegios implements Serializable {
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private SauUsuario idUsuario;
    @JoinColumn(name = "ID_ACCESO", referencedColumnName = "ID_ACCESO")
    @ManyToOne(optional = false)
    private SauAcceso idAcceso;

    public SauPrivilegios() {
    }

    public SauPrivilegios(String idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public SauPrivilegios(String idPrivilegio, String estado, Date fechaAlta) {
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

    public SauUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SauUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SauAcceso getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(SauAcceso idAcceso) {
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
        if (!(object instanceof SauPrivilegios)) {
            return false;
        }
        SauPrivilegios other = (SauPrivilegios) object;
        if ((this.idPrivilegio == null && other.idPrivilegio != null) || (this.idPrivilegio != null && !this.idPrivilegio.equals(other.idPrivilegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauPrivilegios[ idPrivilegio=" + idPrivilegio + " ]";
    }
    
}
