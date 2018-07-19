<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Consulta de aportaciones</title>

<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Costumize CSS -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="shortcut icon" href="img/jramos.ico?" type="image/x-icon" />
</head>
<body class="mibody">
	<div class="container">
      <div class="row justify-content-md-center">
        <div class="col-md-6 col-md-auto login-box miFondo">
          <!-- <h2 class="text-center wdi-white">Asociación XXXII PROM.<br>CMLP - LIMA</h2> -->
          <h1 class="text-center wdi-white"></h1>
          <hr>
          <span id="divErrorMessageLogin" class="divError"> Debe ingresar sus credenciales correctas.</span>
          <form id="formLogin" method="POST" action="adminArticulo">
			<input type="hidden" name="action" value="mostrar"/>
			<input type="hidden" id="indAdm" name="indAdm" value=""/>
           
            <div class="form-row">
              <div class="col-md-12">
               <!--<input type="text" name="username" id="username" class="form-control form-control-lg flat-input" placeholder="username" onkeypress="return submitLoginOnKeypressInput(event);"> -->
              </div>
              <div class="col-md-12">
                <input type="hidden" name="password" id="password" class="form-control form-control-lg flat-input" placeholder="password" value="JRAMOSC" onkeypress="return submitLoginOnKeypressInput(event);">
              </div>
              <!-- <button id="btnSubmitLogin" type="button" class="btn btn-lg btn-block btn-login">Administrar</button> -->
              <button id="btnSubmitParticipante" type="button" class="btn btn-lg btn-block btn-login">Ingresar</button>
            </div>
            <div class="form-row">
            	<div class="col-md-12">
            		<!-- <button id="btnSubmitLogin" type="button" class="btn btn-lg btn-block btn-login">Administrar</button> -->
            	</div>
            </div>
          </form>
        </div>
      </div>
    </div>
    
		<!-- 
		<table border="1" width="50%" align="center">
			<tr>
				<td align="center"><a href="adminArticulo?action=nuevo">Nuevo</a></td>			
			</tr>
			<tr>
				<td align="center"><a href="adminArticulo?action=mostrar">Mostrar</a></td>
			</tr>
		</table>
		 -->
		
<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/login.js"></script>
</body>
</html>