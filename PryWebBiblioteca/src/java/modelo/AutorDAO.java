/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import beans.Alumno;
import beans.Autor;
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
public class AutorDAO {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
 
     public ArrayList<Autor> getAutores(){
         ArrayList<Autor> lista=new ArrayList<>();
         try{
             cn=ConexionBD.getConexion();
             //Llamada al procedimiento almacenado
             CallableStatement cst=cn.prepareCall("{call Listar_Autor()}");
             ResultSet rs=cst.executeQuery();
          while(rs.next()){
              lista.add(new Autor(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
          }  
         }catch(Exception e){
             
         }
        return lista;
     } 
     
     public void registrarAutor(Autor a){
         try{
             cn=ConexionBD.getConexion();
             CallableStatement cst=cn.prepareCall("{call Insertar_Autor(?,?,?,?)}");
              cst.setString(1,a.getNom_autor());
              cst.setString(2,a.getApe_autor());
              cst.setString(3,a.getNacion_autor());
              cst.setString(4,a.getNacimiento());
              cst.execute();
              }catch(Exception e){
         }
     }
      public void modificarAutor(Autor objA) {
        try {
            cn = ConexionBD.getConexion();
            CallableStatement cstm=cn.prepareCall("{call Actualizar_Autor(?,?,?,?,?)}");
            cstm.setString(2, objA.getNom_autor());
            cstm.setString(3, objA.getApe_autor());
            cstm.setString(5, objA.getNacion_autor());
            cstm.setString(4, objA.getNacimiento());
            cstm.setString(1, objA.getId_autor());
            cstm.executeUpdate();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      public void eliminarAutor(String id_autor) {
        try {
            cn = ConexionBD.getConexion();
            CallableStatement cst=cn.prepareCall("{call Eliminar_Autor(?)}");
            cst.setString(1, id_autor);
            cst.execute();
            cst.close();
            cn.close();
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
      
      public Autor getAutor(String id_autor) {
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("{call Consultar_AutorID(?)}");
            ps.setString(1, id_autor);
            rs = ps.executeQuery();
            if (rs.next()) {
                Autor a = new Autor();
                a.setId_autor(rs.getString(1));
                a.setNom_autor(rs.getString(2));
                a.setApe_autor(rs.getString(3));
                a.setNacion_autor(rs.getString(4));
                a.setNacimiento(rs.getString(5));

                return a;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
}
