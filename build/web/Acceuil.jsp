<%@page import="com.p.Msg"%>
<%@page import="com.p.Uservlet"%>
<%@page import="com.p.UtCourant"%>
<%@page import="java.util.List"%>
<%@page import="com.p.UDAO"%>
<%@page import="com.p.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <meta charset="utf-8">
<style>
body {font-family: Arial, Helvetica, sans-serif;}


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
.util{
    text-align: center;
    padding-left: 30%;padding-right: 30%;
}
</style>
</head>
<body style="background-color: #06140d; font-size: 18px">
${alert0}
<ul style="color: white;font-style: italic;font-size: 20px;">
  <li><a href="#" class="active">Conversation</a></li>
  <li style="color: #0c271a;">Esp</li>
  <form action="Uservlet" method="POST">
  <li>
    <div class="form-group input-sm">
        <div style="padding-top:5%; ">
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
      <a href="#" onclick="document.getElementById('id01').style.display='block'" style=""><img src="icons/param.png"></a>
      <a href="index.jsp" class="dec" style=""><img src="icons/out.png"></a>
    </div>
  </li>
</ul></br></br> </br></br>

<div class="util">
<%List < Utilisateur > allu = UDAO.selectUsers(Uservlet.getNomU());
        for (int k = 0; k < allu.size(); k++) {
            String nbre="";
            List < Msg > m1 = UDAO.selectMsgUn(session.getAttribute("nomU").toString(),allu.get(k).getNom());
            for (int i = 0; i < m1.size(); i++) {
               if(!m1.isEmpty()){
                   if(i==m1.size()-1){
                    if(!m1.get(i).getNomU().equals(session.getAttribute("nomU").toString())){
                        nbre="1";
                    }
                    else{
                        nbre="";
                    }
               
                    }
               }
               else{
                    nbre="";
                }
               
            }



%>
        <div id="id1" style="background-color:#0c271a;">
               <form class="modal1-content1" action="Uservlet" method="POST">
               <label style="color: white;" ><b><%=allu.get(k).getNom()%></b></label>
               <div class="imgcontainer1">
                  <img  alt="Pas de photo de profil" class="rounded-circle" style="width:10%" src="<%=allu.get(k).getPdp()%>">
                </div>
               <div class="container1"> 
                  <button type="submit" style="color: white;font-style: italic;font-size: 15px;" name=<%=allu.get(k).getNom()%>><label style="color:white;font-size: 15px"><%=nbre%></label><img src="icons/msg.png"> Contacter</button>
                </div>            
            </form>
            </div></br></br> 
        <%}%> 
        
</div>
<div id="id01" class="modal"> 
    <form class="modal-content animate" action="Uservlet" method="POST">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Fermer">&times;</span>
      <label style="color: white;"><b><%=Uservlet.getNomU()%></b></label>
    </div>
    
    <div class="imgcontainer">
      
      <img  alt="Pas de photo de profil" class="pdp" src=<%=Uservlet.getPdp()%>>
    </div>
    <div class="container">
        <div class="form-group input-sm">
            <label class="col-sm-4 control-label" style="color: white;font-style: italic;font-size: 15px;">Changer la photo de profil</label>
            <div class="col-sm-8">
                <input type="file" class="form-control" name="pdp" style="color: white;font-style: italic;font-size: 12px;"></input>
            </div>
            </br>
            
        </div>
       <div class="form-group input-sm">
            <label for="mdpp" class="col-sm-4 control-label" style="color: white;font-style: italic;font-size: 15px;">Mot de passe</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" placeholder="Entrer votre nouveau mot de passe" name="mdpp" style="font-style: italic;font-size: 12px;">
            </div>
          
        </div>    
        <button type="submit" class="btn btn-default" id="enrep" name="enrep" style="border: 1px solid #06140d; color: white; background-color:#006080; width: 20%">Enregistrer</button>
        </br><button type="submit" class="btn btn-default" style="border: 1px solid #06140d; color: white;background-color: #f44336;"  name="supprimer">Supprimer le compte</button>
    </div>
      
    
  </form>
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

<!-- Mirrored from www.w3schools.com/howto/tryit.asp?filename=tryhow_css_login_form_modal by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 08 Mar 2019 12:46:18 GMT -->
</html>

