/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Intel
 */
@Entity
public class ViewEstandar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id 
    @Column(name = "CANTIDAD",insertable = false, updatable = false )
    private BigInteger cantidad;
    @Column(name = "NOMBRE")
    private String nombre;

    public ViewEstandar() {
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
