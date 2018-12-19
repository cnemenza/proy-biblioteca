<%-- 
    Document   : FrmAlumnoRegistrar
    Created on : 17/05/2018, 08:01:55 AM
    Author     : Alumno-CT
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="beans.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_Alumno, nombre, apellido, direccion, carrera, edad, cel, dni;
    Alumno objAlum = null;
%>

<%

    objAlum = (Alumno) request.getAttribute("consulta");

    if (objAlum != null) {
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
        <link rel="stylesheet" type="text/css" href="css/estiloRegistroAlumno.css" media="screen"/>
        <title>Registrar Alumno</title>
    </head>
    <body style="
    background-color: white;">
        <div id="CuadroConsulta">
            <form method="get" action="ServletAlumno" name="for01">
                <center>
                    <div id="general"><h1>Registrar Alumno</h1></div>
                    
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" id="txtNombre" <% if (objAlum != null) {%> value="<%=nombre%>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido</td>
                        <td><input type="text" name="txtApellido" id="txtApellido" <% if (objAlum != null) {%> value="<%=apellido%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>Direccion</td>
                        <td><input type="text" name="txtDireccion" id="txtDireccion"<% if (objAlum != null) {%> value="<%=direccion%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Carrera</td>
                        <td><input type="text" name="txtCarrera" id="txtCarrera"<% if (objAlum != null) {%> value="<%=carrera%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Edad</td>
                        <td><input type="text" name="txtEdad" onkeypress="return valida(event)" id="txtEdad" <% if (objAlum != null) {%> value="<%=edad%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Celular</td>
                        <td><input type="text" name="txtCelular" onkeypress="return valida(event)" id="txtCelular"<% if (objAlum != null) {%> value="<%=cel%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>DNI</td>
                        <td><input type="text" name="txtdni" onkeypress="return valida(event)" id="txtDni"<% if (objAlum != null) {%> value="<%=dni%>"<%}%> maxlength="30"> </td>
                    </tr>
                    
                           
  
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar" id="btnRegistrar"> </td></tr</table></div>
                 
                </table>
                </center>
               

            </form>
        </div>
                    
               
                    <script src="js/validarAlumnoRegistro.js"></script>
    </body>
</html>
