/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.cepre.domain.CampaniaTo;
import upeu.edu.pe.cepre.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class CampaniaDao extends DBConn {

    public boolean insertCampania(CampaniaTo campañaTo) {

        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_campaña(nombre,descripcion) values(?,?)");
            ps.setString(1, campañaTo.getNombre());
            ps.setString(2, campañaTo.getDescripcion());
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
    
    public List allCampanias(){
    
        List<CampaniaTo> listCampanias=new ArrayList<CampaniaTo>();
        CampaniaTo campañaTo;
        try {
            getConexionDb();
            ps=con.prepareStatement("select * from sca_campaña");
            rs=ps.executeQuery();
            while(rs.next()){
            campañaTo=new CampaniaTo();
            campañaTo.setIdCampaña(rs.getString("id_campaña"));
            campañaTo.setNombre(rs.getString("nombre"));
            campañaTo.setDescripcion(rs.getString("descripcion"));
            listCampanias.add(campañaTo);
            }
        } catch (Exception e) {
            e.getMessage();
        }finally{
        getCerrarConexion();
        }
        return listCampanias;
    }
}
