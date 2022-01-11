/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author @JONATAN
 */
@Entity
@Table(name = "mw_colaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwColaborador.findAll", query = "SELECT m FROM MwColaborador m"),
    @NamedQuery(name = "MwColaborador.findByColaboradorId", query = "SELECT m FROM MwColaborador m WHERE m.colaboradorId = :colaboradorId"),
    @NamedQuery(name = "MwColaborador.findByCargo", query = "SELECT m FROM MwColaborador m WHERE m.cargo = :cargo"),
    @NamedQuery(name = "MwColaborador.findByNivel", query = "SELECT m FROM MwColaborador m WHERE m.nivel = :nivel")})
public class MwColaborador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "colaborador_id")
    private String colaboradorId;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @Basic(optional = false)
    @Column(name = "nivel")
    private String nivel;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private MwUsuario usuarioId;
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    @ManyToOne(optional = false)
    private MwPersona personaId;

    public MwColaborador() {
    }

    public MwColaborador(String colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public MwColaborador(String colaboradorId, String cargo, String nivel) {
        this.colaboradorId = colaboradorId;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    public String getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(String colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public MwUsuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(MwUsuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public MwPersona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(MwPersona personaId) {
        this.personaId = personaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colaboradorId != null ? colaboradorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MwColaborador)) {
            return false;
        }
        MwColaborador other = (MwColaborador) object;
        if ((this.colaboradorId == null && other.colaboradorId != null) || (this.colaboradorId != null && !this.colaboradorId.equals(other.colaboradorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rj.upeu.modelo.MwColaborador[ colaboradorId=" + colaboradorId + " ]";
    }

}
