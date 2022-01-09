/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "SAU_PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SauPersona.findAll", query = "SELECT s FROM SauPersona s")})
public class SauPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERSONA")
    private String idPersona;
    @Basic(optional = false)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "APELL_PATERNO")
    private String apellPaterno;
    @Basic(optional = false)
    @Column(name = "APELL_MATERNO")
    private String apellMaterno;
    @Basic(optional = false)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "CELULAR")
    private String celular;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SauResponsables> sauResponsablesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SauUsuario> sauUsuarioCollection;

    public SauPersona() {
    }

    public SauPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public SauPersona(String idPersona, String nombres, String apellPaterno, String apellMaterno, String dni, String sexo, String telefono, String celular, String email, Date fechaNacimiento, Date fechaAlta) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellPaterno = apellPaterno;
        this.apellMaterno = apellMaterno;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(String apellPaterno) {
        this.apellPaterno = apellPaterno;
    }

    public String getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(String apellMaterno) {
        this.apellMaterno = apellMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @XmlTransient
    public Collection<SauResponsables> getSauResponsablesCollection() {
        return sauResponsablesCollection;
    }

    public void setSauResponsablesCollection(Collection<SauResponsables> sauResponsablesCollection) {
        this.sauResponsablesCollection = sauResponsablesCollection;
    }

    @XmlTransient
    public Collection<SauUsuario> getSauUsuarioCollection() {
        return sauUsuarioCollection;
    }

    public void setSauUsuarioCollection(Collection<SauUsuario> sauUsuarioCollection) {
        this.sauUsuarioCollection = sauUsuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SauPersona)) {
            return false;
        }
        SauPersona other = (SauPersona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SauPersona[ idPersona=" + idPersona + " ]";
    }
    
}
