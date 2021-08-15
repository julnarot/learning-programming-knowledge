/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.InstitucionTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class InstitucionDao extends DBConn {
    
    public boolean insertInstitucion(InstitucionTo institucionTo) {
        
        boolean result = false;
        
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_institucion(razon_social,"
                    + "ruc,direccion,descripcion,telefono,fax,email,pagina,estado) "
                    + "values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, institucionTo.getRazonSocial());
            ps.setString(2, institucionTo.getRuc());
            ps.setString(3, institucionTo.getDireccion());
            ps.setString(4, institucionTo.getDescripcion());
            ps.setString(5, institucionTo.getTelefono());
            ps.setString(6, institucionTo.getFax());
            ps.setString(7, institucionTo.getEmail());
            ps.setString(8, institucionTo.getPagina());
            ps.setString(9, institucionTo.getEstado());
            
            if (ps.executeUpdate() == 1) {
                result = true;
            } else {
                result = false;
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return result;
    }
    
    public List allInstituciones() {
        List<InstitucionTo> allInstitutcion = new ArrayList<InstitucionTo>();
        InstitucionTo institucionTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("select * from sca_institucion");
            rs = ps.executeQuery();
            while (rs.next()) {
                institucionTo = new InstitucionTo();
                institucionTo.setIdInstitucion(rs.getString("id_institucion"));
                institucionTo.setDescripcion(rs.getString("descripcion"));
                institucionTo.setDireccion(rs.getString("direccion"));
                institucionTo.setEmail(rs.getString("email"));
                institucionTo.setEstado(rs.getString("estado"));
                institucionTo.setFax(rs.getString("fax"));
                institucionTo.setPagina(rs.getString("pagina"));
                institucionTo.setRazonSocial(rs.getString("razon_social"));
                institucionTo.setRuc(rs.getString("ruc"));
                institucionTo.setTelefono(rs.getString("telefono"));
                allInstitutcion.add(institucionTo);
            }
            
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return allInstitutcion;
    }
}
