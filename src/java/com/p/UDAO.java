package com.p;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UDAO {
    static Connection con;
    static PreparedStatement pst;
    static PreparedStatement pst1;
    public static int insertU(Utilisateur u){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Insert into Utilisateur(nom,mdp,im) values(?,?,?)");
            pst.setString(1, u.getNom());
            pst.setString(2, u.getMdp());
            pst.setInt(3, u.getIm());
            stat=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }
    public static List < Personnel > selectPers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Personnel > p = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from \"Personnel\"");) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int im=rs.getInt("im");
                String cin=rs.getString("cin");
                String nom=rs.getString("nom");
                String prenoms=rs.getString("prenoms");
                String aa=rs.getString("aa");
                String lt=rs.getString("lt");
                String adresse=rs.getString("ad");
                String stat=rs.getString("stat");
                String sm=rs.getString("sm");
                String grade=rs.getString("grade");
                String cat=rs.getString("categorie");
                int indice=rs.getInt("indice");
                String tel=rs.getString("tel");
                Date dateE=rs.getDate("dateE");
                Date dateNaiss=rs.getDate("dateNaiss");
                p.add(new Personnel(im,cin,nom,prenoms, aa, lt, adresse,  stat,  sm,  grade, cat, indice, tel,dateE, dateNaiss));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return p;
    }
    public static int insertM(String msg,Date d,Time t, String nomR,String nomU){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Insert into Message values(?,?,?,?,?)");
            pst.setString(1, msg);
            pst.setDate(2,d);
            pst.setTime(3, t);
            pst.setString(4, nomR);
            pst.setString(5, nomU);
            stat=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }
    public static int insertPers(Personnel p,int num, Date dateR){
        int s=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Insert into \"Personnel\" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst1=con.prepareStatement("Insert into \"Reclassement\" values(?,?,?)");
            pst1.setInt(1, p.getIm());
            pst1.setInt(2,num);
            pst1.setDate(3, dateR);
            pst.setInt(1, p.getIm());
            pst.setString(2,p.getCin());
            pst.setString(3, p.getNom());
            pst.setString(4, p.getPrenoms());
            pst.setString(5, p.getAa());
            pst.setString(6, p.getLt());
            pst.setString(7, p.getAdresse());
            pst.setString(8,p.getStat());
            pst.setString(9,p.getSm());
            pst.setString(10,p.getGrade());
            pst.setString(11,p.getCat());
            pst.setInt(12, p.getIndice());
            pst.setDate(13, p.getDateE());
            pst.setString(14, p.getTel());   
            pst.setDate(15, p.getDateNaiss());
            pst.executeUpdate();
            System.out.println(pst);
            s=pst1.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return s;
    }
    public static int updatePers1(Personnel p){
        int s=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update \"Personnel\" set nom=?,prenoms=?,aa=?,lt=?,categorie=?,indice=?,ad=?,stat=?,sm=?,tel=? where im=?");
            pst.setInt(11, p.getIm());
            pst.setString(1, p.getNom());
            pst.setString(2, p.getPrenoms());
            pst.setString(3, p.getAa());
            pst.setString(4, p.getLt());
            pst.setString(5, p.getCat());
            pst.setInt(6, p.getIndice());
            pst.setString(7, p.getAdresse());
            pst.setString(8, p.getStat());
            pst.setString(9, p.getSm());
            pst.setString(10, p.getTel());   
            System.out.println(pst);
            s=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return s;
    }
    public static int updatePers2(Personnel p,int num, Date dateR){
        int s=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update \"Personnel\" set nom=?,prenoms=?,aa=?,lt=?,categorie=?,indice=?,ad=?,stat=?,sm=?,tel=?,grade=? where im=?");
            pst.setInt(12, p.getIm());
            pst.setString(1, p.getNom());
            pst.setString(2, p.getPrenoms());
            pst.setString(3, p.getAa());
            pst.setString(4, p.getLt());
            pst.setString(5, p.getCat());
            pst.setInt(6, p.getIndice());
            pst.setString(7, p.getAdresse());
            pst.setString(8, p.getStat());
            pst.setString(9, p.getSm());
            pst.setString(10, p.getTel());   
            pst.setString(11, p.getGrade());
            pst1=con.prepareStatement("Update \"Reclassement\" set num=?,\"dateR\"=? where im=?");
            pst1.setInt(1, num);
            pst1.setDate(2,dateR);
            pst1.setInt(3, p.getIm());
            pst.executeUpdate();
            System.out.println(pst1);
            s=pst1.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return s;
    }
   public static List < Grade > selectNumGrade(String grade) {
       List < Grade > g = new ArrayList < > ();
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from \"Grade\" where grade=?");) {
            preparedStatement.setString(1, grade);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int num = rs.getInt("num");
                String nom = rs.getString("grade");
                int d = rs.getInt("duree");
                g.add(new Grade(num, nom,d));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return g;
    }
   public static List < Reclassement > selectReclassement(int im) {
       List < Reclassement > r = new ArrayList < > ();
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from \"Reclassement\" where im=?");) {
            preparedStatement.setInt(1, im);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int imm = rs.getInt("im");
                int num = rs.getInt("num");
                Date dateR = rs.getDate("dateR");
                
                r.add(new Reclassement(imm,num,dateR));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }
   
    public static List < Utilisateur > selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Utilisateur > users = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from Utilisateur");) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int im = rs.getInt("im");
                String nom = rs.getString("nom");
                String mdp = rs.getString("mdp");
                String pdp = rs.getString("pdp");
                users.add(new Utilisateur(im,nom, mdp,pdp));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return users;
    }
    public static String selectPdp(String nom) {
        String p="";
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement ps = connection.prepareStatement("SELECT pdp from Utilisateur where nom=?");) {
            ps.setString(1, nom);
            System.out.println(ps);
            // Step 3: Execute the query or update query
            ResultSet rs = ps.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                p = rs.getString("pdp");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return p;
    }
    public static int delete(String nom) {
        int stat=0;
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
PreparedStatement ps1 = connection.prepareStatement("DELETE from Message where \"nomU\"=? or \"nomR\"=?");PreparedStatement ps = connection.prepareStatement("DELETE from Utilisateur where nom=?");) {
            ps1.setString(1, nom);
            ps1.setString(2, nom);
            ps.setString(1, nom);
            ps1.executeUpdate();
            stat=ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return stat;
    }
    public static int deletePers(int im) {
        int stat=0;
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
PreparedStatement ps1 = connection.prepareStatement("DELETE from \"Personnel\" where \"im\"=?");PreparedStatement ps = connection.prepareStatement("DELETE from \"Reclassement\" where im=?");PreparedStatement ps2 = connection.prepareStatement("DELETE from \"utilisateur\" where im=?");) {
            ps1.setInt(1,im);
            ps2.setInt(1,im);
            ps.setInt(1,im);
            ps2.executeUpdate();
            ps.executeUpdate();
            
            stat=ps1.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return stat;
    }
    public static List < Grade > selectGrade() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Grade > g = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from \"Grade\" order by num asc");) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int num=rs.getInt("num");
                String grade = rs.getString("grade");
                int d=rs.getInt("duree");
                g.add(new Grade(num,grade,d));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return g;
    }
    
    public static List < Utilisateur > selectUsers(String n) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Utilisateur > users = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from Utilisateur where nom!=?");) {
            preparedStatement.setString(1, n);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int im=rs.getInt("im");
                String nom = rs.getString("nom");
                String mdp = rs.getString("mdp");
                String pdp = rs.getString("pdp");
                users.add(new Utilisateur(im,nom, mdp,pdp));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return users;
    }
    public static List < Utilisateur > searchUsers(String nar,String nomU) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Utilisateur > users = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from Utilisateur where nom like ? and nom!=?");) {
            preparedStatement.setString(1,nar);
            preparedStatement.setString(2,nomU);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int im=rs.getInt("im");
                String nom = rs.getString("nom");
                String mdp = rs.getString("mdp");
                String pdp = rs.getString("pdp");
                users.add(new Utilisateur(im,nom, mdp,pdp));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return users;
    }
    
    public static List < Msg > selectMsgUn(String nR, String nU) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Msg > m = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Message where \"dateE\" in(select distinct(\"dateE\") from Message where (\"nomR\"=? and \"nomU\"=?) or (\"nomR\"=? and \"nomU\"=?)  order by \"dateE\" asc ) and (\"nomR\"=? and \"nomU\"=?) or (\"nomR\"=? and \"nomU\"=?)  ");) {
            preparedStatement.setString(1, nR);
            preparedStatement.setString(2, nU);
            preparedStatement.setString(3, nU);
            preparedStatement.setString(4, nR);
            preparedStatement.setString(5, nR);
            preparedStatement.setString(6, nU);
            preparedStatement.setString(7, nU);
            preparedStatement.setString(8, nR);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String msg = rs.getString("msg");
                String dateE = rs.getString("dateE");
                String heureE = rs.getString("heureE");
                String nomR = rs.getString("nomR");
                String nomU = rs.getString("nomU");
                m.add(new Msg(msg,dateE,heureE,nomR,nomU));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return m;
    }
    public static int deleteM(String nomU,String nR) {
        int stat=0;
        try (Connection connection = Connex.getCon();

            // Step 2:Create a statement using connection object
PreparedStatement ps1 = connection.prepareStatement("DELETE from Message where (\"nomU\"=? and \"nomR\"=?)or (\"nomU\"=? and \"nomR\"=?)");) {
            ps1.setString(1, nomU);
            ps1.setString(2, nR);
            ps1.setString(3, nR);
            ps1.setString(4, nomU);
            stat=ps1.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return stat;
    }
    public static int updateAll(String nom,String mdp,String path){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update Utilisateur set mdp=?,pdp=? where nom=?");
            pst.setString(1, mdp);
            pst.setString(2, path);
            pst.setString(3, nom);
            stat=pst.executeUpdate(); 
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }
    public static int updateMdp(String nom,String mdp){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update Utilisateur set mdp=? where nom=?");
            pst.setString(1, mdp);
            pst.setString(2, nom);
            stat=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }
    public static int updatePdp(String nom,String pdp){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update Utilisateur set pdp=? where nom=?");
            pst.setString(1, pdp);
            pst.setString(2, nom);
            stat=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }
    public static int updateNom(String nom,String nnom){
        int stat=0;
        try{
            con=Connex.getCon();
            pst=con.prepareStatement("Update Utilisateur set nom=? where nom=?");
            pst.setString(1, nnom);
            pst.setString(2, nom);
            stat=pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return stat;
    }

}
