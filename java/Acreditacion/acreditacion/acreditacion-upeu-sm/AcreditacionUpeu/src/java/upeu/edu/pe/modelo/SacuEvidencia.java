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
@Table(name = "SACU_EVIDENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEvidencia.findAll", query = "SELECT s FROM SacuEvidencia s")})
public class SacuEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVIDENCIA")
    private String idEvidencia;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EVIDENCIA")
    private String nombreEvidencia;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "NRO_EVIDENCIA")
    private String nroEvidencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEvidencia")
    private Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection;
    @JoinColumn(name = "ID_ESTANDAR", referencedColumnName = "ID_ESTANDAR")
    @ManyToOne(optional = false)
    private SacuEstandar idEstandar;

    public SacuEvidencia() {
    }

    public SacuEvidencia(String idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public SacuEvidencia(String idEvidencia, String codigo, String nombreEvidencia, String descripcion, String estado, String nroEvidencia) {
        this.idEvidencia = idEvidencia;
        this.codigo = codigo;
        this.nombreEvidencia = nombreEvidencia;
        this.descripcion = descripcion;
        this.estado = estado;
        this.nroEvidencia = nroEvidencia;
    }

    public String getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(String idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEvidencia() {
        return nombreEvidencia;
    }

    public void setNombreEvidencia(String nombreEvidencia) {
        this.nombreEvidencia = nombreEvidencia;
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

    public String getNroEvidencia() {
        return nroEvidencia;
    }

    public void setNroEvidencia(String nroEvidencia) {
        this.nroEvidencia = nroEvidencia;
    }

    @XmlTransient
    public Collection<SacuEvidenciaCumplida> getSacuEvidenciaCumplidaCollection() {
        return sacuEvidenciaCumplidaCollection;
    }

    public void setSacuEvidenciaCumplidaCollection(Collection<SacuEvidenciaCumplida> sacuEvidenciaCumplidaCollection) {
        this.sacuEvidenciaCumplidaCollection = sacuEvidenciaCumplidaCollection;
    }

    public SacuEstandar getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(SacuEstandar idEstandar) {
        this.idEstandar = idEstandar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvidencia != null ? idEvidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEvidencia)) {
            return false;
        }
        SacuEvidencia other = (SacuEvidencia) object;
        if ((this.idEvidencia == null && other.idEvidencia != null) || (this.idEvidencia != null && !this.idEvidencia.equals(other.idEvidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEvidencia[ idEvidencia=" + idEvidencia + " ]";
    }
    
}
