<%@page import="java.util.List"%>
<%@page import="com.p.Personnel"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.p.*"%>
<jsp:useBean id="ub" class="UtCourant" scope="session"></jsp:useBean>
<html>
<style>
/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}



span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
  padding-left: 20%;
  padding-right:  20%;
}

/* Modal Content/Box */
.modal-content {
  background-color: #0c271a;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 50%; /* Could be more or less, depending on screen size */
  padding-left: 20%;
  padding-right:  20%;
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Index</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body style="background-color: #06140d; font-size: 18px">
${alert0}
${alert2}
	<div class="container-fluid bg-3 text-center" style="background-color:#0c271a;"></br></br>
		<div class="row">
			<label class="control-label" style="color: white;font-style: italic;font-size: 30px;">Gestion des avancements du Personnel</label>
		</div>
		
	</div></br></br>	
	<div class="container bg-3 text-center" style=" background-color:#0c271a; "></br>
            <form class="form-horizontal" action="Uservlet" method="POST">
		    <div class="form-group">
		    	<div class="row">
					<label class="control-label col-3" for="nomU" style="color: white;">Nom utilisateur:</label>
				    <div class="col-9" style="column-width: 400px;">
				    	<input type="text" class="form-control" id="noml" placeholder="Entrer votre nom" name="nomU" required value=${n}>
                                        
				    </div>
			    </div></br>
		    	<div class="row">
			    	<label class="control-label col-3" for="pwd" onclick="verif()" style="color: white;">Mot de passe:</label>
			    	<div class="col-9" style="column-width: 400px;">          
			        	<input type="password" class="form-control" id="pwdl" placeholder="Entrer votre mot de passe" name="mdp" required value=${m}>
			    	</div>
			</div></br>      
		    <div class="btn-group">
		    	<div class="col-6">
		    		<button type="submit" class="btn btn-default" id="connecter" name="connecter" style="border: 1px solid #06140d; color: white; background-color:#006080;">Se connecter</button>
		    	</div>
		        <div class="col-6">
		        	<label class="control-label" for="creer" style="color: white;">Avez-vous un compte? sinon,</label>
		        	<button type="button" onclick="document.getElementById('id01').style.display='block'" class="btn btn-default" style="border: 1px solid #06140d; color: white;">Créer un compte</button>
		        </div>		        
		    </div>
		</div>		 
	  	</form></br></br> 	  
	</div></br></br></br></br></br></br></br></br></br></br></br></br>
	<div class="container-fluid text-center" style="background-color:#0c271a;"></br></br>
		<label class="control-label" for="nom" style="color: white;font-style: italic;font-size: 15px;">Copyright 2022</label>
		</br></br>
	</div>	
        <div id="id01" class="modal">
        <form class="modal-content animate" action="Uservlet" method="POST" style=" background-color:#0c271a; ">
    <div class="imgcontainer">
       <img src="icons/images.png" class="img-circle" width="100" height="100">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
    </div>

    <div class="container">
        <div class="form-group input-sm">
            <%List < Personnel > p = UDAO.selectPers();%>
            <label class="control-label col-sm-2" for="imi" style="color: white;">Im:</label>
            <div class="form-group input-sm">
                <select class="form-control" name="imi" style="font-size: 14px;width: 40%">
                    <%for (int k = 0; k < p.size(); k++) {%>
                        <option><%=p.get(k).getIm()%></option></br>                            
                    <%}%>
                </select>
            </div>
            
        </div>
        <div class="form-group input-sm">
            <label class="control-label col-sm-2" for="imi" style="color: white;">Nom utilisateur:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="noml" placeholder="Entrer votre nom" name="nomA" required value=${nA}>
            </div>
        </div>
        <div class="form-group input-sm">
            <label class="control-label col-sm-2" for="imi" style="color: white;" onclick="verif()">Mot de passe:</label>
            <div class="col-sm-10">
                <input type="password"  class="form-control"  placeholder="Entrer votre mot de passe" name="mdpA" required value=${mA}></br>
                <input type="password" class="form-control" placeholder="Confirmer votre mot de passe" name="cmdpA" required value=${cmA}></br>
                <button type="submit" class="btn btn-default" name="ajouter" style="border: 1px solid #06140d; color: white; background-color:#006080; width: 30%">Enregistrer</button>
            </div>
        </div></br>

        </div>
        
	</div>
  
    </form>


<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>	

</body>
</html>
