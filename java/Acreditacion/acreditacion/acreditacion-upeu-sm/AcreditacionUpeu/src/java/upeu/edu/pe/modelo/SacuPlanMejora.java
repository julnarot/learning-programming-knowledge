/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_PLAN_MEJORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuPlanMejora.findAll", query = "SELECT s FROM SacuPlanMejora s")})
public class SacuPlanMejora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PLAN_MEJORA")
    private String idPlanMejora;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHA_SUBIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSubida;
    @JoinColumn(name = "ID_ASIGNACION_EVIDENCIA", referencedColumnName = "ID_ASIGNACION_EVIDENCIA")
    @ManyToOne(optional = false)
    private SacuAsignacionEvidencia idAsignacionEvidencia;

    public SacuPlanMejora() {
    }

    public SacuPlanMejora(String idPlanMejora) {
        this.idPlanMejora = idPlanMejora;
    }

    public SacuPlanMejora(String idPlanMejora, String url, String estado, Date fechaSubida) {
        this.idPlanMejora = idPlanMejora;
        this.url = url;
        this.estado = estado;
        this.fechaSubida = fechaSubida;
    }

    public String getIdPlanMejora() {
        return idPlanMejora;
    }

    public void setIdPlanMejora(String idPlanMejora) {
        this.idPlanMejora = idPlanMejora;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public SacuAsignacionEvidencia getIdAsignacionEvidencia() {
        return idAsignacionEvidencia;
    }

    public void setIdAsignacionEvidencia(SacuAsignacionEvidencia idAsignacionEvidencia) {
        this.idAsignacionEvidencia = idAsignacionEvidencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanMejora != null ? idPlanMejora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SacuPlanMejora)) {
            return false;
        }
        SacuPlanMejora other = (SacuPlanMejora) object;
        if ((this.idPlanMejora == null && other.idPlanMejora != null) || (this.idPlanMejora != null && !this.idPlanMejora.equals(other.idPlanMejora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuPlanMejora[ idPlanMejora=" + idPlanMejora + " ]";
    }
    
}
