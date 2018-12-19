package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

    HttpSession objSesion = request.getSession(false);
    String usuario = (String)objSesion.getAttribute("user");
    if(usuario.equals("")){
        response.sendRedirect("FrmLogin.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilosMain.css\" media=\"screen\"/>\n");
      out.write("        <title>Biblioteca</title>\n");
      out.write("    </head>\n");
      out.write("    <header>\n");
      out.write("     \n");
      out.write("        <div id = cabeza>\n");
      out.write("            <div id=\"detalle\"><h2>Bienvenido ");
 out.println(usuario); 
      out.write("</h2></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"nav\">\n");
      out.write("            <nav class=\"navegacion\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"FrmMain.jsp\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\">Busqueda</a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"FrmAlumnoBusqueda.jsp\" target=\"principal\">Alumno</a></li>\n");
      out.write("                            <li><a href=\"FrmLibroBusquedaCodigo.jsp\" target=\"principal\">Libro</a></li>\n");
      out.write("                            <li><a href=\"FrmAutorBusqueda.jsp\" target=\"principal\">Autor</a></li>\n");
      out.write("                            <li><a href=\"FrmEmpleadoBusqueda.jsp\" target=\"principal\">Empleado</a></li>\n");
      out.write("                            <li><a href=\"FrmListarPrestamos.jsp\" target=\"principal\">Prestamos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li> \n");
      out.write("                    <li><a href=\"#\">Mantenimiento</a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"FrmAlumnoMantenimiento.jsp\" target=\"principal\">Alumno</a></li>\n");
      out.write("                            <li><a href=\"FrmLibroMantenimiento.jsp\" target=\"principal\">Libro</a></li>\n");
      out.write("                            <li><a href=\"FrmAutorMantenimiento.jsp\" target=\"principal\">Autor</a></li>\n");
      out.write("                            <li><a href=\"FrmEmpleadoMantenimiento.jsp\" target=\"principal\">Empleado</a></li>\n");
      out.write("    \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Operaciones</a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"FrmAlumnoRegistrar.jsp\" target=\"principal\">Registrar Alumno</a></li>\n");
      out.write("                            <li><a href=\"FrmLibroRegistrar.jsp\" target=\"principal\">Registrar Libro</a></li>\n");
      out.write("                            <li><a href=\"FrmAutorRegistrar.jsp\" target=\"principal\">Registrar Autor</a></li>\n");
      out.write("                            <li><a href=\"FrmEmpleadoRegistrar.jsp\" target=\"principal\">Registrar Empleado</a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"FrmRegistrarPrestamo.jsp\" target=\"principal\">Registrar Prestamo</a></li>\n");
      out.write("                            <li><a href=\"FrmRegistrarDevolucion.jsp\" target=\"principal\">Registrar Devolucion</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <iframe name=\"principal\" width=\"900px\" height=\"500\" src=\"\" frameborder=\"0\" align=\"center\"></iframe>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
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
