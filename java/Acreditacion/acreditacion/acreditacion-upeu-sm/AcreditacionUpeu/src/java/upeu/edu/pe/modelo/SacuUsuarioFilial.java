/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_USUARIO_FILIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuUsuarioFilial.findAll", query = "SELECT s FROM SacuUsuarioFilial s")})
public class SacuUsuarioFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USUARIO_FILIAL")
    private String idUsuarioFilial;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private SacuUsuario idUsuario;
    @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID_FILIAL")
    @ManyToOne(optional = false)
    private SacuFilial idFilial;

    public SacuUsuarioFilial() {
    }

    public SacuUsuarioFilial(String idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public String getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(String idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public SacuUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SacuUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SacuFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(SacuFilial idFilial) {
        this.idFilial = idFilial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioFilial != null ? idUsuarioFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuUsuarioFilial)) {
            return false;
        }
        SacuUsuarioFilial other = (SacuUsuarioFilial) object;
        if ((this.idUsuarioFilial == null && other.idUsuarioFilial != null) || (this.idUsuarioFilial != null && !this.idUsuarioFilial.equals(other.idUsuarioFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuUsuarioFilial[ idUsuarioFilial=" + idUsuarioFilial + " ]";
    }
    
}
