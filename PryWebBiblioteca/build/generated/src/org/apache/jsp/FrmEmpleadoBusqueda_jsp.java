package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Empleado;

public final class FrmEmpleadoBusqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_empleado, nom_empleado, ape_empleado, dni_empelado, fechaing_empleado, status_empleado;
    Empleado objEmp = null;

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


    objEmp = (Empleado) request.getAttribute("consultaBusqueda");

    if (objEmp != null) {
        id_empleado = objEmp.getId_empleado();
        nom_empleado = objEmp.getNom_empleado();
        ape_empleado = objEmp.getApe_empleado();
        dni_empelado = objEmp.getDni_empleado();
        fechaing_empleado = objEmp.getFechaing_empleado();
        status_empleado = objEmp.getStatus_empleado();
 

    }
      out.write('\n');
      out.write('\n');

    ArrayList<Empleado> listaEmp = null;
    if (request.getAttribute("listaEmpleados") != null) {
        listaEmp = (ArrayList<Empleado>) request.getAttribute("listaEmpleados");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletEmpleado\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Empleado</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <select name=\"tipoBusqueda\"><option selected>Codigo</option><option>Apellido</option></select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"txtCod\" id=\"txtCod\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(id_empleado);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"\n");
      out.write("                           margin-left: 15px;\n");
      out.write("                           margin-right: 15px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input class=\"botones\" type=\"submit\" id=\"btnConsultarBusqueda\" name=\"btnConsultarBusqueda\" value=\"Consultar\">\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de Empleados\"></td>\n");
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
out.println("DNI");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Fecha de Ingreso");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Status");
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objEmp != null) {
      out.write("\n");
      out.write("                <td>");
out.println(id_empleado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nom_empleado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(ape_empleado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(dni_empelado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(fechaing_empleado);
      out.write("</td>\n");
      out.write("                <td>");
out.println(status_empleado);
      out.write("</td>\n");
      out.write("\n");
      out.write("                ");
}
                            if (listaEmp != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Empleado objE : listaEmp) {

                        id_empleado = objE.getId_empleado();
                        nom_empleado = objE.getNom_empleado();
                        ape_empleado = objE.getApe_empleado();
                        dni_empelado = objE.getDni_empleado();
                        fechaing_empleado = objE.getFechaing_empleado();
                        status_empleado = objE.getStatus_empleado();
 

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_empleado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nom_empleado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(ape_empleado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(dni_empelado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(fechaing_empleado);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(status_empleado);
      out.write(" </td>\n");
      out.write("\n");
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
      out.write("            <script src=\"js/validarBusqueda.js\"></script>\n");
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
