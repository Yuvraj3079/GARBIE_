/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
update single column with same value
 */
package garbagemanagent;

import static garbagemanagent.vars.pass;
import static garbagemanagent.vars.un;
import static garbagemanagent.vars.url;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class salary extends javax.swing.JInternalFrame {

String tablename,sal;

    public salary() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jemp = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jsal = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        done = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("SALARY");
        setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("                      SALARY");

        jemp.setText("EMPLOYEE TYPE");
        jemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE", "DRIVER", "COLLECTOR", "SWEEPER" }));

        jsal.setText("SALARY (Rs)");
        jsal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(done)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jemp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(done)
                .addGap(30, 30, 30))
        );

        setBounds(0, 0, 664, 291);
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed

                        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("choose"))
                {
                            JOptionPane.showMessageDialog(rootPane, "PLEASE SELECT EMPLOYEE TYPE");
                }
                        else
                        {
                if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("DRIVER"))
                {
                    tablename = "adddriver";
                }
                if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("SWEEPER"))
                {
                    tablename = "addsweeper";
                }
                //"addcollector"
                if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("collector"))
                {
                    tablename = "addcollector";
                }

                sal = jTextField1.getText();


try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           //update table set column=newvalue where column = oldvalue
           try
           {
            String q = "update "+tablename+" set salary = ?";
           // String p = "insert into "+tablename+"(salary) values(?)";

            PreparedStatement mystatement = myconn.prepareStatement(q);
            //PreparedStatement mystatement1 = myconn.prepareStatement(p);
            mystatement.setString(1,sal);
            // mystatement.setString(2,b);

             int res = mystatement.executeUpdate();
              if(res>0)
              {
                 JOptionPane.showMessageDialog(rootPane, "DONE SUCCESSFULLY ");
              }
              else
              {
                        JOptionPane.showMessageDialog(rootPane, "ERROR ");

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
                        }

    }//GEN-LAST:event_doneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton done;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jemp;
    private javax.swing.JLabel jsal;
    // End of variables declaration//GEN-END:variables
}
