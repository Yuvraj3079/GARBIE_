/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagemanagent;

import static garbagemanagent.vars.pass;
import static garbagemanagent.vars.un;
import static garbagemanagent.vars.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class start {
static int check=0;
 
    public static void main(String[] args) 
    {
        try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           
           try
           {
            String q = "select * from admintable";
            PreparedStatement mystatement = myconn.prepareStatement(q);
             
              ResultSet res = mystatement.executeQuery();
              if(res.next())
              {
                  
                  check=1;
              }
              else
            {
                       check=0;

           }
              if(check ==0)
                    {
                       
                        create_admin obj  = new create_admin();
                        obj.setVisible(true);  

                    }
                    else
                    {
                        LOGIN obj  = new LOGIN();
                        obj.setVisible(true);  
                    }

           }
             catch(Exception e)
           {
                               JOptionPane.showMessageDialog(null, "ERROR IN QUERY " + e.getMessage());

           }
           finally
           {
               myconn.close();
           }
       }
       catch(SQLException e)
       {
            JOptionPane.showMessageDialog(null, "EROOR WHILE CONNECTIONG " + e.getMessage());
       }

        
        

    }
    
}
