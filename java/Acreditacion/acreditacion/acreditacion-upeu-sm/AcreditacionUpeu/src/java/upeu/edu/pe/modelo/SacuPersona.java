/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "SACU_PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SacuPersona.findAll", query = "SELECT s FROM SacuPersona s")})
public class SacuPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERSONA")
    private String idPersona;
    @Basic(optional = false)
    @Column(name = "APELLIDO_PAT")
    private String apellidoPat;
    @Basic(optional = false)
    @Column(name = "APELLIDO_MAT")
    private String apellidoMat;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "CELULAR")
    private String celular;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "URL_FOTO")
    private String urlFoto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuEvaluador> sacuEvaluadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuUsuario> sacuUsuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuDetalleFilial> sacuDetalleFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuDetalleEap> sacuDetalleEapCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<SacuResponsable> sacuResponsableCollection;

    public SacuPersona() {
    }

    public SacuPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public SacuPersona(String idPersona, String apellidoPat, String apellidoMat, String nombre, String email, String celular, String telefono, String dni, String sexo, Date fechaNacimiento, String estado) {
        this.idPersona = idPersona;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.telefono = telefono;
        this.dni = dni;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @XmlTransient
    public Collection<SacuEvaluador> getSacuEvaluadorCollection() {
        return sacuEvaluadorCollection;
    }

    public void setSacuEvaluadorCollection(Collection<SacuEvaluador> sacuEvaluadorCollection) {
        this.sacuEvaluadorCollection = sacuEvaluadorCollection;
    }

    @XmlTransient
    public Collection<SacuUsuario> getSacuUsuarioCollection() {
        return sacuUsuarioCollection;
    }

    public void setSacuUsuarioCollection(Collection<SacuUsuario> sacuUsuarioCollection) {
        this.sacuUsuarioCollection = sacuUsuarioCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleFilial> getSacuDetalleFilialCollection() {
        return sacuDetalleFilialCollection;
    }

    public void setSacuDetalleFilialCollection(Collection<SacuDetalleFilial> sacuDetalleFilialCollection) {
        this.sacuDetalleFilialCollection = sacuDetalleFilialCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleEap> getSacuDetalleEapCollection() {
        return sacuDetalleEapCollection;
    }

    public void setSacuDetalleEapCollection(Collection<SacuDetalleEap> sacuDetalleEapCollection) {
        this.sacuDetalleEapCollection = sacuDetalleEapCollection;
    }

    @XmlTransient
    public Collection<SacuDetalleFacultad> getSacuDetalleFacultadCollection() {
        return sacuDetalleFacultadCollection;
    }

    public void setSacuDetalleFacultadCollection(Collection<SacuDetalleFacultad> sacuDetalleFacultadCollection) {
        this.sacuDetalleFacultadCollection = sacuDetalleFacultadCollection;
    }

    @XmlTransient
    public Collection<SacuResponsable> getSacuResponsableCollection() {
        return sacuResponsableCollection;
    }

    public void setSacuResponsableCollection(Collection<SacuResponsable> sacuResponsableCollection) {
        this.sacuResponsableCollection = sacuResponsableCollection;
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
        if (!(object instanceof SacuPersona)) {
            return false;
        }
        SacuPersona other = (SacuPersona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.edu.pe.modelo.SacuPersona[ idPersona=" + idPersona + " ]";
    }
    
}
