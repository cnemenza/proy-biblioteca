<%-- 
    Document   : FrmRegistrarDevolucion
    Created on : 06/07/2018, 03:15:56 PM
    Author     : Alumno-CT
--%>

<%@page import="modelo.PrestamoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.Prestamo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;
    Prestamo objPres = null;
%>

<%

    objPres = (Prestamo) request.getAttribute("consultaMantenimiento");

    if (objPres != null) {
        id_prestamo = objPres.getId_prestamo();
        id_alumno = objPres.getId_alumno();
        id_empleado = objPres.getId_empleado();
        id_libro = objPres.getId_libro();
        fecha_prestamo = objPres.getFecha_prestamo();
        fecha_devolucion = objPres.getFecha_devolucion();
        fecha_devuelto = objPres.getFecha_devuelto();
        

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloMantenimientoAlumno.css" media="screen"/>
        <title>Busqueda de Alumno</title>
    </head>
    <body>
        <div id="CuadroConsulta">
            <form method="get" action="ServletPrestamo" name="for01">

                <center>
                    <h1>Registor de Prestamos</h1>
                <table id="primerTable">
                    <tr>
                        <td>Codigo :</td>
                        <td><input type="number" min="1" step="1" name="txtCod" id="txtCod" <% if (objPres != null) {%> value="<%=id_prestamo%>"<%}%> maxlength="30"> </td>
                    
                    <td> <input  type="submit" class="botonesC" name="btnModificar" id="btnConsultarBusqueda" value="Registrar Devolucion"> </td></tr>
                </table>
                    
                <table id="segundoTable">
     
                         
                        </div>
                 
                </table>
                    </center>

            </form>
        </div>
        <script src="js/validarBusqueda.js"></script>
    </body>
</html>
