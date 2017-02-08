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

/**
 *
 * @author Asus
 */
public class assign extends javax.swing.JInternalFrame {

    /**
     * Creates new form assign
     */
    public assign() {
        initComponents();
        
    }
    static int large = 0;
//-----------------------------------------------------------------------------------------------                
                
                
                @SuppressWarnings("unchecked")
                // <editor-fold defaultstate="collapsed" desc="Generated Code">
                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locality = new javax.swing.JComboBox<>();
        bus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        driver = new javax.swing.JComboBox<>();
        collector = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bassign = new javax.swing.JButton();
        bus1 = new javax.swing.JComboBox<>();
        driver1 = new javax.swing.JComboBox<>();
        collector1 = new javax.swing.JComboBox<>();
        assign1 = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("     ASSIGN DUTIES ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("LOCALITY NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 30));

        locality.setBackground(new java.awt.Color(236, 240, 241));
        locality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 30));

        bus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("DRIVER NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 30));

        driver.setBackground(new java.awt.Color(236, 240, 241));
        driver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(driver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 140, 30));

        collector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(collector, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("COLLERTOR NAME ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("BUS LICENCE NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 140, 30));

        Bassign.setBackground(new java.awt.Color(236, 240, 241));
        Bassign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bassign.setText("ASSIGN");
        Bassign.setEnabled(false);
        Bassign.setOpaque(false);
        Bassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BassignActionPerformed(evt);
            }
        });
        getContentPane().add(Bassign, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 95, 36));

        bus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(bus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 140, 30));

        driver1.setBackground(new java.awt.Color(236, 240, 241));
        driver1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(driver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 140, 30));

        collector1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE" }));
        getContentPane().add(collector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 140, 30));

        assign1.setBackground(new java.awt.Color(236, 240, 241));
        assign1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assign1.setText("CONFIRM");
        assign1.setOpaque(false);
        assign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign1ActionPerformed(evt);
            }
        });
        getContentPane().add(assign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 365, 120, 30));

        setBounds(0, 0, 654, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        collector1.setVisible(false);
        driver1.setVisible(false);
        bus1.setVisible(false);
//        locality1.setVisible(false);
        try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           
           try
           {
            String q = "select * from addcollector where assigned = 0 ";
            
            PreparedStatement mystatement = myconn.prepareStatement(q);
  
               ResultSet res = mystatement.executeQuery();
            //HOW MAY ROWS ARE AFFECTED BY THE QUERY
            while(res.next())
            {
                String id=res.getString("collector_id");

                String n=res.getString("name");
                collector.addItem(n+" "+id);
            }
               String l = "select * from addlocality where assigned = 0 ";
            
            mystatement = myconn.prepareStatement(l);
  
                res = mystatement.executeQuery();
            //HOW MAY ROWS ARE AFFECTED BY THE QUERY
            while(res.next())
            {
                String id=res.getString("id");

                String n=res.getString("name");
                locality.addItem(n+" "+id);
            }
            
               String b = "select * from addbus where assigned = 0 ";
            
            mystatement = myconn.prepareStatement(b);
  
                res = mystatement.executeQuery();
            //HOW MAY ROWS ARE AFFECTED BY THE QUERY
            while(res.next())
            {
                String id=res.getString("licence");
                bus.addItem(id);
            }

              String d = "select * from adddriver where assigned = 0 ";
            
            mystatement = myconn.prepareStatement(d);
  
                res = mystatement.executeQuery();
            //HOW MAY ROWS ARE AFFECTED BY THE QUERY
            while(res.next())
            {
                String id=res.getString("driver_id");

                String n=res.getString("name");
                driver.addItem(n+" "+id);
            }
            
           }
           catch(Exception e)
           {
                               JOptionPane.showMessageDialog(rootPane, "ERROR " + e.getMessage());

           }
           finally
           {
               myconn.close();
           }
       }
       catch(SQLException e)
       {
            JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
       }

        
    }//GEN-LAST:event_formInternalFrameActivated

    //-----------------------------------------------------------------------------------------------                

        int check()
        {
            String ch = "CHOOSE";
            if((collector.getSelectedItem().toString().equalsIgnoreCase(ch))||(driver.getSelectedItem().toString().equalsIgnoreCase(ch))||(bus.getSelectedItem().toString().equalsIgnoreCase(ch))||(locality.getSelectedItem().toString().equalsIgnoreCase(ch)))
            return 1;
            else
                return 0;
        }
        
        //-----------------------------------------------------------------------------------------------                

        int check1()
        {
            String ch = "CHOOSE";
            if((collector1.getSelectedItem().toString().equalsIgnoreCase(ch))||(driver1.getSelectedItem().toString().equalsIgnoreCase(ch))||(bus1.getSelectedItem().toString().equalsIgnoreCase(ch)))
            return 1;
            else
                return 0;
        }
   
        
    //-----------------------------------------------------------------------------------------------                
    
                void setvalue1(int L,int C,int D,String b)
                {
                            try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           
           try
           {
            String q = "update addcollector set assigned=?  where collector_id = "+C;
            
            PreparedStatement mystatement = myconn.prepareStatement(q);
            mystatement.setInt(1,1);
//            mystatement.setInt(2,C);
            int res = mystatement.executeUpdate();
              if(res>0){
                
            }
               String l = "update addlocality set assigned = ? where id = "+L;
            
            mystatement = myconn.prepareStatement(l);
  
            mystatement.setInt(1,1);
             res = mystatement.executeUpdate();
              if(res>0){
                
            }
            
               String b1 = "update addbus set assigned = ? where licence = '"+b+"'";
            
            mystatement = myconn.prepareStatement(b1);
  
      mystatement.setInt(1,1);
             res = mystatement.executeUpdate();
              if(res>0){
                
            }

              String d = "update adddriver set assigned = ?  where driver_id = "+D;
            
            mystatement = myconn.prepareStatement(d);
  
       mystatement.setInt(1,1);
             res = mystatement.executeUpdate();
              if(res>0){
                
            }
            
           }
           catch(Exception e)
           {
                               JOptionPane.showMessageDialog(rootPane, "ERROR " + e.getMessage());

           }
           finally
           {
               myconn.close();
           }
       }
       catch(SQLException e)
       {
            JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
       }

                }
                
    private void assign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign1ActionPerformed
       
        
 Bassign.setEnabled(true);
        
        try {
                                                Connection myconn = DriverManager.getConnection(url, un, pass);
                                                
                                                                  String l = locality.getSelectedItem().toString();
                                                                  int L = Integer.parseInt(l.substring((l.lastIndexOf(" ")+1),l.length()));
                                               // JOptionPane.showMessageDialog(rootPane, "yoo "+L);
                                                                  try
                                                {
                                                 String q = "select size from addlocality where id = ?";
                                                 PreparedStatement mystatement = myconn.prepareStatement(q);
                                                 mystatement.setInt(1,L);
                                                 ResultSet res = mystatement.executeQuery();
                                                 if(res.next())
        {
            if(res.getString("size").equalsIgnoreCase("large"))
        {
                           // JOptionPane.showMessageDialog(rootPane, "yoo "+L);
                            collector1.setVisible(true);
                             q = "select * from addcollector where assigned = 0 ";
                                mystatement = myconn.prepareStatement(q);
                                res = mystatement.executeQuery();
                               //HOW MAY ROWS ARE AFFECTED BY THE QUERY
            while(res.next())
            {
                String id=res.getString("collector_id");

                String n=res.getString("name");
                collector1.addItem(n+" "+id);
            }
            
                            driver1.setVisible(true);
                            
                            
                            bus1.setVisible(true);
//                            locality1.setVisible(true);
                            large = 1;
        }
            else
                {
                            collector1.setVisible(false);
                            driver1.setVisible(false);
                            bus1.setVisible(false);
//                            locality1.setVisible(false);
                }
        }

                                                             }
                                                   catch(Exception e)
                                                {
                                                                    JOptionPane.showMessageDialog(rootPane, "ERROR " + e.getMessage());

                                                }
                                                
                                            }
                                            catch(SQLException e)
                                            {
                                                 JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
                                            }
                


    }//GEN-LAST:event_assign1ActionPerformed

