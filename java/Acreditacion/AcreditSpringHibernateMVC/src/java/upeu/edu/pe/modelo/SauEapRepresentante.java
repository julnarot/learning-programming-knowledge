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
@Table(name = "SAU_EAP_REPRESENTANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauEapRepresentante.findAll", query = "SELECT s FROM SauEapRepresentante s")})
public class SauEapRepresentante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EAP_REPRESENTANTE")
    private String idEapRepresentante;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private SauPeriodo idPeriodo;
    @JoinColumn(name = "ID_EAP", referencedColumnName = "ID_EAP")
    @ManyToOne(optional = false)
    private SauEap idEap;

    public SauEapRepresentante() {
    }

    public SauEapRepresentante(String idEapRepresentante) {
        this.idEapRepresentante = idEapRepresentante;
    }

    public SauEapRepresentante(String idEapRepresentante, String estado) {
        this.idEapRepresentante = idEapRepresentante;
        this.estado = estado;
    }

    public String getIdEapRepresentante() {
        return idEapRepresentante;
    }

    public void setIdEapRepresentante(String idEapRepresentante) {
        this.idEapRepresentante = idEapRepresentante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SauPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(SauPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public SauEap getIdEap() {
        return idEap;
    }

    public void setIdEap(SauEap idEap) {
        this.idEap = idEap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEapRepresentante != null ? idEapRepresentante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauEapRepresentante)) {
            return false;
        }
        SauEapRepresentante other = (SauEapRepresentante) object;
        if ((this.idEapRepresentante == null && other.idEapRepresentante != null) || (this.idEapRepresentante != null && !this.idEapRepresentante.equals(other.idEapRepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauEapRepresentante[ idEapRepresentante=" + idEapRepresentante + " ]";
    }
    
}
