

<%@page import="javax.swing.JOptionPane"%>
<%@page import="beans.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String id_libro,titulo,editorial,id_autor,id_genero,fecha,status,idioma,area,stock;
    Libro objLibro = null;
%>

<%

    objLibro = (Libro) request.getAttribute("consulta");

    if (objLibro != null) {
 
         id_libro = objLibro.getId_libro();
        titulo = objLibro.getTitulo();
        editorial = objLibro.getEditorial();
        id_autor = objLibro.getAutor();
        id_genero = objLibro.getGenero();
        status = objLibro.getStatus();
        idioma = objLibro.getIdioma();
        area = objLibro.getArea();
        stock = objLibro.getStock();

    }%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloRegistroAlumno.css" media="screen"/>
        <title>Registrar Libro</title>
    </head>
    <body style="
    background-color: white;">
        <div id="CuadroConsulta">
            <form method="get" action="ServletLibro" name="for01">
                <center>
                    <div id="general"><h1>Registrar Libro</h1></div>
                    
                <table>
                   <tr>
                        <td>Titulo : </td>
                        <td><input type="text" name="txtTitulo" <% if (objLibro != null) {%> value="<%=titulo%>"<%}%> maxlength="30"> </td>
                    </tr>
                        <td>Editorial : </td>
                        <td><input type="text" name="txtEditorial" <% if (objLibro != null) {%> value="<%=editorial%>"<%}%> maxlength="30"> </td>
                    </tr> 
                                            <tr> 
                                            <td> Autor </td>
                    <td> 
   
                        <select name="cal1"  class="boton" onchange="this.form['txtAutor'].value=this.value">
                <option value="0">Seleccione Autor..</option>
                 <option value="1">Joanne, Rowling</option>
                 <option  value="2">Gabriel, Garcia Marquez</option>
                 <option  value="3">Mario, Vargas Llosa</option>
                 <option  value="4">Stephen, King</option>
                 <option  value="5">Edgar, Allan Poe</option>
                 <option  value="6">Julio, Cortazar </option>
                 <option  value="7">Cesar, Vallejo </option>
          
        </select> 
                    </td>
                </tr>
   
                                        <tr> 
                                            <td> Genero </td>
                    <td> 
   
                        <select name="cal2"  class="boton" onchange="this.form['txtGenero'].value=this.value">
                 <option value="0">Seleccione Genero..</option>
                 <option value="1">Novela</option>
                 <option  value="2">Cuento</option>
                 <option  value="3">Ensayo</option>
                 <option  value="4">Drama </option>
                 <option  value="5">Leyenda</option>
                 <option  value="6">Magico </option>
                 
          
        </select> 
                    </td>
                </tr>
                
                                            <tr> 
                                            <td> Estatus </td>
                    <td> 
   
                        <select name="cal3"  class="boton" onchange="this.form['txtStatus'].value=this.value">
                 <option value="0">Seleccione Estatus..</option>
                 <option value="A">Activo</option>
                 <option value="I">Inactivo</option>

                 
          
        </select> 
                    </td>
                </tr>
                 
                    <tr>
                        <td>Idioma : </td>
                        <td><input type="text" name="txtIdioma" <% if (objLibro != null) {%> value="<%=idioma%>"<%}%> maxlength="30"> </td>
                    </tr>
                    <tr>
                        <td>Area : </td>
                        <td><input type="text" name="txtArea" <% if (objLibro != null) {%> value="<%=area%>"<%}%> maxlength="30"> </td>
                    </tr>
                    <tr>
                        <td>Stock : </td>
                        <td><input type="number" name="txtStock" <% if (objLibro != null) {%> value="<%=stock%>"<%}%> maxlength="30"> </td>
                    </tr>
                    
                           
                        
                            
                    
                    <div><table> <tr><td> <input  class="botones" type="submit" name="btnRegistrar" value="Registrar"> </td></tr</table></div>
                    
                 
                </table>
                     <td><input type="text" name="txtAutor" <% if (objLibro != null) {%> value="<%=id_autor%>"<%}%> maxlength="30" style="display:none; "> </td>

                             <td><input type="text" name="txtGenero" <% if (objLibro != null) {%> value="<%=id_genero%>"<%}%> maxlength="30" style="display:none; "> </td>

                             <td><input type="text" name="txtStatus" <% if (objLibro != null) {%> value="<%=status%>"<%}%> maxlength="30" style="display:none;"> </td>
                    
                    
                              
                </center>
               

            </form>
        </div>
    </body>
</html>
