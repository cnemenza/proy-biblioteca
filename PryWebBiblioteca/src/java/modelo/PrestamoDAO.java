/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import beans.*;
import beans.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConexionBD;

public class PrestamoDAO {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cst;
    
    public void registrarPrestamo(Prestamo p){
       try{
          cn=ConexionBD.getConexion();
          cst =cn.prepareCall("{CALL Registrar_Prestamo(?,?,?)}");
          cst.setString(1, p.getId_alumno());
          cst.setString(2, p.getId_empleado());
          cst.setString(3, p.getId_libro());
          cst.execute();
       }catch(Exception e){    
       }             
   }
    
     public void registrarDevolucion(Prestamo p){
       try{
          cn=ConexionBD.getConexion();
          cst =cn.prepareCall("{CALL Registrar_Devolucion(?)}");
          cst.setString(1, p.getId_prestamo());

          cst.execute();
       }catch(Exception e){    
       }             
   }
     
      public ArrayList<Prestamo> getPrestamos(){
        ArrayList<Prestamo> listaPrest=new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            cst = cn.prepareCall("{CALL Listar_Prestamos()}");
              rs=cst.executeQuery();
              while(rs.next()){
                  
                  listaPrest.add(new Prestamo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
              }
              
        } catch (Exception e) {
        }
        return listaPrest;
    }
      
      
      public Prestamo getPrestamo(String id_prestamo){
        try{
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("{CALL Consultar_Prestamo(?)}");            
            ps.setString(1,id_prestamo);
            rs=ps.executeQuery();            
            if(rs.next()){
                Prestamo p=new Prestamo();
                p.setId_prestamo(rs.getString(1));
                p.setId_alumno(rs.getString(2));
                p.setId_empleado(rs.getString(3));
                p.setId_libro(rs.getString(4));
                p.setFecha_prestamo(rs.getString(5));
                p.setFecha_devolucion(rs.getString(6));
                p.setFecha_devuelto(rs.getString(7));
               
                return p;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }
                              
          }catch(Exception e){   
              
        }
             return null;
    }   
      
      
          public Libro getLibro(String id_libro) {
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("{CALL Consultar_LibroID(?)}");
            ps.setString(1, id_libro);
            rs = ps.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setId_libro(rs.getString(1));
                l.setTitulo(rs.getString(2));
                l.setEditorial(rs.getString(3));
                l.setAutor(rs.getString(4));
                l.setGenero(rs.getString(5));
                l.setFecha(rs.getString(6));
                l.setStatus(rs.getString(7));
                l.setIdioma(rs.getString(8));
                l.setArea(rs.getString(9));
                l.setStock(rs.getString(10));

                return l;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (Exception ex) {
        }
        return null;
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
          
     
      
      public Alumno getAlumno(String id_alumno){
        try{
            cn=ConexionBD.getConexion();
            ps=cn.prepareStatement("{CALL Consultar_AlumnoID(?)}");            
            ps.setString(1,id_alumno);
            rs=ps.executeQuery();            
            if(rs.next()){
                Alumno a=new Alumno();
                a.setId_alumno(rs.getString(1));
                a.setNom_alum(rs.getString(2));
                a.setApe_alum(rs.getString(3));
                a.setDir_alum(rs.getString(4));
                a.setCarrera_alum(rs.getString(5));
                a.setEdad_alum(rs.getString(6));
                a.setCel_alum(rs.getString(7));
                a.setDni_alum(rs.getString(8));
                return a;
                //return new Persona(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }
                              
          }catch(Exception e){   
              
        }
             return null;
    }           
              
              
          
      
}
