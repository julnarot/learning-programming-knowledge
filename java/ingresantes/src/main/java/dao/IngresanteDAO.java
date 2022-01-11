/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import to.EapTO;
import to.IngresanteTO;

/**
 *
 * @author jota
 */
public class IngresanteDAO extends util.DbConnection{
    public boolean RegistroIngresante(IngresanteTO ingr) throws Exception{
       boolean estado = false ;
       int i = 1;
       String query="INSERT INTO tb_ingresante(codigo, nomb_apels, moti_ingr, fech_alta, eap_id) VALUES (?, ?, ?, now(), ?)";
       try {           
          ObtenerConexion();
           PreparedStatement ps = Conexion.prepareStatement(query);
           ps.setString(i++, ingr.Codigo);
           ps.setString(i++, ingr.NombApell);
           ps.setString(i++, ingr.MotiIngre);
//           ps.setString(i++, ingr.FechAlta);
           ps.setInt(i++, ingr.IdEap);
           if(ps.executeUpdate()!= 0){
               estado = true;
           }
                      
       } catch (SQLException e) {
           System.out.println("Error Ingresante DAO "+ e.getLocalizedMessage() + e.getMessage());
           
       }finally{
          CerrarConexion();
       }
       return estado;
   }
   
   public ArrayList<EapTO> ReporteEap(){
       ArrayList<EapTO> lista = new ArrayList<EapTO>();
       EapTO to = null;
       String query="SELECT * FROM tb_eap ORDER BY 2";
       try {
           ObtenerConexion();
           Prsta=Conexion.prepareStatement(query);
           ResSet = Prsta.executeQuery();
           while (ResSet.next()) {               
               to = new EapTO();
               to.setIdEap(ResSet.getInt("eap_id"));
               to.setNombEap(ResSet.getString("nomb_eap"));
               lista.add(to);
           }
       } catch (SQLException e) {
           System.out.println("Error Reporte de EAP. "+e.getMessage());
       }finally{
       CerrarConexion();
       }
       return lista;
   }
   
   
   public int BusqIdNombEap(String eapnom){
       ArrayList<EapTO> lista = new ArrayList<EapTO>();
       EapTO to = null;
       String query="SELECT e.eap_id FROM tb_eap e where e.nomb_eap = ?";
       int id=0;
       try {
           ObtenerConexion();
           Prsta = Conexion.prepareStatement(query);
           Prsta.setString(1, eapnom);
           ResSet = Prsta.executeQuery();
           while(ResSet.next()){
               to = new EapTO();
               to.setIdEap(ResSet.getInt("eap_id"));
               lista.add(to);
               
           }
           id = to.getIdEap();
       } catch (Exception e) {
           
           System.out.println(" MEtodo Busqueda id nombre eap -> "+e.getMessage());
       }
   return id;
   }
   
}
