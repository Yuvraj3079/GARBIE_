/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagemanagent;

import static garbagemanagent.vars.pass;
import static garbagemanagent.vars.un;
import static garbagemanagent.vars.url;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class searchcollector extends javax.swing.JInternalFrame {

    /**
     * Creates new form searchcollector
     */
    public searchcollector() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        upload = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        update = new javax.swing.JToggleButton();
        delete = new javax.swing.JToggleButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("PHONE");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel3.setText("ADDRESS");

        jLabel4.setText("GENDER");

        jLabel5.setText("DATE OF BIRTH");

        jLabel7.setText("SALARY ( Rs )");

        jLabel8.setText("ID");

        name1.setEditable(false);
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane3.setViewportView(address);

        buttonGroup1.add(male);
        male.setText("Male");
        male.setEnabled(false);

        buttonGroup1.add(female);
        female.setText("Female");
        female.setEnabled(false);

        upload.setText("UPLOAD PIC");
        upload.setEnabled(false);
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        jDateChooser1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(upload)
                                .addGap(49, 49, 49))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("COLLECTOR NAME");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone", "Gender", "DOB", "Salary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete.setText("DELETE");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 1034, 644);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   //jTable1.removeAll();

        try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           
           try
           {
            String q = "select * from addcollector where name like ?";
            PreparedStatement mystatement = myconn.prepareStatement(q);
            mystatement.setString(1, "%" + jTextField1.getText() + "%");
            

                         //mystatement.setString(1,jTextField1.getText());
              ResultSet res = mystatement.executeQuery();
               if(res.next())
              {
                  DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                  mymodel.setRowCount(0);
                  while(res.next())
              {
                 String id=res.getString("collector_id");

                  String n=res.getString("name");
                  String a=res.getString("address");
                  String p=res.getString("phone");
                  String g=res.getString("gender");
                 Date d;
                 d = res.getDate("dob");
                 String dob = d.toString();
                                   String s=res.getString("salary");

                  mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={id,n,a,p,g,dob,s};
                mymodel.addRow(myrow);
              
               if(jTable1.getRowCount()==0)
               {
                   JOptionPane.showMessageDialog(rootPane,"No Memebers Found");
               }
               
               else{
               update.setEnabled(true);
               upload.setEnabled(true);
               delete.setEnabled(true);
               male.setEnabled(true);
               female.setEnabled(true);
               jDateChooser1.setEnabled(true);}
//                 String ofile=res.getString("image");
//                  Image simg = ImageIO.read( new File(ofile)).getScaledInstance( photo.getWidth(), photo.getHeight(), Image.SCALE_DEFAULT);
//                   photo.setIcon(new ImageIcon(simg));
//           
//              }
//              else
//            {
//                                JOptionPane.showMessageDialog(rootPane, "ENTER VALID ID  ");
//                  name.setText("");
//                  address.setText("");
//                  phone.setText("");
//                  gender.setText("");
//                 photo.setText("");
//                  salary.setText("");


           }

            }
           }
             catch(Exception e)
           {
                               JOptionPane.showMessageDialog(rootPane, "ERROR IN QUERY 2" + e.getMessage());

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

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
String c = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           
           try
           {
               
           
           String q="select * from addcollector where collector_id=?";
             PreparedStatement state=myconn.prepareStatement(q);
             state.setString(1, c);
             ResultSet res=state.executeQuery();   
                           if(res.next())
              {
                  name1.setText(c);
                  name.setText(res.getString("name"));
                  address.setText(res.getString("address"));
                  phone.setText(res.getString("phone"));
                  gender.setText(res.getString("gender"));
                  salary.setText(res.getString("salary"));
                 Date d;
                 d = res.getDate("dob");
                 jDateChooser1.setDate(d);
                 
                 String ofile=res.getString("image");
                  Image simg = null;
               try {
                   simg = ImageIO.read( new File(ofile)).getScaledInstance( photo.getWidth(), photo.getHeight(), Image.SCALE_DEFAULT);
               } catch (IOException ex) {
                   Logger.getLogger(searchcollector.class.getName()).log(Level.SEVERE, null, ex);
               }
                   photo.setIcon(new ImageIcon(simg));
                   }
                                        else
             {
                 JOptionPane.showMessageDialog(rootPane, "Invalid memberid"); 
             }
           }
                 catch(Exception e)
                    {
              JOptionPane.showMessageDialog(rootPane, "Error in Query 1"+e.getMessage());
                    }
       }
                   
          catch(SQLException e)
       {
            JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
       }


    }//GEN-LAST:event_jTable1MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
