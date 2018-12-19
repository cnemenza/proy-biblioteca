<%-- 
    Document   : FrmGeneroRegistrar
    Created on : 18/05/2018, 08:58:49 AM
    Author     : Alumno-CT
--%>

<%@page import="beans.Genero"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_genero,nom_genero;
    Genero objGen = null;
%>

<%

    objGen = (Genero) request.getAttribute("consulta");

    if (objGen != null) {
        id_genero = objGen.getId_genero();
        nom_genero = objGen.getNom_genero();
 


        

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloRegistroAlumno.css" media="screen"/>
        <title>Registrar Autor</title>
    </head>
    <body style="
    background-color: white;">
        <div id="CuadroConsulta">
            <form method="get" action="ServletGenero" name="for01">
                <center>
                    <div id="general"><h1>Registrar Genero</h1></div>
                    
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" <% if (objGen != null) {%> value="<%=nom_genero %>"<%}%> maxlength="30"> </td>
                    </tr>
                        
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar"> </td></tr</table></div>
                 
                </table>
                </center>
               

            </form>
        </div>
    </body>
</html>