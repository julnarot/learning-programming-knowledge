/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.bussines;

import java.util.List;
import upeu.edu.dao.CuentaDAO;

/**
 *
 * @author DIGESI
 */
public class CuentaBussines {
    public CuentaDAO dao;
    
    public List Reportecuentas()
    {
    return dao.ListarCuentas();
    }
    
    
}
