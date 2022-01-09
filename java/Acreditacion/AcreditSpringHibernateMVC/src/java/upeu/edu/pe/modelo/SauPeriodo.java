/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_PERIODO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauPeriodo.findAll", query = "SELECT s FROM SauPeriodo s")})
public class SauPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private String idPeriodo;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "EATADO")
    private String eatado;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SauResponsables> sauResponsablesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SauEapRepresentante> sauEapRepresentanteCollection;

    public SauPeriodo() {
    }

    public SauPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SauPeriodo(String idPeriodo, String periodo, String eatado, Date fechaInicio, Date fechaFin) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
        this.eatado = eatado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEatado() {
        return eatado;
    }

    public void setEatado(String eatado) {
        this.eatado = eatado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @XmlTransient
    public Collection<SauEstandarEvaluacion> getSauEstandarEvaluacionCollection() {
        return sauEstandarEvaluacionCollection;
    }

    public void setSauEstandarEvaluacionCollection(Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection) {
        this.sauEstandarEvaluacionCollection = sauEstandarEvaluacionCollection;
    }

    @XmlTransient
    public Collection<SauResponsables> getSauResponsablesCollection() {
        return sauResponsablesCollection;
    }

    public void setSauResponsablesCollection(Collection<SauResponsables> sauResponsablesCollection) {
        this.sauResponsablesCollection = sauResponsablesCollection;
    }

    @XmlTransient
    public Collection<SauEapRepresentante> getSauEapRepresentanteCollection() {
        return sauEapRepresentanteCollection;
    }

    public void setSauEapRepresentanteCollection(Collection<SauEapRepresentante> sauEapRepresentanteCollection) {
        this.sauEapRepresentanteCollection = sauEapRepresentanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauPeriodo)) {
            return false;
        }
        SauPeriodo other = (SauPeriodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauPeriodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
