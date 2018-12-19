package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Prestamo;
import java.util.ArrayList;
import beans.Libro;

public final class FrmRegistrarPrestamo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;
    String titulo,editorial,id_autor,id_genero,fecha,status,idioma,area,stock;
    Libro objLibro = null;


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


    objPres = (Prestamo) request.getAttribute("consulta");

    if (objPres != null) {
        id_prestamo = objPres.getId_prestamo();
        id_alumno = objPres.getId_alumno();
        id_empleado = objPres.getId_empleado();
        id_libro = objPres.getId_libro();
        fecha_prestamo = objPres.getFecha_prestamo();
        fecha_devolucion = objPres.getFecha_devolucion();
        fecha_devuelto = objPres.getFecha_devuelto();
        

    }
    

       objLibro = (Libro) request.getAttribute("consultaMantenimiento");

    if (objLibro != null) {
        id_libro = objLibro.getId_libro();
        titulo = objLibro.getTitulo();
        editorial = objLibro.getEditorial();
        id_autor = objLibro.getAutor();
        id_genero = objLibro.getGenero();
        fecha = objLibro.getFecha();
        status = objLibro.getStatus();
        idioma = objLibro.getIdioma();
        area = objLibro.getArea();
        stock = objLibro.getStock();

    }












      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloRegistroAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Registrar Alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("    background-color: white;\">\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("            <form method=\"get\" action=\"ServletPrestamo\" name=\"for01\">\n");
      out.write("                <center>\n");
      out.write("                    \n");
      out.write("                         <table id=\"primerTable\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"general\"><h1>Registrar Prestamo</h1></div>\n");
      out.write("                    \n");
      out.write("                <table>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                                                   <tr> \n");
      out.write("                                            <td> Alumno </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal1\"  class=\"boton\" onchange=\"this.form['txtAlumno'].value=this.value\">\n");
      out.write("                <option value=\"0\">Seleccione Alumno..</option>\n");
      out.write("                 <option value=\"1\">Christian, Nemenza</option>\n");
      out.write("                 <option  value=\"2\">Carlos, Alcanatara</option>\n");
      out.write("                 <option  value=\"3\">Diego, Cabrera</option>\n");
      out.write("                 <option  value=\"4\">Sergio, Coronado</option>\n");
      out.write("                 <option  value=\"5\">Aldair, Solorzano</option>\n");
      out.write("                 <option  value=\"6\">Carlos, Cardenas </option>\n");
      out.write("\n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  <td> <input  type=\"submit\" class=\"botonesC\" name=\"btnConsultarAlumno\" value=\"Consultar\"> </td></tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                                                            <tr> \n");
      out.write("                                            <td> Empleado </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal1\"  class=\"boton\" onchange=\"this.form['txtEmpleado'].value=this.value\">\n");
      out.write("                <option value=\"0\">Seleccione Empleado..</option>\n");
      out.write("                 <option value=\"1\">Rosa, Angeles</option>\n");
      out.write("                 <option  value=\"2\">Paolo, Guerrero</option>\n");
      out.write("                 <option  value=\"3\">Christian, Nemenza</option>\n");
      out.write("                 <option  value=\"4\">Juan, Quispe</option>\n");
      out.write("                 <option  value=\"5\">Carlos, Enrique</option>\n");
      out.write("                 <option  value=\"6\">Luis, Perez </option>\n");
      out.write("\n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                                                                   <tr> \n");
      out.write("                                            <td> Libro </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal1\"  class=\"boton\" onchange=\"this.form['txtLibro'].value=this.value\">\n");
      out.write("                <option value=\"0\">Seleccione Libro..</option>\n");
      out.write("                 <option value=\"1\">Harry Potter y el cáliz de fuego</option>\n");
      out.write("                 <option  value=\"2\">La ciudad y los perros</option>\n");
      out.write("                 <option  value=\"3\">El cuervo</option>\n");
      out.write("                 <option  value=\"4\">it</option>\n");
      out.write("                 <option  value=\"5\">El resplandor</option>\n");
      out.write("                 <option  value=\"6\">La danza de la muerte </option>\n");
      out.write("                 <option  value=\"7\">Carrie </option>\n");
      out.write("                 <option  value=\"8\">Misery</option>\n");
      out.write("                 <option  value=\"9\">La niebla</option>\n");
      out.write("                 <option  value=\"10\">El misterio de Salem's Lot</option>\n");
      out.write("\n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("  \n");
      out.write("                    <div><table> <tr><td> <input  class=\"botones\" type=\"submit\" name=\"btnRegistrar\" value=\"Registrar\" id=\"btnRegistrar\"> </td></tr</table></div>\n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                                  <td><input type=\"text\" name=\"txtAlumno\" ");
 if (objPres != null) {
      out.write(" value=\"");
      out.print(id_alumno);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"display:none; \"> </td>\n");
      out.write("                                  <td><input type=\"text\" name=\"txtEmpleado\" ");
 if (objPres != null) {
      out.write(" value=\"");
      out.print(id_empleado);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"display:none; \"> </td>\n");
      out.write("                                  <td><input type=\"text\" name=\"txtLibro\" ");
 if (objPres != null) {
      out.write(" value=\"");
      out.print(id_libro);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"display:none; \"> </td>\n");
      out.write("                </center>\n");
      out.write("               \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                    <script src=\"js/validarAlumnoRegistro.js\"></script>\n");
      out.write("    </body>\n");
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
