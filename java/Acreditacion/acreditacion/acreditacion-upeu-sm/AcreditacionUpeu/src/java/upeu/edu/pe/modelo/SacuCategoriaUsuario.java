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
@Table(name = "SACU_CATEGORIA_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuCategoriaUsuario.findAll", query = "SELECT s FROM SacuCategoriaUsuario s")})
public class SacuCategoriaUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA_USUARIO")
    private String idCategoriaUsuario;
    @Basic(optional = false)
    @Column(name = "NOMBRE_DESCRIPCION")
    private String nombreDescripcion;
    @Basic(optional = false)
    @Column(name = "DECRIPCION")
    private String decripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoriaUsuario")
    private Collection<SacuUsuario> sacuUsuarioCollection;

    public SacuCategoriaUsuario() {
    }

    public SacuCategoriaUsuario(String idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    public SacuCategoriaUsuario(String idCategoriaUsuario, String nombreDescripcion, String decripcion, String estado, String codigo) {
        this.idCategoriaUsuario = idCategoriaUsuario;
        this.nombreDescripcion = nombreDescripcion;
        this.decripcion = decripcion;
        this.estado = estado;
        this.codigo = codigo;
    }

    public String getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public void setIdCategoriaUsuario(String idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    public String getNombreDescripcion() {
        return nombreDescripcion;
    }

    public void setNombreDescripcion(String nombreDescripcion) {
        this.nombreDescripcion = nombreDescripcion;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
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
    public Collection<SacuUsuario> getSacuUsuarioCollection() {
        return sacuUsuarioCollection;
    }

    public void setSacuUsuarioCollection(Collection<SacuUsuario> sacuUsuarioCollection) {
        this.sacuUsuarioCollection = sacuUsuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaUsuario != null ? idCategoriaUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuCategoriaUsuario)) {
            return false;
        }
        SacuCategoriaUsuario other = (SacuCategoriaUsuario) object;
        if ((this.idCategoriaUsuario == null && other.idCategoriaUsuario != null) || (this.idCategoriaUsuario != null && !this.idCategoriaUsuario.equals(other.idCategoriaUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuCategoriaUsuario[ idCategoriaUsuario=" + idCategoriaUsuario + " ]";
    }
    
}
