package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Empleado;

public final class FrmEmpleadoRegistrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_empleado, nom_empleado, ape_empleado, dni_empleado, fechaing_empleado, status_empleado;
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
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');


    objEmp = (Empleado) request.getAttribute("consulta");

    if (objEmp != null) {
        nom_empleado = objEmp.getNom_empleado();
        ape_empleado = objEmp.getApe_empleado();
        dni_empleado = objEmp.getDni_empleado();
        fechaing_empleado = objEmp.getFechaing_empleado();
        status_empleado = objEmp.getStatus_empleado();

        

    }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloRegistroAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Registrar Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("    background-color: white;\">\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("            <form method=\"get\" action=\"ServletEmpleado\" name=\"for01\">\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"general\"><h1>Registrar Empleado</h1></div>\n");
      out.write("                    \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nombre</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNombre\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(nom_empleado );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                        <td>Apellido</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtApellido\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(ape_empleado );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr> \n");
      out.write("                        <td>DNI</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtdni\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(dni_empleado );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Fecha Ingreso</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtFechaIngreso\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(fechaing_empleado );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("             \n");
      out.write("                    <tr> \n");
      out.write("                                            <td> Status </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal1\"  class=\"boton\" onchange=\"this.form['txtStatus'].value=this.value\">\n");
      out.write("                <option value=\"0\">Seleccione Status</option>\n");
      out.write("                 <option value=\"A\">Activo</option>\n");
      out.write("                 <option  value=\"I\">Inactivo</option>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("   \n");
      out.write("                      </select>  \n");
      out.write("                        <td><input type=\"text\" name=\"txtStatus\" ");
 if (objEmp != null) {
      out.write(" value=\"");
      out.print(status_empleado );
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"display:none;\"> </td>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    <div><table> <tr><td> <input  class=\"botones\" type=\"submit\" name=\"btnRegistrar\" value=\"Registrar\"> </td></tr</table></div>\n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                </center>\n");
      out.write("               \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
