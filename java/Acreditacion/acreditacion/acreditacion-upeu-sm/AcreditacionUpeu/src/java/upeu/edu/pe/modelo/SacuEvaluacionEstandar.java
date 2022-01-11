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
@Table(name = "SACU_EVALUACION_ESTANDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEvaluacionEstandar.findAll", query = "SELECT s FROM SacuEvaluacionEstandar s")})
public class SacuEvaluacionEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVALUACION_ESTANDAR")
    private String idEvaluacionEstandar;
    @Basic(optional = false)
    @Column(name = "CUMPLIO")
    private String cumplio;
    @Basic(optional = false)
    @Column(name = "URL_DOC_ESTANDAR")
    private String urlDocEstandar;
    @JoinColumn(name = "ID_ESTANDAR_EVALUACION", referencedColumnName = "ID_ESTANDAR_EVALUACION")
    @ManyToOne(optional = false)
    private SacuEstandarEvaluacionEap idEstandarEvaluacion;

    public SacuEvaluacionEstandar() {
    }

    public SacuEvaluacionEstandar(String idEvaluacionEstandar) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
    }

    public SacuEvaluacionEstandar(String idEvaluacionEstandar, String cumplio, String urlDocEstandar) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
        this.cumplio = cumplio;
        this.urlDocEstandar = urlDocEstandar;
    }

    public String getIdEvaluacionEstandar() {
        return idEvaluacionEstandar;
    }

    public void setIdEvaluacionEstandar(String idEvaluacionEstandar) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
    }

    public String getCumplio() {
        return cumplio;
    }

    public void setCumplio(String cumplio) {
        this.cumplio = cumplio;
    }

    public String getUrlDocEstandar() {
        return urlDocEstandar;
    }

    public void setUrlDocEstandar(String urlDocEstandar) {
        this.urlDocEstandar = urlDocEstandar;
    }

    public SacuEstandarEvaluacionEap getIdEstandarEvaluacion() {
        return idEstandarEvaluacion;
    }

    public void setIdEstandarEvaluacion(SacuEstandarEvaluacionEap idEstandarEvaluacion) {
        this.idEstandarEvaluacion = idEstandarEvaluacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvaluacionEstandar != null ? idEvaluacionEstandar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEvaluacionEstandar)) {
            return false;
        }
        SacuEvaluacionEstandar other = (SacuEvaluacionEstandar) object;
        if ((this.idEvaluacionEstandar == null && other.idEvaluacionEstandar != null) || (this.idEvaluacionEstandar != null && !this.idEvaluacionEstandar.equals(other.idEvaluacionEstandar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEvaluacionEstandar[ idEvaluacionEstandar=" + idEvaluacionEstandar + " ]";
    }
    
}
