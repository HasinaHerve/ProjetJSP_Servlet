<%-- 
    Document   : newjsp
    Created on : 25 mars 2022, 01:44:33
    Author     : Makaveli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
		    		<button type="submit" name="aa" id="ajouter" class="btn btn-default" style="border: 1px solid #06140d; color: white; background-color:#006080;">Enregistrer</button>
		    	</div>
		        <div class="col-6">
                            <button type="submit" name="aaa" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #f44336;text-align: right;">Annuler</button>
		        </div>		        
		    </div>
		</div>		 
	  	</form>
    </body>
</html>
