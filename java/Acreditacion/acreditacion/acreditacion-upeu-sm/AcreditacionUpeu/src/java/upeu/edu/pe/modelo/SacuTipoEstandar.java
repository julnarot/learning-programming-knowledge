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
@Table(name = "SACU_TIPO_ESTANDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuTipoEstandar.findAll", query = "SELECT s FROM SacuTipoEstandar s")})
public class SacuTipoEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_ESTANDAR")
    private String idTipoEstandar;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ALIAS")
    private String alias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoEstandar")
    private Collection<SacuEstandar> sacuEstandarCollection;

    public SacuTipoEstandar() {
    }

    public SacuTipoEstandar(String idTipoEstandar) {
        this.idTipoEstandar = idTipoEstandar;
    }

    public SacuTipoEstandar(String idTipoEstandar, String nombre, String descripcion) {
        this.idTipoEstandar = idTipoEstandar;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getIdTipoEstandar() {
        return idTipoEstandar;
    }

    public void setIdTipoEstandar(String idTipoEstandar) {
        this.idTipoEstandar = idTipoEstandar;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @XmlTransient
    public Collection<SacuEstandar> getSacuEstandarCollection() {
        return sacuEstandarCollection;
    }

    public void setSacuEstandarCollection(Collection<SacuEstandar> sacuEstandarCollection) {
        this.sacuEstandarCollection = sacuEstandarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEstandar != null ? idTipoEstandar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuTipoEstandar)) {
            return false;
        }
        SacuTipoEstandar other = (SacuTipoEstandar) object;
        if ((this.idTipoEstandar == null && other.idTipoEstandar != null) || (this.idTipoEstandar != null && !this.idTipoEstandar.equals(other.idTipoEstandar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuTipoEstandar[ idTipoEstandar=" + idTipoEstandar + " ]";
    }
    
}
