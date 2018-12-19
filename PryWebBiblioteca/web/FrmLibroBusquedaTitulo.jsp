<%-- 
    Document   : FrmLibroBusquedaTitulo
    Created on : 18/05/2018, 06:18:14 PM
    Author     : Alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_libro, titulo, editorial, autor, genero, fecha, status, idioma, area, stock;
    Libro objLib = null;
%>

<%

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

    }%>

<%
    ArrayList<Libro> listaLib = null;
    if (request.getAttribute("listaLibros") != null) {
        listaLib = (ArrayList<Libro>) request.getAttribute("listaLibros");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Busqueda de Libro por Titulo</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletLibro" name="for01">
                <h1>Busqueda de Libro por Titulo</h1>
                <table id="seleccion">
                    <tr>
                         <td><a href="FrmLibroBusquedaCodigo.jsp">Por Codigo</a></td>
                        <td><a href="FrmLibroBusquedaTitulo.jsp">Por Titulo</a></td>
                        <td><a href="FrmLibroBusquedaAutor.jsp">Por Autor</a></td>
                    </tr>
                </table>
                <table>
                    <tr>

                    <!--<select name="tipoBusqueda" onchange="this.form['valor'].value = this.value"><option value="1" selected>Codigo</option><option value="2">Autor</option><option value="3">Libro</option></select>-->


                    <input type="text" name="txtCod" id="txtCod" <% if (objLib != null) {%> value="<%=id_libro%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">

                    <input class="botones" type="submit" id="btnConsultarBusqueda" name="btnConsultarBusquedaTitulo" value="Consultar">



                    </tr>

                </table>

                <div>
                    <!-- <a href="FrmGeneroBusqueda.jsp" target="_self"> <input type="button" name="boton" value="Aceptar" /> </a> -->

                    <td><input class="botones" type="submit" name="btnReporteTitulo" value="Ver Listado de Libros"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("Codigo");%></td>
                <td class="primColum"><%out.println("Titulo");%></td>
                <td class="primColum"><%out.println("Editorial");%></td>
                <td class="primColum"><%out.println("Autor");%></td>
                <td class="primColum"><%out.println("Genero");%></td>
                <td class="primColum"><%out.println("Fecha Pub.");%></td>
                <td class="primColum"><%out.println("Status");%></td>
                <td class="primColum"><%out.println("Idioma");%></td>
                <td class="primColum"><%out.println("Area");%></td>
                <td class="primColum"><%out.println("Stock");%></td>
            </tr>
            <tr>
                <%if (objLib != null) {%>
                <td><%out.println(id_libro);%></td>
                <td><%out.println(titulo);%></td>
                <td><%out.println(editorial);%></td>
                <td><%out.println(autor);%></td>
                <td><%out.println(genero);%></td>
                <td><%out.println(fecha);%></td>
                <td><%out.println(status);%></td>
                <td><%out.println(idioma);%></td>
                <td><%out.println(area);%></td>
                <td><%out.println(stock);%></td>
                <%}
                    if (listaLib != null) { %> 
                <%
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

                %>
            <tr>
                <td><%=id_libro%> </td>
                <td><%=titulo%> </td>
                <td><%=editorial%> </td>
                <td><%=autor%> </td>
                <td><%=genero%> </td>
                <td><%=fecha%> </td>
                <td><%=status%> </td>
                <td><%=idioma%> </td>
                <td><%=area%> </td>
                <td><%=stock%> </td>

            </tr>
            <%}%>
            <%}%>





            </tr>
        </table>


    </form>
</div>
</center>
             <script src="js/validarBusqueda.js"></script>
</body>
</html>
