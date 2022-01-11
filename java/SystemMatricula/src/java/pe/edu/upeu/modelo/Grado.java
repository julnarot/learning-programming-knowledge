/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

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

/**
 *
 * @author pp
 */
@Entity
@Table(name = "GRADO")
@NamedQueries({
    @NamedQuery(name = "Grado.findAll", query = "SELECT g FROM Grado g")})
public class Grado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GRADO")
    private String idGrado;
    @Basic(optional = false)
    @Column(name = "NOMBRE_GRADO")
    private String nombreGrado;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private Periodo idPeriodo;
    @JoinColumn(name = "ID_AUXILIAR", referencedColumnName = "ID_AUXILIAR")
    @ManyToOne(optional = false)
    private Auxiliar idAuxiliar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrado")
    private Collection<Matricula> matriculaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrado")
    private Collection<Designacion> designacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrado")
    private Collection<Cursos> cursosCollection;

    public Grado() {
    }

    public Grado(String idGrado) {
        this.idGrado = idGrado;
    }

    public Grado(String idGrado, String nombreGrado) {
        this.idGrado = idGrado;
        this.nombreGrado = nombreGrado;
    }

    public String getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(String idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public Periodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Periodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Auxiliar getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(Auxiliar idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public Collection<Matricula> getMatriculaCollection() {
        return matriculaCollection;
    }

    public void setMatriculaCollection(Collection<Matricula> matriculaCollection) {
        this.matriculaCollection = matriculaCollection;
    }

    public Collection<Designacion> getDesignacionCollection() {
        return designacionCollection;
    }

    public void setDesignacionCollection(Collection<Designacion> designacionCollection) {
        this.designacionCollection = designacionCollection;
    }

    public Collection<Cursos> getCursosCollection() {
        return cursosCollection;
    }

    public void setCursosCollection(Collection<Cursos> cursosCollection) {
        this.cursosCollection = cursosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrado != null ? idGrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grado)) {
            return false;
        }
        Grado other = (Grado) object;
        if ((this.idGrado == null && other.idGrado != null) || (this.idGrado != null && !this.idGrado.equals(other.idGrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Grado[ idGrado=" + idGrado + " ]";
    }
    
}
