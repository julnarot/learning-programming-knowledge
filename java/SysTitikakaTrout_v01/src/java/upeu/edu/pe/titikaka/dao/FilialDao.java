/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.FilialTo;
import upeu.edu.pe.titikaka.domain.InstitucionTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class FilialDao extends DBConn {

    public boolean insertFilial(FilialTo filialTo) {

        boolean result = false;

        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_filial(nombre,direccion,"
                    + "telefono,email,descripcion,estado,id_institucion) "
                    + "values(?,?,?,?,?,?,?)");
            ps.setString(1, filialTo.getNombre());
            ps.setString(2, filialTo.getDireccion());
            ps.setString(3, filialTo.getTelefono());
            ps.setString(4, filialTo.getEmail());
            ps.setString(5, filialTo.getDescripcion());
            ps.setString(6, filialTo.getEstado());
            ps.setString(7, filialTo.getIdInstitucion());

            if (ps.executeUpdate() == 1) {
                result = true;
            } else {
                result = false;
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        } finally {
            getCerrarConexion();
        }
        return result;
    }

    public List reportFilial() {

        List<FilialTo> listFilial = new ArrayList<FilialTo>();
        FilialTo filialTo;
        try {
            getConexionDb();
            ps=con.prepareStatement("select f.id_filial,f.nombre,f.direccion,"
                    + "f.telefono,f.email,f.descripcion,f.estado,i.razon_social "
                    + "from sca_filial f "
                    + "inner join sca_institucion i "
                    + "on f.id_institucion=i.id_institucion");
            rs=ps.executeQuery();
            while(rs.next()){
            filialTo=new FilialTo();
            filialTo.setIdFilial(rs.getString("id_filial"));
            filialTo.setNombre(rs.getString("nombre"));
            filialTo.setDireccion(rs.getString("direccion"));
            filialTo.setTelefono(rs.getString("telefono"));
            filialTo.setEmail(rs.getString("email"));
            filialTo.setDescripcion(rs.getString("descripcion"));
            filialTo.setEstado(rs.getString("estado"));
            InstitucionTo institucionTo = new InstitucionTo();
            institucionTo.setRazonSocial(rs.getString("razon_social"));
            filialTo.setInstitucionTo(institucionTo);
            listFilial.add(filialTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listFilial;
    }
}
