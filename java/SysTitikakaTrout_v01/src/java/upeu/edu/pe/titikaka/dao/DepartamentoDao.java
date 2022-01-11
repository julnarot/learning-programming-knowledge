/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.titikaka.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.titikaka.domain.DepartamentoTo;
import upeu.edu.pe.titikaka.domain.FilialTo;
import upeu.edu.pe.titikaka.utils.DBConn;

/**
 *
 * @author USUARIO
 */
public class DepartamentoDao extends DBConn {

    public List allDepartamentos() {
        List<DepartamentoTo> listDepartamentos = new ArrayList<DepartamentoTo>();
        DepartamentoTo departamentoTo;
        try {
            getConexionDb();
            ps = con.prepareStatement("SELECT dep.id_departamento,dep.nombre,"
                    + "dep.descripcion,dep.estado,dep.id_filial,fil.nombre "
                    + "FROM sca_departamento dep "
                    + "INNER JOIN sca_filial fil "
                    + "ON dep.id_filial=fil.id_filial");
            rs = ps.executeQuery();
            while (rs.next()) {
                departamentoTo = new DepartamentoTo();
                departamentoTo.setIdDepartamento(rs.getString("id_departamento"));
                departamentoTo.setNombre(rs.getString("nombre"));
                departamentoTo.setDescripcion(rs.getString("descripcion"));
                departamentoTo.setEstado(rs.getString("estado"));
                departamentoTo.setIdFilial(rs.getString("id_filial"));
                FilialTo filialTo = new FilialTo();
                filialTo.setNombre(rs.getString("fil.nombre"));
                departamentoTo.setFilialTo(filialTo);
                listDepartamentos.add(departamentoTo);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            getCerrarConexion();
        }
        return listDepartamentos;
    }
}
