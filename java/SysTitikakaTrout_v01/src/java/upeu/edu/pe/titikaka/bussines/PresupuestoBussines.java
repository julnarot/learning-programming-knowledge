/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import upeu.edu.pe.titikaka.dao.PresupuestoDao;

/**
 *
 * @author USUARIO
 */
public class PresupuestoBussines {

    public PresupuestoDao presupuestoDao;

    public List allPresupuestos() {
        presupuestoDao = new PresupuestoDao();
        return presupuestoDao.allPresupuestos();
    }
}
