package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Alumno;

public final class FrmAlumnoBusqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_Alumno, nombre, apellido, direccion, carrera, edad, cel, dni;
    Alumno objAlum = null;

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
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');


    objAlum = (Alumno) request.getAttribute("consultaBusqueda");

    if (objAlum != null) {
        id_Alumno = objAlum.getId_alumno();
        nombre = objAlum.getNom_alum();
        apellido = objAlum.getApe_alum();
        direccion = objAlum.getDir_alum();
        carrera = objAlum.getCarrera_alum();
        edad = objAlum.getEdad_alum();
        cel = objAlum.getCel_alum();
        dni = objAlum.getDni_alum();

    }
      out.write('\n');
      out.write('\n');

    ArrayList<Alumno> listaAlum = null;
    if (request.getAttribute("listaAlumnos") != null) {
        listaAlum = (ArrayList<Alumno>) request.getAttribute("listaAlumnos");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletAlumno\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Alumno</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <select name=\"tipoBusqueda\"><option selected>Codigo</option><option>Apellido</option></select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"number\" name=\"txtCod\" id=\"txtCod\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(id_Alumno);
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
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de estudiantes\"></td>\n");
      out.write("                </div></div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"primColum\">");
out.println("Codigo");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Nombre");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Apellido");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Direccion");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Carrera");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Edad");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Celular");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("DNI");
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objAlum != null) {
      out.write("\n");
      out.write("                <td>");
out.println(id_Alumno);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nombre);
      out.write("</td>\n");
      out.write("                <td>");
out.println(apellido);
      out.write("</td>\n");
      out.write("                <td>");
out.println(direccion);
      out.write("</td>\n");
      out.write("                <td>");
out.println(carrera);
      out.write("</td>\n");
      out.write("                <td>");
out.println(edad);
      out.write("</td>\n");
      out.write("                <td>");
out.println(cel);
      out.write("</td>\n");
      out.write("                <td>");
out.println(dni);
      out.write("</td>\n");
      out.write("                ");
}
                            if (listaAlum != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Alumno objE : listaAlum) {

                        id_Alumno = objE.getId_alumno();
                        nombre = objE.getNom_alum();
                        apellido = objE.getApe_alum();
                        direccion = objE.getDir_alum();
                        carrera = objE.getCarrera_alum();
                        edad = objE.getEdad_alum();
                        cel = objE.getCel_alum();
                        dni = objE.getDni_alum();

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_Alumno);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nombre);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(apellido);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(direccion);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(carrera);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(edad);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(cel);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(dni);
      out.write(" </td>\n");
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
