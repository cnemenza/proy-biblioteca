
 
package modelo;
import beans.Alumno;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.ConexionBD;


public class AlumnoDAO {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cst;
    
    
    
     public void registrarAlumno(Alumno a){
       try{
          cn=ConexionBD.getConexion();
          cst =cn.prepareCall("{CALL Insertar_Alumno(?,?,?,?,?,?,?)}");
          cst.setString(1, a.getNom_alum());
          cst.setString(2, a.getApe_alum());
          cst.setString(3, a.getDir_alum());
          cst.setString(4, a.getCarrera_alum());
          cst.setString(5, a.getEdad_alum());
          cst.setString(6, a.getCel_alum());
          cst.setString(7, a.getDni_alum());
          cst.execute();
       }catch(Exception e){    
       }             
   }
   
    public void modificarAlumno(Alumno objA) {
		try {
		cn = ConexionBD.getConexion();
                cst =cn.prepareCall("{CALL Actualizar_Alumno(?,?,?,?,?,?,?,?)}");
      //ps= cn.prepareStatement("Update talumno set nom_alum=?,ape_alum=?,dir_alum=?,carrera_alum=?,edad_alum=?,cel_alum=?,dni_alum=? where id_alumno=?");
                        cst.setString(2, objA.getNom_alum());		
                        cst.setString(3, objA.getApe_alum());						
			cst.setString(4, objA.getDir_alum());
			cst.setString(5, objA.getCarrera_alum());
                        cst.setString(6, objA.getEdad_alum());
                        cst.setString(7, objA.getCel_alum());
                        cst.setString(8, objA.getDni_alum());
                        cst.setString(1, objA.getId_alumno());
                        cst.executeUpdate();
			cn.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
    

    
       public  void   eliminarAlumno(String id_alumno){
    try {
      cn = ConexionBD.getConexion();
      cst =cn.prepareCall("{CALL Eliminar_Alumno(?)}");
      //ps= cn.prepareStatement("Delete  from talumno where id_alumno=?");
      cst.setString(1, id_alumno);
      cst.execute();        
        cst.close();
        cn.close();
    } catch (Exception e) {
        
       e.printStackTrace();
       
    }
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
       
     public ArrayList<Alumno> getAlumnos(){
        ArrayList<Alumno> listaAlum=new ArrayList<>();
        try {
            cn=ConexionBD.getConexion();
            cst = cn.prepareCall("{CALL Listar_Alumno()}");
              rs=cst.executeQuery();
              while(rs.next()){
                  
                  listaAlum.add(new Alumno(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
              }
              
        } catch (Exception e) {
        }
        return listaAlum;
    }
         
}

    

  
