<%-- 
    Document   : FrmRegistrarPrestamo
    Created on : 06/07/2018, 03:04:39 PM
    Author     : Alumno-CT
--%>

<%@page import="beans.Prestamo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;
    String titulo,editorial,id_autor,id_genero,fecha,status,idioma,area,stock;
    Libro objLibro = null;


    Prestamo objPres = null;
%>

<%

    objPres = (Prestamo) request.getAttribute("consulta");

    if (objPres != null) {
        id_prestamo = objPres.getId_prestamo();
        id_alumno = objPres.getId_alumno();
        id_empleado = objPres.getId_empleado();
        id_libro = objPres.getId_libro();
        fecha_prestamo = objPres.getFecha_prestamo();
        fecha_devolucion = objPres.getFecha_devolucion();
        fecha_devuelto = objPres.getFecha_devuelto();
        

    }
    

       objLibro = (Libro) request.getAttribute("consultaMantenimiento");

    if (objLibro != null) {
        id_libro = objLibro.getId_libro();
        titulo = objLibro.getTitulo();
        editorial = objLibro.getEditorial();
        id_autor = objLibro.getAutor();
        id_genero = objLibro.getGenero();
        fecha = objLibro.getFecha();
        status = objLibro.getStatus();
        idioma = objLibro.getIdioma();
        area = objLibro.getArea();
        stock = objLibro.getStock();

    }











%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloRegistroAlumno.css" media="screen"/>
        <title>Registrar Alumno</title>
    </head>
    <body style="
    background-color: white;">
        <div id="CuadroConsulta">
            <form method="get" action="ServletPrestamo" name="for01">
                <center>
                    
                    
                    
                    <div id="general"><h1>Registrar Prestamo</h1></div>
                    
                <table>
                
                    
                                                   <tr> 
                                            <td> Alumno </td>
                    <td> 
   
                        <select name="cal1"  class="boton" onchange="this.form['txtAlumno'].value=this.value">
                <option value="0">Seleccione Alumno..</option>
                 <option value="1">Christian, Nemenza</option>
                 <option  value="2">Carlos, Alcanatara</option>
                 <option  value="3">Diego, Cabrera</option>
                 <option  value="4">Sergio, Coronado</option>
                 <option  value="5">Aldair, Solorzano</option>
                 <option  value="6">Carlos, Cardenas </option>
                 <option  value="7">Sebastian Pulgar </option>

        </select> 
                    </td>
                </tr>
                
                
                
                    
                                                            <tr> 
                                            <td> Empleado </td>
                    <td> 
   
                        <select name="cal1"  class="boton" onchange="this.form['txtEmpleado'].value=this.value">
                <option value="0">Seleccione Empleado..</option>
                 <option value="1">Rosa, Angeles</option>
                 <option  value="2">Paolo, Guerrero</option>
                 <option  value="3">Christian, Nemenza</option>
                 <option  value="4">Juan, Quispe</option>
                 <option  value="5">Carlos, Enrique</option>
                 <option  value="6">Luis, Perez </option>

        </select> 
                    </td>
                </tr>
                
                                                                   <tr> 
                                            <td> Libro </td>
                    <td> 
   
                        <select name="cal1"  class="boton" onchange="this.form['txtLibro'].value=this.value">
                <option value="0">Seleccione Libro..</option>
                 <option value="1">Harry Potter y el cáliz de fuego</option>
                 <option  value="2">La ciudad y los perros</option>
                 <option  value="3">El cuervo</option>
                 <option  value="4">it</option>
                 <option  value="5">El resplandor</option>
                 <option  value="6">La danza de la muerte </option>
                 <option  value="7">Carrie </option>
                 <option  value="8">Misery</option>
                 <option  value="9">La niebla</option>
                 <option  value="10">El misterio de Salem's Lot</option>
                 <option  value="11">Los tres cerditos</option>

        </select> 
                    </td>
                </tr>
                
                    
                    
                    
  
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar" id="btnRegistrar"> </td></tr</table></div>
                 
                </table>
                    
                    
                                  <td><input type="text" name="txtAlumno" <% if (objPres != null) {%> value="<%=id_alumno%>"<%}%> maxlength="30" style="display:none; "> </td>
                                  <td><input type="text" name="txtEmpleado" <% if (objPres != null) {%> value="<%=id_empleado%>"<%}%> maxlength="30" style="display:none; "> </td>
                                  <td><input type="text" name="txtLibro" <% if (objPres != null) {%> value="<%=id_libro%>"<%}%> maxlength="30" style="display:none; "> </td>
                </center>
               

            </form>
                    
                    
                    
        </div>
                    
               
                    <script src="js/validarAlumnoRegistro.js"></script>
    </body>
</html>
