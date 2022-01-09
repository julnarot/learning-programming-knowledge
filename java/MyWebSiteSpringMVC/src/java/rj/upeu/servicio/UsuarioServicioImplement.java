/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.servicio;

import rj.upeu.dao.UsuarioDAO;
import rj.upeu.modelo.MwUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jonatan
 */
@Service
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class UsuarioServicioImplement implements UsuarioServicio{
    @Autowired
    public UsuarioDAO userdao;
    
    @Override
  public List<MwUsuario> Validar(MwUsuario c)
  {
      return userdao.validarUsuarioPass(c);
  }
    
}
