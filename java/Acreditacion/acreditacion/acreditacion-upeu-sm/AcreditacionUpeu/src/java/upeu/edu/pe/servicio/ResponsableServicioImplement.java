/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.servicio;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PC
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
public class ResponsableServicioImplement implements ResponsableServicio{
    
}
