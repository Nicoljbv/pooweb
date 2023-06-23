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
        <br>
        <br>
        <h1>CALCULAR EL AREA DE UN CIRCULO</h1>
        <br>
        <br>
        <form action="servlet" method="post">
            <label>Ingrese el diametro del circulo</label>
            <br>
            <input type="text" name="diametro">
            <br>
            <br>
        <div class="boton1">
            <button type="submit" name="control" value="areacir">Calcular Area</button>
            &nbsp;
            <button type="submit" name="control" value="perimetrocir">Calcular Perimetro</button>
        </div>
        </form>
</body>
</html>