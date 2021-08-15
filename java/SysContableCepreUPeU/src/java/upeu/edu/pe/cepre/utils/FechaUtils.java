/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.utils;

/**
 *
 * @author USUARIO
 */
public class FechaUtils {

    public String MesEnLetras(String numeroMes) {
        String mesEnletras = null;
        if (numeroMes.equals("1")) {
            mesEnletras = "ENERO";
        }
        if (numeroMes.equals("2")) {
            mesEnletras = "FEBRERO";
        }
        if (numeroMes.equals("3")) {
            mesEnletras = "MARZO";
        }
        if (numeroMes.equals("4")) {
            mesEnletras = "ABRIL";
        }
        if (numeroMes.equals("5")) {
            mesEnletras = "MAYO";
        }
        if (numeroMes.equals("6")) {
            mesEnletras = "JUNIO";
        }
        if (numeroMes.equals("7")) {
            mesEnletras = "JULIO";
        }
        if (numeroMes.equals("8")) {
            mesEnletras = "AGOSTO";
        }
        if (numeroMes.equals("9")) {
            mesEnletras = "SEPTIEMBRE";
        }
        if (numeroMes.equals("10")) {
            mesEnletras = "OCTUBRE";
        }
        if (numeroMes.equals("11")) {
            mesEnletras = "NOVIEMBRE";
        }
        if (numeroMes.equals("12")) {
            mesEnletras = "DICIEMBRE";
        }
        return mesEnletras;
    }
    
    public static void main(String[]args){
    
        String numeroMes="2";
        FechaUtils fechaMes = new FechaUtils();
        System.out.print(fechaMes.MesEnLetras(numeroMes));
    }
}
