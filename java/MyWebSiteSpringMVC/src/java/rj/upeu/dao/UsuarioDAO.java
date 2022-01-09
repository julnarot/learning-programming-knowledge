/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.dao;

import rj.upeu.modelo.MwUsuario;
import java.util.List;

/**
 *
 * @author jonatan
 */
public interface UsuarioDAO {
    public List<MwUsuario> validarUsuarioPass(MwUsuario userandpass);
}
