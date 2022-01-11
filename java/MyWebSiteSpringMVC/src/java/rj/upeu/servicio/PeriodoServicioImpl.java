/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.servicio;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alumno
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class PeriodoServicioImpl implements PeriodoServicio{
}
