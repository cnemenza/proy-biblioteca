package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Autor;

public final class FrmAutorBusqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');


    objAut = (Autor) request.getAttribute("consultaBusqueda");

    if (objAut != null) {
        id_autor = objAut.getId_autor();
        nom_autor = objAut.getNom_autor();
        ape_autor = objAut.getApe_autor();
        nacion_autor = objAut.getNacion_autor();
        nacimiento = objAut.getNacimiento();

    }
      out.write('\n');
      out.write('\n');

    ArrayList<Autor> listaAut = null;
    if (request.getAttribute("listaAutores") != null) {
        listaAut = (ArrayList<Autor>) request.getAttribute("listaAutores");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Autor</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletAutor\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Autor</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <select name=\"tipoBusqueda\"><option selected>Codigo</option><option>Apellido</option></select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"txtCod\" id=\"txtCod\" ");
 if (objAut != null) {
      out.write(" value=\"");
      out.print(id_autor);
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
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de Autores\"></td>\n");
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
out.println("Pais");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Año de Nac.");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Libros");
      out.write("</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objAut != null) {
      out.write("\n");
      out.write("                <td>");
out.println(id_autor);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nom_autor);
      out.write("</td>\n");
      out.write("                <td>");
out.println(ape_autor);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nacion_autor);
      out.write("</td>\n");
      out.write("                <td>");
out.println(nacimiento);
      out.write("</td>\n");
      out.write("                <td><input type=\"submit\" value=\"\" width=\"5\" name=\"libros\" style=\"background:url(Libros.png);border:none;width: 100px;height: 35px;background-repeat:  no-repeat;background-size:  contain;background-position-x: 50%;\" title=\"Libros\"></td>\n");
      out.write("\n");
      out.write("                ");
}
                            if (listaAut != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Autor objE : listaAut) {

                        id_autor = objE.getId_autor();
                        nom_autor = objE.getNom_autor();
                        ape_autor = objE.getApe_autor();
                        nacion_autor = objE.getNacion_autor();
                        nacimiento = objE.getNacimiento();
                       

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_autor);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nom_autor);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(ape_autor);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nacion_autor);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(nacimiento);
      out.write(" </td>\n");
      out.write("                <td><input type=\"submit\" value=\"\" width=\"5\" name=\"libros\" style=\"background:url(Libros.png);border:none;width: 100px;height: 35px;background-repeat:  no-repeat;background-size:  contain;background-position-x: 50%;\" title=\"Libros\"></td>\n");
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
      out.write("                <script src=\"js/validarBusqueda.js\"></script>\n");
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
