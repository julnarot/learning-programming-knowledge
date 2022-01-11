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
@Table(name = "SACU_ESTANDAR_INVOLUCRADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEstandarInvolucrado.findAll", query = "SELECT s FROM SacuEstandarInvolucrado s")})
public class SacuEstandarInvolucrado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR_INVOLUCRADO")
    private String idEstandarInvolucrado;
    @JoinColumn(name = "ID_INVOLUCRADO", referencedColumnName = "ID_INVOLUCRADO")
    @ManyToOne(optional = false)
    private SacuInvolucrado idInvolucrado;
    @JoinColumn(name = "ID_ESTANDAR", referencedColumnName = "ID_ESTANDAR")
    @ManyToOne(optional = false)
    private SacuEstandar idEstandar;

    public SacuEstandarInvolucrado() {
    }

    public SacuEstandarInvolucrado(String idEstandarInvolucrado) {
        this.idEstandarInvolucrado = idEstandarInvolucrado;
    }

    public String getIdEstandarInvolucrado() {
        return idEstandarInvolucrado;
    }

    public void setIdEstandarInvolucrado(String idEstandarInvolucrado) {
        this.idEstandarInvolucrado = idEstandarInvolucrado;
    }

    public SacuInvolucrado getIdInvolucrado() {
        return idInvolucrado;
    }

    public void setIdInvolucrado(SacuInvolucrado idInvolucrado) {
        this.idInvolucrado = idInvolucrado;
    }

    public SacuEstandar getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(SacuEstandar idEstandar) {
        this.idEstandar = idEstandar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandarInvolucrado != null ? idEstandarInvolucrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEstandarInvolucrado)) {
            return false;
        }
        SacuEstandarInvolucrado other = (SacuEstandarInvolucrado) object;
        if ((this.idEstandarInvolucrado == null && other.idEstandarInvolucrado != null) || (this.idEstandarInvolucrado != null && !this.idEstandarInvolucrado.equals(other.idEstandarInvolucrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEstandarInvolucrado[ idEstandarInvolucrado=" + idEstandarInvolucrado + " ]";
    }
    
}
