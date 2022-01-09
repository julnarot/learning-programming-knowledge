/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pp
 */
@Entity
@Table(name = "MATRICULA")
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m")})
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MATRICULA")
    private String idMatricula;
    @Basic(optional = false)
    @Column(name = "FECHA_MATRICULA")
    @Temporal(TemporalType.DATE)
    private Date fechaMatricula;
    @JoinColumn(name = "ID_TIPO_DE_PAGO", referencedColumnName = "ID_TIPO_DE_PAGO")
    @ManyToOne(optional = false)
    private Tipo idTipoDePago;
    @JoinColumn(name = "ID_GRADO", referencedColumnName = "ID_GRADO")
    @ManyToOne(optional = false)
    private Grado idGrado;
    @JoinColumn(name = "ID_ALUMNO", referencedColumnName = "ID_ALUMNO")
    @ManyToOne(optional = false)
    private Alumno idAlumno;

    public Matricula() {
    }

    public Matricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Matricula(String idMatricula, Date fechaMatricula) {
        this.idMatricula = idMatricula;
        this.fechaMatricula = fechaMatricula;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public Tipo getIdTipoDePago() {
        return idTipoDePago;
    }

    public void setIdTipoDePago(Tipo idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public Grado getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Grado idGrado) {
        this.idGrado = idGrado;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMatricula != null ? idMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.idMatricula == null && other.idMatricula != null) || (this.idMatricula != null && !this.idMatricula.equals(other.idMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Matricula[ idMatricula=" + idMatricula + " ]";
    }
    
}
