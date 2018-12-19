/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import beans.Libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.LibroDAO;

/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletLibro", urlPatterns = {"/ServletLibro"})
public class ServletLibro extends HttpServlet {
    
     LibroDAO objDAO = new LibroDAO();
    Libro objLib = null;

    String id_libro,titulo,editorial,autor,genero,fecha,status,idioma,area,stock;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             if (request.getParameter("btnConsultarBusqueda") != null) {
                id_libro = request.getParameter("txtCod");
                objLib = objDAO.getLibro(id_libro);

                if (objLib != null) {
                    request.setAttribute("consultaBusqueda", objLib);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmLibroBusquedaCodigo.jsp");
                    rdC.forward(request, response);
                }
                else{
                    response.sendRedirect("FrmLibroBusquedaCodigo.jsp");
                }
                
               
                
            } else if (request.getParameter("btnReporte") != null) {
                ArrayList<Libro> listaLib = objDAO.getLibros();
                if (listaLib != null) {
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaCodigo.jsp").forward(request, response);
                }
            } else if (request.getParameter("btnConsultarMantenimiento") != null) {
                id_libro = request.getParameter("txtCod");
                objLib = objDAO.getLibro(id_libro);

                if (objLib != null) {
                    request.setAttribute("consultaMantenimiento", objLib);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmLibroMantenimiento.jsp");
                    rdC.forward(request, response);
                }

            } else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objLib.setId_libro(request.getParameter("txtCod"));
                objDAO.modificarLibro(objLib);
                request.getRequestDispatcher("FrmLibroMantenimiento.jsp").forward(request, response);

            } else if (request.getParameter("btnEliminar") != null) {
                id_libro = request.getParameter("txtCod");
                objDAO.eliminarLibro(id_libro);
                request.getRequestDispatcher("FrmLibroMantenimiento.jsp").forward(request, response);
            } else if (request.getParameter("btnRegistrar") != null) {

                capturarDatos(request);
                objDAO.registrarLibro(objLib);
                request.getRequestDispatcher("FrmLibroRegistrar.jsp").forward(request, response);

            } else if(request.getParameter("btnConsultarBusquedaCodigo")!=null){
                
                 id_libro = request.getParameter("txtCod");
                objLib = objDAO.getLibro(id_libro);

                if (objLib != null) {
                    request.setAttribute("consultaBusqueda", objLib);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmLibroBusquedaCodigo.jsp");
                    rdC.forward(request, response);
                }else{
                    response.sendRedirect("FrmLibroBusquedaCodigo.jsp");
                }
                
                
            }else if(request.getParameter("btnConsultarBusquedaTitulo")!=null){
                
                 id_libro = request.getParameter("txtCod");
                ArrayList<Libro> listaLib = objDAO.getLibrosTitulo(id_libro);
                objLib = objDAO.getLibro(id_libro);
                
                if(listaLib!=null){
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaTitulo.jsp").forward(request, response);
                }
                 else{
                    response.sendRedirect("FrmLibroBusquedaTitulo.jsp");
                }
                
            }
             
             else if(request.getParameter("btnConsultarBusquedaAutor")!=null){
                
                 id_libro = request.getParameter("txtCod");
                ArrayList<Libro> listaLib = objDAO.getLibrosAutor(id_libro);
                objLib = objDAO.getLibro(id_libro);
                
                if(listaLib!=null){
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaAutor.jsp").forward(request, response);
                }
                else{
                    response.sendRedirect("FrmLibroBusquedaAutor.jsp");
                }
                
            }else if (request.getParameter("btnReporteTitulo") != null) {
                ArrayList<Libro> listaLib = objDAO.getLibros();
                if (listaLib != null) {
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaTitulo.jsp").forward(request, response);
                }
            } else if (request.getParameter("btnReporteCodigo") != null) {
                ArrayList<Libro> listaLib = objDAO.getLibros();
                if (listaLib != null) {
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaCodigo.jsp").forward(request, response);
                }
            } else if (request.getParameter("btnReporteAutor") != null) {
                ArrayList<Libro> listaLib = objDAO.getLibros();
                if (listaLib != null) {
                    request.setAttribute("listaLibros", listaLib);
                    request.getRequestDispatcher("FrmLibroBusquedaAutor.jsp").forward(request, response);
                }
            } 
            
        }
    }
    
     public void capturarDatos(HttpServletRequest r) {
        id_libro = r.getParameter("txtCod");
        titulo = r.getParameter("txtTitulo");
        editorial = r.getParameter("txtEditorial");
        autor = r.getParameter("txtAutor");
        genero = r.getParameter("txtGenero");
        //fecha = r.getParameter("txtFecha");
        status = r.getParameter("txtStatus");
        idioma = r.getParameter("txtIdioma");
        area = r.getParameter("txtArea");
        stock = r.getParameter("txtStock");

        // 1° FORMA
        objLib = new Libro();

        objLib.setId_libro(id_libro);
        objLib.setTitulo(titulo);
        objLib.setEditorial(editorial);
        objLib.setAutor(autor);
        objLib.setGenero(genero);
        //objLib.setFecha(fecha);
        objLib.setStatus(status);
        objLib.setIdioma(idioma);
        objLib.setArea(area);
        objLib.setStock(stock);

    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
