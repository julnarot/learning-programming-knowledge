/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.servicio;

import rj.upeu.modelo.MwUsuario;
import java.util.List;

/**
 *
 * @author jonatan
 */

public interface UsuarioServicio {
    public List<MwUsuario> Validar(MwUsuario c);
}
