<%-- 
    Document   : Essai
    Created on : 26 mars 2022, 16:28:44
    Author     : Makaveli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Essai</title>
    </head>
    <body>
        <form class="form-horizontal" action="session" method="POST">
		    <div class="form-group">
		    	<div class="row">
					<label class="control-label col-3" for="nom" style="color: white;" name="hasina">Nom utilisateur:</label>
				    <div class="col-9" style="column-width: 400px;">
                                        <input type="text" class="form-control" id="noml" placeholder="Enter votre nom" name="n" value=${nom}>
                                        
				    </div>
			    </div></br>
		    	<div class="row">
			    	<label class="control-label col-3" for="pwd" onclick="verif()" style="color: black;">${h}</label>
			    	<div class="col-9" style="column-width: 400px;">          
			        	<input type="password" class="form-control" id="pwdl" placeholder="Enter votre mot de passe" name="mp">
			    	</div>
			    </div></br>      
		    <div class="btn-group">
		    	<div class="col-6">
                           <button type="submit" class="btn btn-default" id="connecter" name="conn" style="border: 1px solid #06140d; color: white; background-color:#006080;">Se connecter</button>

                           <button type="submit" class="btn btn-default" id="connecter" name="dec" style="border: 1px solid #06140d; color: white; background-color:#006080;">dec</button>
                           <a href="index.jsp">Lien</a>
                        </div>	        
		    </div>
		</div>		 
	  	</form>
    </body>
</html>
