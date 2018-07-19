<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <!-- Costumize CSS -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/1.0.7/css/responsive.dataTables.min.css">
    <title>Lista de aportaciones</title>
    <link rel="shortcut icon" href="img/jramos.ico?" type="image/x-icon" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3 text-center">
				&nbsp;
			</div>
			<div class="col-xs-7 col-sm-7 col-md-7 col-lg-7 text-center">
				<h2 class="text-center wdi-red">Lista general </h2>
			</div>
			<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 text-center">
				<a href="adminArticulo?action=indexAdm">(*)</a>
			</div>
			<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 text-left">
				&nbsp;
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center">
				<a class="btn btn-primary btn-sm" href="adminArticulo?action=nuevo" ><span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;Nuevo </span></a>
				<a class="btn btn-primary btn-sm" href="adminArticulo?action=index" ><span class="glyphicon glyphicon-off" aria-hidden="true">&nbsp;Salir </span></a>  
			</div>
		</div>
		
		<div class="row">
			<!-- <div class="col-xs-3 col-sm-6 col-md-12 col-lg-12"> -->
				<div class="responsive">
					<table id="tblArticulo" class="table table-striped table-bordered display" style="width:100%; margin-left:5px;">
						<thead>
							<tr>
								<th>#</th>
								<th>Sección</th>
								<th>Apellido Paterno</th>
								<th>Apellido Materno</th>
								<th>Nombres</th>
								<th>CUOTAS</th>
								<th>- CUOTA 2014</th>
								<th>- CUOTA 2015</th>
								<th>- CUOTA 2016</th>
								<th>- CUOTA 2017</th>
								<th>- CUOTA 2018</th>
								<th>- CUOTA 2019</th>
								<th>- CUOTA 2020</th>
								<th>Rifa 2018</th>
								<th>Tarjeta Fiesta US$</th>
								<!-- <th>CUOTA7</th>
								<th>CUOTA8</th>
								<th>CUOTA9</th>
								<th>CUOTA10</th>
								<th>NRO VOUCHER</th>
								<th>GRADO</th> -->
								<th>EDITAR</th>
								<th>ELIMINAR</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="articulo" items="${lista}">
								<tr>
									<td>${articulo.id}</td>
									<td>${articulo.seccion}</td>
									<td>${articulo.apePaterno}</td>
									<td>${articulo.apeMaterno}</td>
									<td>${articulo.nombres}</td>
									<td>${articulo.mesAporte}</td>
									<td>${articulo.cuota1}</td>
									<td>${articulo.cuota2}</td>
									<td>${articulo.cuota3}</td>
									<td>${articulo.cuota4}</td>
									<td>${articulo.cuota5}</td>
									<td>${articulo.cuota6}</td>
									<td>${articulo.cuota7}</td>
									<td>${articulo.mtoAporte}</td>
									<td>${articulo.totalAporte}</td>
									<%-- <td>${articulo.cuota7}</td>
									<td>${articulo.cuota8}</td>
									<td>${articulo.cuota9}</td>
									<td>${articulo.cuota10}</td>
									<td>${articulo.nroVoucher}</td>
									<td>${articulo.grado}</td> --%>
									<td><a href="adminArticulo?action=showedit&id=<c:out value="${articulo.id}" />">Editar</a></td>
									<td><a href="adminArticulo?action=eliminar&id=<c:out value="${articulo.id}"/>">Eliminar</a> </td>	
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		<!-- </div> -->
	</div>
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   <!--  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script> -->
    <script src="https://code.jquery.com/jquery-3.3.1.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    <!-- <script src="js/bootstrap.min.js"></script> -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
    <script src="js/mostrar.js"></script>
</body>
</html>