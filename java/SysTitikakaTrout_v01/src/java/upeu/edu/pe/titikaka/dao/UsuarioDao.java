/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import upeu.edu.pe.titikaka.domain.PersonaTo;
import upeu.edu.pe.titikaka.domain.UsuarioTo;
import upeu.edu.pe.titikaka.utils.DBConn;
import upeu.edu.pe.titikaka.utils.STRCrypto;

/**
 *
 * @author USUARIO
 */
public class UsuarioDao extends DBConn{
    public UsuarioTo validateUser(String username, String password) {
        UsuarioTo userValidated=new UsuarioTo();
        STRCrypto cryp=new STRCrypto();
        try {
            getConexionDb();
            
            ps = con.prepareStatement("select u.id_usuario,u.username,u.password,u.cargo,p.nombres,p.apell_patern,p.apell_matern from sca_usuario u inner join sca_persona p on u.id_persona=p.id_persona where u.username=? and u.password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                userValidated.setIdUsuario(rs.getString("id_usuario"));
                userValidated.setUsername(rs.getString("username"));
                userValidated.setPassword(rs.getString("password"));
                userValidated.setCargo(rs.getString("cargo"));
                PersonaTo personaTo = new PersonaTo();
                personaTo.setNombres(rs.getString("nombres"));
                personaTo.setApellPatern(rs.getString("apell_patern"));
                personaTo.setApellMatern(rs.getString("apell_matern"));
                userValidated.setPersona(personaTo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            getCerrarConexion();
        }
        return userValidated;
    }    
}
