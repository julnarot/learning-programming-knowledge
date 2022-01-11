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
@Table(name = "SACU_DETALLE_EAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDetalleEap.findAll", query = "SELECT s FROM SacuDetalleEap s")})
public class SacuDetalleEap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_EAP")
    private String idDetalleEap;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SacuPersona idPersona;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_EAP", referencedColumnName = "ID_EAP")
    @ManyToOne(optional = false)
    private SacuEap idEap;

    public SacuDetalleEap() {
    }

    public SacuDetalleEap(String idDetalleEap) {
        this.idDetalleEap = idDetalleEap;
    }

    public String getIdDetalleEap() {
        return idDetalleEap;
    }

    public void setIdDetalleEap(String idDetalleEap) {
        this.idDetalleEap = idDetalleEap;
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

    public SacuEap getIdEap() {
        return idEap;
    }

    public void setIdEap(SacuEap idEap) {
        this.idEap = idEap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleEap != null ? idDetalleEap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDetalleEap)) {
            return false;
        }
        SacuDetalleEap other = (SacuDetalleEap) object;
        if ((this.idDetalleEap == null && other.idDetalleEap != null) || (this.idDetalleEap != null && !this.idDetalleEap.equals(other.idDetalleEap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDetalleEap[ idDetalleEap=" + idDetalleEap + " ]";
    }
    
}
