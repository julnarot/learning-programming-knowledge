/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.to;

/**
 *
 * @author jonatan
 */
public class CuentaTO {
    public String fecha,concepto,voucher,banco,numerocheque,tipopago;
    public int cuentaIdC,personaIdC;
    public double debito,credito;

    public String getApe_mateP() {
        return ape_mateP;
    }

    public void setApe_mateP(String ape_mateP) {
        this.ape_mateP = ape_mateP;
    }

    public String getApe_patP() {
        return ape_patP;
    }

    public void setApe_patP(String ape_patP) {
        this.ape_patP = ape_patP;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getCuentaIdC() {
        return cuentaIdC;
    }

    public void setCuentaIdC(int cuentaIdC) {
        this.cuentaIdC = cuentaIdC;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha_nacP() {
        return fecha_nacP;
    }

    public void setFecha_nacP(String fecha_nacP) {
        this.fecha_nacP = fecha_nacP;
    }

    public int getIdPersonaP() {
        return idPersonaP;
    }

    public void setIdPersonaP(int idPersonaP) {
        this.idPersonaP = idPersonaP;
    }

    public String getNivelP() {
        return nivelP;
    }

    public void setNivelP(String nivelP) {
        this.nivelP = nivelP;
    }

    public String getNombresP() {
        return nombresP;
    }

    public void setNombresP(String nombresP) {
        this.nombresP = nombresP;
    }

    public String getNumerocheque() {
        return numerocheque;
    }

    public void setNumerocheque(String numerocheque) {
        this.numerocheque = numerocheque;
    }

    public int getPersonaIdC() {
        return personaIdC;
    }

    public void setPersonaIdC(int personaIdC) {
        this.personaIdC = personaIdC;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    
    
    public String nombresP,ape_patP,ape_mateP,nivelP,codigoP,emailP,fecha_nacP,estadoP;
    public int idPersonaP;
}