if(myfile!=null){
         filename = "Images\\"+new Date().getTime() + "_" + myfile.getName();//Date.getTime() added for unique file name.
        int i;
        FileInputStream rd = null;
        FileOutputStream outs = null;
        try {

            rd = new FileInputStream(myfile);
            outs = new FileOutputStream(filename);//writing the new file in 'Images' folder, in the project

            byte[] b = new byte[2048];
            while ((i = rd.read(b)) > 0) {
                outs.write(b, 0, i);

            }
            JOptionPane.showMessageDialog(rootPane, "File saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error " + e.getMessage());
        } finally {
            try {
                rd.close();
                outs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
            }
        }
        }else
        {
            filename="Default\\mypic";
        }
        
        try
       {
          // Connection myconn;
           Connection myconn = DriverManager.getConnection(url, un, pass);
                 
           try
           {
               String q="update addcollector set name=?,address=?,phone=?,gender=?,dob=?,image=?,salary=? where collector_id=?";
                           PreparedStatement mystatement = myconn.prepareStatement(q);
        
             mystatement.setString(1,name.getText());
             mystatement.setString(2,address.getText());
              mystatement.setString(3,phone.getText());
               mystatement.setString(4,gender.getText());
               // mystatement.setString(5,dob.getText());
                 SimpleDateFormat mydate = new SimpleDateFormat("yyyy-MM-dd");
              String doj=mydate.format(jDateChooser1.getDate());
              mystatement.setString(5, doj);
                 //mystatement.setString(1,image.getText());
                                             mystatement.setString(6, filename);

                  mystatement.setString(7,salary.getText());
              mystatement.setString(8, name1.getText());
            
             
             
              int res = mystatement.executeUpdate();
              if(res>0)
              {
                  
              }
           
           
           }
     
              catch(Exception e)
          {
              JOptionPane.showMessageDialog(rootPane,"error in query" + e.getMessage());
          }
          finally
          {
              myconn.close();
          }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }//GEN-LAST:event_updateActionPerformed

    JFileChooser fc;
    File myfile;
    String pic = "";
    String filename="";  
    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        fc = new JFileChooser();

        fc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                int pos = f.getName().lastIndexOf('.');
                if (pos == -1) {
                    return false;
                } else {
                    String extention = f.getName().substring(pos + 1);//saving the extension
                    String str[] = {"gif", "png", "jpg", "jpeg"};//allowed extentions
                    for (String allwd : str) {

                        if (extention.equalsIgnoreCase(allwd)) {
                            return true;
                        }
                    }
                    return false;
                }

            }

            @Override
            public String getDescription() {

                return "All Picture Files";
            }
        });
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            myfile = fc.getSelectedFile();

            try {
                
                String ofile=myfile.getPath();
                                JOptionPane.showMessageDialog(rootPane, ofile);
                Image simg = ImageIO.read(new File(ofile)).getScaledInstance( jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT);
                jLabel7.setIcon(new ImageIcon(simg)); 

                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error  ");
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_uploadActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 try
       {
           Connection myconn = DriverManager.getConnection(url, un, pass);
           //CONNECTION ESTABLISHMENT
           int ch = JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE ","CONFIRM DELETE",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		   if(ch==JOptionPane.YES_OPTION)
                   {
           try
           {
               
           
           String q="delete from addcollector where collector_id=?";
             PreparedStatement state=myconn.prepareStatement(q);
             state.setString(1, name1.getText());
             int res=state.executeUpdate();   
                           if(res>0)
              {
             JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY DELETED.. ");
         
           }
           }
                 catch(Exception e)
                    {
              JOptionPane.showMessageDialog(rootPane, "SOMETHING WRONG WHILE DELETING : " + e.getMessage());
                    }
       }
       }          
          catch(SQLException e)
       {
            JOptionPane.showMessageDialog(rootPane, "EROOR WHILE CONNECTIONG " + e.getMessage());
       }
                   
                   


    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton delete;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField salary;
    private javax.swing.JToggleButton update;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
