/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.modelo.SauPeriodo;
import upeu.edu.pe.modelo.ViewEstandar;

/**
 *
 * @author Alumno
 */
@Repository("PeriodoDao")
public class PeriodoDaoImplement implements PeriodoDao{    
    @Autowired
    public SessionFactory sesionFactory;
    
    
    @Override
    public List<SauPeriodo> listaPeriodo(){
    return sesionFactory.getCurrentSession().createCriteria(SauPeriodo.class).list();         
    }
    @Override
    public List<ViewEstandar> listacantidadEstandar(){
        ArrayList<ViewEstandar> resultado= (ArrayList<ViewEstandar>) sesionFactory.getCurrentSession()
                    .createSQLQuery("select * from view_estandar").addEntity(ViewEstandar.class).list();
    return resultado;         
    }
    
    @Override
    public void insertarPeriodo(SauPeriodo periodo ){
        System.out.println(periodo.getPeriodo());        
          Session session =sesionFactory.openSession();
          session.beginTransaction().begin();
          //  session.persist(periodo);
            session.save(periodo);
          //  session.createSQLQuery(null);
          session.beginTransaction().commit();          
    }
    @Override
    public void insertarEstandarEval(String idPeriodo, String idEap ){        
                    sesionFactory.getCurrentSession()
                    .createSQLQuery("{ CALL upeu.PS_ESTANDAR_EVAL_FOR(?, ?) }")
                            .setParameter(0, idPeriodo)
                            .setParameter(1, idEap)
                            .executeUpdate();
//
//        Session session =sesionFactory.openSession();
//          session.beginTransaction().begin();
//            session.createSQLQuery("{ CALL PS_ESTANDAR_EVAL_FOR(?, ?) }")
//                    .setParameter(0, idPeriodo)
//                    .setParameter(1, idEap);
//          session.beginTransaction().commit(); 
              System.out.println(idPeriodo+"     "+idEap); 
    }
    
    @Override
    public void eliminarPeriodo(String idPeriodo){
    sesionFactory.getCurrentSession()
            .createQuery("delete SauPeriodo per where per.idPeriodo=?")
            .setString(0, idPeriodo)            
            .executeUpdate();
    }
    
    @Override
    public SauPeriodo buscarIdPeriodo(String idPeriodo){
    return (SauPeriodo)sesionFactory.getCurrentSession().get(SauPeriodo.class, idPeriodo);
    }
    
    @Override
    public void actualizarPeriodo(SauPeriodo periodo){
    Session sesion=sesionFactory.openSession();
     System.out.println("------------------>"+periodo.getFechaFin());
        try {
                sesion.beginTransaction().begin();
                sesion.update(periodo);
                sesion.getTransaction().commit(); 
        } catch (Exception e) { System.out.println("------------------>"+e.getMessage());
        }
   
    }
    
    
    
}
