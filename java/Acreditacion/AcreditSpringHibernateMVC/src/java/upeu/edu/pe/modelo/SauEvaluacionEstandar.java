/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_EVALUACION_ESTANDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEvaluacionEstandar.findAll", query = "SELECT s FROM SauEvaluacionEstandar s")})
public class SauEvaluacionEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EVALUACION_ESTANDAR")
    private String idEvaluacionEstandar;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "NIVEL_EVALUACION")
    private String nivelEvaluacion;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private SauUsuario idUsuario;
    @JoinColumn(name = "ID_ESTANDAR_EVAL", referencedColumnName = "ID_ESTANDAR_EVAL")
    @ManyToOne(optional = false)
    private SauEstandarEvaluacion idEstandarEval;

    public SauEvaluacionEstandar() {
    }

    public SauEvaluacionEstandar(String idEvaluacionEstandar) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
    }

    public SauEvaluacionEstandar(String idEvaluacionEstandar, String estado, String nivelEvaluacion, Date fecha, String observacion) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
        this.estado = estado;
        this.nivelEvaluacion = nivelEvaluacion;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public String getIdEvaluacionEstandar() {
        return idEvaluacionEstandar;
    }

    public void setIdEvaluacionEstandar(String idEvaluacionEstandar) {
        this.idEvaluacionEstandar = idEvaluacionEstandar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivelEvaluacion() {
        return nivelEvaluacion;
    }

    public void setNivelEvaluacion(String nivelEvaluacion) {
        this.nivelEvaluacion = nivelEvaluacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public SauUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SauUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SauEstandarEvaluacion getIdEstandarEval() {
        return idEstandarEval;
    }

    public void setIdEstandarEval(SauEstandarEvaluacion idEstandarEval) {
        this.idEstandarEval = idEstandarEval;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvaluacionEstandar != null ? idEvaluacionEstandar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEvaluacionEstandar)) {
            return false;
        }
        SauEvaluacionEstandar other = (SauEvaluacionEstandar) object;
        if ((this.idEvaluacionEstandar == null && other.idEvaluacionEstandar != null) || (this.idEvaluacionEstandar != null && !this.idEvaluacionEstandar.equals(other.idEvaluacionEstandar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEvaluacionEstandar[ idEvaluacionEstandar=" + idEvaluacionEstandar + " ]";
    }
    
}
