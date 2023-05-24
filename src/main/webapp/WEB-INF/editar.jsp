
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Registro de Datos</h1>
        
        <form action="MainController" method="post"></form>
        <br>
        <label>Id</label>
        <input type="text" name="id">
        <br>
        <label>Descripcion</label>
        <input type="text" name="descripcion">
        <br>
        <label>Cantidad</label>
        <input type="text" name="cantidad">
        <br>
        <label>Precio</label>
        <input type="text" name="precio">
        <br> 
          <input type="submit" value="enviar">
    </body>
</html>
