<%-- 
    Document   : FrmAutorMantenimiento
    Created on : 17/05/2018, 02:36:55 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Autor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_autor,nom_autor,ape_autor,nacion_autor,nacimiento;
    Autor objAut = null;
%>

<%

    objAut = (Autor) request.getAttribute("consultaMantenimiento");

    if (objAut != null) {
        id_autor = objAut.getId_autor();
        nom_autor = objAut.getNom_autor();
        ape_autor = objAut.getApe_autor();
        nacion_autor = objAut.getNacion_autor();
        nacimiento = objAut.getNacimiento();
       

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloMantenimientoAlumno.css" media="screen"/>
        <title>Busqueda de Alumno</title>
    </head>
    <body>
        <div id="CuadroConsulta">
            <form method="get" action="ServletAutor" name="for01">

                <center>
                    <h1>Mantenimiento de Autores</h1>
                <table id="primerTable">
                    <tr>
                        <td>Codigo :</td>
                        <td><input type="number" min="1" step="1" name="txtCod" id="txtCod" <% if (objAut != null) {%> value="<%=id_autor%>"<%}%> maxlength="30"> </td>
                    
                    <td> <input  type="submit" class="botonesC" id="btnConsultarBusqueda" name="btnConsultarMantenimiento" value="Consultar"> </td></tr>
                </table>
                    
                <table id="segundoTable">
                    <tr>
                        <td>Nombre : </td>
                        <td><input type="text" name="txtNombre" <% if (objAut != null) {%> value="<%=nom_autor%>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido : </td>
                        <td><input type="text" name="txtApellido" <% if (objAut != null) {%> value="<%=ape_autor%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>Pais : </td>
                        <td><input type="text" name="txtNacion" <% if (objAut != null) {%> value="<%=nacion_autor%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Año de Nac. : </td>
                        <td><input type="text" name="txtNacimiento" <% if (objAut != null) {%> value="<%=nacimiento%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    
                            <td> <input  class="botones" type="submit" name="btnModificar" value="Modificar"> </td>
                            <td> <input class="botones"  type="submit" name="btnEliminar" value="Eliminar"> </td>
                     
                        </div>
                 
                </table>
                    </center>

            </form>
        </div>
        <script src="js/validarBusqueda.js"></script>
    </body>
</html>
