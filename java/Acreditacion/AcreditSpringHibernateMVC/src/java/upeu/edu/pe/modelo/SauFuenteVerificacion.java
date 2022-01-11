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
@Table(name = "SAU_FUENTE_VERIFICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauFuenteVerificacion.findAll", query = "SELECT s FROM SauFuenteVerificacion s")})
public class SauFuenteVerificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FUENTE_VERIFICACION")
    private String idFuenteVerificacion;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuenteVerificacion")
    private Collection<SauEstandarFuenteEvidencia> sauEstandarFuenteEvidenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuenteVerificacion")
    private Collection<SauEstandarEvidencia> sauEstandarEvidenciaCollection;

    public SauFuenteVerificacion() {
    }

    public SauFuenteVerificacion(String idFuenteVerificacion) {
        this.idFuenteVerificacion = idFuenteVerificacion;
    }

    public SauFuenteVerificacion(String idFuenteVerificacion, String nombre, String descripcion, String estado, String codigo) {
        this.idFuenteVerificacion = idFuenteVerificacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.codigo = codigo;
    }

    public String getIdFuenteVerificacion() {
        return idFuenteVerificacion;
    }

    public void setIdFuenteVerificacion(String idFuenteVerificacion) {
        this.idFuenteVerificacion = idFuenteVerificacion;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<SauEstandarFuenteEvidencia> getSauEstandarFuenteEvidenciaCollection() {
        return sauEstandarFuenteEvidenciaCollection;
    }

    public void setSauEstandarFuenteEvidenciaCollection(Collection<SauEstandarFuenteEvidencia> sauEstandarFuenteEvidenciaCollection) {
        this.sauEstandarFuenteEvidenciaCollection = sauEstandarFuenteEvidenciaCollection;
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
        hash += (idFuenteVerificacion != null ? idFuenteVerificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauFuenteVerificacion)) {
            return false;
        }
        SauFuenteVerificacion other = (SauFuenteVerificacion) object;
        if ((this.idFuenteVerificacion == null && other.idFuenteVerificacion != null) || (this.idFuenteVerificacion != null && !this.idFuenteVerificacion.equals(other.idFuenteVerificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauFuenteVerificacion[ idFuenteVerificacion=" + idFuenteVerificacion + " ]";
    }
    
}
