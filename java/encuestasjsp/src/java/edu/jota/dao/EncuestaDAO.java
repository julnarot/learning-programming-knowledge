/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jota.dao;

import edu.jota.model.Encuesta;
import edu.jota.util.DataBaseConexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jota
 */
public class EncuestaDAO extends DataBaseConexion{
    
    public List<Encuesta> ReporteEncuesta(){
        
        List<Encuesta> reporte = new ArrayList<Encuesta>();
        Encuesta datos = null;
        
        try {
                getConexion();
                ps=Conn.prepareStatement("select * from encuestas_encuesta enc order by enc.fecha_alta desc");
                rs=ps.executeQuery();
                while (rs.next()) {
                    datos = new Encuesta();
                    
                    datos.setIdEncuesta(rs.getString("id"));
                    datos.setPregunta(rs.getString("pregunta"));
                    datos.setFechaAlta(rs.getDate("fecha_alta"));
                    reporte.add(datos);
            }
        } catch (Exception e){
            System.out.println("Error a Realizar Reporte en : "+e.getMessage()+" en: "+e.getLocalizedMessage());
            e.getMessage();
        }finally{
        closeConexion();
        }
        
        return reporte;
    }
    
    
    public boolean AgregarEncuesta(Encuesta dato){
        
        int i=0;        
        try {
           getConexion();      
           ps=Conn.prepareStatement("insert into encuestas_encuesta (pregunta, fecha_alta) values(?, ?)");           
           ps.setString(++i, dato.getPregunta());
           ps.setDate(++i, (java.sql.Date)dato.getFechaAlta());          
           return ps.executeUpdate()==1;       
        } catch (SQLException e) { 
            System.out.println("Error al  Agregar Encuesta:"+e.getMessage()+" -> "+e.getLocalizedMessage()+" sql-> "+e.getSQLState());
            }
        finally{ closeConexion();}
        return  false;
    }
}
