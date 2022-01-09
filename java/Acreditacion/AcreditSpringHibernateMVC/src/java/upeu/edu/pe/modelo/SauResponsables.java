/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_RESPONSABLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauResponsables.findAll", query = "SELECT s FROM SauResponsables s")})
public class SauResponsables implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RESPONSABLE")
    private String idResponsable;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SauPersona idPersona;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SauPeriodo idPeriodo;
    @JoinColumn(name = "ID_FACTOR", referencedColumnName = "ID_FACTOR")
    @ManyToOne(optional = false)
    private SauFactor idFactor;
    @JoinColumn(name = "ID_AREAS", referencedColumnName = "ID_AREAS")
    @ManyToOne(optional = false)
    private SauAreas idAreas;

    public SauResponsables() {
    }

    public SauResponsables(String idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(String idResponsable) {
        this.idResponsable = idResponsable;
    }

    public SauPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(SauPersona idPersona) {
        this.idPersona = idPersona;
    }

    public SauPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SauPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SauFactor getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(SauFactor idFactor) {
        this.idFactor = idFactor;
    }

    public SauAreas getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(SauAreas idAreas) {
        this.idAreas = idAreas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResponsable != null ? idResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauResponsables)) {
            return false;
        }
        SauResponsables other = (SauResponsables) object;
        if ((this.idResponsable == null && other.idResponsable != null) || (this.idResponsable != null && !this.idResponsable.equals(other.idResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauResponsables[ idResponsable=" + idResponsable + " ]";
    }
    
}
