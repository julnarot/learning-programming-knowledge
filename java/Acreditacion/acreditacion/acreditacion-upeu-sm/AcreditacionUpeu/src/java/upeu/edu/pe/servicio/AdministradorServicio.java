/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.servicio;

import java.util.List;
import upeu.edu.pe.modelo.SacuEstandar;

/**
 *
 * @author PC
 */
public interface AdministradorServicio {

    public List<SacuEstandar> listaEstandar();

    public void eliminarEstandar(String idEstandar);

    public void actualizarEstandar(SacuEstandar estandar);

    public SacuEstandar buscarEstandarId(String EstandarId);
}
