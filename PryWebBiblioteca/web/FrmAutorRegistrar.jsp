<%-- 
    Document   : FrmAutorRegistrar
    Created on : 17/05/2018, 02:42:46 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Autor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_autor,nom_autor,ape_autor,nacion_autor,nacimiento;
    Autor objAut = null;
%>

<%

    objAut = (Autor) request.getAttribute("consulta");

    if (objAut != null) {
        nom_autor = objAut.getNom_autor();
        ape_autor = objAut.getApe_autor();
        nacion_autor = objAut.getNacion_autor();
        nacimiento = objAut.getNacimiento();


        

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
            <form method="get" action="ServletAutor" name="for01">
                <center>
                    <div id="general"><h1>Registrar Autor</h1></div>
                    
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" <% if (objAut != null) {%> value="<%=nom_autor %>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido</td>
                        <td><input type="text" name="txtApellido" <% if (objAut != null) {%> value="<%=ape_autor %>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>Pais</td>
                        <td><input type="text" name="txtNacion" <% if (objAut != null) {%> value="<%=nacion_autor %>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Año Nac.</td>
                        <td><input type="text" name="txtNacimiento" <% if (objAut != null) {%> value="<%=nacimiento %>"<%}%> maxlength="30"> </td>
                    </tr> 
                 
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar"> </td></tr</table></div>
                 
                </table>
                </center>
                  

            </form>
        </div>
    </body>
</html>
