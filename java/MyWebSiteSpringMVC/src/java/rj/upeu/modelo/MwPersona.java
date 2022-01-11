/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author @JONATAN
 */
@Entity
@Table(name = "mw_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwPersona.findAll", query = "SELECT m FROM MwPersona m"),
    @NamedQuery(name = "MwPersona.findByPersonaId", query = "SELECT m FROM MwPersona m WHERE m.personaId = :personaId"),
    @NamedQuery(name = "MwPersona.findByNumcel", query = "SELECT m FROM MwPersona m WHERE m.numcel = :numcel"),
    @NamedQuery(name = "MwPersona.findByFechanac", query = "SELECT m FROM MwPersona m WHERE m.fechanac = :fechanac"),
    @NamedQuery(name = "MwPersona.findByCorreo", query = "SELECT m FROM MwPersona m WHERE m.correo = :correo"),
    @NamedQuery(name = "MwPersona.findByApellidos", query = "SELECT m FROM MwPersona m WHERE m.apellidos = :apellidos"),
    @NamedQuery(name = "MwPersona.findByNombres", query = "SELECT m FROM MwPersona m WHERE m.nombres = :nombres")})
public class MwPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "persona_id")
    private String personaId;
    @Basic(optional = false)
    @Column(name = "numcel")
    private String numcel;
    @Basic(optional = false)
    @Column(name = "fechanac")
    private String fechanac;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaId")
    private Collection<MwColaborador> mwColaboradorCollection;

    public MwPersona() {
    }

    public MwPersona(String personaId) {
        this.personaId = personaId;
    }

    public MwPersona(String personaId, String numcel, String fechanac, String correo, String apellidos, String nombres) {
        this.personaId = personaId;
        this.numcel = numcel;
        this.fechanac = fechanac;
        this.correo = correo;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getPersonaId() {
        return personaId;
    }

    public void setPersonaId(String personaId) {
        this.personaId = personaId;
    }

    public String getNumcel() {
        return numcel;
    }

    public void setNumcel(String numcel) {
        this.numcel = numcel;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @XmlTransient
    public Collection<MwColaborador> getMwColaboradorCollection() {
        return mwColaboradorCollection;
    }

    public void setMwColaboradorCollection(Collection<MwColaborador> mwColaboradorCollection) {
        this.mwColaboradorCollection = mwColaboradorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaId != null ? personaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwPersona)) {
            return false;
        }
        MwPersona other = (MwPersona) object;
        if ((this.personaId == null && other.personaId != null) || (this.personaId != null && !this.personaId.equals(other.personaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwPersona[ personaId=" + personaId + " ]";
    }

}
