<%@page import="java.util.List"%>
<%@page import="com.p.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nouveau messages</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<style>
 body {font-family: Arial, Helvetica, sans-serif;}
 button {
  background-color: #006080;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
}

button:hover {
  opacity: 0.8;
}
 .mod{
  display: none;
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
}
.mod-content {
  background-color: #0c271a;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}
.container {
  padding: 16px;
}
.bt {
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.bt1{border-radius: 12px;background-color: #06140d;width: auto;}
.bt2{border-radius: 12px;background-color: #006080; width: auto;}
.c {
  padding-right: 20%;
  padding-left: 20%;
}
* {
  box-sizing: border-box;
}

.msg{
    background-color: white;
}

button {
  background-color: #006080;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 30%;
}

button:hover {
  opacity: 0.8;
}

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

img.pdp {
  width: 20%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal1 {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #06140d; /* Black w/ opacity */
  padding-top: 60px;
}
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
  
}
/* Modal Content/Box */
.modal-content {
  background-color: #0c271a;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 50%; /* Could be more or less, depending on screen size */
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
ul {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  width: 100%;
  list-style-type: none;
  margin: 0;
  padding: 0;
  background-color: #0c271a;

}

li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: #006080;
}


li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content:hover .dec{background-color: #red}

.dropdown:hover .dropdown-content {
  display: block;
}
li a:hover:not(.active) {
  background-color: #006080;
}

.active {
  background-color: #006080;
}
.column {
  float: left;
  width: 100%;
  padding: 50px;
  text-align: center;
  font-size: 25px;
  cursor: pointer;
  color: white;
}
.c {
  padding-right: 20%;
  padding-left: 20%;
}
* {
  box-sizing: border-box;
}

.msg{
    background-color: white;
}
table#tm r{
  background-color: black;
}        
</style>
    </head>
<body style="background-color: #06140d;">
${alert4}
<ul style="color: white;font-style: italic;font-size: 20px;">
  <li><a href="#" class="active">Conversation</a></li>
  <li style="color: #0c271a;">Esp</li>
  <form action="Uservlet" method="POST">
  <li>
    <div class="form-group input-sm">
        <div style="padding-top:5%;">
            <input class="form-control" type="text" name="nar" placeholder="Rechercher">
        </div>
    </div>
  </li>
  <li>
    <div class="form-group input-sm" >
        <div style="padding-top:3%;">
            <button type="submit" class="btn" style="border: 1px solid #06140d; color: white; background-color:#006080;text-align: center; width: 100%" name="rechercher"><img src="icons/search.png"></button>
        </div>
    </div>
  </li>
  </form>
  <li class="dropdown" style="float: right;">
    <a href="#" class="dropbtn">Profil</a>
    <div class="dropdown-content">
      <a href="#" onclick="document.getElementById('id01').style.display='block'">Paramètres</a>
      <a href="#" class="dec">Déconnection</a>
      
    </div>
  </li>
</ul></br></br> </br></br>
<div id="id01" class="modal"> 
    <form class="modal-content animate" action="Uservlet" method="POST">
    <label style="color: white;"><b>Nom de l'utilisateur:"<%=session.getAttribute("nomU").toString()%>"</b></label>
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Fermer">&times;</span>
      <img  alt="Pas de photo de profil" class="pdp" src=<%=Uservlet.getPdp()%>>
    </div>
    <div class="container">
      <label for="pdp" class="control-label col-3" style="color: white;"><b>Changer le photo de profil</b></label>
      <input type="file" class="form-control" name="pdp"></input><br><br> 
      <label for="mdpp" class="control-label col-3" style="color: white;"><b>Mot de passe</b></label>
      <input type="password" class="form-control" placeholder="Entrer votre nouveau mot de passe" name="mdpp">
        
      <button type="submit" class="btn btn-default" id="enrep" name="enrep" style="border: 1px solid #06140d; color: white; background-color:#006080; width: 20%">Enregistrer</button>
    </div>
      <button type="submit" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #f44336;"  name="supprimer">Supprimer le compte</button>
    
  </form>
</div>    
    <div id="id1" class="mod" style="display:${disp1}"> 
        <div class="container" >
            <a style="color:#006080" href="Acceuil.jsp"><img src="icons/retour.png"></a>
            <label for="mdpp" class="control-label col-3" style="color: white;"><%=Uservlet.getNr()%></label>
        </div>
      
        <div class="container" style="background-color:#0c271a;">
            <img  alt="Pas de photo de profil" class="rounded-circle" style="width:5%" src=${pdpR}> 
            <table style=" width: 50%; height: 100px;">
                <%List < Msg > m1 = UDAO.selectMsgUn(session.getAttribute("nomU").toString(),session.getAttribute("nomR").toString());%>
           <%for (int i = 0; i < m1.size(); i++) {
               if(!m1.get(i).getNomU().equals(session.getAttribute("nomU").toString())){
                   out.print("<tr><td><label style=\"color: white; font-size:8px;\">"+m1.get(i).getDateE()+" "+m1.get(i).getHeureE().substring(0,5)+"</label></br><button class=\"btn-group btn-group-md bt1\" style=\"font-size:12px;\">"+m1.get(i).getMsg()+"</button></td></tr>");
               }
               else{
                   out.print("<tr><td></td><td><label style=\"color: white; font-size:8px;\">"+m1.get(i).getDateE()+" "+m1.get(i).getHeureE().substring(0,5)+"</label></br><button class=\"btn-group btn-group-md bt2\" style=\"font-size:12px;\">"+m1.get(i).getMsg()+"</button></td></tr>");
               }
            }%>
            </table>
            <form method="POST" action="Uservlet">
                <div class="col-12">
                        <input type="text" class="form-control" placseholder="Tapez votre message" name="mess"> 
                    </div>
                    <div class="col">
                        <button name="envoi"  type="submit" class="btn btn-default" style="color: white; background-color:#006080;width:15%;">Envoyer<img src="icons/send2.png"></button>
                    </div>
                <button type="submit" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #f44336; width:10%;"  name="supM">Supprimer</button>
            </form>  
        </div>
          
    </div>
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
