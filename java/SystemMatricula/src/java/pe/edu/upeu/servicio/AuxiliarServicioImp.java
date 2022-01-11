/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.AuxiliarDaoImp;
import pe.edu.upeu.dao.AuxiliarDaoInt;
import pe.edu.upeu.modelo.Auxiliar;

/**
 *
 * @author pp
 */
public class AuxiliarServicioImp implements AuxiliarServicioInt{
    AuxiliarDaoInt dao;
    public AuxiliarServicioImp(){
    dao= new AuxiliarDaoImp();
    }
    @Override
    public List<Auxiliar> listarauxiliar(){return dao.getListAll();}
    @Override
    public void guardarauxiliar(Auxiliar t){ dao.save(t);}
    @Override
    public void actualizarauxiliar(Auxiliar to){ dao.update(to);}
    @Override
    public void eliminarauxiliar(String idAuxiliar) {dao.delete(idAuxiliar);
    }
    @Override
    public Auxiliar buscarporid(String idAuxiliar){
        return dao.getById(idAuxiliar);
    }

    @Override
    public Auxiliar buscarCodigoAuxiliarpoid(String idAuxiliar) {
        return dao.getByStrId(idAuxiliar);
    }
    

}

