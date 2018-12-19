package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.PrestamoDAO;
import java.util.ArrayList;
import beans.Prestamo;

public final class FrmListarPrestamos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;
    Prestamo objPres = null;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');


    objPres = (Prestamo) request.getAttribute("consultaBusqueda");

    if (objPres != null) {
         id_prestamo = objPres.getId_prestamo();
        id_alumno = objPres.getId_alumno();
        id_empleado = objPres.getId_empleado();
        id_libro = objPres.getId_libro();
        fecha_prestamo = objPres.getFecha_prestamo();
        fecha_devolucion = objPres.getFecha_devolucion();
        fecha_devuelto = objPres.getFecha_devuelto();

    }
      out.write('\n');
      out.write('\n');

    ArrayList<Prestamo> listPres = null;
    if (request.getAttribute("listaAlumnos") != null) {
        listPres = (ArrayList<Prestamo>) request.getAttribute("listaAlumnos");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Lista de Prestamos</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletPrestamo\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Prestamo</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                    <input type=\"number\" name=\"txtCod\" id=\"txtCod\" ");
 if (objPres != null) {
      out.write(" value=\"");
      out.print(id_prestamo);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"\n");
      out.write("                           margin-left: 15px;\n");
      out.write("                           margin-right: 15px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input class=\"botones\" type=\"submit\" name=\"btnConsultarBusqueda\" id=\"btnConsultarBusqueda\" value=\"Consultar\">\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <!-- <a href=\"FrmGeneroBusqueda.jsp\" target=\"_self\"> <input type=\"button\" name=\"boton\" value=\"Aceptar\" /> </a> -->\n");
      out.write("\n");
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de Prestamos\"></td>\n");
      out.write("                </div></div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"primColum\">");
out.println("ID_Prestamo");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Alumno");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Empleado");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Libro");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Fecha Prestamo");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Fecha Devolucion");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Fecha Devuelto");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Mantenimiento");
      out.write("</td>\n");
      out.write("     \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objPres != null) {
      out.write("\n");
      out.write("                <td>");
out.println(id_prestamo);
      out.write("</td>\n");
      out.write("                <td>");
out.println(id_alumno);
      out.write("</td>\n");
      out.write("                <td>");
out.println(id_empleado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(id_libro);
      out.write("</td>\n");
      out.write("                <td>");
out.println(fecha_prestamo);
      out.write("</td>\n");
      out.write("                <td>");
out.println(fecha_devolucion);
      out.write("</td>\n");
      out.write("                <td>");
out.println(fecha_devuelto);
      out.write("</td>\n");
      out.write("                 <td>  <input class=\"botones\" type=\"submit\" name=\"btnRegistrarDevolucion\" id=\"btnConsultarBusqueda\" value=\"Registrar Devolucion\"></td>\n");
      out.write("               \n");
      out.write("                ");
}
                            if (listPres != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Prestamo objP : listPres) {

                        id_prestamo = objP.getId_prestamo();
                        id_alumno = objP.getId_alumno();
                        id_empleado = objP.getId_empleado();
                        id_libro = objP.getId_libro();
                        fecha_prestamo = objP.getFecha_prestamo();
                        fecha_devolucion = objP.getFecha_devolucion();
                        fecha_devuelto = objP.getFecha_devuelto();
                        
                   

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_prestamo);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(id_alumno);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(id_empleado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(id_libro);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(fecha_prestamo);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(fecha_devolucion);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(fecha_devuelto);
      out.write(" </td>\n");
      out.write("                <td>  <input class=\"botones\" type=\"submit\" name=\"btnRegistrarDevolucion\" id=\"btnConsultarBusqueda\" value=\"Registrar Devolucion\"></td>\n");
      out.write("               \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("             <script src=\"js/validarBusqueda.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
