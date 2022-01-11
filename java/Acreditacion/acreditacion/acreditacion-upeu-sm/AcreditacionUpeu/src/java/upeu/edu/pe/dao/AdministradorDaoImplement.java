/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.modelo.SacuEstandar;

/**
 *
 * @author PC
 */
@Repository("AdministradorDao")
public class AdministradorDaoImplement implements AdministradorDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<SacuEstandar> listarEstandares() {
        try {
            return sessionFactory.getCurrentSession().createCriteria(SacuEstandar.class).list();
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public void eliminarEstandar(String idEstandar){
        try {
            sessionFactory.getCurrentSession()
            .createQuery("delete SacuEstandar per where per.idEstandar=?")
            .setString(0, idEstandar)            
            .executeUpdate();
        } catch (Exception e) {
        }
    }
    @Override
    public void actualizarEstandar(SacuEstandar estandar){
    Session sesion=sessionFactory.openSession();
     
        try {
                sesion.beginTransaction().begin();
                sesion.update(estandar);
                sesion.getTransaction().commit(); 
        } catch (Exception e) {
        }
   
    }
    @Override
    public SacuEstandar buscarIdEstandar(String idEstandar){
        try {
            return (SacuEstandar)sessionFactory.getCurrentSession().get(SacuEstandar.class, idEstandar);
        } catch (Exception e) {
            return null;
        }
    }
    
    
}
