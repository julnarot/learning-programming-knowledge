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
@Table(name = "SAU_ESTANDAR_EVIDENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEstandarEvidencia.findAll", query = "SELECT s FROM SauEstandarEvidencia s")})
public class SauEstandarEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR_EVIDENCIA")
    private String idEstandarEvidencia;
    @Basic(optional = false)
    @Column(name = "URL_EVIDENCIA")
    private String urlEvidencia;
    @Basic(optional = false)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private SauUsuario idUsuario;
    @JoinColumn(name = "ID_FUENTE_VERIFICACION", referencedColumnName = "ID_FUENTE_VERIFICACION")
    @ManyToOne(optional = false)
    private SauFuenteVerificacion idFuenteVerificacion;
    @JoinColumn(name = "ID_ESTANDAR_EVAL", referencedColumnName = "ID_ESTANDAR_EVAL")
    @ManyToOne(optional = false)
    private SauEstandarEvaluacion idEstandarEval;

    public SauEstandarEvidencia() {
    }

    public SauEstandarEvidencia(String idEstandarEvidencia) {
        this.idEstandarEvidencia = idEstandarEvidencia;
    }

    public SauEstandarEvidencia(String idEstandarEvidencia, String urlEvidencia, String tipoDocumento, String estado, Date fecha) {
        this.idEstandarEvidencia = idEstandarEvidencia;
        this.urlEvidencia = urlEvidencia;
        this.tipoDocumento = tipoDocumento;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getIdEstandarEvidencia() {
        return idEstandarEvidencia;
    }

    public void setIdEstandarEvidencia(String idEstandarEvidencia) {
        this.idEstandarEvidencia = idEstandarEvidencia;
    }

    public String getUrlEvidencia() {
        return urlEvidencia;
    }

    public void setUrlEvidencia(String urlEvidencia) {
        this.urlEvidencia = urlEvidencia;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public SauUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(SauUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SauFuenteVerificacion getIdFuenteVerificacion() {
        return idFuenteVerificacion;
    }

    public void setIdFuenteVerificacion(SauFuenteVerificacion idFuenteVerificacion) {
        this.idFuenteVerificacion = idFuenteVerificacion;
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
        hash += (idEstandarEvidencia != null ? idEstandarEvidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEstandarEvidencia)) {
            return false;
        }
        SauEstandarEvidencia other = (SauEstandarEvidencia) object;
        if ((this.idEstandarEvidencia == null && other.idEstandarEvidencia != null) || (this.idEstandarEvidencia != null && !this.idEstandarEvidencia.equals(other.idEstandarEvidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEstandarEvidencia[ idEstandarEvidencia=" + idEstandarEvidencia + " ]";
    }
    
}
