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
@Table(name = "SACU_DETALLE_FILIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDetalleFilial.findAll", query = "SELECT s FROM SacuDetalleFilial s")})
public class SacuDetalleFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_FILIAL")
    private String idDetalleFilial;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SacuPersona idPersona;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID_FILIAL")
    @ManyToOne(optional = false)
    private SacuFilial idFilial;

    public SacuDetalleFilial() {
    }

    public SacuDetalleFilial(String idDetalleFilial) {
        this.idDetalleFilial = idDetalleFilial;
    }

    public String getIdDetalleFilial() {
        return idDetalleFilial;
    }

    public void setIdDetalleFilial(String idDetalleFilial) {
        this.idDetalleFilial = idDetalleFilial;
    }

    public SacuPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(SacuPersona idPersona) {
        this.idPersona = idPersona;
    }

    public SacuPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SacuPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
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
        hash += (idDetalleFilial != null ? idDetalleFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDetalleFilial)) {
            return false;
        }
        SacuDetalleFilial other = (SacuDetalleFilial) object;
        if ((this.idDetalleFilial == null && other.idDetalleFilial != null) || (this.idDetalleFilial != null && !this.idDetalleFilial.equals(other.idDetalleFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDetalleFilial[ idDetalleFilial=" + idDetalleFilial + " ]";
    }
    
}
