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
@Table(name = "SACU_ESTANDAR_EVALUACION_EAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEstandarEvaluacionEap.findAll", query = "SELECT s FROM SacuEstandarEvaluacionEap s")})
public class SacuEstandarEvaluacionEap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR_EVALUACION")
    private String idEstandarEvaluacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandarEvaluacion")
    private Collection<SacuEvaluacionEstandar> sacuEvaluacionEstandarCollection;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_ESTANDAR", referencedColumnName = "ID_ESTANDAR")
    @ManyToOne(optional = false)
    private SacuEstandar idEstandar;
    @JoinColumn(name = "ID_EAP", referencedColumnName = "ID_EAP")
    @ManyToOne(optional = false)
    private SacuEap idEap;

    public SacuEstandarEvaluacionEap() {
    }

    public SacuEstandarEvaluacionEap(String idEstandarEvaluacion) {
        this.idEstandarEvaluacion = idEstandarEvaluacion;
    }

    public String getIdEstandarEvaluacion() {
        return idEstandarEvaluacion;
    }

    public void setIdEstandarEvaluacion(String idEstandarEvaluacion) {
        this.idEstandarEvaluacion = idEstandarEvaluacion;
    }

    @XmlTransient
    public Collection<SacuEvaluacionEstandar> getSacuEvaluacionEstandarCollection() {
        return sacuEvaluacionEstandarCollection;
    }

    public void setSacuEvaluacionEstandarCollection(Collection<SacuEvaluacionEstandar> sacuEvaluacionEstandarCollection) {
        this.sacuEvaluacionEstandarCollection = sacuEvaluacionEstandarCollection;
    }

    public SacuPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SacuPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SacuEstandar getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(SacuEstandar idEstandar) {
        this.idEstandar = idEstandar;
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
        hash += (idEstandarEvaluacion != null ? idEstandarEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEstandarEvaluacionEap)) {
            return false;
        }
        SacuEstandarEvaluacionEap other = (SacuEstandarEvaluacionEap) object;
        if ((this.idEstandarEvaluacion == null && other.idEstandarEvaluacion != null) || (this.idEstandarEvaluacion != null && !this.idEstandarEvaluacion.equals(other.idEstandarEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEstandarEvaluacionEap[ idEstandarEvaluacion=" + idEstandarEvaluacion + " ]";
    }
    
}
