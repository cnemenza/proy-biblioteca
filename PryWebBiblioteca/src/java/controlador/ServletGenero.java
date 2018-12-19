/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Genero;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GeneroDAO;

/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletGenero", urlPatterns = {"/ServletGenero"})
public class ServletGenero extends HttpServlet {

    GeneroDAO objDAO = new GeneroDAO();
    Genero objGen = null;

    String id_genero, nom_genero;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("btnConsultarBusqueda") != null) {
                id_genero = request.getParameter("txtCod");
                objGen = objDAO.getGenero(id_genero);

                if (objGen != null) {
                    request.setAttribute("consultaBusqueda", objGen);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmGeneroBusqueda.jsp");
                    rdC.forward(request, response);
                }
                else{
                    response.sendRedirect("FrmGeneroBusqueda.jsp");
                }
            } else if (request.getParameter("btnReporte") != null) {
                ArrayList<Genero> listaGen = objDAO.getGeneros();
                if (listaGen != null) {
                    request.setAttribute("listaGeneros", listaGen);
                    request.getRequestDispatcher("FrmGeneroBusqueda.jsp").forward(request, response);
                }
            } else if (request.getParameter("btnConsultarMantenimiento") != null) {
                id_genero = request.getParameter("txtCod");
                objGen = objDAO.getGenero(id_genero);

                if (objGen != null) {
                    request.setAttribute("consultaMantenimiento", objGen);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmGeneroMantenimiento.jsp");
                    rdC.forward(request, response);
                }

            } else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objGen.setId_genero(request.getParameter("txtCod"));
                objDAO.modificarGenero(objGen);
                request.getRequestDispatcher("FrmGeneroMantenimiento.jsp").forward(request, response);

            } else if (request.getParameter("btnEliminar") != null) {
                id_genero = request.getParameter("txtCod");
                objDAO.eliminarGenero(id_genero);
                request.getRequestDispatcher("FrmGeneroMantenimiento.jsp").forward(request, response);
            } else if (request.getParameter("btnRegistrar") != null) {

                capturarDatos(request);
                objDAO.registrarGenero(objGen);
                request.getRequestDispatcher("FrmGeneroRegistrar.jsp").forward(request, response);

            }
        }
    }

    public void capturarDatos(HttpServletRequest r) {
        id_genero = r.getParameter("txtCod");
        nom_genero = r.getParameter("txtNombre");

        // 1° FORMA
        objGen = new Genero();

        objGen.setId_genero(id_genero);
        objGen.setNom_genero(nom_genero);

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