//-----------------------------------------------------------------------------------------------                
    private void BassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BassignActionPerformed

        if(check()==1)
        JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL OF THE ABOVE ");
        else
        {
            try
            {
                Connection myconn = DriverManager.getConnection(url, un, pass);
                //CONNECTION ESTABLISHMENT

                try
                {
                    String l,c,d,b;
                    l = locality.getSelectedItem().toString();
                    int L = Integer.parseInt(l.substring((l.lastIndexOf(" ")+1),l.length()));

                    c = collector.getSelectedItem().toString();
                    d = driver.getSelectedItem().toString();
                    b = bus.getSelectedItem().toString();
                    int C = Integer.parseInt(c.substring((c.lastIndexOf(" ")+1),c.length()));
                    int D = Integer.parseInt(d.substring((d.lastIndexOf(" ")+1),d.length()));
                    //int B = Integer.parseInt(b.substring(b.lastIndexOf(" "),b.length()));

                    setvalue1(L,C,D,b);

                    String q = "insert into assign(locality_id,bus_id,collector_id,driver_id) values(?,?,?,?) ";

                    PreparedStatement mystatement = myconn.prepareStatement(q);
                    mystatement.setInt(1,L);
                    mystatement.setString(2,b);
                    mystatement.setInt(3,C);
                    mystatement.setInt(4,D);

                    int res = mystatement.executeUpdate();
                    if(res>0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "DUTY ASSIGNED SUCCESSFULLY ");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "SOMETHING WENT WRONG ");

                    }
                    /////-------------------------------------------------------------------------------------------------------------------------------------
                    if(large==1)
                    {
                        if(check1()==1)
                        JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL OF THE ABOVE IN 2 ");
                        else
                        {

                            //              String l,c,d,b;
                            //l = locality1.getSelectedItem().toString();
                            // L = Integer.parseInt(l.substring((l.lastIndexOf(" ")+1),l.length()));

                            c = collector1.getSelectedItem().toString();
                            d = driver1.getSelectedItem().toString();
                            b = bus1.getSelectedItem().toString();
                            C = Integer.parseInt(c.substring((c.lastIndexOf(" ")+1),c.length()));
                            D = Integer.parseInt(d.substring((d.lastIndexOf(" ")+1),d.length()));
                            //int B = Integer.parseInt(b.substring(b.lastIndexOf(" "),b.length()));

                            String q1 = "insert into assign(locality_id,bus_id,collector_id,driver_id) values(?,?,?,?) ";

                            mystatement = myconn.prepareStatement(q1);
                            mystatement.setInt(1,L);
                            mystatement.setString(2,b);
                            mystatement.setInt(3,C);
                            mystatement.setInt(4,D);

                            res = mystatement.executeUpdate();
                            if(res>0)
                            {
                                //JOptionPane.showMessageDialog(rootPane, "DUTY ASSIGNED SUCCESSFULLY ");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "SOMETHING WENT WRONG IN 2");

                            }

                        }
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "ERROR IN QUERY 2 " + e.getMessage());

                }
                finally
                {
                    myconn.close();
                    large=0;
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
            }}

        
    }//GEN-LAST:event_BassignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bassign;
    private javax.swing.JButton assign1;
    private javax.swing.JComboBox<String> bus;
    private javax.swing.JComboBox<String> bus1;
    private javax.swing.JComboBox<String> collector;
    private javax.swing.JComboBox<String> collector1;
    private javax.swing.JComboBox<String> driver;
    private javax.swing.JComboBox<String> driver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> locality;
    // End of variables declaration//GEN-END:variables
}
