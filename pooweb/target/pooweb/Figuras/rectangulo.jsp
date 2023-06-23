<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Rectangulo</title>
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
        <h1>CALCULAR EL AREA DE UN RECTANGULO</h1>
        <br>
        <br>
        <br>
        <br>
        <form action="servlet" method="post">
            <label>Ingrese la base del Rectangulo</label>
            <br>
            <input type="text" name="base">
            <br>
            <label>Ingrese la altura del Rectangulo</label>
            <br>
            <input type="text" name="altura">
            <br>
            <br>
            <div class="boton1">
            <button type="submit" name="control" value="arearec">Calcular Area</button>
            &nbsp;
            <button type="submit" name="control" value="perimetrorec">Calcular Perimetro</button>
            </div>
        </form>
</body>
</html>