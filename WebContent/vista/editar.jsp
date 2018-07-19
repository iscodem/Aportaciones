<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Actualizar Artículo</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Costumize CSS -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <title>Editar integrante</title>
</head>
<body>
	<div class="container">
		<h2 class="text-center wdi-red">Editar integrante</h2>
			<form action="adminArticulo?action=editar" method="post">
				<div class="form-group">
					<label for="id">ID</label>	
					<input type="text" class="form-control" name="id" placeholder="Id" value="${articulo.id}" readonly>
				</div>
				<div class="form-group">
					<label for="seccion">SECCIÓN:</label>	
					<input type="text" class="form-control" name="seccion" placeholder="Seccion" value="${articulo.seccion}" >
				</div>
				<div class="form-group">
					<label for="apePaterno">APELL. PATERNO:</label>	
					<input type="text" class="form-control" name="apePaterno" placeholder="Apell. Paterno" value="${articulo.apePaterno}">
				</div>
				<div class="form-group">
					<label for="apeMaterno">APELL. MATERNO:</label>	
					<input type="text" class="form-control" name="apeMaterno" placeholder="Apell. Materno" value="${articulo.apeMaterno}">
				</div>
				<div class="form-group">
					<label for="nombres">NOMBRES:</label>	
					<input type="text" class="form-control" name="nombres" placeholder="Nombres" value="${articulo.nombres}" >
				</div>
				<%-- <div class="form-group">
					<label for="mesAporte">MES APORTE:</label>	
					<input type="text" class="form-control" name="mesAporte" placeholder="Mes Aporte" value="${articulo.mesAporte}" >
				</div> --%>
				
				<div class="form-group">
					<label for="cuota1">CUOTA 2014:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota1" placeholder="Cuota 2014" value="${articulo.cuota1}" >
				</div>
				<div class="form-group">
					<label for="cuota2">CUOTA 2015:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota2" placeholder="Cuota 2015" value="${articulo.cuota2}" >
				</div>
				<div class="form-group">
					<label for="cuota3">CUOTA 2016:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota3" placeholder="Cuota 2016" value="${articulo.cuota3}" >
				</div>
				<div class="form-group">
					<label for="cuota4">CUOTA 2017:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota4" placeholder="Cuota 2017" value="${articulo.cuota4}" >
				</div>
				<div class="form-group">
					<label for="cuota5">CUOTA 2018:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota5" placeholder="Cuota 2018" value="${articulo.cuota5}" >
				</div>
				<div class="form-group">
					<label for="cuota6">CUOTA 2019:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota6" placeholder="Cuota 2019" value="${articulo.cuota6}" >
				</div>
				<div class="form-group">
					<label for="cuota7">CUOTA 2020:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota7" placeholder="Cuota 2020" value="${articulo.cuota7}" >
				</div>
				<div class="form-group">
					<label for="mtoAporte">RIFA 2018:</label>	
					<input type="number" class="form-control" step="0.01" name="mtoAporte" placeholder="RIFA 2018" value="${articulo.mtoAporte}" >
				</div>
				<div class="form-group">
					<label for="totalAporte">Tarjeta Fiesta US $:</label>	
					<input type="number" class="form-control" step="0.01" name="totalAporte" placeholder="Tarjeta Fiesta US$" value="${articulo.totalAporte}" >
				</div>
				<%-- <div class="form-group">
					<label for="cuota8">CUOTA 8:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota8" placeholder="Cuota 8" value="${articulo.cuota8}" >
				</div>
				<div class="form-group">
					<label for="cuota9">CUOTA 9:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota9" placeholder="Cuota 9" value="${articulo.cuota9}" >
				</div>
				<div class="form-group">
					<label for="cuota10">CUOTA 10:</label>	
					<input type="number" class="form-control" step="0.01" name="cuota10" placeholder="Cuota 10" value="${articulo.cuota10}" >
				</div>
				<div class="form-group">
					<label for="nroVoucher">NRO VOUCHER:</label>	
					<input type="text" class="form-control" name="nroVoucher" placeholder="Nro. Voucher" value="${articulo.nroVoucher}" >
				</div>
				<div class="form-group">
					<label for="grado">GRADO:</label>	
					<input type="text" class="form-control" name="grado" placeholder="Grado" value="${articulo.grado}" >
				</div>--%>
				<div class="form-group">
					<input type="submit" class="btn btn-primary btn-block btn-login" value="Guardar" name="registrar">
				</div> 
			</form>
	</div>
	 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="js/editar.js"></script>
</body>
</html>