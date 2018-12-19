/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import beans.Empleado;
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
public class EmpleadoDAO {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cst;
    
    
     public void registrarEmpleado(Empleado e){
       try{
           cn=ConexionBD.getConexion();
           
           cst = cn.prepareCall("{call Insertar_Empleado (?,?,?,?,?)}");

          cst.setString(1, e.getNom_empleado());
          cst.setString(2, e.getApe_empleado());
          cst.setString(3, e.getDni_empleado());
          cst.setString(4, e.getFechaing_empleado());
          cst.setString(5, e.getStatus_empleado());
          cst.execute();
       }catch(Exception ex){
       }             
   }
   
    public void modificarEmpleado(Empleado objE) {
		try {
		cn = ConexionBD.getConexion();
              cst = cn.prepareCall("{call Actualizar_Empleado  (?,?,?,?,?,?)}");
                        cst.setString(2, objE.getNom_empleado());		
                        cst.setString(3, objE.getApe_empleado());						
			cst.setString(4, objE.getDni_empleado());
			cst.setString(5, objE.getFechaing_empleado());
                        cst.setString(6, objE.getStatus_empleado());
                        cst.setString(1, objE.getId_empleado());
                        cst.executeUpdate();
			cst.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
    
       public  void   eliminarEmpleado(String id_empleado){
    try {
      cn = ConexionBD.getConexion();
      cst = cn.prepareCall("{ call Eliminar_Empleado(?) }");
      cst.setString(1, id_empleado);
      cst.execute();        
        cst.close();
        cn.close();
    } catch (Exception e) {
        
       e.printStackTrace();
       
    }
}
  
      public Empleado getEmpleado(String id_empleado){
        try{
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("{call Consultar_EmpleadoID(?)}");            
            ps.setString(1,id_empleado);
            rs=ps.executeQuery();            
            if(rs.next()){
                Empleado e=new Empleado();
                e.setId_empleado(rs.getString(1));
                e.setNom_empleado(rs.getString(2));
                e.setApe_empleado(rs.getString(3));
                e.setDni_empleado(rs.getString(4));
                e.setFechaing_empleado(rs.getString(5));
                e.setStatus_empleado(rs.getString(6));
                return e;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }                         
          }catch(Exception ex){            
        }
             return null;
    }     
       
     public ArrayList<Empleado> getEmpleados(){
        ArrayList<Empleado> listaEmp=new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            cst = cn.prepareCall("{call Listar_Empleado()}");
              rs=cst.executeQuery();
              while(rs.next()){
                Empleado e=new Empleado();
                e.setId_empleado(rs.getString(1));
                e.setNom_empleado(rs.getString(2));
                e.setApe_empleado(rs.getString(3));
                e.setDni_empleado(rs.getString(4));
                e.setFechaing_empleado(rs.getString(5));
                e.setStatus_empleado(rs.getString(6));
                listaEmp.add(e);
              }
              
        } catch (Exception e) {
        }
        return listaEmp;
    }
     
     public boolean autentificacion(String usuario,String contraseña){
         try{
             cn=ConexionBD.getConexion();
             String consulta = "select * from templeado where nom_empleado=? and dni_empelado=?";
             ps = cn.prepareStatement(consulta);
             ps.setString(1,usuario);
             ps.setString(2,contraseña);
             rs=ps.executeQuery();

             if(rs.absolute(1)){
                 return true;
             }
         }catch(Exception e){
             System.err.println("Error "+e);
         }
         finally{
             try{
                 if(cn!=null){
                 cn.close();
                }
                 if(ps!=null){
                     ps.close();
                 }
                 if(rs!=null){
                     rs.close();
                 }
             }catch(Exception e){
                 
             }
             
         }
         return false;
     }
     
     public static void main(String[] args) {
         
         EmpleadoDAO objDAO = new EmpleadoDAO();
         System.out.println(objDAO.autentificacion("Rosa", "12345678"));
    }
     
     
}

    
