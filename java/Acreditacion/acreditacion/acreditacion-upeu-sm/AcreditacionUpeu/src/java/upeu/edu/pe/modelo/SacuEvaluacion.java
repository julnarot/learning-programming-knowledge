/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_EVALUACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEvaluacion.findAll", query = "SELECT s FROM SacuEvaluacion s")})
public class SacuEvaluacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVALUACION")
    private String idEvaluacion;
    @Basic(optional = false)
    @Column(name = "EVALUACION")
    private String evaluacion;
    @JoinColumn(name = "ID_EVIDENCIA_CUMPLIDA", referencedColumnName = "ID_EVIDENCIA_CUMPLIDA")
    @ManyToOne(optional = false)
    private SacuEvidenciaCumplida idEvidenciaCumplida;
    @JoinColumn(name = "ID_EVALUADOR", referencedColumnName = "ID_EVALUADOR")
    @ManyToOne(optional = false)
    private SacuEvaluador idEvaluador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEvaluacion")
    private Collection<SacuObservacion> sacuObservacionCollection;

    public SacuEvaluacion() {
    }

    public SacuEvaluacion(String idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public SacuEvaluacion(String idEvaluacion, String evaluacion) {
        this.idEvaluacion = idEvaluacion;
        this.evaluacion = evaluacion;
    }

    public String getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(String idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public SacuEvidenciaCumplida getIdEvidenciaCumplida() {
        return idEvidenciaCumplida;
    }

    public void setIdEvidenciaCumplida(SacuEvidenciaCumplida idEvidenciaCumplida) {
        this.idEvidenciaCumplida = idEvidenciaCumplida;
    }

    public SacuEvaluador getIdEvaluador() {
        return idEvaluador;
    }

    public void setIdEvaluador(SacuEvaluador idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    @XmlTransient
    public Collection<SacuObservacion> getSacuObservacionCollection() {
        return sacuObservacionCollection;
    }

    public void setSacuObservacionCollection(Collection<SacuObservacion> sacuObservacionCollection) {
        this.sacuObservacionCollection = sacuObservacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvaluacion != null ? idEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEvaluacion)) {
            return false;
        }
        SacuEvaluacion other = (SacuEvaluacion) object;
        if ((this.idEvaluacion == null && other.idEvaluacion != null) || (this.idEvaluacion != null && !this.idEvaluacion.equals(other.idEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEvaluacion[ idEvaluacion=" + idEvaluacion + " ]";
    }
    
}
