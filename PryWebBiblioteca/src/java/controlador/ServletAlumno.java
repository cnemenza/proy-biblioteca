/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlumnoDAO;

/**
 *
 * @author Alumno-CT
 */
@WebServlet(name = "ServletAlumno", urlPatterns = {"/ServletAlumno"})
public class ServletAlumno extends HttpServlet {

    AlumnoDAO objDAO = new AlumnoDAO();
    Alumno objAlum = null;

    String id_Alumno, nombre, apellido, direccion, carrera, edad, cel, dni;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             if (request.getParameter("btnConsultarBusqueda") != null) {
                id_Alumno = request.getParameter("txtCod");
                objAlum = objDAO.getAlumno(id_Alumno);

                if (objAlum != null) {
                    request.setAttribute("consultaBusqueda", objAlum);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmAlumnoBusqueda.jsp");
                    rdC.forward(request, response);
                } else{
                    response.sendRedirect("FrmAlumnoBusqueda.jsp");
                }
             }else if (request.getParameter("btnReporte")!=null) {
               ArrayList<Alumno> listaAlum = objDAO.getAlumnos();
                if (listaAlum!= null) {
                    request.setAttribute("listaAlumnos", listaAlum);
                    request.getRequestDispatcher("FrmAlumnoBusqueda.jsp").forward(request, response);
                }
            }else if (request.getParameter("btnConsultarMantenimiento")!= null) {
                id_Alumno = request.getParameter("txtCod");
                objAlum = objDAO.getAlumno(id_Alumno);
                
                if (objAlum != null) {
                    request.setAttribute("consultaMantenimiento", objAlum);
                    RequestDispatcher rdC = request.getRequestDispatcher("FrmAlumnoMantenimiento.jsp");
                    rdC.forward(request, response);
                }else{
                    response.sendRedirect("FrmAlumnoMantenimiento.jsp");
                }
                
            }else if (request.getParameter("btnModificar") != null) {
                capturarDatos(request);
                objAlum.setId_alumno(request.getParameter("txtCod"));
                objDAO.modificarAlumno(objAlum);
                request.getRequestDispatcher("FrmAlumnoMantenimiento.jsp").forward(request, response);  
                
            }else if (request.getParameter("btnEliminar") != null) {
                id_Alumno= request.getParameter("txtCod");
                objDAO.eliminarAlumno(id_Alumno);
                request.getRequestDispatcher("FrmAlumnoMantenimiento.jsp").forward(request, response);
            }else if (request.getParameter("btnRegistrar")!= null) {
                
                capturarDatos(request);
               
                    objDAO.registrarAlumno(objAlum);
                request.getRequestDispatcher("FrmAlumnoRegistrar.jsp").forward(request, response);   
                
                         

            }
        }
    }
    public void capturarDatos(HttpServletRequest r){
        id_Alumno = r.getParameter("txtCod");
        nombre = r.getParameter("txtNombre");
        apellido = r.getParameter("txtApellido");
        direccion = r.getParameter("txtDireccion");
        carrera = r.getParameter("txtCarrera");
        edad = r.getParameter("txtEdad");
        cel = r.getParameter("txtCelular");
        dni = r.getParameter("txtdni");

        // 1° FORMA
        objAlum = new Alumno();
        
        objAlum.setId_alumno(id_Alumno);
        objAlum.setNom_alum(nombre);
        objAlum.setApe_alum(apellido);
        objAlum.setDir_alum(direccion);
        objAlum.setCarrera_alum(carrera);
        objAlum.setEdad_alum(edad);
        objAlum.setCel_alum(cel);
        objAlum.setDni_alum(dni);
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
