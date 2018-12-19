/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import beans.Alumno;
import beans.Autor;
import beans.Libro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConexionBD;

/**
 *
 * @author Alumno-CT
 */
public class LibroDAO {

    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cst;


    public void registrarLibro(Libro l) {
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{CALL Insertar_Libro (?,?,?,?,?,?,?,?)}");
            cst.setString(1, l.getTitulo());
            cst.setString(2, l.getEditorial());
            cst.setString(3, l.getAutor());
            cst.setString(4, l.getGenero());
            cst.setString(5, l.getStatus());
            cst.setString(6, l.getIdioma());
            cst.setString(7, l.getArea());
            cst.setString(8, l.getStock());
            
            cst.execute();
        } catch (Exception ex) {
        }
    }

    public void modificarLibro(Libro objL) {
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{ CALL Actualizar_Libro (?,?,?,?,?,?,?,?,?,?)}");
            cst.setString(2, objL.getTitulo());
            cst.setString(3, objL.getEditorial());
            cst.setString(4, objL.getAutor());
            cst.setString(5, objL.getGenero());
            cst.setString(6, objL.getFecha());
            cst.setString(7, objL.getStatus());
            cst.setString(8, objL.getIdioma());
            cst.setString(9, objL.getArea());
            cst.setString(10, objL.getStock());
            cst.setString(1, objL.getId_libro());

            cst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarLibro(String id_libro) {
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{CALL  Eliminar_Libro(?)}");
            cst.setString(1, id_libro);
            cst.execute();
            cst.close();
            cn.close();
        } catch (Exception e) {

            e.printStackTrace();

        }
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
    

    public ArrayList<Libro> getLibros() {
        ArrayList<Libro> listaLib = new ArrayList<>();
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{CALL Listar_Libro()}");
            rs = cst.executeQuery();
            while (rs.next()) {
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

                listaLib.add(l);
            }

        } catch (Exception e) {
        }
        return listaLib;
    }
    
   /* public Libro getLibroAutor(String nom_autor) {
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select id_libro,tit_libro,edit_libro,nom_autor,nom_genero,fecha_entrada_libro,status_libro ,idioma ,area ,stock_libro from tlibro inner join tautor on tlibro.id_autor = tautor.id_autor inner join tgenero on tlibro.id_genero=tgenero.id_genero where tautor.nom_autor like '%"+nom_autor+"%'");
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
    }*/
    
    public ArrayList<Libro> getLibrosAutor(String nom_autor) {
        ArrayList<Libro> listaLib = new ArrayList<>();
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{CALL Consultar_LibroAutor(?)}");
            rs = cst.executeQuery();
            while (rs.next()) {
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

                listaLib.add(l);
            }

        } catch (Exception e) {
        }
        return listaLib;
    }
    
        public ArrayList<Libro> getLibrosTitulo(String titulo_libro) {
        ArrayList<Libro> listaLib = new ArrayList<>();
        try {
            cn = ConexionBD.getConexion();
            cst =cn.prepareCall("{CALL Consultar_LibroNombre(?)}");
            rs = cst.executeQuery();
            while (rs.next()) {
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

                listaLib.add(l);
            }

        } catch (Exception e) {
        }
        return listaLib;
    }
       
    

}
