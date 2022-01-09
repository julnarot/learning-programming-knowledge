/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "SAU_ESTANDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEstandar.findAll", query = "SELECT s FROM SauEstandar s")})
public class SauEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR")
    private String idEstandar;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "NRO_ESTANDAR")
    private BigInteger nroEstandar;
    @JoinColumn(name = "ID_GRUPOAREAS", referencedColumnName = "ID_GRUPOAREAS")
    @ManyToOne(optional = false)
    private SauGrupoareas idGrupoareas;
    @JoinColumn(name = "ID_CRITERIO", referencedColumnName = "ID_CRITERIO")
    @ManyToOne(optional = false)
    private SauCriterio idCriterio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandar")
    private Collection<SauEstandarFuenteEvidencia> sauEstandarFuenteEvidenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstandar")
    private Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection;

    public SauEstandar() {
    }

    public SauEstandar(String idEstandar) {
        this.idEstandar = idEstandar;
    }

    public SauEstandar(String idEstandar, String nombre, String estado, Date fecha, BigInteger nroEstandar) {
        this.idEstandar = idEstandar;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha = fecha;
        this.nroEstandar = nroEstandar;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getNroEstandar() {
        return nroEstandar;
    }

    public void setNroEstandar(BigInteger nroEstandar) {
        this.nroEstandar = nroEstandar;
    }

    public SauGrupoareas getIdGrupoareas() {
        return idGrupoareas;
    }

    public void setIdGrupoareas(SauGrupoareas idGrupoareas) {
        this.idGrupoareas = idGrupoareas;
    }

    public SauCriterio getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(SauCriterio idCriterio) {
        this.idCriterio = idCriterio;
    }

    @XmlTransient
    public Collection<SauEstandarFuenteEvidencia> getSauEstandarFuenteEvidenciaCollection() {
        return sauEstandarFuenteEvidenciaCollection;
    }

    public void setSauEstandarFuenteEvidenciaCollection(Collection<SauEstandarFuenteEvidencia> sauEstandarFuenteEvidenciaCollection) {
        this.sauEstandarFuenteEvidenciaCollection = sauEstandarFuenteEvidenciaCollection;
    }

    @XmlTransient
    public Collection<SauEstandarEvaluacion> getSauEstandarEvaluacionCollection() {
        return sauEstandarEvaluacionCollection;
    }

    public void setSauEstandarEvaluacionCollection(Collection<SauEstandarEvaluacion> sauEstandarEvaluacionCollection) {
        this.sauEstandarEvaluacionCollection = sauEstandarEvaluacionCollection;
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
        if (!(object instanceof SauEstandar)) {
            return false;
        }
        SauEstandar other = (SauEstandar) object;
        if ((this.idEstandar == null && other.idEstandar != null) || (this.idEstandar != null && !this.idEstandar.equals(other.idEstandar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEstandar[ idEstandar=" + idEstandar + " ]";
    }
    
}
