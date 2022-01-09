/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.to;

/**
 *
 * @author jonatan
 */
public class SaldoTO {
   public int saldo_id,cuenta_id;
   public String tipo_saldo;
   public double saldo;

    public int getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(int cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSaldo_id() {
        return saldo_id;
    }

    public void setSaldo_id(int saldo_id) {
        this.saldo_id = saldo_id;
    }

    public String getTipo_saldo() {
        return tipo_saldo;
    }

    public void setTipo_saldo(String tipo_saldo) {
        this.tipo_saldo = tipo_saldo;
    }
}
