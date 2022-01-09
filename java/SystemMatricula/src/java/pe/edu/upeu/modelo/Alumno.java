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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pp
 */
@Entity
@Table(name = "ALUMNO")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")})
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ALUMNO")
    private String idAlumno;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private int codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDOPAT")
    private String apellidopat;
    @Basic(optional = false)
    @Column(name = "APELLDIOMAT")
    private String apelldiomat;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "DNI")
    private int dni;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno")
    private Collection<Matricula> matriculaCollection;

    public Alumno() {
    }

    public Alumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Alumno(String idAlumno, int codigo, String nombre, String apellidopat, String apelldiomat, String sexo, int dni) {
        this.idAlumno = idAlumno;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apelldiomat = apelldiomat;
        this.sexo = sexo;
        this.dni = dni;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopat() {
        return apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public String getApelldiomat() {
        return apelldiomat;
    }

    public void setApelldiomat(String apelldiomat) {
        this.apelldiomat = apelldiomat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Collection<Matricula> getMatriculaCollection() {
        return matriculaCollection;
    }

    public void setMatriculaCollection(Collection<Matricula> matriculaCollection) {
        this.matriculaCollection = matriculaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Alumno[ idAlumno=" + idAlumno + " ]";
    }
    
}
