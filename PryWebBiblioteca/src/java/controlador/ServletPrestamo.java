/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Alumno;
import beans.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;

/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletPrestamo", urlPatterns = {"/ServletPrestamo"})
public class ServletPrestamo extends HttpServlet {
    
    PrestamoDAO objDAO = new PrestamoDAO();
    Prestamo objPres = null;
    
    LibroDAO objLibroDAO = new LibroDAO();
    Libro objLibro = null;
    
    
    EmpleadoDAO objEmpDAO = new EmpleadoDAO();
    Empleado objEmp = null;
    
    AlumnoDAO objAlumDAO = new AlumnoDAO();
    Alumno objAlum = null;
    
    

    String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            if (request.getParameter("btnRegistrar")!= null) {
               capturarDatos(request); 
                    objDAO.registrarPrestamo(objPres);
                request.getRequestDispatcher("FrmListarPrestamos.jsp").forward(request, response);   
            }else  if (request.getParameter("btnConsultarBusqueda") != null) {
                id_prestamo = request.getParameter("txtCod");
                objPres = objDAO.getPrestamo(id_prestamo);

                if (objPres != null) {
                    request.setAttribute("consultaBusqueda", objPres);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmListarPrestamos.jsp");
                    rdC.forward(request, response);
                } else{
                    response.sendRedirect("FrmListarPrestamos.jsp");
                }
             
           
        }else if (request.getParameter("btnReporte")!=null) {
               ArrayList<Prestamo> listPres = objDAO.getPrestamos();
                if (listPres!= null) {
                    request.setAttribute("listaAlumnos", listPres);
                    request.getRequestDispatcher("FrmListarPrestamos.jsp").forward(request, response);
                }
            }
            else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objPres.setId_alumno(request.getParameter("txtCod"));
                objDAO.registrarDevolucion(objPres);
                request.getRequestDispatcher("FrmListarPrestamos.jsp").forward(request, response);  
                
            }else if (request.getParameter("btnConsultarMantenimiento")!= null) {
                id_prestamo = request.getParameter("txtCod");
                objPres = objDAO.getPrestamo(id_prestamo);
                
                if (objPres != null) {
                    request.setAttribute("consultaMantenimiento", objPres);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmRegistrarDevolucion.jsp");
                    rdC.forward(request, response);
                }else{
                    response.sendRedirect("FrmRegistrarDevolucion.jsp");
                }
                
            }
        }
    }
    public void capturarDatos(HttpServletRequest r){
        id_prestamo = r.getParameter("txtCod");
        id_alumno = r.getParameter("txtAlumno");
        id_empleado = r.getParameter("txtEmpleado");
        id_libro = r.getParameter("txtLibro");
        fecha_prestamo = r.getParameter("txtFechaPrestamo");
        fecha_devolucion = r.getParameter("txtFechaDevolucion");
        fecha_devuelto = r.getParameter("txtFechaDevuelto");

        // 1° FORMA
        objPres = new Prestamo();
        
        objPres.setId_prestamo(id_prestamo);
        objPres.setId_alumno(id_alumno);
        objPres.setId_empleado(id_empleado);
        objPres.setId_libro(id_libro);
        objPres.setFecha_prestamo(fecha_prestamo);
        objPres.setFecha_devolucion(fecha_devolucion);
        objPres.setFecha_devuelto(fecha_devuelto);
      
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
