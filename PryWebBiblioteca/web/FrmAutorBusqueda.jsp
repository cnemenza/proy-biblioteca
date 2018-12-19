<%-- 
    Document   : FrmAutorBusqueda
    Created on : 17/05/2018, 02:31:20 PM
    Author     : Alumno-CT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Autor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_autor,nom_autor,ape_autor,nacion_autor,nacimiento;
    Autor objAut = null;
%>

<%

    objAut = (Autor) request.getAttribute("consultaBusqueda");

    if (objAut != null) {
        id_autor = objAut.getId_autor();
        nom_autor = objAut.getNom_autor();
        ape_autor = objAut.getApe_autor();
        nacion_autor = objAut.getNacion_autor();
        nacimiento = objAut.getNacimiento();

    }%>

<%
    ArrayList<Autor> listaAut = null;
    if (request.getAttribute("listaAutores") != null) {
        listaAut = (ArrayList<Autor>) request.getAttribute("listaAutores");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Busqueda de Autor</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletAutor" name="for01">
                <h1>Busqueda de Autor</h1>
                <table>
                    <tr>

                    <select name="tipoBusqueda"><option selected>Codigo</option><option>Apellido</option></select>


                    <input type="text" name="txtCod" id="txtCod" <% if (objAut != null) {%> value="<%=id_autor%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">


                    <input class="botones" type="submit" name="btnConsultarBusqueda" id="btnConsultarBusqueda" value="Consultar">

                    </tr>

                </table>


                <div>
                    <td><input class="botones" type="submit" name="btnReporte" value="Ver Listado de Autores"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("Codigo");%></td>
                <td class="primColum"><%out.println("Nombre");%></td>
                <td class="primColum"><%out.println("Apellido");%></td>
                <td class="primColum"><%out.println("Pais");%></td>
                <td class="primColum"><%out.println("Año de Nac.");%></td>
                <td class="primColum"><%out.println("Libros");%></td>

            </tr>
            <tr>
                <%if (objAut != null) {%>
                <td><%out.println(id_autor);%></td>
                <td><%out.println(nom_autor);%></td>
                <td><%out.println(ape_autor);%></td>
                <td><%out.println(nacion_autor);%></td>
                <td><%out.println(nacimiento);%></td>
                <td><input type="submit" value="" width="5" name="libros" style="background:url(Libros.png);border:none;width: 100px;height: 35px;background-repeat:  no-repeat;background-size:  contain;background-position-x: 50%;" title="Libros"></td>

                <%}
                            if (listaAut != null) { %> 
                <%
                    for (Autor objE : listaAut) {

                        id_autor = objE.getId_autor();
                        nom_autor = objE.getNom_autor();
                        ape_autor = objE.getApe_autor();
                        nacion_autor = objE.getNacion_autor();
                        nacimiento = objE.getNacimiento();
                       

                %>
            <tr>
                <td><%=id_autor%> </td>
                <td><%=nom_autor%> </td>
                <td><%=ape_autor%> </td>
                <td><%=nacion_autor%> </td>
                <td><%=nacimiento%> </td>
                <td><input type="submit" value="" width="5" name="libros" style="background:url(Libros.png);border:none;width: 100px;height: 35px;background-repeat:  no-repeat;background-size:  contain;background-position-x: 50%;" title="Libros"></td>

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
