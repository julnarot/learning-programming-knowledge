/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pp
 */
@Entity
@Table(name = "AUXILIAR")
@NamedQueries({
    @NamedQuery(name = "Auxiliar.findAll", query = "SELECT a FROM Auxiliar a")})
public class Auxiliar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AUXILIAR")
    private String idAuxiliar;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private int codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDOPAT")
    private String apellidopat;
    @Basic(optional = false)
    @Column(name = "APELLIDOMAT")
    private String apellidomat;
    @Basic(optional = false)
    @Column(name = "DNI")
    private int dni;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private String sexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAuxiliar")
    private Collection<Grado> gradoCollection;

    public Auxiliar() {
    }

    public Auxiliar(String idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public Auxiliar(String idAuxiliar, int codigo, String nombre, String apellidopat, String apellidomat, int dni, String sexo) {
        this.idAuxiliar = idAuxiliar;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(String idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopat() {
        return apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public String getApellidomat() {
        return apellidomat;
    }

    public void setApellidomat(String apellidomat) {
        this.apellidomat = apellidomat;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Collection<Grado> getGradoCollection() {
        return gradoCollection;
    }

    public void setGradoCollection(Collection<Grado> gradoCollection) {
        this.gradoCollection = gradoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuxiliar != null ? idAuxiliar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auxiliar)) {
            return false;
        }
        Auxiliar other = (Auxiliar) object;
        if ((this.idAuxiliar == null && other.idAuxiliar != null) || (this.idAuxiliar != null && !this.idAuxiliar.equals(other.idAuxiliar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Auxiliar[ idAuxiliar=" + idAuxiliar + " ]";
    }
    
}
