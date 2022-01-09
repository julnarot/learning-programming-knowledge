/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_PERIODO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuPeriodo.findAll", query = "SELECT s FROM SacuPeriodo s")})
public class SacuPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private String idPeriodo;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHAINICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicial;
    @Basic(optional = false)
    @Column(name = "FECHAFINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuEvaluador> sacuEvaluadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuDetalleFilial> sacuDetalleFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuDetalleEap> sacuDetalleEapCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<SacuResponsable> sacuResponsableCollection;

    public SacuPeriodo() {
    }

    public SacuPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SacuPeriodo(String idPeriodo, String periodo, String estado, Date fechainicial, Date fechafinal) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
        this.estado = estado;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    @XmlTransient
    public Collection<SacuEvaluador> getSacuEvaluadorCollection() {
        return sacuEvaluadorCollection;
    }

    public void setSacuEvaluadorCollection(Collection<SacuEvaluador> sacuEvaluadorCollection) {
        this.sacuEvaluadorCollection = sacuEvaluadorCollection;
    }

    @XmlTransient
    public Collection<SacuEvidenciaCumplida> getSacuEvidenciaCumplidaCollection() {
        return sacuEvidenciaCumplidaCollection;
    }

    public void setSacuEvidenciaCumplidaCollection(Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection) {
        this.sacuEvidenciaCumplidaCollection = sacuEvidenciaCumplidaCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleFilial> getSacuDetalleFilialCollection() {
        return sacuDetalleFilialCollection;
    }

    public void setSacuDetalleFilialCollection(Collection<SacuDetalleFilial> sacuDetalleFilialCollection) {
        this.sacuDetalleFilialCollection = sacuDetalleFilialCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleEap> getSacuDetalleEapCollection() {
        return sacuDetalleEapCollection;
    }

    public void setSacuDetalleEapCollection(Collection<SacuDetalleEap> sacuDetalleEapCollection) {
        this.sacuDetalleEapCollection = sacuDetalleEapCollection;
    }

    @XmlTransient
    public Collection<SacuEstandarEvaluacionEap> getSacuEstandarEvaluacionEapCollection() {
        return sacuEstandarEvaluacionEapCollection;
    }

    public void setSacuEstandarEvaluacionEapCollection(Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection) {
        this.sacuEstandarEvaluacionEapCollection = sacuEstandarEvaluacionEapCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleFacultad> getSacuDetalleFacultadCollection() {
        return sacuDetalleFacultadCollection;
    }

    public void setSacuDetalleFacultadCollection(Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection) {
        this.sacuDetalleFacultadCollection = sacuDetalleFacultadCollection;
    }

    @XmlTransient
    public Collection<SacuResponsable> getSacuResponsableCollection() {
        return sacuResponsableCollection;
    }

    public void setSacuResponsableCollection(Collection<SacuResponsable> sacuResponsableCollection) {
        this.sacuResponsableCollection = sacuResponsableCollection;
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
        if (!(object instanceof SacuPeriodo)) {
            return false;
        }
        SacuPeriodo other = (SacuPeriodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuPeriodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
