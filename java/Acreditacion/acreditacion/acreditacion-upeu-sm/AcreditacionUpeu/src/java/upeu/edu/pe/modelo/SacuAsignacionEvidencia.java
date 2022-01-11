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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SACU_ASIGNACION_EVIDENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuAsignacionEvidencia.findAll", query = "SELECT s FROM SacuAsignacionEvidencia s")})
public class SacuAsignacionEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ASIGNACION_EVIDENCIA")
    private String idAsignacionEvidencia;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "FECHA_ASIGNACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAsignacionEvidencia")
    private Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAsignacionEvidencia")
    private Collection<SacuPlanMejora> sacuPlanMejoraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAsignacionEvidencia")
    private Collection<SacuDetalleEvidenciaCambio> sacuDetalleEvidenciaCambioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAsignacionEvidencia")
    private Collection<SacuDireccionEvidencia> sacuDireccionEvidenciaCollection;
    @JoinColumn(name = "ID_AREA", referencedColumnName = "ID_AREA")
    @ManyToOne(optional = false)
    private SacuArea idArea;

    public SacuAsignacionEvidencia() {
    }

    public SacuAsignacionEvidencia(String idAsignacionEvidencia) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
    }

    public SacuAsignacionEvidencia(String idAsignacionEvidencia, String codigo, Date fechaAsignacion, String estado) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
        this.codigo = codigo;
        this.fechaAsignacion = fechaAsignacion;
        this.estado = estado;
    }

    public String getIdAsignacionEvidencia() {
        return idAsignacionEvidencia;
    }

    public void setIdAsignacionEvidencia(String idAsignacionEvidencia) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SacuEvidenciaCumplida> getSacuEvidenciaCumplidaCollection() {
        return sacuEvidenciaCumplidaCollection;
    }

    public void setSacuEvidenciaCumplidaCollection(Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection) {
        this.sacuEvidenciaCumplidaCollection = sacuEvidenciaCumplidaCollection;
    }

    @XmlTransient
    public Collection<SacuPlanMejora> getSacuPlanMejoraCollection() {
        return sacuPlanMejoraCollection;
    }

    public void setSacuPlanMejoraCollection(Collection<SacuPlanMejora> sacuPlanMejoraCollection) {
        this.sacuPlanMejoraCollection = sacuPlanMejoraCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleEvidenciaCambio> getSacuDetalleEvidenciaCambioCollection() {
        return sacuDetalleEvidenciaCambioCollection;
    }

    public void setSacuDetalleEvidenciaCambioCollection(Collection<SacuDetalleEvidenciaCambio> sacuDetalleEvidenciaCambioCollection) {
        this.sacuDetalleEvidenciaCambioCollection = sacuDetalleEvidenciaCambioCollection;
    }

    @XmlTransient
    public Collection<SacuDireccionEvidencia> getSacuDireccionEvidenciaCollection() {
        return sacuDireccionEvidenciaCollection;
    }

    public void setSacuDireccionEvidenciaCollection(Collection<SacuDireccionEvidencia> sacuDireccionEvidenciaCollection) {
        this.sacuDireccionEvidenciaCollection = sacuDireccionEvidenciaCollection;
    }

    public SacuArea getIdArea() {
        return idArea;
    }

    public void setIdArea(SacuArea idArea) {
        this.idArea = idArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacionEvidencia != null ? idAsignacionEvidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuAsignacionEvidencia)) {
            return false;
        }
        SacuAsignacionEvidencia other = (SacuAsignacionEvidencia) object;
        if ((this.idAsignacionEvidencia == null && other.idAsignacionEvidencia != null) || (this.idAsignacionEvidencia != null && !this.idAsignacionEvidencia.equals(other.idAsignacionEvidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuAsignacionEvidencia[ idAsignacionEvidencia=" + idAsignacionEvidencia + " ]";
    }
    
}
