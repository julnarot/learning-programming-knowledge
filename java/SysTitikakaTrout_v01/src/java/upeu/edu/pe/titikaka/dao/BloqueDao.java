/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.BloqueTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class BloqueDao extends DBConn {

    public boolean insertBloque(BloqueTo bloqueTo) {

        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into trout_bloque(nombre, "
                    + "totalpeces, totalpeso, estado ) "
                    + "values(?,?,?,?)");
            ps.setString(1, bloqueTo.getNombre());
            ps.setString(2, bloqueTo.getTotalpeces());
            ps.setString(3, bloqueTo.getTotalpeso());
            ps.setString(4, bloqueTo.getEstado());
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
   
    public List allBloque() {
        List<BloqueTo> listBloque = new ArrayList<BloqueTo>();
        BloqueTo bloqueTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT nombre, totalpeces, totalpeso, estado FROM trout_bloque" );
            rs = ps.executeQuery();
            while (rs.next()) {
                bloqueTo = new BloqueTo();
                bloqueTo.setNombre(rs.getString("nombre"));
                bloqueTo.setTotalpeces(rs.getString("totalpeces"));
                bloqueTo.setTotalpeso(rs.getString("totalpeso"));
                bloqueTo.setEstado(rs.getString("estado"));
                listBloque.add(bloqueTo);

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listBloque;

    }

    
}
