/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.bussines;

import java.util.List;
import upeu.edu.pe.cepre.dao.FacultadDao;

/**
 *
 * @author USUARIO
 */
public class FacultadBussines {

    public FacultadDao facultadDao;

    public List allFacultades() {
        facultadDao = new FacultadDao();
        return facultadDao.allFacultades();
    }
}
