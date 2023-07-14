 <%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.p.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="u" class="UtCourant" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  height: 30px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  font-size: 14px;
}

/* Set a style for all buttons */
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
.imgcontainer1 {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.pdp1 {
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

/* Modal Content/Box */
.modal-content {
  text-align: center;
  background-color: #0c271a;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 50%; /* Could be more or less, depending on screen size */
}
.modal1-content1 {
  background-color: #0c271a;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
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
.util{
    text-align: center;
    padding-left: 25%;
    padding-right: 25%;
    padding-top: 3%;
    width: 50%;
}
.row{
    padding-left: 3%;
    padding-right: 3%;
}
</style>
</head>
<body style="background-color: #06140d; font-size: 18px">
${alert3}
<ul style="color: white;font-style: italic;font-size: 20px;">
  <li><a class="active">Acceuil</a></li>
  <li><a href="Messages.jsp">Conversation</a></li>
  <li class="dropdown" style="float: right;">
    <a href="#" class="dropbtn">Profil<label style="color: #0c271a;"></label></a>
    
    <div class="dropdown-content">
      <a href="#" onclick="document.getElementById('id01').style.display='block'" style="font-size: 20px"><img src="icons/param.png"></a>
      <a href="index.jsp" class="dec" style="font-size: 12px;color: #f44336;"><img src="icons/out.png"></a>
    </div>
  </li>
</ul>
</br></br></br>
<div class="row" style="font-size: 14px">
    <div class="col-sm-4" style="background-color: #06140d;">
        <form class="form-horizontal" method="POST" action="Uservlet">
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;">IM</label>
                <div class="col-sm-10">
                  <input class="form-control" type="text" name="im" placeholder="Immatricule" required ${rim1} value=${rim}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;">CIN</label>
                <div class="col-sm-10">
                  <input class="form-control" type="text" name="cin" placeholder="Numero cin" required value=${rcin} ${rcin1}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Nom</label>
                <div class="col-sm-10">
                  <input class="form-control"  type="text" name="nom" placeholder="Nom" required value=${rnom}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Prenoms</label>
                <div class="col-sm-10">
                  <input class="form-control" type="text" name="prenoms" placeholder="Prenoms" required value=${rprenoms}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Date de naissance</label>
                <div class="col-sm-10">
                    <input class="form-control" style="height: 30px;font-size: 14px;" type="date" name="dateNaiss" required ${rdN} value=${dN} >
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" required>Aa</label>
                <div class="col-sm-10">
                  <input class="form-control" id="focusedInput" type="text" name="aa" placeholder="Attribution actuelle" required value=${raa}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Grade</label>
                <div class="col-sm-10" >
                    <%List < Grade > allg = UDAO.selectGrade();
                    
                    %>
                    <select class="form-control" name="grade" style="height: 30px;font-size: 14px;" ${rgrade}>
                    <%for (int k = 0; k < allg.size(); k++) {%>
                    <option <%=session.getAttribute(allg.get(k).getGrade())%>><%=allg.get(k).getGrade()%></option></br>                            
                    <%}%>
                    </select>
                </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Categorie</label>
                <div class="col-sm-10">
                    <select class="form-control" style="height: 30px;font-size: 14px;" name="cat">
                        <option ${I}>I</option>
                        <option ${II}>II</option>
                        <option ${III}>III</option>
                        <option ${IV}>IV</option>
                        <option ${V}>V</option>
                        <option ${VI}>VI</option>
                        <option ${VII}>VII</option>
                        <option ${VIII}>VIII</option>
                        <option ${IX}>IX</option>
                        <option ${X}>X</option>
                    </select>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Indice</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="indice" placeholder="indice" required value=${rindice}>
                </div>
            </div></br>
            </div>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Lt</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="lt" placeholder="Lieu de travail" required value=${rlt}>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Date d'entrée dans l'administration</label>
                <div class="col-sm-10">
                  <input class="form-control" style="height: 30px;font-size: 14px;" type="date" name="dateE" required ${rdE} value=${dE} >
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Adresse</label>
                <div class="col-sm-10">
                  <input class="form-control" type="text" name="ad" placeholder="Adresse" required value="${rad}">
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Status</label>
                <div class="col-sm-10">
                    <select class="form-control" style="height: 30px;font-size: 14px;" name="stat">
                        <option ${actif}>Actif</option>
                        <option ${retraite}>Retraite</option>
                        <option ${decede}>Decede</option>
                    </select>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Situation matrimoniale</label>
                <div class="col-sm-10">
                    <select class="form-control" style="height: 30px;font-size: 14px;" name="sm">
                        <option ${celibataire}>Celibataire</option>
                        <option ${marie}>Marie(e)</option>
                        <option ${divorce}>Divorce(e)</option>
                        <option ${veuf}>Veuf(ve)</option>
                    </select>
                </div>
            </div></br>
            <div class="form-group input-sm">
                <label class="col-sm-2 control-label" style="color: white;" >Tel</label>
                <div class="col-sm-10">
                  <input class="form-control" type="text" name="tel" placeholder="Numéro téléphone" required value=${rtel}>
                </div>
            </div></br>
            <div class="col-sm-6">
		<button type="submit" class="btn btn-default" name="enrePers" style="border: 1px solid #06140d; color: white; background-color:#006080;width: 80%;">Enregistrer</button>
            </div></br></br>
        </form>
    
    </div>
    <div class="col-sm-8">
        <div class="col-sm-12" style="text-align:center">
            <label for="nom" style="color: white;font-style: italic;font-size: 15px;">Liste des Personnels</label><br><br>
        </div> 
        <table class="table table-hover table-sm" style="color: white;font-style: italic;font-size: 10px;">
            <thead>
              <tr>
                <th>IM</th>
                <th>NOM</th>
                <th>PRENOMS</th>
                <th>FONCTION</th>
                <th>GRADE</th>
                <th>CATEGORIE</th>
                <th>INDEX</th>
                <th>TELEPHONE</th>
                <th>MODIFICATION</th>
                <th>IMMINENCE</th>
                <th>AVANCEMENT</th>
                <th>SUPPRESSION</th>
                
              </tr>
            </thead>
            <tbody>
              <tr class="success">
                  <%List < Personnel > p = UDAO.selectPers();
                  
        for (int i = 0; i < p.size(); i++) {
            Date dtr=null;
                List < Reclassement > r0 = UDAO.selectReclassement(p.get(i).getIm());
                for (int j = 0; j < r0.size(); j++) {
                    dtr=r0.get(j).getDateR(); 
                }
        
                long an0=0;
                long m0=0;
                long j0=0;
                Date d0=dtr;
                String ico="icons/oui.png";
                LocalDate n1 = LocalDate.now();
                Date n2=Date.valueOf(n1);
                if(n2.toLocalDate().getYear()<=d0.toLocalDate().getYear()){
                    an0=d0.toLocalDate().getYear()-n2.toLocalDate().getYear();
                    if(n2.toLocalDate().getMonthValue()<=d0.toLocalDate().getMonthValue()){
                        m0=d0.toLocalDate().getMonthValue()-n2.toLocalDate().getMonthValue();
                        if(n2.toLocalDate().getDayOfMonth()<=d0.toLocalDate().getDayOfMonth()){
                            j0=d0.toLocalDate().getDayOfMonth()-n2.toLocalDate().getDayOfMonth();
                        }
                        else{
                            j0=0;
                        }
                    }
                    else{
                        m0=0;
                    }
                    if(an0==0 && m0<=3){
                        ico="icons/yes.png";
                    }
                                        
                }
                if(d0.toLocalDate().getYear()<n2.toLocalDate().getYear()){
                    
                    ico="icons/no.png";
                    an0=n2.toLocalDate().getYear()-d0.toLocalDate().getYear();
                    if(n2.toLocalDate().getMonthValue()<=d0.toLocalDate().getMonthValue()){
                        m0=0;
                        if(n2.toLocalDate().getDayOfMonth()<=d0.toLocalDate().getDayOfMonth()){
                            j0=0;
                        }
                        else{
                            j0=n2.toLocalDate().getDayOfMonth()-d0.toLocalDate().getDayOfMonth();
                        }
                    }
                    else{
                        m0=n2.toLocalDate().getMonthValue()-d0.toLocalDate().getMonthValue();
                    }
                    
                }
                  
                  
                  
                  
                  %>
            <div id="id1" >
                <tr>
                <td><%=p.get(i).getIm()%></td>
                <td><%=p.get(i).getNom()%></td>
                <td><%=p.get(i).getPrenoms()%></td>
                <td><%=p.get(i).getAa()%></td>
                <td><%=p.get(i).getGrade()%></td>
                <td><%=p.get(i).getCat()%></td>
                <td><%=p.get(i).getIndice()%></td>
                <td><%=p.get(i).getTel()%></td>
                <form class="form-horizontal" method="POST" action="Uservlet">
                <td><button type="submit" class="btn btn-default" id="enrep" name="m<%=p.get(i).getIm()%>" style="border: 1px solid #06140d; color: white; background-color:#006080;font-size:10px ; width: 100%">Modifier</button></td>
                <td><img  alt="Pas de photo de profil" class="pdp" src=<%=ico%>></td>
                <td><button type="submit" class="btn btn-default" name="d<%=p.get(i).getIm()%>" style="border: 1px solid #06140d; color: white;background-color: #006080;font-size:10px ; width: 100%">Détails</button</td>
                <td><button type="submit" class="btn btn-default" name="s<%=p.get(i).getIm()%>" style="border: 1px solid #06140d; color: white;background-color: #f44336;font-size:10px ; width: 100%">Supprimer</button</td>
                
                </form>
                </tr>
           
            </div>
        <%}%> 
              </tr>      
        </table></br> 
        <div class="col-sm-12" style="text-align:center">
            <label for="nom" style="color: white;font-style: italic;font-size: 15px;">Liste des utilisateurs</label><br><br>
        </div> 
              <div class="tab2" style="text-align:center"> 
        <table class="table table-hover table-sm" style="color: white;font-style: italic;font-size: 10px;">
            <thead>
              <tr>
                <th>IM</th>
                <th>NOM</th>
                <th>MOT DE PASSE</th>               
              </tr>
            </thead>
            <tbody>
            <tr class="success">
                <%List < Utilisateur > ut = UDAO.selectAllUsers();
        for (int i = 0; i <ut.size(); i++) {%>
            <div id="id1" >
                <tr>
                <td><%=ut.get(i).getIm()%></td>
                <td><%=ut.get(i).getNom()%></td>
                <td><%=ut.get(i).getMdp()%></td>
                
                </form>
                </tr>
           
            </div>
        <%}%>
            </tr>
           
            </div>
       
              </tr>      
        </table>
            </div> 
    </div>
   

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
                <input type="password" class="form-control" placeholder="Entrer votre nouveau mot de passe" name="mdpp" style="color: white;font-style: italic;font-size: 12px;">
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


