/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.dao;

import java.net.URL;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.modelo.SacuCargarArchivo;



/**
 *
 * @author nancy
 */ 
@Repository("CargarArchivoDao")
public class CargarArchivoImplement implements CargarArchivoDao{
    @Autowired
    public SessionFactory sessionFactory;
    
    @Override
    
    public List<SacuCargarArchivo> listaArchivos(){
        return sessionFactory.getCurrentSession().createCriteria(SacuCargarArchivo.class).list();
    }
    
    @Override
    
    public void ingresarArchivo(SacuCargarArchivo CargarArchivo){
        System.out.println(CargarArchivo.getUrl());
        Session session=sessionFactory.openSession();
        session.beginTransaction().begin();
        session.save(CargarArchivo);
        session.beginTransaction().commit();
        
    }
    
    @Override
    
    public SacuCargarArchivo obtenerListadoCargaArchivo(String idDireccion){
        return(SacuCargarArchivo)sessionFactory.getCurrentSession().get(SacuCargarArchivo.class, idDireccion);
    }
    
    @Override
    
    public void eliminarCargaArchivo(String idDireccion){
        sessionFactory.getCurrentSession().createQuery("delete SacuCargarArchivo per where per.idDireccion=?")
                .setString(0, idDireccion).executeUpdate();
    }
    
    
    
    
}
