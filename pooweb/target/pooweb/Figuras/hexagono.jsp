<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Hexagono</title>
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
        <h1>CALCULAR EL AREA DE UN HEXAGONO</h1>
        <br>
        <br>
        <form action="servlet" method="post">
            <label>Ingrese la medida del lado del hexagono</label>
            <br>
            <input type="text" name="lado">
            <br>
            <br>
        <div class="boton1">
            <button type="submit" name="control" value="areahex">Calcular Area</button>
            &nbsp;
            <button type="submit" name="control" value="perimetrohex">Calcular Perimetro</button>
        </div>
        </form>
</body>
</html>