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
@Table(name = "SAU_CATEGORIA_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauCategoriaUsuario.findAll", query = "SELECT s FROM SauCategoriaUsuario s")})
public class SauCategoriaUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA_USUARIO")
    private String idCategoriaUsuario;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoriaUsuario")
    private Collection<SauUsuario> sauUsuarioCollection;

    public SauCategoriaUsuario() {
    }

    public SauCategoriaUsuario(String idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    public SauCategoriaUsuario(String idCategoriaUsuario, String nombre, String descripcion, String estado, String codigo) {
        this.idCategoriaUsuario = idCategoriaUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.codigo = codigo;
    }

    public String getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public void setIdCategoriaUsuario(String idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
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
    public Collection<SauUsuario> getSauUsuarioCollection() {
        return sauUsuarioCollection;
    }

    public void setSauUsuarioCollection(Collection<SauUsuario> sauUsuarioCollection) {
        this.sauUsuarioCollection = sauUsuarioCollection;
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
        if (!(object instanceof SauCategoriaUsuario)) {
            return false;
        }
        SauCategoriaUsuario other = (SauCategoriaUsuario) object;
        if ((this.idCategoriaUsuario == null && other.idCategoriaUsuario != null) || (this.idCategoriaUsuario != null && !this.idCategoriaUsuario.equals(other.idCategoriaUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauCategoriaUsuario[ idCategoriaUsuario=" + idCategoriaUsuario + " ]";
    }
    
}
