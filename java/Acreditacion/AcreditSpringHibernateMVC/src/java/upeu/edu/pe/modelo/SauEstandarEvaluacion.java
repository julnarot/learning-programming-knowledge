/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_ESTANDAR_EVALUACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEstandarEvaluacion.findAll", query = "SELECT s FROM SauEstandarEvaluacion s")})
public class SauEstandarEvaluacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR_EVAL")
    private String idEstandarEval;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandarEval")
    private Collection<SauEvaluacionEstandar> sauEvaluacionEstandarCollection;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SauPeriodo idPeriodo;
    @JoinColumn(name = "ID_ESTANDAR", referencedColumnName = "ID_ESTANDAR")
    @ManyToOne(optional = false)
    private SauEstandar idEstandar;
    @JoinColumn(name = "ID_EAP", referencedColumnName = "ID_EAP")
    @ManyToOne(optional = false)
    private SauEap idEap;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandarEval")
    private Collection<SauEstandarEvidencia> sauEstandarEvidenciaCollection;

    public SauEstandarEvaluacion() {
    }

    public SauEstandarEvaluacion(String idEstandarEval) {
        this.idEstandarEval = idEstandarEval;
    }

    public String getIdEstandarEval() {
        return idEstandarEval;
    }

    public void setIdEstandarEval(String idEstandarEval) {
        this.idEstandarEval = idEstandarEval;
    }

    @XmlTransient
    public Collection<SauEvaluacionEstandar> getSauEvaluacionEstandarCollection() {
        return sauEvaluacionEstandarCollection;
    }

    public void setSauEvaluacionEstandarCollection(Collection<SauEvaluacionEstandar> sauEvaluacionEstandarCollection) {
        this.sauEvaluacionEstandarCollection = sauEvaluacionEstandarCollection;
    }

    public SauPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SauPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SauEstandar getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(SauEstandar idEstandar) {
        this.idEstandar = idEstandar;
    }

    public SauEap getIdEap() {
        return idEap;
    }

    public void setIdEap(SauEap idEap) {
        this.idEap = idEap;
    }

    @XmlTransient
    public Collection<SauEstandarEvidencia> getSauEstandarEvidenciaCollection() {
        return sauEstandarEvidenciaCollection;
    }

    public void setSauEstandarEvidenciaCollection(Collection<SauEstandarEvidencia> sauEstandarEvidenciaCollection) {
        this.sauEstandarEvidenciaCollection = sauEstandarEvidenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandarEval != null ? idEstandarEval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEstandarEvaluacion)) {
            return false;
        }
        SauEstandarEvaluacion other = (SauEstandarEvaluacion) object;
        if ((this.idEstandarEval == null && other.idEstandarEval != null) || (this.idEstandarEval != null && !this.idEstandarEval.equals(other.idEstandarEval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEstandarEvaluacion[ idEstandarEval=" + idEstandarEval + " ]";
    }
    
}
