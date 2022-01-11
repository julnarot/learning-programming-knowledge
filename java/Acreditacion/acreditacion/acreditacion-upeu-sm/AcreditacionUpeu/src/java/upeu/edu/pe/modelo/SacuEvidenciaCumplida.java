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
@Table(name = "SACU_EVIDENCIA_CUMPLIDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEvidenciaCumplida.findAll", query = "SELECT s FROM SacuEvidenciaCumplida s")})
public class SacuEvidenciaCumplida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVIDENCIA_CUMPLIDA")
    private String idEvidenciaCumplida;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_EVIDENCIA", referencedColumnName = "ID_EVIDENCIA")
    @ManyToOne(optional = false)
    private SacuEvidencia idEvidencia;
    @JoinColumn(name = "ID_ASIGNACION_EVIDENCIA", referencedColumnName = "ID_ASIGNACION_EVIDENCIA")
    @ManyToOne(optional = false)
    private SacuAsignacionEvidencia idAsignacionEvidencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEvidenciaCumplida")
    private Collection<SacuEvaluacion> sacuEvaluacionCollection;

    public SacuEvidenciaCumplida() {
    }

    public SacuEvidenciaCumplida(String idEvidenciaCumplida) {
        this.idEvidenciaCumplida = idEvidenciaCumplida;
    }

    public String getIdEvidenciaCumplida() {
        return idEvidenciaCumplida;
    }

    public void setIdEvidenciaCumplida(String idEvidenciaCumplida) {
        this.idEvidenciaCumplida = idEvidenciaCumplida;
    }

    public SacuPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SacuPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SacuEvidencia getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(SacuEvidencia idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public SacuAsignacionEvidencia getIdAsignacionEvidencia() {
        return idAsignacionEvidencia;
    }

    public void setIdAsignacionEvidencia(SacuAsignacionEvidencia idAsignacionEvidencia) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
    }

    @XmlTransient
    public Collection<SacuEvaluacion> getSacuEvaluacionCollection() {
        return sacuEvaluacionCollection;
    }

    public void setSacuEvaluacionCollection(Collection<SacuEvaluacion> sacuEvaluacionCollection) {
        this.sacuEvaluacionCollection = sacuEvaluacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvidenciaCumplida != null ? idEvidenciaCumplida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEvidenciaCumplida)) {
            return false;
        }
        SacuEvidenciaCumplida other = (SacuEvidenciaCumplida) object;
        if ((this.idEvidenciaCumplida == null && other.idEvidenciaCumplida != null) || (this.idEvidenciaCumplida != null && !this.idEvidenciaCumplida.equals(other.idEvidenciaCumplida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEvidenciaCumplida[ idEvidenciaCumplida=" + idEvidenciaCumplida + " ]";
    }
    
}
