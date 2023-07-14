<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <script src="jquery-3.6.0.min.js"></script>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta charset="utf-8">
  <title>Profil</title>
</head>
<body style="background-color: #06140d;">
    
  <div class="container-fluid bg-3 text-center" style="background-color:#0c271a; position: fixed;"></br></br>
    <div class="row">
      <label class="control-label" style="color: white;font-style: italic;font-size: 30px;"><%=session.getAttribute("nomU")%></label>
      <input class="form-control" type="date" name="adresse">
    </div>
    
  </div></br></br> </br></br></br></br> 
  <div class="container bg-3 text-center" style=" background-color:#0c271a; ">
    <div class="container text-center" style="">
      
    </div>
  </br>
  <form class="form-horizontal" action="Uservlet" method="POST">
        <div class="form-group">
          <div class="row">
            <div class="container"> 
              <img src="D://FRONT//img.jpg" class="img-circle" alt="Photo de profil" width="304" height="236"> 
              <div class="text-center">
                <input type="file" name="pdp" selectionDirection="image">
              </div>
              
            </div></br>       
      </form></br></br>     
  </div></br></br></br></br>
  <div class="container-fluid text-center" style="background-color:#0c271a;"></br></br>
    <div class="btn-group">
          <div class="col-6">
            <button type="submit" class="btn btn-default" style="border: 1px solid #06140d; color: white; background-color:#006080;">Enregistrer</button>
          </div>
            <div class="col-6" style="text-align: right;">
              <button type="submit" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #990000;">Annuler</button>
            </div>            
        </div>
    </br></br>
  </div>    
  

</body>
</html>
