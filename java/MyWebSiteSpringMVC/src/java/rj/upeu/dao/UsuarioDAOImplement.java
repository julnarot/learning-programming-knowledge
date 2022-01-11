/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.dao;

import rj.upeu.modelo.MwUsuario;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jonatan
 */
@Repository
public class UsuarioDAOImplement implements UsuarioDAO{
    @Autowired
    public SessionFactory sesion;
    
      @Override
    public List<MwUsuario> validarUsuarioPass(MwUsuario userandpass)
    {
        String hql="select a from MwUsuario a where a.alias=? and a.clave=?";
      return (List<MwUsuario>)sesion.getCurrentSession().createQuery(hql).setString(0, userandpass.getAlias()).setString(1, userandpass.getClave()).list();
        //return (List<CpUsuario>)sesion.getCurrentSession().createQuery(hql)                .setParameter(0, userandpass.getUsuario())                .setParameter(1, userandpass.getClave()).list();
    }
    
}
