<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de inicio</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" 
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" 
	crossorigin="anonymous"></script>
</head>
<body>

<div class="container col-md-4">
    <h3 style="text-align: center;">Registro</h3><br>
    <form class="px-2" action="/submit" method="POST">
    
      <div class="form-group">
        <label>Nombre</label>
        <input type="text" class="form-control" name="name" value="${name}">
        <div style="color:red">${alertaNombre}</div>
        <br>
      </div>
      
      <div class="form-group">
        <label>Apellido</label>
        <input type="text" class="form-control" name="lastName" value="${lastName}">
        <div style="color:red">${alertaApellido}</div>
      </div><br>
  
  
      <div class="form-group">
        <label>Limite</label>
        <input type="number" class="form-control" name="limit" value="${limit}">
        <div style="color:red">${alertaLimite}</div>
      </div><br>
      
      <div class="form-group">
        <label>Código postal</label>
        <input type="text" class="form-control" name="code" value="${code}">
        <div style="color:red">${alertaCodigo}</div>
      </div><br>
   
  
      <div class="container">
        <div class="row">
            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                <button type="submit" class="btn btn-success">Agregar</button>
            </div>
        </div>
      </div>
      <br>

    </form>
  </div>

</body>
</html>