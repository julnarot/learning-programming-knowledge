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
@Table(name = "SAU_GRUPOAREAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauGrupoareas.findAll", query = "SELECT s FROM SauGrupoareas s")})
public class SauGrupoareas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GRUPOAREAS")
    private String idGrupoareas;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CODIGO")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupoareas")
    private Collection<SauEstandar> sauEstandarCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupoareas")
    private Collection<SauFacultad> sauFacultadCollection;

    public SauGrupoareas() {
    }

    public SauGrupoareas(String idGrupoareas) {
        this.idGrupoareas = idGrupoareas;
    }

    public SauGrupoareas(String idGrupoareas, String nombre, String estado) {
        this.idGrupoareas = idGrupoareas;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getIdGrupoareas() {
        return idGrupoareas;
    }

    public void setIdGrupoareas(String idGrupoareas) {
        this.idGrupoareas = idGrupoareas;
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
    public Collection<SauEstandar> getSauEstandarCollection() {
        return sauEstandarCollection;
    }

    public void setSauEstandarCollection(Collection<SauEstandar> sauEstandarCollection) {
        this.sauEstandarCollection = sauEstandarCollection;
    }

    @XmlTransient
    public Collection<SauFacultad> getSauFacultadCollection() {
        return sauFacultadCollection;
    }

    public void setSauFacultadCollection(Collection<SauFacultad> sauFacultadCollection) {
        this.sauFacultadCollection = sauFacultadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupoareas != null ? idGrupoareas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauGrupoareas)) {
            return false;
        }
        SauGrupoareas other = (SauGrupoareas) object;
        if ((this.idGrupoareas == null && other.idGrupoareas != null) || (this.idGrupoareas != null && !this.idGrupoareas.equals(other.idGrupoareas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauGrupoareas[ idGrupoareas=" + idGrupoareas + " ]";
    }
    
}
