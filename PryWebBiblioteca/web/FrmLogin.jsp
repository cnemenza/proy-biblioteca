    
<%@page import="modelo.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Inicio de Sesion Biblioteca</title>


        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css">   

    </head>
    <body>
        <div class="login-box">
            <img src="avatar.jpg" class="avatar">
            <h1>Ingresar</h1>
            <form method="get" action="iniciar" name="for01">
                <p>Usuario</p> 
                <input type="text" id="txtUsuario" name="txtUsuario" placeholder="Ingrese Usuario">
                <p>Contraseña</p>
                <input type="password" id="txtContrasenia" name="txtContrasenia" placeholder="Ingrese Contraseña">
                <input type="submit" id="btnIngresar" name="btnIngresar" value="Entrar">
            </form>      
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/login.js"></script>
    </body>
</html>