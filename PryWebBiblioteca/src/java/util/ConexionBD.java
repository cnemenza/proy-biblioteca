
package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static Connection getConexion(){   
    Connection cn=null;
    try{
        Class.forName("com.mysql.jdbc.Driver"); 
        String url="jdbc:mysql://localhost/dbbiblioteca";
        cn=DriverManager.getConnection(url,"root","");
        //System.out.print("Conexión con exito");
    }catch(Exception e){
        System.out.print("ERROR en la Conexión ?\n "+e.getMessage());        
    }
    return cn;
}

public static void main(String []args){
    getConexion();
}    
}

