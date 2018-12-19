package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Alumno;

public final class FrmAlumnoMantenimiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');


    objAlum = (Alumno) request.getAttribute("consultaMantenimiento");

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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloMantenimientoAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("            <form method=\"get\" action=\"ServletAlumno\" name=\"for01\">\n");
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <h1>Mantenimiento de Alumnos</h1>\n");
      out.write("                <table id=\"primerTable\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Codigo :</td>\n");
      out.write("                        <td><input type=\"number\" min=\"1\" step=\"1\" name=\"txtCod\" id=\"txtCod\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(id_Alumno);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    \n");
      out.write("                    <td> <input  type=\"submit\" class=\"botonesC\" name=\"btnConsultarMantenimiento\" id=\"btnConsultarBusqueda\" value=\"Consultar\"> </td></tr>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("                <table id=\"segundoTable\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nombre : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNombre\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(nombre);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                        <td>Apellido : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtApellido\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(apellido);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr> \n");
      out.write("                        <td>Direccion : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtDireccion\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(direccion);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Carrera : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtCarrera\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(carrera);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Edad : </td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtEdad\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(edad);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Celular : </td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtCelular\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(cel);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>DNI : </td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtdni\" ");
 if (objAlum != null) {
      out.write(" value=\"");
      out.print(dni);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                            <td> <input  class=\"botones\" type=\"submit\" name=\"btnModificar\" value=\"Modificar\"> </td>\n");
      out.write("                            <td> <input class=\"botones\"  type=\"submit\" name=\"btnEliminar\" value=\"Eliminar\"> </td>\n");
      out.write("                     \n");
      out.write("                        </div>\n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                    </center>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/validarBusqueda.js\"></script>\n");
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
