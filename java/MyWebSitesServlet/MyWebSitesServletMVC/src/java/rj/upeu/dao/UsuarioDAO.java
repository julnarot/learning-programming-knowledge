/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rj.upeu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rj.upeu.modelo.MwUsuarioTo;
import rj.upeu.utilitarios.DBConexion;

/**
 *
 * @author JONATAN
 */
public class UsuarioDAO extends DBConexion{
    
        public List UsuarioValidate(String user, String llave){
        MwUsuarioTo usuario=new MwUsuarioTo();
        List lista=new ArrayList<Object>();
        try {
            getConexion();
            ps=Conn.prepareStatement("SELECT * FROM mw_usuario WHERE UPPER(alias)=UPPER(?) AND clave=? AND estado='1' AND estadosesion='0'");
            ps.setString(1, user);
            ps.setString(2, llave);
            rs=ps.executeQuery();
            if(rs.next()){
            usuario.setUsuarioId(rs.getString("usuario_id"));    
            String ides=rs.getString("usuario_id");
            usuario.setAlias(rs.getString("alias"));          
            usuario.setClave(rs.getString("clave"));
            usuario.setEstado(rs.getString("estado"));
            usuario.setEstadoSession(rs.getString("estadosesion"));
            usuario.setFechaAlta(rs.getString("fechaalta"));
            usuario.setFechaAcceso(rs.getString("fechaacces"));            
//            cs.execute("UPDATE mw_usuario SET estadosesion='1' WHERE usuario_id='"+rs.getString("usuario_id")+"'");            
            lista.add(usuario);                       
            Conn.createStatement().executeQuery("UPDATE mw_usuario SET estadosesion='1' WHERE usuario_id='"+rs.getString("usuario_id")+"'");
            }
        } catch (SQLException e) {        
        System.out.println("Error Al Autentificar Usuario ->UsuarioDAO-> "+e.getMessage()+" -> "+e.getLocalizedMessage());}
        return lista;
        }
        
        public boolean  CrearUsuario(MwUsuarioTo dato){
            String sql="INSERT INTO mw_usuario(usuario_id,alias,clave,fechaalta,fechaacces,estado,estadosesion) VALUES (?, ?, ?, now(), now(), '1', '1')";
            int i=0;
            String idN=TriggerIdTable("mw_usuario", "usuario_id", "usua");    
            try {
            getConexion();      
            ps=Conn.prepareStatement(sql);
            ps.setString(++i, idN);
            ps.setString(++i, dato.getAlias());
            ps.setString(++i, dato.getClave());
            return ps.executeUpdate()==1;       
            } catch (Exception e) { e.getMessage();}
            finally{ closeConexion();}
            return  false;
        }
        
            public List<MwUsuarioTo> reportarUsuario()
                {
                String sql = " select * from mw_usuario ";
                List<MwUsuarioTo> Lista = new ArrayList<MwUsuarioTo>(); 
                MwUsuarioTo Toto = null;
                try 
                    {
                        getConexion();
                        ps = Conn.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while (rs.next()) 
                        {            
                        Toto = new MwUsuarioTo();
                        Toto.setUsuarioId(rs.getString("usuario_id"));
                        Toto.setAlias(rs.getString("alias"));
                        Toto.setClave(rs.getString("clave"));
                        Toto.setFechaAlta(rs.getString("fechaAlta"));
                        Toto.setFechaAcceso(rs.getString("fechaaces"));
                        Toto.setEstado(rs.getString("estado"));
                        Toto.setEstadoSession(rs.getString("estadosesion"));
                        Lista.add(Toto);
                        }
                        
                    } catch (Exception Exc) 
                    {
                        Exc.getMessage();
                    }
                finally
                {
                closeConexion();
                }
                return Lista;
                }

}
