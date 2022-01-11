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
@Table(name = "SECCION")
@NamedQueries({
    @NamedQuery(name = "Seccion.findAll", query = "SELECT s FROM Seccion s")})
public class Seccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SECCION")
    private String idSeccion;
    @Basic(optional = false)
    @Column(name = "NOMBRE_SECCION")
    private String nombreSeccion;
    @Basic(optional = false)
    @Column(name = "LIMITE_SECCION")
    private short limiteSeccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSeccion")
    private Collection<Designacion> designacionCollection;

    public Seccion() {
    }

    public Seccion(String idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Seccion(String idSeccion, String nombreSeccion, short limiteSeccion) {
        this.idSeccion = idSeccion;
        this.nombreSeccion = nombreSeccion;
        this.limiteSeccion = limiteSeccion;
    }

    public String getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(String idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public short getLimiteSeccion() {
        return limiteSeccion;
    }

    public void setLimiteSeccion(short limiteSeccion) {
        this.limiteSeccion = limiteSeccion;
    }

    public Collection<Designacion> getDesignacionCollection() {
        return designacionCollection;
    }

    public void setDesignacionCollection(Collection<Designacion> designacionCollection) {
        this.designacionCollection = designacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeccion != null ? idSeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.idSeccion == null && other.idSeccion != null) || (this.idSeccion != null && !this.idSeccion.equals(other.idSeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Seccion[ idSeccion=" + idSeccion + " ]";
    }
    
}
