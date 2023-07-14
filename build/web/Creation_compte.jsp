<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<script src="jquery-3.6.0.min.js"></script>
	<script src="bootstrap/js/bootstrap.min"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<title>Creation de compte</title>
</head>
<body style="background-color: #06140d;">
	<div class="container-fluid bg-3 text-center" style="background-color:#0c271a;"></br></br>
		<div class="row">
			<label class="control-label" for="nom" style="color: white;font-style: italic;font-size: 30px;">Création de compte CPC</label>
		</div>
		
	</div></br></br>	
	<div class="container bg-3 text-center" style=" background-color:#0c271a; ">
		<div class="container text-center" style="">
			<a href="index.jsp">Retour</a>
			
		</div>
	</br>
            <form class="form-horizontal" action="Uservlet" method="POST">
		    <div class="form-group">
		    	<div class="row">
					<label class="control-label col-3" for="nom" style="color: white;">Nom utilisateur:</label>
				    <div class="col-9" style="column-width: 400px;">
				    	<input type="text" class="form-control" placeholder="Enter votre nom" name="nom" required>
				    </div>
			    </div></br>
		    	<div class="row">
			    	<label class="control-label col-3" for="mdp" style="color: white;">Mot de passe:</label>
			    	<div class="col-9" style="column-width: 400px;">          
			        	<input type="password" class="form-control" placeholder="Enter votre mot de passe" name="mdp" required>
			    	</div>
			    </div></br>
			    <div class="row">
			    	<label class="control-label col-3" for="cmdp" style="color: white;"></label>
			    	<div class="col-9" style="column-width: 400px;">          
			        	<input type="password" class="form-control" placeholder="Confirmer votre mot de passe" name="cmdp" required>
			    	</div>
			    </div></br>       
		    <div class="btn-group">
		    	<div class="col-6">
		    		<button type="submit" name="ajouter" id="ajouter" class="btn btn-default" style="border: 1px solid #06140d; color: white; background-color:#006080;">Enregistrer</button>
		    	</div>
		        <div class="col-6">
                            <button type="submit" name="annuler" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #f44336;text-align: right;">Annuler</button>
		        </div>		        
		    </div>
		</div>		 
	  	</form></br></br> 	  
	</div></br></br></br></br></br></br></br></br></br></br>
	<div class="container-fluid text-center" style="background-color:#0c271a;"></br></br>
		<label class="control-label" for="nom" style="color: white;font-style: italic;font-size: 15px;">Copyright 2022</label>
		</br></br>
	</div>		
	

</body>
</html>
