/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_ESTANDAR_FUENTE_EVIDENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEstandarFuenteEvidencia.findAll", query = "SELECT s FROM SauEstandarFuenteEvidencia s")})
public class SauEstandarFuenteEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTANDAR_FUENTE_EVIDENCIA")
    private String idEstandarFuenteEvidencia;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "NRO_ORDEN")
    private BigInteger nroOrden;
    @JoinColumn(name = "ID_FUENTE_VERIFICACION", referencedColumnName = "ID_FUENTE_VERIFICACION")
    @ManyToOne(optional = false)
    private SauFuenteVerificacion idFuenteVerificacion;
    @JoinColumn(name = "ID_ESTANDAR", referencedColumnName = "ID_ESTANDAR")
    @ManyToOne(optional = false)
    private SauEstandar idEstandar;

    public SauEstandarFuenteEvidencia() {
    }

    public SauEstandarFuenteEvidencia(String idEstandarFuenteEvidencia) {
        this.idEstandarFuenteEvidencia = idEstandarFuenteEvidencia;
    }

    public SauEstandarFuenteEvidencia(String idEstandarFuenteEvidencia, String estado, BigInteger nroOrden) {
        this.idEstandarFuenteEvidencia = idEstandarFuenteEvidencia;
        this.estado = estado;
        this.nroOrden = nroOrden;
    }

    public String getIdEstandarFuenteEvidencia() {
        return idEstandarFuenteEvidencia;
    }

    public void setIdEstandarFuenteEvidencia(String idEstandarFuenteEvidencia) {
        this.idEstandarFuenteEvidencia = idEstandarFuenteEvidencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(BigInteger nroOrden) {
        this.nroOrden = nroOrden;
    }

    public SauFuenteVerificacion getIdFuenteVerificacion() {
        return idFuenteVerificacion;
    }

    public void setIdFuenteVerificacion(SauFuenteVerificacion idFuenteVerificacion) {
        this.idFuenteVerificacion = idFuenteVerificacion;
    }

    public SauEstandar getIdEstandar() {
        return idEstandar;
    }

    public void setIdEstandar(SauEstandar idEstandar) {
        this.idEstandar = idEstandar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandarFuenteEvidencia != null ? idEstandarFuenteEvidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEstandarFuenteEvidencia)) {
            return false;
        }
        SauEstandarFuenteEvidencia other = (SauEstandarFuenteEvidencia) object;
        if ((this.idEstandarFuenteEvidencia == null && other.idEstandarFuenteEvidencia != null) || (this.idEstandarFuenteEvidencia != null && !this.idEstandarFuenteEvidencia.equals(other.idEstandarFuenteEvidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEstandarFuenteEvidencia[ idEstandarFuenteEvidencia=" + idEstandarFuenteEvidencia + " ]";
    }
    
}
