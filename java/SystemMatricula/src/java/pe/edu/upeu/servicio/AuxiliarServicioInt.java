/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.Auxiliar;

/**
 *
 * @author pp
 */
public interface AuxiliarServicioInt {
    public List<Auxiliar> listarauxiliar();
    public void guardarauxiliar(Auxiliar t);
    public void actualizarauxiliar(Auxiliar to);
    public void eliminarauxiliar(String auxiliar);
    public Auxiliar buscarporid(String idAuxiliar);
   public Auxiliar buscarCodigoAuxiliarpoid(String idgrado);
}
