/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.cepre.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.cepre.domain.FacultadTo;
import upeu.edu.pe.cepre.domain.FilialTo;
import upeu.edu.pe.cepre.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class FacultadDao extends DBConn {

    public List allFacultades() {

        List<FacultadTo> listFacultades = new ArrayList<FacultadTo>();
        FacultadTo facultadTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT  fac.id_facultad,fac.nombre,"
                    + "fac.descripcion,fac.estado,fac.id_filial,fil.nombre "
                    + "FROM sca_facultad fac "
                    + "INNER JOIN sca_filial fil "
                    + "ON fac.id_filial=fil.id_filial;");
            rs = ps.executeQuery();
            while (rs.next()) {
                facultadTo = new FacultadTo();
                facultadTo.setIdFacultad(rs.getString("id_facultad"));
                facultadTo.setNombre(rs.getString("nombre"));
                facultadTo.setDescripcion(rs.getString("descripcion"));
                facultadTo.setEstado(rs.getString("estado"));
                facultadTo.setIdFilial(rs.getString("id_filial"));
                FilialTo filialTo = new FilialTo();
                filialTo.setNombre(rs.getString("fil.nombre"));
                facultadTo.setFilialTo(filialTo);
                listFacultades.add(facultadTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listFacultades;
    }
}
