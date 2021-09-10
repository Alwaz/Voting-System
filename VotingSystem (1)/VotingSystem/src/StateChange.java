/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */

//import java.sql.*;
//import javax.swing.JOptionPane;

public class StateChange {

//    public static boolean statebutton=true;
/*    
    public static boolean retrievestate(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","lunaaurora");
            
            Statement st = con.createStatement();
            //mysql query 
            String sql = "select * from statechange";
            ResultSet rst = st.executeQuery(sql);
            
            while(rst.next()){
                //data will be added until finish 
                statebutton = rst.getBoolean("change");
                //string array t store data in jtable 
             }
            
            con.close();
        }
        
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return statebutton;
    }

    public static boolean updatestate(boolean a){
      
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e) {
         System.out.println("Class not found "+ e);
        }       
        

      try {
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","lunaaurora");
         
         Statement stmt = conn.createStatement();
         String sql = "UPDATE statechange SET change='"+a+"' WHERE change = '"+statebutton+"'');";
         
         stmt.execute(sql);
         
         ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
         System.out.println("id  name    job");
         
         while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String job = rs.getString("job");
            System.out.println(id+"   "+name+"    "+job);
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","lunaaurora");
            Statement st=conn.createStatement();
            String sql = "UPDATE statechange SET change='"+a+"' WHERE change = '"+statebutton+"'');";
            ResultSet pstmt=st.executeQuery(sql);
            
            while(pstmt.next()){
            statebutton = pstmt.getBoolean("change");
            }
        }
        
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return statebutton;
        }
        return statebutton;
    }
    
    public static void main (String args[]){
        System.out.println(retrievestate());
        System.out.println(updatestate(false));
    }
    
    
    
    //UPDATE `votingsystem`.`statechange` SET `change` = '0' WHERE (`change` = '1');*/
}
 