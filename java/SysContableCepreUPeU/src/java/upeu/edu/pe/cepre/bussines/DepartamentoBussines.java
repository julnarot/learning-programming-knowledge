/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import upeu.edu.pe.cepre.dao.DepartamentoDao;

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
