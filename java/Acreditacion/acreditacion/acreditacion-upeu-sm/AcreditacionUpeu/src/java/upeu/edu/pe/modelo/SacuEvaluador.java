/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_EVALUADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuEvaluador.findAll", query = "SELECT s FROM SacuEvaluador s")})
public class SacuEvaluador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVALUADOR")
    private String idEvaluador;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private SacuPersona idPersona;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SacuPeriodo idPeriodo;
    @JoinColumn(name = "ID_EAP", referencedColumnName = "ID_EAP")
    @ManyToOne(optional = false)
    private SacuEap idEap;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEvaluador")
    private Collection<SacuEvaluacion> sacuEvaluacionCollection;

    public SacuEvaluador() {
    }

    public SacuEvaluador(String idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    public SacuEvaluador(String idEvaluador, String estado) {
        this.idEvaluador = idEvaluador;
        this.estado = estado;
    }

    public String getIdEvaluador() {
        return idEvaluador;
    }

    public void setIdEvaluador(String idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SacuPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(SacuPersona idPersona) {
        this.idPersona = idPersona;
    }

    public SacuPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SacuPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SacuEap getIdEap() {
        return idEap;
    }

    public void setIdEap(SacuEap idEap) {
        this.idEap = idEap;
    }

    @XmlTransient
    public Collection<SacuEvaluacion> getSacuEvaluacionCollection() {
        return sacuEvaluacionCollection;
    }

    public void setSacuEvaluacionCollection(Collection<SacuEvaluacion> sacuEvaluacionCollection) {
        this.sacuEvaluacionCollection = sacuEvaluacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvaluador != null ? idEvaluador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuEvaluador)) {
            return false;
        }
        SacuEvaluador other = (SacuEvaluador) object;
        if ((this.idEvaluador == null && other.idEvaluador != null) || (this.idEvaluador != null && !this.idEvaluador.equals(other.idEvaluador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuEvaluador[ idEvaluador=" + idEvaluador + " ]";
    }
    
}
