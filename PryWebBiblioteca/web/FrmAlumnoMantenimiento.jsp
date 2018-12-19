<%-- 
    Document   : FrmAlumnoMantenimiento
    Created on : 16/05/2018, 02:58:32 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_Alumno, nombre, apellido, direccion, carrera, edad, cel, dni;
    Alumno objAlum = null;
%>

<%

    objAlum = (Alumno) request.getAttribute("consultaMantenimiento");

    if (objAlum != null) {
        id_Alumno = objAlum.getId_alumno();
        nombre = objAlum.getNom_alum();
        apellido = objAlum.getApe_alum();
        direccion = objAlum.getDir_alum();
        carrera = objAlum.getCarrera_alum();
        edad = objAlum.getEdad_alum();
        cel = objAlum.getCel_alum();
        dni = objAlum.getDni_alum();

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloMantenimientoAlumno.css" media="screen"/>
        <title>Busqueda de Alumno</title>
    </head>
    <body>
        <div id="CuadroConsulta">
            <form method="get" action="ServletAlumno" name="for01">

                <center>
                    <h1>Mantenimiento de Alumnos</h1>
                <table id="primerTable">
                    <tr>
                        <td>Codigo :</td>
                        <td><input type="number" min="1" step="1" name="txtCod" id="txtCod" <% if (objAlum != null) {%> value="<%=id_Alumno%>"<%}%> maxlength="30"> </td>
                    
                    <td> <input  type="submit" class="botonesC" name="btnConsultarMantenimiento" id="btnConsultarBusqueda" value="Consultar"> </td></tr>
                </table>
                    
                <table id="segundoTable">
                    <tr>
                        <td>Nombre : </td>
                        <td><input type="text" name="txtNombre" <% if (objAlum != null) {%> value="<%=nombre%>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido : </td>
                        <td><input type="text" name="txtApellido" <% if (objAlum != null) {%> value="<%=apellido%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>Direccion : </td>
                        <td><input type="text" name="txtDireccion" <% if (objAlum != null) {%> value="<%=direccion%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Carrera : </td>
                        <td><input type="text" name="txtCarrera" <% if (objAlum != null) {%> value="<%=carrera%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Edad : </td>
                        <td><input type="number" name="txtEdad" <% if (objAlum != null) {%> value="<%=edad%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Celular : </td>
                        <td><input type="number" name="txtCelular" <% if (objAlum != null) {%> value="<%=cel%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>DNI : </td>
                        <td><input type="number" name="txtdni" <% if (objAlum != null) {%> value="<%=dni%>"<%}%> maxlength="30"> </td>
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
