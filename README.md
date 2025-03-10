<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menú de Aplicación</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
            text-align: center;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            background: #007BFF;
            color: white;
            padding: 10px;
            margin: 5px 0;
            border-radius: 5px;
            cursor: pointer;
            transition: 0.3s;
        }
        li:hover {
            background: #0056b3;
        }
        .info {
            text-align: left;
            margin-top: 20px;
            font-size: 16px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Menú de Aplicación</h1>
        <ul>
            <li>1. Registrar productos</li>
            <li>2. Mostrar todos los productos</li>
            <li>3. Mostrar el total en $ de todos los productos</li>
            <li>4. Mostrar el total en $ de un producto en específico</li>
            <li>5. Salir</li>
        </ul>
        <div class="info">
            <h2>Datos del Producto</h2>
            <p>° Código</p>
            <p>° Nombre</p>
            <p>° Stock</p>
            <p>° Valor unitario</p>
        </div>
    </div>
</body>
</html>
