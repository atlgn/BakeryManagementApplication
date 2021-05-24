/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BakeryManagement.Forms;

import BakeryManagement.BakeryManagementSystemProject;
import BakeryManagement.Employees;
import BakeryManagement.Functions.AddFunctions;
import BakeryManagement.Functions.DelFunctions;
import BakeryManagement.Functions.EditFunctions;
import BakeryManagement.Order;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeesMGMT extends javax.swing.JFrame {

  int xx=0;
int yy=0;
    public EmployeesMGMT() {
        initComponents();
          setResizable(false);
            refresh_JTable();
          datePicker1.setDateToToday();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        new_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\314\\Project\\BakeryManagementSystem\\src\\BakeryManagement\\Forms\\Icons\\Bakery Management System.png")); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel1.setText("Employee ID");
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel3.setText("Employee Name");
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel4.setText("Employee Email");
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel5.setText("Employee Address");
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        new_btn.setText("New");
        new_btn.setName("new_btn"); // NOI18N
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.setName("save_btn"); // NOI18N
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        del_btn.setText("Delete");
        del_btn.setName("del_btn"); // NOI18N
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " ID", "Employee Name", "Employee Email", "Employee Address", "Employee City", "Employee Phone", "Employee Slary", "Employee HireDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel6.setText("Employee City");
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel7.setText("Employee Phone");
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel8.setText("Employee Slary");
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel9.setText("Employee Hiredate");
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 147, Short.MAX_VALUE)
                                .addComponent(new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
  //NEW 
        
    jTextField1.setText(null);
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField4.setText(null);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jTextField7.setText(null);
    datePicker1.setDateToToday();
    jTextField1.requestFocus();    
    }//GEN-LAST:event_new_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
     // SAVE 
        if(
           !jTextField1.getText().trim().isEmpty()&&
           !jTextField2.getText().trim().isEmpty()&&
           !jTextField3.getText().trim().isEmpty()&&
           !jTextField4.getText().trim().isEmpty()&&
           !jTextField5.getText().trim().isEmpty()&&
           !jTextField6.getText().trim().isEmpty())
     {
            int emp_id    = Integer.parseInt(jTextField1.getText().trim());
            String emp_name    = jTextField2.getText().trim();
            String emp_email    = jTextField3.getText().trim();
            String emp_address    =jTextField4.getText().trim();
            String emp_city    = jTextField5.getText().trim();
            String emp_phone    = jTextField6.getText().trim();
            String emp_salary    = jTextField7.getText().trim();
            String temp_date = datePicker1.getDate().toString().trim();
            
            String string_attdate =temp_date.substring(8,10)+"/"+
                                temp_date.substring(5,7)+"/"+
                                temp_date.substring(0,4);

            GregorianCalendar emp_hiredate = 
                    BakeryManagementSystemProject.strToGregorianCalendar(
                     string_attdate);
            
           List employeeses =BakeryManagementSystemProject.employeeses; 
           Employees em;
           Boolean found=false;
          Iterator <Employees> itr = employeeses.iterator();
          while (itr.hasNext()) {
          em = itr.next(); 
          if(emp_id==em.getEmp_id()) {
              found=true;
              break;
              }
            }
      if (!found) {  
             // New Employees Record  
             AddFunctions.add_employees(emp_id, emp_name, emp_email, emp_address, emp_city, emp_phone, emp_salary, emp_hiredate);
             JOptionPane.showMessageDialog(null, "NEW Employees Record Successfully ADDED!");
           } else {
             // found is true! So existing Employees recort will be updated!!!  
             EditFunctions.edit_employee(emp_id, emp_name, emp_email, emp_address, emp_city, emp_phone, emp_salary, emp_hiredate);
             JOptionPane.showMessageDialog(null, "Employees Record Successfully EDITED!");

           }
    }                                                                         
        else {
            JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
        }
        refresh_JTable();
    }//GEN-LAST:event_save_btnActionPerformed

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
       if(
           !jTextField1.getText().trim().isEmpty()) {
            int emp_id         = Integer.parseInt(jTextField1.getText().trim());
            
           List attendances =BakeryManagementSystemProject.employeeses; 
      Employees em;
      Boolean found=false;
      Iterator <Employees> itr = attendances.iterator();
      while (itr.hasNext()) {
          em = itr.next(); 
          if(emp_id==em.getEmp_id()) {
              found=true;
              break;
              }
            }
           if (found) {  
             DelFunctions.delete_employee(emp_id);
             JOptionPane.showMessageDialog(null, "Selected Employees Record Successfully DELETED!");
           } 
    } else                                      
       {
            JOptionPane.showMessageDialog(null, "You have to fill Employees id field before deleting the record!");
        }
        refresh_JTable();
                         
                               
    }//GEN-LAST:event_del_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int sel_row= jTable1.getSelectedRow();
        List employeeses =BakeryManagementSystemProject.employeeses;
        Employees em;
        em = (Employees) employeeses.get(sel_row);
        jTextField1.setText(""+em.getEmp_id());
        jTextField2.setText(em.getEmp_name());
        jTextField3.setText(em.getEmp_email());   
        jTextField4.setText(em.getEmp_phone());   
        jTextField5.setText(em.getEmp_address());   
        jTextField6.setText(em.getEmp_city());   
        jTextField7.setText(em.getEmp_salary());   

        Date dt = em.getEmp_hiredate().getTime();
        String st_d = dateToString(dt);
        datePicker1.setText(st_d);
    }//GEN-LAST:event_jTable1MouseClicked

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeesMGMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesMGMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesMGMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesMGMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeesMGMT().setVisible(true);
        });
    }
    
     public void refresh_JTable() {
        
           List employeeses = BakeryManagementSystemProject.employeeses;
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           Object rowData[] = new Object[8]; 
           Iterator itr = employeeses.iterator();
           Employees em;          
           model.setNumRows(0); 
           while (itr.hasNext()) {
              em = (Employees) itr.next();
              rowData[0] = em.getEmp_id();
              rowData[1] = em.getEmp_name();
              rowData[2] = em.getEmp_email();
              rowData[3] = em.getEmp_email();
	      rowData[4] = em.getEmp_address();
	      rowData[5] = em.getEmp_city();
	      rowData[6] = em.getEmp_salary();					   
              rowData[7] = BakeryManagementSystemProject.fmt.format(em.getEmp_hiredate().getTime());  
              model.addRow(rowData);
           }   
          }
     
public String dateToString(Date d_date) {
    String temp_date, conv_date=null;
    temp_date = BakeryManagementSystemProject.fmt.format(d_date);
    // Required format is like: May 15, 2021
    switch (temp_date.substring(3,5)) {
        case "01": conv_date="January "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;
        case "02": conv_date="February "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;        
        case "03": conv_date="March "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "04": conv_date="April "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "05": conv_date="May "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "06": conv_date="June "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "07": conv_date="July "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "08": conv_date="August "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "09": conv_date="September "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "10": conv_date="October "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "11": conv_date="November "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "12": conv_date="December "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
    }
    return conv_date;    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton del_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton new_btn;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables
}
