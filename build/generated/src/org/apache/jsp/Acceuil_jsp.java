package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.p.*;

public final class Acceuil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      UtCourant u = null;
      synchronized (session) {
        u = (UtCourant) _jspx_page_context.getAttribute("u", PageContext.SESSION_SCOPE);
        if (u == null){
          u = new UtCourant();
          _jspx_page_context.setAttribute("u", u, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("  background-color: #006080;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center the image and position the close button */\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.pdp {\n");
      out.write("  width: 20%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write(".imgcontainer1 {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.pdp1 {\n");
      out.write("  width: 20%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("  padding-top: 60px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".modal1 {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: #06140d; /* Black w/ opacity */\n");
      out.write("  padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("  background-color: #0c271a;\n");
      out.write("  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 50%; /* Could be more or less, depending on screen size */\n");
      out.write("}\n");
      out.write(".modal1-content1 {\n");
      out.write("  background-color: #0c271a;\n");
      out.write("  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("}\n");
      out.write("/* The Close Button (x) */\n");
      out.write(".close {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 25px;\n");
      out.write("  top: 0;\n");
      out.write("  color: #000;\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: red;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add Zoom Animation */\n");
      out.write(".animate {\n");
      out.write("  -webkit-animation: animatezoom 0.6s;\n");
      out.write("  animation: animatezoom 0.6s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes animatezoom {\n");
      out.write("  from {-webkit-transform: scale(0)} \n");
      out.write("  to {-webkit-transform: scale(1)}\n");
      out.write("}\n");
      out.write("  \n");
      out.write("@keyframes animatezoom {\n");
      out.write("  from {transform: scale(0)} \n");
      out.write("  to {transform: scale(1)}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.psw {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0; \n");
      out.write("  background-color: #0c271a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("  display: inline-block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: #006080;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("li.dropdown {\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content:hover .dec{background-color: #red}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #006080;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #006080;\n");
      out.write("}\n");
      out.write(".util{\n");
      out.write("    text-align: center;\n");
      out.write("    padding-left: 25%;\n");
      out.write("    padding-right: 25%;\n");
      out.write("    padding-top: 3%;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #06140d; font-size: 18px\">\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("<ul style=\"color: white;font-style: italic;font-size: 25px;\">\n");
      out.write("  <li><a class=\"active\">Acceuil</a></li>\n");
      out.write("  <li><a href=\"Messages.jsp\">Conversation</a></li>\n");
      out.write("  <li class=\"dropdown\" style=\"float: right;\">\n");
      out.write("    <a href=\"#\" class=\"dropbtn\">Profil</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\" onclick=\"document.getElementById('id01').style.display='block'\">Paramètres</a>\n");
      out.write("      <a href=\"index.jsp\" class=\"dec\" >Déconnection</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("</br></br>\n");
      out.write("<form action=\"Uservlet\" method=\"GET\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" style=\"width:15%;\" placeholder=\"Nom à rechercher\" name=\"nar\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-danger\" style=\"width:10%;\" name=\"rechercher\">Rechercher</button>\n");
      out.write("</form>\n");
      out.write("<div class=\"util\">\n");
List < Utilisateur > allu = UDAO.selectUsers();
        for (int k = 0; k < allu.size(); k++) {
      out.write("\n");
      out.write("            <div id=\"id1\">\n");
      out.write("               <form class=\"modal1-content1\" action=\"Uservlet\" method=\"POST\">\n");
      out.write("               <label style=\"color: white;\" ><b>");
      out.print(allu.get(k).getNom());
      out.write("</b></label>\n");
      out.write("               <div class=\"imgcontainer1\">\n");
      out.write("                  <img  alt=\"Pas de photo de profil\" class=\"pdp1\" src=\"");
      out.print(allu.get(k).getPdp());
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("               <div class=\"container1\"> \n");
      out.write("                  <button type=\"submit\" name=");
      out.print(allu.get(k).getNom());
      out.write(">Contacter</button>\n");
      out.write("                </div>             \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        ");
}
      out.write(" \n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"id01\" class=\"modal\"> \n");
      out.write("    <form class=\"modal-content animate\" action=\"Uservlet\" method=\"POST\">\n");
      out.write("    <label style=\"color: white;\"><b>Nom de l'utilisateur:\"");
      out.print(Uservlet.getNomU());
      out.write("\"</b></label>\n");
      out.write("    <div class=\"imgcontainer\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Fermer\">&times;</span>\n");
      out.write("      <img  alt=\"Pas de photo de profil\" class=\"pdp\" src=");
      out.print(Uservlet.getPdp());
      out.write(">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <label for=\"pdp\" class=\"control-label col-3\" style=\"color: white;\"><b>Changer le photo de profil</b></label>\n");
      out.write("      <input type=\"file\" class=\"form-control\" name=\"pdp\"></input><br><br> \n");
      out.write("      <label for=\"mdpp\" class=\"control-label col-3\" style=\"color: white;\"><b>Mot de passe</b></label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" placeholder=\"Entrer votre nouveau mot de passe\" name=\"mdpp\">\n");
      out.write("        \n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\" id=\"enrep\" name=\"enrep\" style=\"border: 1px solid #06140d; color: white; background-color:#006080; width: 20%\">Enregistrer</button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <button type=\"button\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white;background-color: #f44336;\" onclick=\"return confirm(Voulez-vous supprimer?)\"  name=\"suppr\">Supprimer le compte</button>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.w3schools.com/howto/tryit.asp?filename=tryhow_css_login_form_modal by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 08 Mar 2019 12:46:18 GMT -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
