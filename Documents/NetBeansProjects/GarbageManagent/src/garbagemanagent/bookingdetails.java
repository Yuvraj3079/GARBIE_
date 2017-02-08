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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class bookingdetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form bookingdetails
     */
    public bookingdetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Address", "Phone Number", "Sweeper IDs"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 797, 494);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated


        try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           
           try
           {
            String q = "select * from booking order by date asc";
            PreparedStatement mystatement = myconn.prepareStatement(q);

            {
                jTable1.removeAll();
             //mystatement.setString(1,jTextField1.getText());
              ResultSet res = mystatement.executeQuery();
              while(res.next())
              {
                 String t=res.getString("time");

                  //String n=res.getString("name");
                  String a=res.getString("address");
                  String p=res.getString("phone");
                  
                 Date d;
                 d = res.getDate("date");
                 String dob = d.toString();
                 String names="";
                 String ids =  res.getString("sweeperassigned");
                 names = ids.substring(0, (ids.length()-1));
             
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={dob,t,a,p,names};
                mymodel.addRow(myrow);
              
               if(jTable1.getRowCount()==0)
               {
                   JOptionPane.showMessageDialog(rootPane,"No Memebers Found");
               }
               

           }

            }
           }
             catch(Exception e)
           {
                               JOptionPane.showMessageDialog(rootPane, "ERROR IN QUERY " + e.getMessage());

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
