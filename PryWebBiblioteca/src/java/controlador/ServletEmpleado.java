/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Alumno;
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
import modelo.EmpleadoDAO;

/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado"})
public class ServletEmpleado extends HttpServlet {
    
        EmpleadoDAO objDAO = new EmpleadoDAO();
    Empleado objEmp = null;

    String id_empleado, nom_empleado, ape_empleado, dni_empelado, fechaing_empleado, status_empleado;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("btnConsultarBusqueda") != null) {
                id_empleado = request.getParameter("txtCod");
                objEmp = objDAO.getEmpleado(id_empleado);

                if (objEmp != null) {
                    request.setAttribute("consultaBusqueda", objEmp);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmEmpleadoBusqueda.jsp");
                    rdC.forward(request, response);
                } else{
                    response.sendRedirect("FrmEmpleadoBusqueda.jsp");
                }
             }else if (request.getParameter("btnReporte")!=null) {
               ArrayList<Empleado> listaEmp = objDAO.getEmpleados();
                if (listaEmp!= null) {
                    request.setAttribute("listaEmpleados", listaEmp);
                    request.getRequestDispatcher("FrmEmpleadoBusqueda.jsp").forward(request, response);
                }
            }else if (request.getParameter("btnConsultarMantenimiento")!= null) {
                id_empleado = request.getParameter("txtCod");
                objEmp = objDAO.getEmpleado(id_empleado);
                
                if (objEmp != null) {
                    request.setAttribute("consultaMantenimiento", objEmp);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmEmpleadoMantenimiento.jsp");
                    rdC.forward(request, response);
                }else{
                    response.sendRedirect("FrmEmpleadoMantenimiento.jsp");
                }
                
            }else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objEmp.setId_empleado(request.getParameter("txtCod"));
                objDAO.modificarEmpleado(objEmp);
                request.getRequestDispatcher("FrmEmpleadoMantenimiento.jsp").forward(request, response);  
                
            }else if (request.getParameter("btnEliminar") != null) {
                id_empleado= request.getParameter("txtCod");
                objDAO.eliminarEmpleado(id_empleado);
                request.getRequestDispatcher("FrmEmpleadoMantenimiento.jsp").forward(request, response);
            }else if (request.getParameter("btnRegistrar")!= null) {
                
                capturarDatos(request);
                objDAO.registrarEmpleado(objEmp);
                request.getRequestDispatcher("FrmEmpleadoRegistrar.jsp").forward(request, response);            

            }
   
        }
    }
    public void capturarDatos(HttpServletRequest r){
        id_empleado = r.getParameter("txtCod");
        nom_empleado = r.getParameter("txtNombre");
        ape_empleado = r.getParameter("txtApellido");
        dni_empelado = r.getParameter("txtdni");
        fechaing_empleado = r.getParameter("txtFechaIngreso");
        status_empleado = r.getParameter("txtStatus");


        // 1° FORMA
        objEmp = new Empleado();
        
        objEmp.setId_empleado(id_empleado);
        objEmp.setNom_empleado(nom_empleado);
        objEmp.setApe_empleado(ape_empleado);
        objEmp.setDni_empleado(dni_empelado);
        objEmp.setFechaing_empleado(fechaing_empleado);
        objEmp.setStatus_empleado(status_empleado);

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
