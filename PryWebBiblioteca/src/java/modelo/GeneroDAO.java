/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import beans.Empleado;
import beans.Genero;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConexionBD;

/**
 *
 * @author Alumno
 */
public class GeneroDAO {
Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cst;
    
    
    
     public void registrarGenero(Genero g){
       try{
           cn=ConexionBD.getConexion();
           String sql="insert into tgenero(nom_genero) values(?)";
//INSERT INTO TPersona VALUES('01','Dany','Montoya Negrillo','Lima','Calle Guayaquil 145'),           
          ps=cn.prepareStatement(sql);
          ps.setString(1, g.getNom_genero());
          ps.execute();
       }catch(Exception ex){
       }             
   }
   
    public void modificarGenero(Genero objG) {
		try {
		cn = ConexionBD.getConexion();
      ps= cn.prepareStatement("Update tgenero  set nom_genero=? where id_genero=?");
                        ps.setString(1, objG.getNom_genero());		
                        ps.setString(2, objG.getId_genero());						

                        ps.executeUpdate();
			cn.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
    
       public  void   eliminarGenero(String id_genero){
    try {
      cn = ConexionBD.getConexion();
      ps= cn.prepareStatement("Delete  from tgenero where id_genero=?");
      ps.setString(1, id_genero);
      ps.execute();        
        ps.close();
        cn.close();
    } catch (Exception e) {
        
       e.printStackTrace();
       
    }
}
  
      public Genero getGenero(String id_genero){
        try{
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("SELECT * FROM  tgenero WHERE id_genero=?");            
            ps.setString(1,id_genero);
            rs=ps.executeQuery();            
            if(rs.next()){
                Genero g=new Genero();
                g.setId_genero(rs.getString(1));
                g.setNom_genero(rs.getString(2));

                return g;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }                         
          }catch(Exception ex){            
        }
             return null;
    }     
       
     public ArrayList<Genero> getGeneros(){
        ArrayList<Genero> listaGen=new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            
             cst = cn.prepareCall("{CALL Listar_Genero()}");
              rs=ps.executeQuery();
              while(rs.next()){
                Genero g=new Genero();
                g.setId_genero(rs.getString(1));
                g.setNom_genero(rs.getString(2));

                listaGen.add(g);
              }
              
        } catch (Exception e) {
        }
        return listaGen;
    }
         
}

    
