<%-- 
    Document   : FrmEmpleadoMantenimiento
    Created on : 17/05/2018, 02:06:09 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!  String id_empleado,nom_empleado,ape_empleado,dni_empleado,fechaing_empleado,status_empleado;
    Empleado objEmp = null;
%>

<%

    objEmp = (Empleado) request.getAttribute("consultaMantenimiento");

    if (objEmp != null) {
        id_empleado = objEmp.getId_empleado();
        nom_empleado = objEmp.getNom_empleado();
        ape_empleado = objEmp.getApe_empleado();
        dni_empleado = objEmp.getDni_empleado();
        fechaing_empleado = objEmp.getFechaing_empleado();
        status_empleado = objEmp.getStatus_empleado();

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloMantenimientoAlumno.css" media="screen"/>
        <title>Busqueda de Empleado</title>
    </head>
    <body>
        <div id="CuadroConsulta">
            <form method="get" action="ServletEmpleado" name="for01">

                <center>
                    <h1>Mantenimiento de Empleados</h1>
                <table id="primerTable">
                    <tr>
                        <td>Codigo :</td>
                        <td><input type="number" min="1" step="1" name="txtCod" id="txtCod" <% if (objEmp != null) {%> value="<%=id_empleado%>"<%}%> maxlength="30"> </td>
                    
                    <td> <input  type="submit" class="botonesC" name="btnConsultarMantenimiento" id="btnConsultarBusqueda" value="Consultar"> </td></tr>
                </table>
                    
                <table id="segundoTable">
                    <tr>
                        <td>Nombre : </td>
                        <td><input type="text" name="txtNombre" <% if (objEmp != null) {%> value="<%=nom_empleado%>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido : </td>
                        <td><input type="text" name="txtApellido" <% if (objEmp != null) {%> value="<%=ape_empleado%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>DNI : </td>
                        <td><input type="text" name="txtdni" <% if (objEmp != null) {%> value="<%=dni_empleado%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Fecha Ingreso : </td>
                        <td><input type="text" name="txtFechaIngreso" <% if (objEmp != null) {%> value="<%=fechaing_empleado%>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Status : </td>
                        <td><input type="text" name="txtStatus" <% if (objEmp != null) {%> value="<%=status_empleado%>"<%}%> maxlength="30"> </td>
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
