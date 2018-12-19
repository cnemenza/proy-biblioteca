<%-- 
    Document   : FrmEmpleadoBusqueda
    Created on : 17/05/2018, 01:51:37 PM
    Author     : Alumno-CT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_empleado, nom_empleado, ape_empleado, dni_empelado, fechaing_empleado, status_empleado;
    Empleado objEmp = null;
%>

<%

    objEmp = (Empleado) request.getAttribute("consultaBusqueda");

    if (objEmp != null) {
        id_empleado = objEmp.getId_empleado();
        nom_empleado = objEmp.getNom_empleado();
        ape_empleado = objEmp.getApe_empleado();
        dni_empelado = objEmp.getDni_empleado();
        fechaing_empleado = objEmp.getFechaing_empleado();
        status_empleado = objEmp.getStatus_empleado();
 

    }%>

<%
    ArrayList<Empleado> listaEmp = null;
    if (request.getAttribute("listaEmpleados") != null) {
        listaEmp = (ArrayList<Empleado>) request.getAttribute("listaEmpleados");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Busqueda de Empleado</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletEmpleado" name="for01">
                <h1>Busqueda de Empleado</h1>
                <table>
                    <tr>

                    <select name="tipoBusqueda"><option selected>Codigo</option><option>Apellido</option></select>


                    <input type="text" name="txtCod" id="txtCod" <% if (objEmp != null) {%> value="<%=id_empleado%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">


                    <input class="botones" type="submit" id="btnConsultarBusqueda" name="btnConsultarBusqueda" value="Consultar">

                    </tr>

                </table>


                <div>
                    <td><input class="botones" type="submit" name="btnReporte" value="Ver Listado de Empleados"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("Codigo");%></td>
                <td class="primColum"><%out.println("Nombre");%></td>
                <td class="primColum"><%out.println("Apellido");%></td>
                <td class="primColum"><%out.println("DNI");%></td>
                <td class="primColum"><%out.println("Fecha de Ingreso");%></td>
                <td class="primColum"><%out.println("Status");%></td>
            </tr>
            <tr>
                <%if (objEmp != null) {%>
                <td><%out.println(id_empleado);%></td>
                <td><%out.println(nom_empleado);%></td>
                <td><%out.println(ape_empleado);%></td>
                <td><%out.println(dni_empelado);%></td>
                <td><%out.println(fechaing_empleado);%></td>
                <td><%out.println(status_empleado);%></td>

                <%}
                            if (listaEmp != null) { %> 
                <%
                    for (Empleado objE : listaEmp) {

                        id_empleado = objE.getId_empleado();
                        nom_empleado = objE.getNom_empleado();
                        ape_empleado = objE.getApe_empleado();
                        dni_empelado = objE.getDni_empleado();
                        fechaing_empleado = objE.getFechaing_empleado();
                        status_empleado = objE.getStatus_empleado();
 

                %>
            <tr>
                <td><%=id_empleado%> </td>
                <td><%=nom_empleado%> </td>
                <td><%=ape_empleado%> </td>
                <td><%=dni_empelado%> </td>
                <td><%=fechaing_empleado%> </td>
                <td><%=status_empleado%> </td>


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
