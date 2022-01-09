/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.edu.to.CuentaTO;
import upeu.edu.util.DBConn;

/**
 *
 * @author DIGESI
 */
public class CuentaDAO extends DBConn{
     public List ListarCuentas() 
    {
    List reporte=new ArrayList();
    CuentaTO to;
    String sql="select p.nombres,c.fecha,c.concepto,c.tipo_pago,c.debito,c.credito from caja.cuenta c, caja.persona p where c.persona_id=p.persona_id";
        try {
            getConexionDb();
           
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            to=new CuentaTO();
            to.setNombresP(rs.getString("persona_id"));
            to.setFecha(rs.getString("fecha"));
            to.setVoucher(rs.getString("voucher"));
            to.setConcepto(rs.getString("concepto"));
            to.setDebito(rs.getDouble("debito"));
            to.setCredito(rs.getDouble("credito"));
            reporte.add(to);
            
             System.out.println("Reportado..!");
            }
        } catch (Exception e) {
            System.out.println("Error en Reporte alumno..." + e.getMessage());
        }
        finally {
         getCerrarConexion();
        }
        return reporte;
    }
     
    public int insertarAlumno(CuentaTO to) {
        int r=0;
        try {
            getConexionDb();
           ps=con.prepareStatement("insert into caja.cuenta(fecha,concepto,voucher,tipo_pago,banco,num_cheque,debito,credito,persona_id) "
                   + "values(now(),'pago por comida','v0155',?,?,?,?,?,?)"); 
            ps.setString(1, to.getTipopago());
            ps.setString(2, to.getBanco());
            ps.setString(3, to.getNumerocheque());
            ps.setDouble(4, to.getDebito());
            ps.setDouble(5, to.getCredito());
            ps.setInt(6, to.getPersonaIdC());

            if (ps.executeUpdate() == 1) {
                r=1;    
                System.out.println("Insertado!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return r;
    }  
}
