package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Autor;

public final class FrmAutorRegistrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_autor,nom_autor,ape_autor,nacion_autor,nacimiento;
    Autor objAut = null;

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


    objAut = (Autor) request.getAttribute("consulta");

    if (objAut != null) {
        nom_autor = objAut.getNom_autor();
        ape_autor = objAut.getApe_autor();
        nacion_autor = objAut.getNacion_autor();
        nacimiento = objAut.getNacimiento();


        

    }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloRegistroAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Registrar Autor</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("    background-color: white;\">\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("            <form method=\"get\" action=\"ServletAutor\" name=\"for01\">\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"general\"><h1>Registrar Autor</h1></div>\n");
      out.write("                    \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nombre</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNombre\" ");
 if (objAut != null) {
      out.write(" value=\"");
      out.print(nom_autor );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                        <td>Apellido</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtApellido\" ");
 if (objAut != null) {
      out.write(" value=\"");
      out.print(ape_autor );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr> \n");
      out.write("                        <td>Pais</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNacion\" ");
 if (objAut != null) {
      out.write(" value=\"");
      out.print(nacion_autor );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Año Nac.</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNacimiento\" ");
 if (objAut != null) {
      out.write(" value=\"");
      out.print(nacimiento );
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                 \n");
      out.write("                    <div><table> <tr><td> <input  class=\"botones\" type=\"submit\" name=\"btnRegistrar\" value=\"Registrar\"> </td></tr</table></div>\n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                </center>\n");
      out.write("                  \n");
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
