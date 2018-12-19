/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import beans.Autor;
import beans.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AutorDAO;


/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletAutor", urlPatterns = {"/ServletAutor"})
public class ServletAutor extends HttpServlet {
    AutorDAO objDAO = new AutorDAO();
    Autor objAut = null;

    String id_autor ,ape_autor , nom_autor , nacion_autor , nacimiento ;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("btnConsultarBusqueda") != null) {
                id_autor = request.getParameter("txtCod");
                objAut = objDAO.getAutor(id_autor);

                if (objAut != null) {
                    request.setAttribute("consultaBusqueda", objAut);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmAutorBusqueda.jsp");
                    rdC.forward(request, response);
                } 
                else{
                    response.sendRedirect("FrmAutorBusqueda.jsp");
                }
             }else if (request.getParameter("btnReporte")!=null) {
               ArrayList<Autor> listaAut = objDAO.getAutores();
                if (listaAut!= null) {
                    request.setAttribute("listaAutores", listaAut);
                    request.getRequestDispatcher("FrmAutorBusqueda.jsp").forward(request, response);
                }
            }else if (request.getParameter("btnConsultarMantenimiento")!= null) {
                id_autor = request.getParameter("txtCod");
                objAut = objDAO.getAutor(id_autor);
                
                if (objAut != null) {
                    request.setAttribute("consultaMantenimiento", objAut);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmAutorMantenimiento.jsp");
                    rdC.forward(request, response);
                } else{
                    response.sendRedirect("FrmAutorMantenimiento.jsp");
                }
                
            }else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objAut.setId_autor(request.getParameter("txtCod"));
                objDAO.modificarAutor(objAut);
                request.getRequestDispatcher("FrmAutorMantenimiento.jsp").forward(request, response);  
                
            }else if (request.getParameter("btnEliminar") != null) {
                id_autor= request.getParameter("txtCod");
                objDAO.eliminarAutor(id_autor);
                request.getRequestDispatcher("FrmAutorMantenimiento.jsp").forward(request, response);
            }else if (request.getParameter("btnRegistrar")!= null) {
                
                capturarDatos(request);
                objDAO.registrarAutor(objAut);
                request.getRequestDispatcher("FrmAutorRegistrar.jsp").forward(request, response);            

            }
          
        }
    }
    public void capturarDatos(HttpServletRequest r){
        id_autor = r.getParameter("txtCod");
        nom_autor = r.getParameter("txtNombre");
        ape_autor = r.getParameter("txtApellido");
        nacion_autor = r.getParameter("txtNacion");
        nacimiento = r.getParameter("txtNacimiento");

        // 1° FORMA
        objAut = new Autor();
        
        objAut.setId_autor(id_autor);
        objAut.setNom_autor(nom_autor);
        objAut.setApe_autor(ape_autor);
        objAut.setNacion_autor(nacion_autor);
        objAut.setNacimiento(nacimiento);


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
