package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import beans.Libro;

public final class FrmLibroRegistrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id_libro,titulo,editorial,id_autor,id_genero,fecha,status,idioma,area,stock;
    Libro objLibro = null;

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


    objLibro = (Libro) request.getAttribute("consulta");

    if (objLibro != null) {
 
         id_libro = objLibro.getId_libro();
        titulo = objLibro.getTitulo();
        editorial = objLibro.getEditorial();
        id_autor = objLibro.getAutor();
        id_genero = objLibro.getGenero();
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
      out.write("        <title>Registrar Libro</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\n");
      out.write("    background-color: white;\">\n");
      out.write("        <div id=\"CuadroConsulta\">\n");
      out.write("            <form method=\"get\" action=\"ServletLibro\" name=\"for01\">\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"general\"><h1>Registrar Libro</h1></div>\n");
      out.write("                    \n");
      out.write("                <table>\n");
      out.write("                   <tr>\n");
      out.write("                        <td>Titulo : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtTitulo\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(titulo);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                        <td>Editorial : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtEditorial\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(editorial);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr> \n");
      out.write("                                            <tr> \n");
      out.write("                                            <td> Autor </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal1\"  class=\"boton\" onchange=\"this.form['txtAutor'].value=this.value\">\n");
      out.write("                <option value=\"0\">Seleccione Autor..</option>\n");
      out.write("                 <option value=\"1\">Joanne, Rowling</option>\n");
      out.write("                 <option  value=\"2\">Gabriel, Garcia Marquez</option>\n");
      out.write("                 <option  value=\"3\">Mario, Vargas Llosa</option>\n");
      out.write("                 <option  value=\"4\">Stephen, King</option>\n");
      out.write("                 <option  value=\"5\">Edgar, Allan Poe</option>\n");
      out.write("                 <option  value=\"6\">Julio, Cortazar </option>\n");
      out.write("                 <option  value=\"7\">Cesar, Vallejo </option>\n");
      out.write("          \n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("   \n");
      out.write("                                        <tr> \n");
      out.write("                                            <td> Genero </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal2\"  class=\"boton\" onchange=\"this.form['txtGenero'].value=this.value\">\n");
      out.write("                 <option value=\"0\">Seleccione Genero..</option>\n");
      out.write("                 <option value=\"1\">Novela</option>\n");
      out.write("                 <option  value=\"2\">Cuento</option>\n");
      out.write("                 <option  value=\"3\">Ensayo</option>\n");
      out.write("                 <option  value=\"4\">Drama </option>\n");
      out.write("                 <option  value=\"5\">Leyenda</option>\n");
      out.write("                 <option  value=\"6\">Magico </option>\n");
      out.write("                 \n");
      out.write("          \n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                                            <tr> \n");
      out.write("                                            <td> Estatus </td>\n");
      out.write("                    <td> \n");
      out.write("   \n");
      out.write("                        <select name=\"cal3\"  class=\"boton\" onchange=\"this.form['txtStatus'].value=this.value\">\n");
      out.write("                 <option value=\"0\">Seleccione Estatus..</option>\n");
      out.write("                 <option value=\"A\">Activo</option>\n");
      out.write("                 <option value=\"I\">Inactivo</option>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("          \n");
      out.write("        </select> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Idioma : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtIdioma\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(idioma);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Area : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtArea\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(area);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Stock : </td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtStock\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(stock);
      out.write('"');
}
      out.write(" maxlength=\"30\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                    \n");
      out.write("                    <div><table> <tr><td> <input  class=\"botones\" type=\"submit\" name=\"btnRegistrar\" value=\"Registrar\"> </td></tr</table></div>\n");
      out.write("                     <td><input type=\"text\" name=\"txtAutor\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(id_autor);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\" \"> </td>\n");
      out.write("\n");
      out.write("                             <td><input type=\"text\" name=\"txtGenero\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(id_genero);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\" \"> </td>\n");
      out.write("\n");
      out.write("                             <td><input type=\"text\" name=\"txtStatus\" ");
 if (objLibro != null) {
      out.write(" value=\"");
      out.print(status);
      out.write('"');
}
      out.write(" maxlength=\"30\" style=\" \"> </td>\n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                              \n");
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
