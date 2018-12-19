<%-- 
    Document   : FrmEmpleadoRegistrar
    Created on : 17/05/2018, 02:14:00 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_empleado, nom_empleado, ape_empleado, dni_empleado, fechaing_empleado, status_empleado;
    Empleado objEmp = null;
%>

<%

    objEmp = (Empleado) request.getAttribute("consulta");

    if (objEmp != null) {
        nom_empleado = objEmp.getNom_empleado();
        ape_empleado = objEmp.getApe_empleado();
        dni_empleado = objEmp.getDni_empleado();
        fechaing_empleado = objEmp.getFechaing_empleado();
        status_empleado = objEmp.getStatus_empleado();

        

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloRegistroAlumno.css" media="screen"/>
        <title>Registrar Empleado</title>
    </head>
    <body style="
    background-color: white;">
        <div id="CuadroConsulta">
            <form method="get" action="ServletEmpleado" name="for01">
                <center>
                    <div id="general"><h1>Registrar Empleado</h1></div>
                    
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" <% if (objEmp != null) {%> value="<%=nom_empleado %>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Apellido</td>
                        <td><input type="text" name="txtApellido" <% if (objEmp != null) {%> value="<%=ape_empleado %>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr> 
                        <td>DNI</td>
                        <td><input type="text" name="txtdni" <% if (objEmp != null) {%> value="<%=dni_empleado %>"<%}%> maxlength="30"> </td>
                    </tr> 
                    <tr>
                        <td>Fecha Ingreso</td>
                        <td><input type="text" name="txtFechaIngreso" <% if (objEmp != null) {%> value="<%=fechaing_empleado %>"<%}%> maxlength="30"> </td>
                    </tr> 
             
                    <tr> 
                                            <td> Status </td>
                    <td> 
   
                        <select name="cal1"  class="boton" onchange="this.form['txtStatus'].value=this.value">
                <option value="0">Seleccione Status</option>
                 <option value="A">Activo</option>
                 <option  value="I">Inactivo</option>
          
          
        </select> 
                    </td>
                </tr>
   
                      </select>  
                        <td><input type="text" name="txtStatus" <% if (objEmp != null) {%> value="<%=status_empleado %>"<%}%> maxlength="30" style="display:none;"> </td>
                    
                  
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar"> </td></tr</table></div>
                 
                </table>
                </center>
               

            </form>
        </div>
    </body>
</html>
