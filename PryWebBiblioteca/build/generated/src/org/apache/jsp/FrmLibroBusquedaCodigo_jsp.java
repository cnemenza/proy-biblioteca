package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Libro;

public final class FrmLibroBusquedaCodigo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_libro, titulo, editorial, autor, genero, fecha, status, idioma, area, stock;
    Libro objLib = null;

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


    objLib = (Libro) request.getAttribute("consultaBusqueda");

    if (objLib != null) {
        id_libro = objLib.getId_libro();
        titulo = objLib.getTitulo();
        editorial = objLib.getEditorial();
        autor = objLib.getAutor();
        genero = objLib.getGenero();
        fecha = objLib.getFecha();
        status = objLib.getStatus();
        idioma = objLib.getIdioma();
        area = objLib.getArea();
        stock = objLib.getStock();

    }
      out.write('\n');
      out.write('\n');

    ArrayList<Libro> listaLib = null;
    if (request.getAttribute("listaLibros") != null) {
        listaLib = (ArrayList<Libro>) request.getAttribute("listaLibros");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estiloBusquedaAlumno.css\" media=\"screen\"/>\n");
      out.write("        <title>Busqueda de Libro por Codigo</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("          background-color: white;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("\n");
      out.write("            <form method=\"get\" action=\"ServletLibro\" name=\"for01\">\n");
      out.write("                <h1>Busqueda de Libro por Codigo</h1>\n");
      out.write("                <table id=\"seleccion\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"FrmLibroBusquedaCodigo.jsp\">Por Codigo</a></td>\n");
      out.write("                        <td><a href=\"FrmLibroBusquedaTitulo.jsp\">Por Titulo</a></td>\n");
      out.write("                        <td><a href=\"FrmLibroBusquedaAutor.jsp\">Por Autor</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                    <!--<select name=\"tipoBusqueda\" onchange=\"this.form['valor'].value = this.value\"><option value=\"1\" selected>Codigo</option><option value=\"2\">Autor</option><option value=\"3\">Libro</option></select>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"txtCod\" ");
 if (objLib != null) {
      out.write(" value=\"");
      out.print(id_libro);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\"\n");
      out.write("                           margin-left: 15px;\n");
      out.write("                           margin-right: 15px;\">\n");
      out.write("\n");
      out.write("                    <input class=\"botones\" type=\"submit\" name=\"btnConsultarBusquedaCodigo\" value=\"Consultar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <!-- <a href=\"FrmGeneroBusqueda.jsp\" target=\"_self\"> <input type=\"button\" name=\"boton\" value=\"Aceptar\" /> </a> -->\n");
      out.write("\n");
      out.write("                    <td><input class=\"botones\" type=\"submit\" name=\"btnReporte\" value=\"Ver Listado de Libros\"></td>\n");
      out.write("                </div></div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");
if (objLib != null) {
      out.write("\n");
      out.write("                <td class=\"primColum\">");
out.println("Codigo");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Titulo");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Editorial");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Autor");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Genero");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Fecha Pub.");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Status");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Idioma");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Area");
      out.write("</td>\n");
      out.write("                <td class=\"primColum\">");
out.println("Stock");
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>");
out.println(id_libro);
      out.write("</td>\n");
      out.write("                <td>");
out.println(titulo);
      out.write("</td>\n");
      out.write("                <td>");
out.println(editorial);
      out.write("</td>\n");
      out.write("                <td>");
out.println(autor);
      out.write("</td>\n");
      out.write("                <td>");
out.println(genero);
      out.write("</td>\n");
      out.write("                <td>");
out.println(fecha);
      out.write("</td>\n");
      out.write("                <td>");
out.println(status);
      out.write("</td>\n");
      out.write("                <td>");
out.println(idioma);
      out.write("</td>\n");
      out.write("                <td>");
out.println(area);
      out.write("</td>\n");
      out.write("                <td>");
out.println(stock);
      out.write("</td>\n");
      out.write("                ");
}
                    if (listaLib != null) { 
      out.write(" \n");
      out.write("                ");

                    for (Libro objE : listaLib) {

                        id_libro = objE.getId_libro();
                        titulo = objE.getTitulo();
                        editorial = objE.getEditorial();
                        autor = objE.getAutor();
                        genero = objE.getGenero();
                        fecha = objE.getFecha();
                        status = objE.getStatus();
                        idioma = objE.getIdioma();
                        area = objE.getArea();
                        stock = objE.getStock();

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id_libro);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(titulo);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(editorial);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(autor);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(genero);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(fecha);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(status);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(idioma);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(area);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(stock);
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
