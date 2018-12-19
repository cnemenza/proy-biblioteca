<%-- 
    Document   : FrmMain
    Created on : 15/05/2018, 10:49:19 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objSesion = request.getSession(false);
    String usuario = (String)objSesion.getAttribute("user");
    if(usuario.equals("")){
        response.sendRedirect("FrmLogin.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/estilosMain.css" media="screen"/>
        <title>Biblioteca</title>
    </head>
    <header>
     
        <div id = cabeza>
            <div id="detalle"><h2>Bienvenido <% out.println(usuario); %></h2></div>

        </div>

        <div id="nav">
            <nav class="navegacion">
                <ul class="menu">
                    <li><a href="FrmMain.jsp">Inicio</a></li>
                    <li><a href="#">Busqueda</a>
                        <ul class="submenu">
                            <li><a href="FrmAlumnoBusqueda.jsp" target="principal">Alumno</a></li>
                            <li><a href="FrmLibroBusquedaCodigo.jsp" target="principal">Libro</a></li>
                            <li><a href="FrmAutorBusqueda.jsp" target="principal">Autor</a></li>
                            <li><a href="FrmEmpleadoBusqueda.jsp" target="principal">Empleado</a></li>
                            <li><a href="FrmListarPrestamos.jsp" target="principal">Prestamos</a></li>
                        </ul>
                    </li> 
                    <li><a href="#">Mantenimiento</a>
                        <ul class="submenu">
                            <li><a href="FrmAlumnoMantenimiento.jsp" target="principal">Alumno</a></li>
                            <li><a href="FrmLibroMantenimiento.jsp" target="principal">Libro</a></li>
                            <li><a href="FrmAutorMantenimiento.jsp" target="principal">Autor</a></li>
                            <li><a href="FrmEmpleadoMantenimiento.jsp" target="principal">Empleado</a></li>
    
                        </ul>
                    </li>
                    <li><a href="#">Operaciones</a>
                        <ul class="submenu">
                            <li><a href="FrmAlumnoRegistrar.jsp" target="principal">Registrar Alumno</a></li>
                            <li><a href="FrmLibroRegistrar.jsp" target="principal">Registrar Libro</a></li>
                            <li><a href="FrmAutorRegistrar.jsp" target="principal">Registrar Autor</a></li>
                            <li><a href="FrmEmpleadoRegistrar.jsp" target="principal">Registrar Empleado</a></li>

                            <li><a href="FrmRegistrarPrestamo.jsp" target="principal">Registrar Prestamo</a></li>
                            <li><a href="FrmRegistrarDevolucion.jsp" target="principal">Registrar Devolucion</a></li>

                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </header>


    <body>
    <center>
        <iframe name="principal" width="900px" height="650" src="" frameborder="0" align="center"></iframe>
    </center>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
