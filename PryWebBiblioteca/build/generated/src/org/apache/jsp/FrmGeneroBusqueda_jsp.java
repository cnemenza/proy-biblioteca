package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Genero;

public final class FrmGeneroBusqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_genero,nom_genero;
    Genero objGen = null;

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


    objGen = (Genero) request.getAttribute("consultaBusqueda");

    if (objGen != null) {
        id_genero = objGen.getId_genero();
        nom_genero = objGen.getNom_genero();


    }
      out.write('\n');
      out.write('\n');

    ArrayList<Genero> listaGen = null;
    if (request.getAttribute("listaGeneros") != null) {
        listaGen = (ArrayList<Genero>) request.getAttribute("listaGeneros");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Generos</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletGenero\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Genero</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <select name=\"tipoBusqueda\"><option selected>Codigo</option><option>Apellido</option></select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"txtCod\" id=\"txtCod\" ");
 if (objGen != null) {
      out.write(" value=\"");
      out.print(id_genero);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"\n");
      out.write("                           margin-left: 15px;\n");
      out.write("                           margin-right: 15px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input class=\"botones\" id=\"btnConsultarBusqueda\" type=\"submit\" name=\"btnConsultarBusqueda\" value=\"Consultar\">\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de Generos\"></td>\n");
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
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objGen != null) {
      out.write("\n");
      out.write("                <td>");
out.println(id_genero);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nom_genero);
      out.write("</td>\n");
      out.write("\n");
      out.write("                ");
}
                            if (listaGen != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Genero objE : listaGen) {

                        id_genero = objE.getId_genero();
                        nom_genero = objE.getNom_genero();
             

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_genero);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nom_genero);
      out.write(" </td>\n");
      out.write("         \n");
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
