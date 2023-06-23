<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>circulo</title>
    <link rel="stylesheet" type="text/css" href="./Estilos/index.css">  
</head>
<body>
    <header>
        <div class="header">
            <a href="index.jsp"><div><img src="./img/Logo.PNG"></div></a>
            <div class="boton"><a href="servlet?control=circulo">Circulo</a></div>
            <div class="boton"><a href="servlet?control=triangulo">Triangulo</a></div>
            <div class="boton"><a href="servlet?control=rectangulo">Rectangulo</a></div>
            <div class="boton"><a href="servlet?control=hexagono">Hexagono</a></div>
        </div>
        </header>
        <br>
        <br>
        <div class="resul">
        <h1>EL AREA DE LA FIGURA ES:<br><%= request.getAttribute("area")%></h1> 
        </div>
</body>
</html>