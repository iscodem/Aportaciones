<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Artículo</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Costumize CSS -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <title>Registrar nuevo integrante</title>
    <link rel="shortcut icon" href="img/jramos.ico?" type="image/x-icon" />
</head>
<body>
	<div class="container">
		<h2 class="text-center wdi-red">Registrar nuevo integrante</h2>
			
				<form action="adminArticulo?action=register" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="seccion" placeholder="Sección" >
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="apePaterno" placeholder="Apell. Paterno" >
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="apeMaterno" placeholder="Apell. Materno">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="nombres" placeholder="Nombres"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="mtoAporte" placeholder="RIFA 2018"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="totalAporte" placeholder="Tarjeta Fiesta US$"  >
					</div>
					<!-- <div class="form-group">
						<input type="text" class="form-control" name="mesAporte" placeholder="Mes Aporte"  >
					</div> -->
					
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota1" placeholder="Cuota 1"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota2" placeholder="Cuota 2"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota3" placeholder="Cuota 3"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota4" placeholder="Cuota 4" >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota5" placeholder="Cuota 5" >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota6" placeholder="Cuota 6" >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota7" placeholder="Cuota 7"  >
					</div>
					<!-- <div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota8" placeholder="Cuota 8"  >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota9" placeholder="Cuota 9" >
					</div>
					<div class="form-group">
						<input type="number" class="form-control" step="0.01" name="cuota10" placeholder="Cuota 10" >
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="nroVoucher" placeholder="Nro. Voucher" >
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="grado" placeholder="Grado" >
					</div> -->
					<div class="form-group">
						<div class="row">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center">
								<input type="submit" class="btn btn-primary btn-block btn-login" value="Agregar" name="agregar">
							</div>
						</div>
					</div>
				</form>
	</div>
	
		<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="js/register.js"></script>
</body>
</html>