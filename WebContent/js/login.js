$(document).ready(function () {
	 $("#btnSubmitLogin").on("click", clickBtnSubmitLogin);
	 $("#btnSubmitParticipante").on("click", clickBtnSubmitParticipante);
	 
	 $("#username").on("keydown",function(){
		 if($("#username").val()!="" && $("#password").val()!=""){
			 $("#divErrorMessageLogin").css("display", "none");
		 }else{
			 $("#divErrorMessageLogin").css("display", "block"); 
		 }
	 });
	 
	 $("#password").on("keydown",function(){
		 if($("#username").val()!="" && $("#password").val()!=""){
			 $("#divErrorMessageLogin").css("display", "none");
		 }else{
			 $("#divErrorMessageLogin").css("display", "block");
		 }
	 });
});

function clickBtnSubmitLogin() {
	//$("#divErrorMessageLogin").hide();
	var formNode = $("#formLogin");
	if (formNode) {
        var username= $("#username").val();
        var password=$("#password").val();
		formNode.find("input[name='username']").val(username);
        formNode.find("input[name='password']").val(password);
        
        if(username!="" && password!=""){
            if(username.toUpperCase()=="JRAMOSC"){
            	$("#indAdm").val("S");
            	formNode.submit();
            }else{
            	$("#divErrorMessageLogin").val("Usted no posee las credenciales correctas.");
            	$("#divErrorMessageLogin").css("display", "block");
            	$("#divErrorMessageLogin").show();
            }
        }else{
        	$("#divErrorMessageLogin").val("Debe ingresar sus credenciales correctos.");
        	$("#divErrorMessageLogin").css("display", "block");
        }
	}
}

function clickBtnSubmitParticipante(){
	//$("#divErrorMessageLogin").hide();
	var formNode = $("#formLogin");
	if (formNode) {
		formNode.submit();
	}
}

var submitLoginOnKeypressInput = function(event) {
	var keyCode = window.event ? event.keyCode : event.which;
	if (keyCode == 13) {
		clickBtnSubmitLogin();
		return false;
	}
	else {
		return true;
	}
}