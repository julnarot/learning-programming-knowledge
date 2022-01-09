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
@Table(name = "SACU_OBSERVACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuObservacion.findAll", query = "SELECT s FROM SacuObservacion s")})
public class SacuObservacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_OBSERVACION")
    private String idObservacion;
    @Basic(optional = false)
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "ID_EVALUACION", referencedColumnName = "ID_EVALUACION")
    @ManyToOne(optional = false)
    private SacuEvaluacion idEvaluacion;

    public SacuObservacion() {
    }

    public SacuObservacion(String idObservacion) {
        this.idObservacion = idObservacion;
    }

    public SacuObservacion(String idObservacion, String observacion) {
        this.idObservacion = idObservacion;
        this.observacion = observacion;
    }

    public String getIdObservacion() {
        return idObservacion;
    }

    public void setIdObservacion(String idObservacion) {
        this.idObservacion = idObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public SacuEvaluacion getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(SacuEvaluacion idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObservacion != null ? idObservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuObservacion)) {
            return false;
        }
        SacuObservacion other = (SacuObservacion) object;
        if ((this.idObservacion == null && other.idObservacion != null) || (this.idObservacion != null && !this.idObservacion.equals(other.idObservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuObservacion[ idObservacion=" + idObservacion + " ]";
    }
    
}
