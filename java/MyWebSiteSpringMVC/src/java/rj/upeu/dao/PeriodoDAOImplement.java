/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.dao;


import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alumno
 */

@Repository("PeriodoDAOImpl")
public class PeriodoDAOImplement  implements PeriodoDAO{
@Autowired 
public SessionFactory sesionFactory;
public Log logger=LogFactory.getLog(PeriodoDAOImplement.class);

}
