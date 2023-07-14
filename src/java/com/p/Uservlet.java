package com.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;


/**
 *
 * @author Makaveli
 */

public class Uservlet extends HttpServlet {
    static String nomU;
    static String pdp;
    static String nR;
    static String nar;
    String action="ajouter";
    public static String getNar(){
        return Uservlet.nar;
    }
    public static String getNr(){
        return Uservlet.nR;
    }
    public static String getNomU(){
        return Uservlet.nomU;
    }
    public static String getPdp(){
        return Uservlet.pdp;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Uservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>NOM " + request.getServletPath()+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getAttribute("dec")==null){
            int i=JOptionPane.showConfirmDialog(null, "OK");
            if(i==0){
                response.sendRedirect("index.jsp");
            }
            else{
                response.sendRedirect("Personnel.jsp");
            }
        }
        
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.setAttribute("n", request.getParameter("n"));
        session.setAttribute("mp", request.getParameter("mp"));
        session.setAttribute("imminence","icons/oui.png");
        //session.setAttribute("action", "ajouter");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        List < Personnel >p = UDAO.selectPers();
        for (int a = 0; a < p.size(); a++) {
                
            if(request.getParameter("m"+String.valueOf(p.get(a).getIm()))!=null){
                
                action="modifier";
                session.setAttribute("imm",String.valueOf(p.get(a).getIm()) );
                session.removeAttribute("STAGIAIRE");
                session.removeAttribute("2EME CLASSE 1ER ECHELON");
                session.removeAttribute("2EME CLASSE 2EME ECHELON");
                session.removeAttribute("2EME CLASSE 3EME ECHELON");
                session.removeAttribute("1ER CLASSE 1ER ECHELON");
                session.removeAttribute("1ER CLASSE 2EME ECHELON");
                session.removeAttribute("1ER CLASSE 3EME ECHELON");
                session.removeAttribute("PRINCIPAL 1ER ECHELON");
                session.removeAttribute("PRINCIPAL 2EME ECHELON");
                session.removeAttribute("PRINCIPAL 3EME ECHELON");
                session.removeAttribute("EXCEPTIONNEL 1ER ECHELON");
                session.removeAttribute("EXCEPTIONNEL 2EME ECHELON");
                session.removeAttribute("EXCEPTIONNEL 3EME ECHELON");
                request.setAttribute("rim",String.valueOf(p.get(a).getIm()));
                request.setAttribute("rim1","disabled");
                request.setAttribute("rcin",String.valueOf(p.get(a).getCin()));
                request.setAttribute("rcin1","disabled");
                request.setAttribute("rnom",String.valueOf(p.get(a).getNom()));
                request.setAttribute("rprenoms",String.valueOf(p.get(a).getPrenoms()));
                request.setAttribute("raa",String.valueOf(p.get(a).getAa()));
                request.setAttribute("rlt",String.valueOf(p.get(a).getLt()));
                request.setAttribute("rtel",String.valueOf(p.get(a).getTel()));
                request.setAttribute("rad",String.valueOf(p.get(a).getAdresse()));
                request.setAttribute("rindice",String.valueOf(p.get(a).getIndice()));
                
                session.setAttribute("ag", p.get(a).getGrade());
                
                if(String.valueOf(p.get(a).getCat()).equals("I")){
                    request.setAttribute("I","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("II")){
                    request.setAttribute("II","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("III")){
                    request.setAttribute("III","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("IV")){
                    request.setAttribute("IV","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("V")){
                    request.setAttribute("V","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("VI")){
                    request.setAttribute("VI","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("VII")){
                    request.setAttribute("VII","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("VIII")){
                    request.setAttribute("VIII","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("IX")){
                    request.setAttribute("IX","selected");
                }
                if(String.valueOf(p.get(a).getCat()).equals("X")){
                    request.setAttribute("X","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("STAGIAIRE")){
                    session.setAttribute("STAGIAIRE","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("2EME CLASSE 1ER ECHELON")){
                    session.setAttribute("2EME CLASSE 1ER ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("2EME CLASSE 2EME ECHELON")){
                    session.setAttribute("2EME CLASSE 2EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("2EME CLASSE 3EME ECHELON")){
                    session.setAttribute("2EME CLASSE 3EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("1ER CLASSE 1ER ECHELON")){
                    session.setAttribute("1ER CLASSE 1ER ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("1ER CLASSE 2EME ECHELON")){
                    session.setAttribute("1ER CLASSE 2EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("1ER CLASSE 3EME ECHELON")){
                    session.setAttribute("1ER CLASSE 3EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("PRINCIPAL 1ER ECHELON")){
                    session.setAttribute("PRINCIPAL 1ER ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("PRINCIPAL 2EME ECHELON")){
                    session.setAttribute("PRINCIPAL 2EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("PRINCIPAL 3EME ECHELON")){
                    session.setAttribute("PRINCIPAL 3EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("EXCEPTIONNEL 1ER ECHELON")){
                    session.setAttribute("EXCEPTIONNEL 1ER ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("EXCEPTIONNEL 2EME ECHELON")){
                    session.setAttribute("EXCEPTIONNEL 2EME ECHELON","selected");
                }
                if(String.valueOf(p.get(a).getGrade()).equals("EXCEPTIONNEL 3EME ECHELON")){
                    session.setAttribute("EXCEPTIONNEL 3EME ECHELON","selected");
                }
                if(p.get(a).getStat().equals("Actif")){
                    request.setAttribute("actif","selected");
                }
                if(p.get(a).getStat().equals("Retraite")){
                    request.setAttribute("retraite","selected");
                }
                if(p.get(a).getStat().equals("Decede")){
                    request.setAttribute("decede","selected");
                }
                
                if(p.get(a).getSm().equals("Celibataire")){
                    session.setAttribute("celibataire","selected");
                }
                if(p.get(a).getSm().equals("Marie(e)")){
                    request.setAttribute("Marie","selected");
                }
                if(p.get(a).getSm().equals("Divorce(e)")){
                    request.setAttribute("divorce","selected");
                }
                if(p.get(a).getSm().equals("Veuf(ve)")){
                    request.setAttribute("veuf","selected");
                }
                request.setAttribute("dN",String.valueOf(p.get(a).getDateNaiss()));
                request.setAttribute("dE",String.valueOf(p.get(a).getDateE()));
                request.setAttribute("rdN","disabled");
                request.setAttribute("rdE","disabled");
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
                session.setAttribute("action","modifier");
            } 
            if(request.getParameter("s"+String.valueOf(p.get(a).getIm()))!=null){
                session.setAttribute("imf",String.valueOf(p.get(a).getIm()));
                int i=JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer ce personnel");
                if(i==0){
                    int stat=UDAO.deletePers(Integer.parseInt(session.getAttribute("imf").toString()));
                    if(stat>0){
                        request.setAttribute("alert3", "<script>alert(\"Suppression effectuée\");</script>");
                        request.getRequestDispatcher("Personnel.jsp").forward(request, response);
                    }
                    else{
                        response.sendRedirect("Erreur.jsp");
                    }
                }
                else{
                    response.sendRedirect("Personnel.jsp");
                }
            }
            if(request.getParameter("d"+String.valueOf(p.get(a).getIm()))!=null){
                Date dateR=null;
                List < Reclassement > r = UDAO.selectReclassement(p.get(a).getIm());
                for (int j = 0; j < r.size(); j++) {
                    dateR=r.get(j).getDateR(); 
                }
        
                long an=0;
                long m=0;
                long j=0;
                Date d=dateR;

                LocalDate n0 = LocalDate.now();
                Date n=Date.valueOf(n0);
                if(n.toLocalDate().getYear()<=d.toLocalDate().getYear()){
                    an=d.toLocalDate().getYear()-n.toLocalDate().getYear();
                    if(n.toLocalDate().getMonthValue()<=d.toLocalDate().getMonthValue()){
                        m=d.toLocalDate().getMonthValue()-n.toLocalDate().getMonthValue();
                        if(n.toLocalDate().getDayOfMonth()<=d.toLocalDate().getDayOfMonth()){
                            j=d.toLocalDate().getDayOfMonth()-n.toLocalDate().getDayOfMonth();
                        }
                        else{
                            j=0;
                        }
                    }
                    else{
                        m=0;
                    }
                    JOptionPane.showMessageDialog(null, "Le prochain avancement sera le "+dateR+"\n Il reste à peu près "+an+"ans "+m+"mois et "+j+"jours avant l'avancement");
                }
                else{
                    an=n.toLocalDate().getYear()-d.toLocalDate().getYear();
                    if(n.toLocalDate().getMonthValue()<=d.toLocalDate().getMonthValue()){
                        m=0;
                        if(n.toLocalDate().getDayOfMonth()<=d.toLocalDate().getDayOfMonth()){
                            j=0;
                        }
                        else{
                            j=n.toLocalDate().getDayOfMonth()-d.toLocalDate().getDayOfMonth();
                        }
                    }
                    else{
                        m=n.toLocalDate().getMonthValue()-d.toLocalDate().getMonthValue();
                    }
                    JOptionPane.showMessageDialog(null, "Le dernier avancement était le "+dateR+"\n Il est passé à peu près "+an+"ans "+m+"mois et "+j+"jours depuis l'avancement");
                }
                
                response.sendRedirect("Personnel.jsp");
                 
                System.out.println(dateR);
                
            }
        }
            
        
        
        if(request.getParameter("enrePers")!=null){
            if(action.equals("modifier")){
                if(request.getParameter("grade").equals(session.getAttribute("ag"))){
                    try {
                    updatePers1(request,response,Integer.parseInt(session.getAttribute("imm").toString()));
                    action="ajouter";
                    session.removeAttribute("ag");
                    } catch (SQLException ex) {
                        Logger.getLogger(Uservlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                    updatePers2(request,response,Integer.parseInt(session.getAttribute("imm").toString()),request.getParameter("grade"));
                    session.removeAttribute(action);
                    session.removeAttribute("ag");
                    } catch (SQLException ex) {
                        Logger.getLogger(Uservlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            else{
                try {
                insertPers(request,response);
                } catch (SQLException ex) {
                    Logger.getLogger(Uservlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        
            
        }
        
        if(request.getParameter("rechercher")!=null){
            nar=request.getParameter("nar"); 
            List < Utilisateur > allu = UDAO.searchUsers(nar,nomU);
            if(nar.equals("")){
                if(nomU.equals("Admin")){
                    request.getRequestDispatcher("Messages.jsp").forward(request, response);
                }
                else{
                    request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
                }
                
            }
            if(allu.isEmpty()){
                if(nomU.equals("Admin")){
                    request.setAttribute("alert2", "<script>alert(\"Aucun utilisateur relié à ce nom ou c'est votre compte\");</script>");
                    request.getRequestDispatcher("Messages.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("alert0", "<script>alert(\"Aucun utilisateur relié à ce nom\");</script>");
                    request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
                }
                
            }
            else{
                if(nomU.equals("Admin")){
                    request.setAttribute("nar", nar);
                    request.getRequestDispatcher("AcceuilR1.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("nar", nar);
                    request.getRequestDispatcher("AcceuilR.jsp").forward(request, response);
                }
                 
            }
                
              
        }
        if(request.getParameter("ajouter")!=null){                      
            try {
                insertU(request,response);
            } catch (SQLException ex) {
                Logger.getLogger(Uservlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
        if(request.getParameter("annuler")!=null){
            response.sendRedirect("Creation_compte.jsp");
        }
        if(request.getParameter("connecter")!=null){
            try {
                connecter(request,response);                 
            }catch (SQLException ex) {
                Logger.getLogger(Uservlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(request.getParameter("supprimer")!=null){
            int i=JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer votre compte");
            if(i==0){
                int stat=UDAO.delete(nomU);
                if(stat>0){
                    request.setAttribute("alert0", "<script>alert(\"Votre compte a été supprimer\");</script>");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                else{
                    response.sendRedirect("Erreur.jsp");
                }
            }
            else{
                if(nomU.equals("Admin")){
                    response.sendRedirect("Personnel.jsp");
                }
                else{
                    response.sendRedirect("Acceuil.jsp");
                }
                
            }
            
        }
        if(request.getParameter("supM")!=null){
            int j=JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer votre compte");
            if(j==0){
                int stat=UDAO.deleteM(nomU,nR);
                if(stat>0){
                    
                    if(nomU.equals("Admin")){
                        request.setAttribute("alert5", "<script>alert(\"Messages supprimés\");</script>");
                        request.setAttribute("disp", "block");
                        request.setAttribute("pdpR", UDAO.selectPdp(nR));
                        request.getRequestDispatcher("Nmsg.jsp").forward(request, response);
                    }
                    else{
                        request.setAttribute("alert4", "<script>alert(\"Messages supprimés\");</script>");
                        request.setAttribute("disp1", "block");
                        request.setAttribute("pdpR", UDAO.selectPdp(nR));
                        request.getRequestDispatcher("Nmsg1.jsp").forward(request, response);
                    }
                }
                else{
                    if(nomU.equals("Admin")){
                        //request.setAttribute("alert5", "<script>alert(\"Messages supprimés\");</script>");
                        request.setAttribute("disp", "block");
                        request.setAttribute("pdpR", UDAO.selectPdp(nR));
                        request.getRequestDispatcher("Nmsg.jsp").forward(request, response);
                    }
                    else{
                        //request.setAttribute("alert4", "<script>alert(\"Messages supprimés\");</script>");
                        request.setAttribute("disp1", "block");
                        request.setAttribute("pdpR", UDAO.selectPdp(nR));
                        request.getRequestDispatcher("Nmsg1.jsp").forward(request, response);
                    }
                }
            }
            else{
                if(nomU.equals("Admin")){
                    request.setAttribute("disp", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("disp1", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg1.jsp").forward(request, response);
                }
                
            }
            
        }
        
        List < Utilisateur > u = UDAO.selectUsers(nomU);
        for (int i = 0; i < u.size(); i++) {
            if(request.getParameter(u.get(i).getNom())!=null){
                session.setAttribute("nomR", u.get(i).getNom());
                nR=u.get(i).getNom();
                if(nomU.equals("Admin")){
                    request.setAttribute("disp", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("disp1", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg1.jsp").forward(request, response);
                }
            }
        }
        if(request.getParameter("envoi")!=null){
            System.out.println(request.getParameter("mess"));
            LocalDate dateE = LocalDate.now();
            LocalTime heureE = LocalTime.now();
            
            int stat=UDAO.insertM(request.getParameter("mess"),Date.valueOf(dateE),Time.valueOf(heureE),Uservlet.getNr(),Uservlet.getNomU());
            if(stat>0){
                if(nomU.equals("Admin")){
                    request.setAttribute("disp", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("disp1", "block");
                    request.setAttribute("pdpR", UDAO.selectPdp(nR));
                    request.getRequestDispatcher("Nmsg1.jsp").forward(request, response);
                }
            }
            else{
                System.out.println("ERREUR");
            }
        }
        if(request.getParameter("contacter")!=null){
            response.sendRedirect("Messages.jsp");
        }
        if(request.getParameter("enrep")!=null){
            if(request.getParameter("mdpp").equals("") && request.getParameter("pdp").equals("")){
                request.setAttribute("alert1", "<script>alert(\"Veuiller remplir au moins un champ\");</script>");
                request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
                return;
            }

            if(!request.getParameter("pdp").equals("") && !request.getParameter("mdpp").equals("")){
                updateAll(request,response);   
            }
            if(!request.getParameter("pdp").equals("") && request.getParameter("mdpp").equals("")){
                updatePdp(request,response);   
            }
            if(!request.getParameter("mdpp").equals("") && request.getParameter("pdp").equals("")){
                updateMdp(request,response);   
            }
            
            
 }       
    }
    
    private void updateAll(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        String mdp=request.getParameter("mdpp");
        String p=request.getParameter("pdp");
        String b="";
        String c="";
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)=='\\'){
                break;
            }
            b+=p.charAt(i);
        }
        for(int i=b.length()-1;i>=0;i--){
            c+=b.charAt(i);
        }
        String pp="images/"+c;
        int stat=UDAO.updateAll(nomU,mdp, pp);
        if(UDAO.selectPdp(nomU).equals("")){
            pdp="";
        }
        else{
            pdp=UDAO.selectPdp(nomU);
        }
        
        if(stat>0){
            if(nomU.equals("Admin")){
                request.setAttribute("alert3", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
            else{
                request.setAttribute("alert0", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
            }
            
        }
        
    }
    private void updateMdp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        String mdp=request.getParameter("mdpp");
        int stat=UDAO.updateMdp(nomU,mdp);
        if(stat>0){
            if(nomU.equals("Admin")){
                request.setAttribute("alert3", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
            else{
                request.setAttribute("alert0", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
            }
        }
        
    }
    private void updatePdp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String p=request.getParameter("pdp");
        String b="";
        String c="";
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)=='\\'){
                break;
            }
            b+=p.charAt(i);
        }
        for(int i=b.length()-1;i>=0;i--){
            c+=b.charAt(i);
        }
        String pp="images/"+c;
        int stat=UDAO.updatePdp(nomU,pp);
        pdp=UDAO.selectPdp(nomU);
        if(stat>0){
            if(nomU.equals("Admin")){
                request.setAttribute("alert3", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
            else{
                request.setAttribute("alert0", "<script>alert(\"Modification effectuée\");</script>");
                request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
            }
        }
        
    }
    
    private void connecter(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        HttpSession session=request.getSession();
        session.setAttribute("nomU", request.getParameter("nomU"));
        session.setAttribute("mdp", request.getParameter("mdp"));
        nomU=session.getAttribute("nomU").toString();
        pdp=UDAO.selectPdp(nomU);
        session.setAttribute("pdp", pdp);
        String mdpl=request.getParameter("mdpl");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        List < Utilisateur > u = UDAO.selectAllUsers();
        for (int i = 0; i < u.size(); i++) {
            if(nomU.equals(u.get(i).getNom())){
                if(!request.getParameter("mdp").equals(u.get(i).getMdp())){
                    request.setAttribute("n", session.getAttribute("nomU").toString());
                    request.setAttribute("m", session.getAttribute("mdp").toString());
                    request.setAttribute("alert0", "<script>alert(\"Mot de passe incorrect\");</script>");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                if(request.getParameter("mdp").equals(u.get(i).getMdp())){
                    if(nomU.equals("Admin")){
                        request.setAttribute("alert3", "<script>alert(\"Connexion réussie\");</script>");
                        request.getRequestDispatcher("Personnel.jsp").forward(request, response);
                    }
                    else{
                        request.setAttribute("alert0", "<script>alert(\"Connexion réussie\");</script>");
                        request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
                    }
                    
                }
                break;
            }
            if(i==u.size()-1){
                request.setAttribute("n", session.getAttribute("nomU").toString());
                request.setAttribute("m", session.getAttribute("mdp").toString());
                request.setAttribute("alert0", "<script>alert(\"Ce compte n'existe pas\");</script>");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
         }
        
        
    }
    private void insertPers(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
        int num=0;
        int d=0;
        Date dateR;
        int im=Integer.parseInt(request.getParameter("im"));
        String cin=request.getParameter("cin");
        String nom=request.getParameter("nom");
        String prenoms=request.getParameter("prenoms");
        String aa=request.getParameter("aa");
        String lt=request.getParameter("lt");
        String ad=request.getParameter("ad");
        String stat=request.getParameter("stat");
        String sm=request.getParameter("sm");
        String grade=request.getParameter("grade");
        List < Grade > g = UDAO.selectNumGrade(grade);
        for (int k = 0; k < g.size(); k++) {
            num=g.get(k).getNum(); 
            d=g.get(k).getDuree();
        }
        
        String cat=request.getParameter("cat");
        int indice=Integer.parseInt(request.getParameter("indice"));
        String tel=request.getParameter("tel");
        Date dateE=Date.valueOf(request.getParameter("dateE"));
        String d0=request.getParameter("dateE");
        String d1=d0.substring(0,4);
        
        int di=Integer.parseInt(d1)+d;
        String d2=String.valueOf(di)+d0.substring(4, 10);
        dateR=Date.valueOf(d2);
        Date dateNaiss=Date.valueOf(request.getParameter("dateNaiss"));
        Personnel p=new Personnel(im,cin,nom,prenoms,aa,lt,ad,stat,sm, grade,cat,indice,tel,dateE,dateNaiss);
        int s=UDAO.insertPers(p,num+1,dateR);
                if(s>0){
                    request.setAttribute("alert3","<script>alert(\"Enregistrement effectué\");</script>" );
                    request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
                else{
                    request.setAttribute("alert3","<script>alert(\"Un personnel est déjà enregisté sur cette im\");</script>" );
                    request.getRequestDispatcher("Personnel.jsp").forward(request, response);
                }
    }
    private void updatePers1(HttpServletRequest request, HttpServletResponse response,int im)throws SQLException, IOException, ServletException {
        String cin=request.getParameter("cin");
        String nom=request.getParameter("nom");
        String prenoms=request.getParameter("prenoms");
        String aa=request.getParameter("aa");
        String lt=request.getParameter("lt");
        String ad=request.getParameter("ad");
        String stat=request.getParameter("stat");
        String sm=request.getParameter("sm");
        String grade=request.getParameter("grade");
        String cat=request.getParameter("cat");
        int indice=Integer.parseInt(request.getParameter("indice"));
        String tel=request.getParameter("tel");
        Date dateE=null;
        Date dateNaiss=null;
        Personnel p=new Personnel(im,cin,nom,prenoms,aa,lt,ad,stat,sm, grade,cat,indice,tel,dateE,dateNaiss);
        int s=UDAO.updatePers1(p);
            if(s>0){
                request.setAttribute("alert3","<script>alert(\"Modification effectuée\");</script>" );
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
    }
    private void updatePers2(HttpServletRequest request, HttpServletResponse response,int im,String gr)throws SQLException, IOException, ServletException {
        int num=0;
        int d=0;
        Date dateR;
        String cin=request.getParameter("cin");
        String nom=request.getParameter("nom");
        String prenoms=request.getParameter("prenoms");
        String aa=request.getParameter("aa");
        String lt=request.getParameter("lt");
        String ad=request.getParameter("ad");
        String stat=request.getParameter("stat");
        String sm=request.getParameter("sm");
        String grade=request.getParameter("grade");
        List < Grade > g = UDAO.selectNumGrade(gr);
        for (int k = 0; k < g.size(); k++) {
            num=g.get(k).getNum(); 
            d=g.get(k).getDuree();
        }
        
        String cat=request.getParameter("cat");
        int indice=Integer.parseInt(request.getParameter("indice"));
        String tel=request.getParameter("tel");
        Date dateE=null;
        List < Reclassement > r = UDAO.selectReclassement(im);
        for (int j = 0; j < r.size(); j++) {
            dateE=r.get(j).getDateR(); 
        }
        String d0=dateE.toString();        
        String d1=d0.substring(0,4); 
        System.out.println(d1);
        int di=Integer.parseInt(d1)+d;
        String d2=String.valueOf(di)+d0.substring(4, 10);
        dateR=Date.valueOf(d2);
        Date dateNaiss=null;
        Personnel p=new Personnel(im,cin,nom,prenoms,aa,lt,ad,stat,sm, grade,cat,indice,tel,dateE,dateNaiss);
        int s=UDAO.updatePers2(p,num+1,dateR);
            if(s>0){
                request.setAttribute("alert3","<script>alert(\"Modification effectuée\");</script>" );
                request.getRequestDispatcher("Personnel.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
    }
    private void insertU(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
        int imi=Integer.parseInt(request.getParameter("imi"));
        String nom=request.getParameter("nomA");
        String mdp=request.getParameter("mdpA");
        String cmdp=request.getParameter("cmdpA");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        System.out.println(nom);
        Utilisateur u=new Utilisateur(imi,nom,mdp);
        String a="";
        List < Utilisateur > u1 = UDAO.selectAllUsers();
        for (int i = 0; i < u1.size(); i++) {
            int im=u1.get(i).getIm();
            if(imi==im){
                a="<script>alert(\"Un personnel ne doit pas avoir deux comptes\");</script>";
                request.setAttribute("nimi", imi);
                request.setAttribute("nA", nom);
                request.setAttribute("mdpA", mdp);
                request.setAttribute("cmdpA", cmdp);
                request.setAttribute("alert2", a);
                request.setAttribute("creer", "<script>document.getElementById('id01').style.display='block';</script>");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }
            
        }
           
        if((nom.equals("")) || (nom.equals("") && (mdp.equals("") || cmdp.equals(""))) ||(!nom.equals("") && (mdp.equals("") || cmdp.equals("")))  ){
            if(!mdp.equals(cmdp)){
                a="<script>alert(\"Confirmation du mot de passe incorrect\");</script>";
                request.setAttribute("nimi", imi);
                request.setAttribute("nA", nom);
                request.setAttribute("mdpA", mdp);
                request.setAttribute("cmdpA", cmdp);
                request.setAttribute("alert2", a);
                request.setAttribute("creer", "<script>document.getElementById('id01').style.display='block';</script>");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            return;
        }
        if(!nom.equals("")){
            if(!mdp.equals(cmdp)){
                a="<script>alert(\"Confirmation du mot de passe incorrect\");</script>";
                request.setAttribute("nimi", imi);
                request.setAttribute("nA", nom);
                request.setAttribute("mA", mdp);
                request.setAttribute("cmA", cmdp);
                request.setAttribute("alert2", a);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            else{
                int stat=UDAO.insertU(u);
                if(stat>0){
                    a="<script>alert(\"Création de compte effectuée, connectez-vous!\");</script>";
                    request.setAttribute("alert2", a);
                    request.setAttribute("n", nom);
                    request.setAttribute("creer", "<script>document.getElementById('id01').style.display='none';</script>");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
            }
                else{
                    a="<script>alert(\"Veuiller entrer un autre nom d'utilisateur car l'utilisateur que vous avez entré existe déjà\");</script>";
                    request.setAttribute("nimi", imi);
                    request.setAttribute("nA", nom);
                    request.setAttribute("mA", mdp);
                    request.setAttribute("cmA", cmdp);
                    request.setAttribute("alert2", a);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }
            
            
        
        }
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
