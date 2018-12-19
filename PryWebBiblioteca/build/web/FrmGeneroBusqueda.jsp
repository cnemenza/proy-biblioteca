<%-- 
    Document   : FrmGeneroBusqueda
    Created on : 18/05/2018, 08:43:49 AM
    Author     : Alumno-CT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Genero"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_genero,nom_genero;
    Genero objGen = null;
%>

<%

    objGen = (Genero) request.getAttribute("consultaBusqueda");

    if (objGen != null) {
        id_genero = objGen.getId_genero();
        nom_genero = objGen.getNom_genero();


    }%>

<%
    ArrayList<Genero> listaGen = null;
    if (request.getAttribute("listaGeneros") != null) {
        listaGen = (ArrayList<Genero>) request.getAttribute("listaGeneros");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Busqueda de Generos</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletGenero" name="for01">
                <h1>Busqueda de Genero</h1>
                <table>
                    <tr>

                    <select name="tipoBusqueda"><option selected>Codigo</option><option>Apellido</option></select>


                    <input type="text" name="txtCod" id="txtCod" <% if (objGen != null) {%> value="<%=id_genero%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">


                    <input class="botones" id="btnConsultarBusqueda" type="submit" name="btnConsultarBusqueda" value="Consultar">

                    </tr>

                </table>


                <div>
                    <td><input class="botones" type="submit" name="btnReporte" value="Ver Listado de Generos"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("Codigo");%></td>
                <td class="primColum"><%out.println("Nombre");%></td>
            </tr>
            <tr>
                <%if (objGen != null) {%>
                <td><%out.println(id_genero);%></td>
                <td><%out.println(nom_genero);%></td>

                <%}
                            if (listaGen != null) { %> 
                <%
                    for (Genero objE : listaGen) {

                        id_genero = objE.getId_genero();
                        nom_genero = objE.getNom_genero();
             

                %>
            <tr>
                <td><%=id_genero%> </td>
                <td><%=nom_genero%> </td>
         

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
