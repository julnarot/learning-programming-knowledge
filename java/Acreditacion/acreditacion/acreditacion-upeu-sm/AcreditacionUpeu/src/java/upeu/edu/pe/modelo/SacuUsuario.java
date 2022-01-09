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
@Table(name = "SACU_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuUsuario.findAll", query = "SELECT s FROM SacuUsuario s")})
public class SacuUsuario implements Serializable {
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
    @Temporal(TemporalType.DATE)
    private Date fechaAcceso;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SacuPersona idPersona;
    @JoinColumn(name = "ID_CATEGORIA_USUARIO", referencedColumnName = "ID_CATEGORIA_USUARIO")
    @ManyToOne(optional = false)
    private SacuCategoriaUsuario idCategoriaUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<SacuPrivilegios> sacuPrivilegiosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<SacuUsuarioFilial> sacuUsuarioFilialCollection;

    public SacuUsuario() {
    }

    public SacuUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SacuUsuario(String idUsuario, String usuario, String clave, String estado, Date fechaAcceso, Date fechaAlta) {
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

    public SacuPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(SacuPersona idPersona) {
        this.idPersona = idPersona;
    }

    public SacuCategoriaUsuario getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public void setIdCategoriaUsuario(SacuCategoriaUsuario idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    @XmlTransient
    public Collection<SacuPrivilegios> getSacuPrivilegiosCollection() {
        return sacuPrivilegiosCollection;
    }

    public void setSacuPrivilegiosCollection(Collection<SacuPrivilegios> sacuPrivilegiosCollection) {
        this.sacuPrivilegiosCollection = sacuPrivilegiosCollection;
    }

    @XmlTransient
    public Collection<SacuUsuarioFilial> getSacuUsuarioFilialCollection() {
        return sacuUsuarioFilialCollection;
    }

    public void setSacuUsuarioFilialCollection(Collection<SacuUsuarioFilial> sacuUsuarioFilialCollection) {
        this.sacuUsuarioFilialCollection = sacuUsuarioFilialCollection;
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
        if (!(object instanceof SacuUsuario)) {
            return false;
        }
        SacuUsuario other = (SacuUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
