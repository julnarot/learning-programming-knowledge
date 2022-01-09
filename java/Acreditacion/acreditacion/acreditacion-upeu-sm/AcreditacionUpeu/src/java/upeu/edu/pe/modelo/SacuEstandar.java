/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "SACU_ESTANDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEstandar.findAll", query = "SELECT s FROM SacuEstandar s")})
public class SacuEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR")
    private String idEstandar;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "NRO_ESTANDAR")
    private BigInteger nroEstandar;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandar")
    private Collection<SacuEvidencia> sacuEvidenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandar")
    private Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection;
    @JoinColumn(name = "ID_TIPO_ESTANDAR", referencedColumnName = "ID_TIPO_ESTANDAR")
    @ManyToOne(optional = false)
    private SacuTipoEstandar idTipoEstandar;
    @JoinColumn(name = "ID_CRITERIO", referencedColumnName = "ID_CRITERIO")
    @ManyToOne(optional = false)
    private SacuCriterio idCriterio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandar")
    private Collection<SacuEstandarInvolucrado> sacuEstandarInvolucradoCollection;

    public SacuEstandar() {
    }

    public SacuEstandar(String idEstandar) {
        this.idEstandar = idEstandar;
    }

    public SacuEstandar(String idEstandar, String nombre, String descripcion, BigInteger nroEstandar, Date fecha, String estado) {
        this.idEstandar = idEstandar;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nroEstandar = nroEstandar;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(String idEstandar) {
        this.idEstandar = idEstandar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getNroEstandar() {
        return nroEstandar;
    }

    public void setNroEstandar(BigInteger nroEstandar) {
        this.nroEstandar = nroEstandar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SacuEvidencia> getSacuEvidenciaCollection() {
        return sacuEvidenciaCollection;
    }

    public void setSacuEvidenciaCollection(Collection<SacuEvidencia> sacuEvidenciaCollection) {
        this.sacuEvidenciaCollection = sacuEvidenciaCollection;
    }

    @XmlTransient
    public Collection<SacuEstandarEvaluacionEap> getSacuEstandarEvaluacionEapCollection() {
        return sacuEstandarEvaluacionEapCollection;
    }

    public void setSacuEstandarEvaluacionEapCollection(Collection<SacuEstandarEvaluacionEap> sacuEstandarEvaluacionEapCollection) {
        this.sacuEstandarEvaluacionEapCollection = sacuEstandarEvaluacionEapCollection;
    }

    public SacuTipoEstandar getIdTipoEstandar() {
        return idTipoEstandar;
    }

    public void setIdTipoEstandar(SacuTipoEstandar idTipoEstandar) {
        this.idTipoEstandar = idTipoEstandar;
    }

    public SacuCriterio getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(SacuCriterio idCriterio) {
        this.idCriterio = idCriterio;
    }

    @XmlTransient
    public Collection<SacuEstandarInvolucrado> getSacuEstandarInvolucradoCollection() {
        return sacuEstandarInvolucradoCollection;
    }

    public void setSacuEstandarInvolucradoCollection(Collection<SacuEstandarInvolucrado> sacuEstandarInvolucradoCollection) {
        this.sacuEstandarInvolucradoCollection = sacuEstandarInvolucradoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandar != null ? idEstandar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEstandar)) {
            return false;
        }
        SacuEstandar other = (SacuEstandar) object;
        if ((this.idEstandar == null && other.idEstandar != null) || (this.idEstandar != null && !this.idEstandar.equals(other.idEstandar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEstandar[ idEstandar=" + idEstandar + " ]";
    }
    
}
