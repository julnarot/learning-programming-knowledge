/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.to;

/**
 *
 * @author jonatan
 */
public class PersonaTO {
    public String nombres,ape_pat,ape_mate,nivel,codigo,email,fecha_nac,estado;
    public int idPersona;

    public String getApe_mate() {
        return ape_mate;
    }

    public void setApe_mate(String ape_mate) {
        this.ape_mate = ape_mate;
    }

    public String getApe_pat() {
        return ape_pat;
    }

    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}
