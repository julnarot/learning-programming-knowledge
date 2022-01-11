
package rj.upeu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rj.upeu.modelo.MwPaginaTo;
import rj.upeu.utilitarios.DBConexion;

/*
 * @author @JONATAN
 */
    public class PaginaDAO extends DBConexion{

          public List<MwPaginaTo> ListarPaginaId(String idf)
            {
                String sql = "SELECT * FROM mw_pagina WHERE libro_id='"+idf+"'";
                List<MwPaginaTo> Lista = new ArrayList<MwPaginaTo>(); 
                MwPaginaTo Toto = null;
                try 
                    {
                        getConexion();
                        ps = Conn.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while (rs.next()) 
                        {            
                        Toto = new MwPaginaTo();
                        Toto.setPagina_id(rs.getString("pagina_id"));
                        Toto.setContenido(rs.getString("contenido"));
                        Toto.setNumPagina(rs.getString("numpagina"));    
                        Lista.add(Toto);
                        System.out.println("paginando");
                        }
                    } catch (Exception e) 
                    {
                        System.out.println("Error Al Reportar Pagina ->PaginaDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
                    }
                finally
                {
                closeConexion();
                }
                return Lista;
            }
          
          
          public List<MwPaginaTo> ListarPaginaIdPag(String idf)
            {
                String sql = "SELECT * FROM mw_pagina WHERE pagina_id='"+idf+"'";
                List<MwPaginaTo> Lista = new ArrayList<MwPaginaTo>(); 
                MwPaginaTo Toto = null;
                try 
                    {
                        getConexion();
                        ps = Conn.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while (rs.next()) 
                        {            
                        Toto = new MwPaginaTo();
                        Toto.setPagina_id(rs.getString("pagina_id"));
                        Toto.setContenido(rs.getString("contenido"));
                        Toto.setNumPagina(rs.getString("numpagina"));
                        Toto.setLibroId(rs.getString("libro_id"));
                        Lista.add(Toto);
                        System.out.println("paginando");
                        }
                    } catch (SQLException e) 
                    {
                        System.out.println("Error Al Reportar Pagina idpag ->PaginaDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
                    }
                finally
                {
                closeConexion();
                }
                return Lista;
            }
          
          
          public boolean AgregarPagina(MwPaginaTo dato)
            {
                String sql = "INSERT INTO mw_pagina(pagina_id,contenido,numpagina,libro_id,fechaalta) VALUES ( ?,?,?,?,NOW())";
                int i=0;
                String idN=TriggerIdTable("mw_pagina", "pagina_id", "pagi"); 
//                String idd=dato.getLibroId();
//                String Succ=Sucesion("mw_pagina", "numpagina",idd);
//                System.out.println("########"+idd);
                try {
                getConexion();      
                ps=Conn.prepareStatement(sql);
                ps.setString(++i, idN);       
                ps.setString(++i, dato.getContenido());
                ps.setString(++i, dato.getNumPagina());       
                ps.setString(++i, dato.getLibroId());
                
                System.out.println(idN+dato.getContenido()+dato.getNumPagina()+dato.getLibroId());
                return ps.executeUpdate()==1;       
                
                
                
                } catch (SQLException e) { 
                    System.out.println("Error Al AgregarPagina->PaginaDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
                    }
                finally{ closeConexion();}
                return  false;
                }
        
          public void ModificarPagina(MwPaginaTo to,String idU ){
        try {             
            int stado=0;
            getConexion();
            
            System.out.println("hola desde dao libros pag");
            ps=Conn.prepareStatement("UPDATE mw_pagina SET contenido=?  WHERE pagina_id=?");
            ps.setString(1, to.getContenido());
//            ps.setString(2, to.getNumPagina());
            ps.setString(2, idU);            
            stado=ps.executeUpdate();
         System.out.println("Actualizado!!->"+to.getContenido()+to.getNumPagina()+idU+"estado:"+stado);          
        } catch (SQLException e) {
            System.out.println("Error Al ActualizarPagina->PaginaDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());
        } finally {
            closeConexion();
        }
    }
    }