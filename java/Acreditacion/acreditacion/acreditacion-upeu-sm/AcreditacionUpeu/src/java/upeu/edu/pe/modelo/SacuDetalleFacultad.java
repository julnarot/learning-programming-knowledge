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
@Table(name = "SACU_DETALLE_FACULTAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuDetalleFacultad.findAll", query = "SELECT s FROM SacuDetalleFacultad s")})
public class SacuDetalleFacultad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_FACULTAD")
    private String idDetalleFacultad;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SacuPersona idPersona;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_FACULTAD", referencedColumnName = "ID_FACULTAD")
    @ManyToOne(optional = false)
    private SacuFacultad idFacultad;

    public SacuDetalleFacultad() {
    }

    public SacuDetalleFacultad(String idDetalleFacultad) {
        this.idDetalleFacultad = idDetalleFacultad;
    }

    public String getIdDetalleFacultad() {
        return idDetalleFacultad;
    }

    public void setIdDetalleFacultad(String idDetalleFacultad) {
        this.idDetalleFacultad = idDetalleFacultad;
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

    public SacuFacultad getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(SacuFacultad idFacultad) {
        this.idFacultad = idFacultad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleFacultad != null ? idDetalleFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuDetalleFacultad)) {
            return false;
        }
        SacuDetalleFacultad other = (SacuDetalleFacultad) object;
        if ((this.idDetalleFacultad == null && other.idDetalleFacultad != null) || (this.idDetalleFacultad != null && !this.idDetalleFacultad.equals(other.idDetalleFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuDetalleFacultad[ idDetalleFacultad=" + idDetalleFacultad + " ]";
    }
    
}
