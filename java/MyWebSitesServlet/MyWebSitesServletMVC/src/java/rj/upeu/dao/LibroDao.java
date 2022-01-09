/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rj.upeu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rj.upeu.utilitarios.DBConexion;
import rj.upeu.modelo.MwLibroTo;
/**
 *
 * @author @JONATAN
 */
public class LibroDao extends DBConexion{

    public List<MwLibroTo> ListarLibro()
{
//    String sql = "SELECT li.libro_id,li.nombre,li.autor,li.color,li.imgportada,li.contraportada,li.fechaalta,li.estado,pg.pagina_id,GROUP_CONCAT(pg.contenido) AS contenido FROM mw_libro li,mw_pagina pg  WHERE pg.libro_id=li.libro_id AND li.estado!='0' GROUP BY li.libro_id ORDER BY pg.pagina_id ASC";
    String sql = "SELECT * FROM mw_pagina pg,mw_libro li WHERE pg.libro_id=li.libro_id AND li.estado!='0' GROUP BY li.libro_id";
    List<MwLibroTo> Lista = new ArrayList<MwLibroTo>(); 
    MwLibroTo Toto = null;
    try 
        {
            getConexion();
            ps = Conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) 
            {            
            Toto = new MwLibroTo();
            Toto.setLibro_id(rs.getString("libro_id"));            
            Toto.setNombre(rs.getString("nombre"));
            Toto.setAutor(rs.getString("autor"));
            Toto.setColor(rs.getString("color"));    
            Toto.setImgPortada(rs.getString("imgportada"));     
            Toto.setContraPortada(rs.getString("contraportada"));                 
            Toto.setFechaAlta(rs.getString("fechaalta"));                   
            Toto.setEstado(rs.getString("estado"));
            Toto.setPPagina_id(rs.getString("pagina_id"));
            Toto.setPContenido(rs.getString("contenido"));                        
            Lista.add(Toto);
            }
        } catch (Exception e) 
        {
            System.out.println("Error Al Reportar Libro ->LibroDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
        }
    finally
    {
    closeConexion();
    }
    return Lista;
}

        public String  AgregarLibro(MwLibroTo dato){
            String idli="";
            String sql="INSERT INTO mw_libro(libro_id,autor,nombre,color,imgportada,contraportada,fechaalta,estado) VALUES (?, ?, ?, ?, ?, ?,NOW(),'1')";
            int i=0;
            String idN=TriggerIdTable("mw_libro", "libro_id", "libr");    
            try {
            getConexion();      
            ps=Conn.prepareStatement(sql);
            ps.setString(++i, idN);
            ps.setString(++i, dato.getAutor());
            ps.setString(++i, dato.getNombre());
            ps.setString(++i, dato.getColor());       
            ps.setString(++i, dato.getImgPortada());
            ps.setString(++i, dato.getContraPortada());
            ps.executeUpdate();       
             idli=idN;
            } catch (SQLException e) { 
                System.out.println("Error Al AgregarLibro->LibroDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
                }
            finally{ closeConexion();}
            return  idli;
        }


        public boolean  AgregarPagina(MwLibroTo dato){
    String sql="INSERT INTO mw_libro(libro_id,autor,nombre,color,imgportada,contraportada,fechaalta,estado) VALUES (?, ?, ?, ?, ?, ?,NOW(),'1')";
    int i=0;
    String idN=TriggerIdTable("mw_libro", "libro_id", "libr");    
    try {
       getConexion();      
       ps=Conn.prepareStatement(sql);
       ps.setString(++i, idN);
       ps.setString(++i, dato.getAutor());
       ps.setString(++i, dato.getNombre());
       ps.setString(++i, dato.getColor());       
       ps.setString(++i, dato.getImgPortada());
       ps.setString(++i, dato.getContraPortada());
       return ps.executeUpdate()==1;       
    } catch (SQLException e) { 
        System.out.println("Error Al AgregarLibro->LibroDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
        }
    finally{ closeConexion();}
    return  false;
}

        public List<MwLibroTo> ReportarLibroId(String ids)
        {
            String sql = "SELECT * FROM mw_libro WHERE libro_id=? AND estado!='0'";
            List<MwLibroTo> Lista = new ArrayList<MwLibroTo>(); 
            MwLibroTo Toto = null;
            try 
                {
                    getConexion();
                    ps = Conn.prepareStatement(sql);
                    ps.setString(1, ids);
                    rs = ps.executeQuery();
                    while (rs.next()) 
                    {            
                    Toto = new MwLibroTo();
                    Toto.setLibro_id(rs.getString("libro_id"));            
                    Toto.setNombre(rs.getString("nombre"));
                    Toto.setAutor(rs.getString("autor"));
                    Toto.setColor(rs.getString("color"));    
                    Toto.setImgPortada(rs.getString("imgportada"));     
                    Toto.setContraPortada(rs.getString("contraportada"));                 
                    Toto.setFechaAlta(rs.getString("fechaalta"));                   
                    Toto.setEstado(rs.getString("estado"));                        
                    Lista.add(Toto);
                    }
                } catch (Exception e) 
                {
                    System.out.println("Error Al Reportar LibroId ->LibroDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
                }
            finally
            {
            closeConexion();
            }
            return Lista;            
        }
        
        public boolean ModificarLibro(MwLibroTo dato,String id)
        {
            boolean stado=false;
            int i=0;
            try {                         
            getConexion();            
            System.out.println("hola desde dao libros pag");
            ps=Conn.prepareStatement("UPDATE mw_libro SET nombre=?,autor=?,color=?,imgportada=?,contraportada=?,estado=? WHERE libro_id=?");
            ps.setString(++i, dato.getNombre());
            ps.setString(++i, dato.getAutor());
            ps.setString(++i, dato.getColor());
            ps.setString(++i, dato.getImgPortada());
            ps.setString(++i, dato.getContraPortada());
            ps.setString(++i, dato.getEstado());
            ps.setString(++i, id);
            System.out.println(id+" ->Actualizadoss Libro");            
            stado=ps.execute();  
        } catch (SQLException e) {
            System.out.println("Error Al ActualizarLibro->LibroDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
        } finally {
            closeConexion();
        }
            return stado;
        }
}
