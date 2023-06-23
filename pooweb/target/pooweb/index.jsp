<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Figuras</title>
    <link rel="stylesheet" type="text/css" href="./Estilos/index.css"> 
</head>
<body>
    <header>
    <div class="header">
        <a href="./index.jsp"><div><img src="./img/Logo.PNG"></div></a>
        <div class="boton"><a href="servlet?control=circulo">Circulo</a></div>
        <div class="boton"><a href="servlet?control=triangulo">Triangulo</a></div>
        <div class="boton"><a href="servlet?control=rectangulo">Rectangulo</a></div>
        <div class="boton"><a href="servlet?control=hexagono">Hexagono</a></div>
    </div>
    </header>
    <br>
    <br>
    <h1>ELIJA UNA FIGURA</h1>
    <br>
    <div class="contenedor">
        <a href="servlet?control=circulo"><img src="./img/Circulo.PNG"></a>
        <a href="servlet?control=triangulo"><img src="./img/Triangulo.PNG"></a>
    </div>
    <br>
    <br>
    <div class="contenedor">
        <a href="servlet?control=rectangulo"><img src="./img/Rectangulo.PNG"></a>
        <a href="servlet?control=hexagono"><img src="./img/Hexagono.PNG"></a>
    </div>

   
</body>
</html>