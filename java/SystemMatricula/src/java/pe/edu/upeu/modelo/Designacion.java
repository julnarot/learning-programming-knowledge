/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pp
 */
@Entity
@Table(name = "DESIGNACION")
@NamedQueries({
    @NamedQuery(name = "Designacion.findAll", query = "SELECT d FROM Designacion d")})
public class Designacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DESIGNACION")
    private String idDesignacion;
    @JoinColumn(name = "ID_SECCION", referencedColumnName = "ID_SECCION")
    @ManyToOne(optional = false)
    private Seccion idSeccion;
    @JoinColumn(name = "ID_GRADO", referencedColumnName = "ID_GRADO")
    @ManyToOne(optional = false)
    private Grado idGrado;
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE")
    @ManyToOne(optional = false)
    private Docente idDocente;

    public Designacion() {
    }

    public Designacion(String idDesignacion) {
        this.idDesignacion = idDesignacion;
    }

    public String getIdDesignacion() {
        return idDesignacion;
    }

    public void setIdDesignacion(String idDesignacion) {
        this.idDesignacion = idDesignacion;
    }

    public Seccion getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Seccion idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Grado getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Grado idGrado) {
        this.idGrado = idGrado;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDesignacion != null ? idDesignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Designacion)) {
            return false;
        }
        Designacion other = (Designacion) object;
        if ((this.idDesignacion == null && other.idDesignacion != null) || (this.idDesignacion != null && !this.idDesignacion.equals(other.idDesignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Designacion[ idDesignacion=" + idDesignacion + " ]";
    }
    
}
