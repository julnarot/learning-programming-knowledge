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
@Table(name = "SAU_FACULTAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauFacultad.findAll", query = "SELECT s FROM SauFacultad s")})
public class SauFacultad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FACULTAD")
    private String idFacultad;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFacultad")
    private Collection<SauEap> sauEapCollection;
    @JoinColumn(name = "ID_GRUPOAREAS", referencedColumnName = "ID_GRUPOAREAS")
    @ManyToOne(optional = false)
    private SauGrupoareas idGrupoareas;

    public SauFacultad() {
    }

    public SauFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public SauFacultad(String idFacultad, String nombre, String descripcion, String representante, String estado) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.representante = representante;
        this.estado = estado;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
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

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SauEap> getSauEapCollection() {
        return sauEapCollection;
    }

    public void setSauEapCollection(Collection<SauEap> sauEapCollection) {
        this.sauEapCollection = sauEapCollection;
    }

    public SauGrupoareas getIdGrupoareas() {
        return idGrupoareas;
    }

    public void setIdGrupoareas(SauGrupoareas idGrupoareas) {
        this.idGrupoareas = idGrupoareas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacultad != null ? idFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauFacultad)) {
            return false;
        }
        SauFacultad other = (SauFacultad) object;
        if ((this.idFacultad == null && other.idFacultad != null) || (this.idFacultad != null && !this.idFacultad.equals(other.idFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauFacultad[ idFacultad=" + idFacultad + " ]";
    }
    
}
