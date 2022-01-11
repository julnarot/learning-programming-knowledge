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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pp
 */
@Entity
@Table(name = "TIPO")
@NamedQueries({
    @NamedQuery(name = "Tipo.findAll", query = "SELECT t FROM Tipo t")})
public class Tipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_DE_PAGO")
    private String idTipoDePago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTOCONDESCUENTO")
    private Double costocondescuento;
    @Column(name = "COSTOINCREMENTADO")
    private Double costoincrementado;
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private Periodo idPeriodo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDePago")
    private Collection<Matricula> matriculaCollection;

    public Tipo() {
    }

    public Tipo(String idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public String getIdTipoDePago() {
        return idTipoDePago;
    }

    public void setIdTipoDePago(String idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public Double getCostocondescuento() {
        return costocondescuento;
    }

    public void setCostocondescuento(Double costocondescuento) {
        this.costocondescuento = costocondescuento;
    }

    public Double getCostoincrementado() {
        return costoincrementado;
    }

    public void setCostoincrementado(Double costoincrementado) {
        this.costoincrementado = costoincrementado;
    }

    public Periodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Periodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Collection<Matricula> getMatriculaCollection() {
        return matriculaCollection;
    }

    public void setMatriculaCollection(Collection<Matricula> matriculaCollection) {
        this.matriculaCollection = matriculaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDePago != null ? idTipoDePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo)) {
            return false;
        }
        Tipo other = (Tipo) object;
        if ((this.idTipoDePago == null && other.idTipoDePago != null) || (this.idTipoDePago != null && !this.idTipoDePago.equals(other.idTipoDePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.Tipo[ idTipoDePago=" + idTipoDePago + " ]";
    }
    
}
