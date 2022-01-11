/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.cepre.domain.FilialTo;
import upeu.edu.pe.cepre.domain.SedeTo;
import upeu.edu.pe.cepre.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class SedeDao extends DBConn {

    public boolean insertSede(SedeTo sedeTo) {

        boolean result = false;
        try {
            getConexionDb();
            ps = con.prepareStatement("insert into sca_sede(nombre,descripcion,"
                    + "direccion,tipo_sede,id_filial) "
                    + "values(?,?,?,?,?)");
            ps.setString(1, sedeTo.getNombre());
            ps.setString(2, sedeTo.getDescripcion());
            ps.setString(3, sedeTo.getDireccion());
            ps.setString(4, sedeTo.getTipoSede());
            ps.setString(5, sedeTo.getIdFilial());
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
    
    public List AllSedes(){
    
        List<SedeTo> listSedes = new ArrayList<SedeTo>();
        SedeTo sedeTo;
        try {
            getConexionDb();
            ps=con.prepareStatement("select s.nombre,s.direccion,s.descripcion,"
                    + "s.tipo_sede,s.id_filial,f.nombre "
                    + "from sca_sede s "
                    + "inner join sca_filial f "
                    + "on s.id_filial=f.id_filial");
            rs=ps.executeQuery();
            while(rs.next()){
            sedeTo = new SedeTo();
            sedeTo.setNombre(rs.getString("nombre"));
            sedeTo.setDireccion(rs.getString("direccion"));
            sedeTo.setDescripcion(rs.getString("descripcion"));
            sedeTo.setTipoSede(rs.getString("tipo_sede"));
            FilialTo filialTo = new FilialTo();
            filialTo.setNombre(rs.getString("f.nombre"));
            sedeTo.setFilialTo(filialTo);
            listSedes.add(sedeTo);
            }
        } catch (Exception e) {
            e.getMessage();
        }finally{
        getCerrarConexion();
        }
        return listSedes;
    }
    
    
}
