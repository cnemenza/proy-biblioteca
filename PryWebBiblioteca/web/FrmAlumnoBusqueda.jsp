<%-- 
    Document   : FrmAlumnoBusqueda
    Created on : 16/05/2018, 12:01:51 PM
    Author     : Alumno-CT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_Alumno, nombre, apellido, direccion, carrera, edad, cel, dni;
    Alumno objAlum = null;
%>

<%

    objAlum = (Alumno) request.getAttribute("consultaBusqueda");

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

<%
    ArrayList<Alumno> listaAlum = null;
    if (request.getAttribute("listaAlumnos") != null) {
        listaAlum = (ArrayList<Alumno>) request.getAttribute("listaAlumnos");
    }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloBusquedaAlumno.css" media="screen"/>
        <title>Busqueda de Alumno</title>
    </head>
    <body style="
          background-color: white;">
    <center>
        <div id="CuadroConsulta">

            <form method="get" action="ServletAlumno" name="for01">
                <h1>Busqueda de Alumno</h1>
                <table>
                    <tr>

                    <select name="tipoBusqueda"><option selected>Codigo</option><option>Apellido</option></select>


                    <input type="number" name="txtCod" id="txtCod" <% if (objAlum != null) {%> value="<%=id_Alumno%>"<%}%> maxlength="30" style="
                           margin-left: 15px;
                           margin-right: 15px;">


                    <input class="botones" type="submit" name="btnConsultarBusqueda" id="btnConsultarBusqueda" value="Consultar">

                    </tr>

                </table>


                <div>
                    <!-- <a href="FrmGeneroBusqueda.jsp" target="_self"> <input type="button" name="boton" value="Aceptar" /> </a> -->

                    <td><input class="botones" type="submit" name="btnReporte" value="Ver Listado de estudiantes"></td>
                </div></div>

        <br>


        <table>
            <tr>
                <td class="primColum"><%out.println("Codigo");%></td>
                <td class="primColum"><%out.println("Nombre");%></td>
                <td class="primColum"><%out.println("Apellido");%></td>
                <td class="primColum"><%out.println("Direccion");%></td>
                <td class="primColum"><%out.println("Carrera");%></td>
                <td class="primColum"><%out.println("Edad");%></td>
                <td class="primColum"><%out.println("Celular");%></td>
                <td class="primColum"><%out.println("DNI");%></td>
            </tr>
            <tr>
                <%if (objAlum != null) {%>
                <td><%out.println(id_Alumno);%></td>
                <td><%out.println(nombre);%></td>
                <td><%out.println(apellido);%></td>
                <td><%out.println(direccion);%></td>
                <td><%out.println(carrera);%></td>
                <td><%out.println(edad);%></td>
                <td><%out.println(cel);%></td>
                <td><%out.println(dni);%></td>
                <%}
                            if (listaAlum != null) { %> 
                <%
                    for (Alumno objE : listaAlum) {

                        id_Alumno = objE.getId_alumno();
                        nombre = objE.getNom_alum();
                        apellido = objE.getApe_alum();
                        direccion = objE.getDir_alum();
                        carrera = objE.getCarrera_alum();
                        edad = objE.getEdad_alum();
                        cel = objE.getCel_alum();
                        dni = objE.getDni_alum();

                %>
            <tr>
                <td><%=id_Alumno%> </td>
                <td><%=nombre%> </td>
                <td><%=apellido%> </td>
                <td><%=direccion%> </td>
                <td><%=carrera%> </td>
                <td><%=edad%> </td>
                <td><%=cel%> </td>
                <td><%=dni%> </td>

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
