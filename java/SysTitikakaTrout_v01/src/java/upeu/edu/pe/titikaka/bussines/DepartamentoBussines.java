/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.bussines;

import java.util.List;
import upeu.edu.pe.titikaka.dao.DepartamentoDao;

/**
 *
 * @author USUARIO
 */
public class DepartamentoBussines {

    public DepartamentoDao departamentoDao;

    public List allDepartamentos() {
        departamentoDao = new DepartamentoDao();
        return departamentoDao.allDepartamentos();
    }
}
