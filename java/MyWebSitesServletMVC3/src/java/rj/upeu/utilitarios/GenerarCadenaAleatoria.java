/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.utilitarios;

import java.util.Vector;

/**
 *
 * @author @JONATAN
 */
public class GenerarCadenaAleatoria {
public static void main(String[] args) {
Vector v = new Vector();
String cadena;
int N = 14;
int longitud = 5;
System.out.println("CAdena!! :"+genCad(9));
for(int i=1;i<=N;++i) {
cadena = genCad(longitud);

if(v.contains(cadena)) {
//JOptionPane.showMessageDialog(null,cadena,"¡Cadena repetida!",JOptionPane.WARNING_MESSAGE);
    System.out.println("CAdena Repetidaa");
} else {
//JOptionPane.showMessageDialog(null, cadena, "Cadena: " + i + " Ok!",JOptionPane.INFORMATION_MESSAGE);
    System.out.println("Cadena :"+i);
v.add(cadena);
}
}

}

private static String genCad(int largo) {
char [] ccad = new char [largo];
for(int i=0;i<=largo-1;++i) {
ccad[i]=(char)(Math.random()*26 + 'A');
}
return String.valueOf(ccad);
}
}