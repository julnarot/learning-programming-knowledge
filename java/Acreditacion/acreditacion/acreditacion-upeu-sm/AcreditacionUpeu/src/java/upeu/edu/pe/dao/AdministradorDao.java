/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.dao;

import java.util.List;
import upeu.edu.pe.modelo.SacuEstandar;

/**
 *
 * @author PC
 */
public interface AdministradorDao {

    public List<SacuEstandar> listarEstandares();

    public void actualizarEstandar(SacuEstandar estandar);

    public void eliminarEstandar(String idEstandar);

    public SacuEstandar buscarIdEstandar(String idEstandar);
}
