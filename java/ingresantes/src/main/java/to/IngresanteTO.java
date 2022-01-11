/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package to;

/**
 *
 * @author jota
 */
public class IngresanteTO extends EapTO{
    public int idIngresante;
    public String  NombApell;
    public String Codigo;    
    public String MotiIngre;  
    public String FechAlta;  

    public int getIdIngresante() {
        return idIngresante;
    }

    public void setIdIngresante(int idIngresante) {
        this.idIngresante = idIngresante;
    }

    public String getNombApell() {
        return NombApell;
    }

    public void setNombApell(String NombApell) {
        this.NombApell = NombApell;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMotiIngre() {
        return MotiIngre;
    }

    public void setMotiIngre(String MotiIngre) {
        this.MotiIngre = MotiIngre;
    }

    public String getFechAlta() {
        return FechAlta;
    }

    public void setFechAlta(String FechAlta) {
        this.FechAlta = FechAlta;
    }
    

}
