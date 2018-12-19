<%-- 
    Document   : FrmGeneroMantenimiento
    Created on : 18/05/2018, 08:56:00 AM
    Author     : Alumno-CT
--%>

<%@page import="beans.Genero"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_genero,nom_genero;
    Genero objGen = null;
%>

<%

    objGen = (Genero) request.getAttribute("consultaMantenimiento");

    if (objGen != null) {
        id_genero = objGen.getId_genero();
        nom_genero = objGen.getNom_genero();


    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloMantenimientoAlumno.css" media="screen"/>
        <title>Busqueda de Genero</title>
    </head>
    <body>
        <div id="CuadroConsulta">
            <form method="get" action="ServletGenero" name="for01">

                <center>
                    <h1>Mantenimiento de Generos</h1>
                <table id="primerTable">
                    <tr>
                        <td>Codigo :</td>
                        <td><input type="number" min="1" step="1" name="txtCod" <% if (objGen != null) {%> value="<%=id_genero%>"<%}%> maxlength="30"> </td>
                    
                    <td> <input  type="submit" class="botonesC" name="btnConsultarMantenimiento" value="Consultar"> </td></tr>
                </table>
                    
                <table id="segundoTable">
                    <tr>
                        <td>Nombre : </td>
                        <td><input type="text" name="txtNombre" <% if (objGen != null) {%> value="<%=nom_genero%>"<%}%> maxlength="30"> </td>
                    </tr>
                        
                    
                            <td> <input  class="botones" type="submit" name="btnModificar" value="Modificar"> </td>
                            <td> <input class="botones"  type="submit" name="btnEliminar" value="Eliminar"> </td>
                     
                        </div>
                 
                </table>
                    </center>

            </form>
        </div>
    </body>
</html>
