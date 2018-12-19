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

    objPres = (Prestamo) request.getAttribute("consultaBusqueda");

    if (objPres != null) {
         id_prestamo = objPres.getId_prestamo();
        id_alumno = objPres.getId_alumno();
        id_empleado = objPres.getId_empleado();
        id_libro = objPres.getId_libro();
        fecha_prestamo = objPres.getFecha_prestamo();
        fecha_devolucion = objPres.getFecha_devolucion();
        fecha_devuelto = objPres.getFecha_devuelto();

    }%>

<%
    ArrayList<Prestamo> listPres = null;
    if (request.getAttribute("listaAlumnos") != null) {
        listPres = (ArrayList<Prestamo>) request.getAttribute("listaAlumnos");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Lista de Prestamos</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletPrestamo" name="for01">
                <h1>Busqueda de Prestamo</h1>
                <table>
                    <tr>
                    <input type="number" name="txtCod" id="txtCod" <% if (objPres != null) {%> value="<%=id_prestamo%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">


                    <input class="botones" type="submit" name="btnConsultarBusqueda" id="btnConsultarBusqueda" value="Consultar">

                    </tr>

                </table>


                <div>
                    <!-- <a href="FrmGeneroBusqueda.jsp" target="_self"> <input type="button" name="boton" value="Aceptar" /> </a> -->

                    <td><input class="botones" type="submit" name="btnReporte" value="Ver Listado de Prestamos"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("ID_Prestamo");%></td>
                <td class="primColum"><%out.println("Alumno");%></td>
                <td class="primColum"><%out.println("Empleado");%></td>
                <td class="primColum"><%out.println("Libro");%></td>
                <td class="primColum"><%out.println("Fecha Prestamo");%></td>
                <td class="primColum"><%out.println("Fecha Devolucion");%></td>
                <td class="primColum"><%out.println("Fecha Devuelto");%></td>
                <td class="primColum"><%out.println("Mantenimiento");%></td>
     
            </tr>
            <tr>
                <%if (objPres != null) {%>
                <td><%out.println(id_prestamo);%></td>
                <td><%out.println(id_alumno);%></td>
                <td><%out.println(id_empleado);%></td>
                <td><%out.println(id_libro);%></td>
                <td><%out.println(fecha_prestamo);%></td>
                <td><%out.println(fecha_devolucion);%></td>
                <td><%out.println(fecha_devuelto);%></td>
                 <td>  <input class="botones" type="submit" name="btnRegistrarDevolucion" id="btnConsultarBusqueda" value="Registrar Devolucion"></td>
               
                <%}
                            if (listPres != null) { %> 
                <%
                    for (Prestamo objP : listPres) {

                        id_prestamo = objP.getId_prestamo();
                        id_alumno = objP.getId_alumno();
                        id_empleado = objP.getId_empleado();
                        id_libro = objP.getId_libro();
                        fecha_prestamo = objP.getFecha_prestamo();
                        fecha_devolucion = objP.getFecha_devolucion();
                        fecha_devuelto = objP.getFecha_devuelto();
                        
                   

                %>
            <tr>
                <td><%=id_prestamo%> </td>
                <td><%=id_alumno%> </td>
                <td><%=id_empleado%> </td>
                <td><%=id_libro%> </td>
                <td><%=fecha_prestamo%> </td>
                <td><%=fecha_devolucion%> </td>
                <td><%=fecha_devuelto%> </td>
                <td>  <input class="botones" type="submit" name="btnRegistrarDevolucion" id="btnConsultarBusqueda" value="Registrar Devolucion"></td>
               

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
