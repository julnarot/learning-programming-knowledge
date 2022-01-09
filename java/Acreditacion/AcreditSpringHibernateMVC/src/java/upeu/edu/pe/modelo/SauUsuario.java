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
@Table(name = "SAU_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauUsuario.findAll", query = "SELECT s FROM SauUsuario s")})
public class SauUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private String clave;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHA_ACCESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcceso;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<SauEvaluacionEstandar> sauEvaluacionEstandarCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<SauPrivilegios> sauPrivilegiosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<SauEstandarEvidencia> sauEstandarEvidenciaCollection;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SauPersona idPersona;
    @JoinColumn(name = "ID_CATEGORIA_USUARIO", referencedColumnName = "ID_CATEGORIA_USUARIO")
    @ManyToOne(optional = false)
    private SauCategoriaUsuario idCategoriaUsuario;

    public SauUsuario() {
    }

    public SauUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SauUsuario(String idUsuario, String usuario, String clave, String estado, Date fechaAcceso, Date fechaAlta) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
        this.fechaAcceso = fechaAcceso;
        this.fechaAlta = fechaAlta;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaAcceso() {
        return fechaAcceso;
    }

    public void setFechaAcceso(Date fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @XmlTransient
    public Collection<SauEvaluacionEstandar> getSauEvaluacionEstandarCollection() {
        return sauEvaluacionEstandarCollection;
    }

    public void setSauEvaluacionEstandarCollection(Collection<SauEvaluacionEstandar> sauEvaluacionEstandarCollection) {
        this.sauEvaluacionEstandarCollection = sauEvaluacionEstandarCollection;
    }

    @XmlTransient
    public Collection<SauPrivilegios> getSauPrivilegiosCollection() {
        return sauPrivilegiosCollection;
    }

    public void setSauPrivilegiosCollection(Collection<SauPrivilegios> sauPrivilegiosCollection) {
        this.sauPrivilegiosCollection = sauPrivilegiosCollection;
    }

    @XmlTransient
    public Collection<SauEstandarEvidencia> getSauEstandarEvidenciaCollection() {
        return sauEstandarEvidenciaCollection;
    }

    public void setSauEstandarEvidenciaCollection(Collection<SauEstandarEvidencia> sauEstandarEvidenciaCollection) {
        this.sauEstandarEvidenciaCollection = sauEstandarEvidenciaCollection;
    }

    public SauPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(SauPersona idPersona) {
        this.idPersona = idPersona;
    }

    public SauCategoriaUsuario getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public void setIdCategoriaUsuario(SauCategoriaUsuario idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauUsuario)) {
            return false;
        }
        SauUsuario other = (SauUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
