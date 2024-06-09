/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TestClass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Stastic extends javax.swing.JFrame {

    /**
     * Creates new form Stastic
     */
    public Stastic() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Delete_button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sanskrit Text", 0, 18)); // NOI18N
        jLabel1.setText("Statestic");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "ID", "Student Name", "Issu Data", "Return Date", "Statuse"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "ID", "Student Name", "Email", "Contract No", "Return Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(50);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable2.getColumnModel().getColumn(2).setMinWidth(50);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        Delete_button1.setIcon(new javax.swing.ImageIcon("E:\\class pdf\\java\\JavaGui\\back.png")); // NOI18N
        Delete_button1.setText("home");
        Delete_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Delete_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Delete_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ////String rowDateString = rowData[5].trim();
        ////LocalDate rowDate = LocalDate.parse(rowDateString, dateFormatter);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate currentDate = LocalDate.now();
        //String currentDateString = currentDate.format(formatter);
        //String givenDateString = "18/05/2024";
        //LocalDate givenDate = LocalDate.parse(givenDateString, formatter);
        String filePatha = System.getProperty("user.home") + "/Issue_records.txt";
        String filePathS = System.getProperty("user.home") + "/student_records.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePatha))) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel mode2 = (DefaultTableModel) jTable2.getModel();
            String line;
            String ExidS;
            String ExnmS;
            String ExidB;
            String ExnmB;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                LocalDate rowDate = LocalDate.parse(rowData[5].trim(), formatter);
                if (rowData[6].trim().equals("false") && rowData[6].trim() != null && rowDate.isBefore(currentDate)) {
                    System.out.println(rowData[5].trim());
                    model.addRow(rowData);
                    model.setValueAt("Expired", i++, 6);
                    ExidS = rowData[2].trim();
                    ExnmS = rowData[3].trim();
                    ExidB = rowData[0].trim();
                    ExnmB = rowData[1].trim();
                    //System.out.println("Expired");

                    try (BufferedReader readerS = new BufferedReader(new FileReader(filePathS))) {
                        String line2;


                        while ((line2 = readerS.readLine()) != null) {
                            String[] rowDataS = line2.split(",");
                            if (rowDataS[0].trim().equals(ExidS)) {
//                                mode2.addRow(rowData);
//                        mode2.setValueAt(rowDataS[2].trim(), j++, 4);
//                        System.out.println("inner j: " + j);
//                        mode2.setValueAt(rowDataS[3].trim(), k++, 5);
//                        mode2.setValueAt(rowData[5].trim(), l++, 6);
                    
                               int newRow = mode2.getRowCount();
                               //System.out.println(newRow);
                        mode2.addRow(new Object[]{});
                        mode2.setValueAt(ExidB, newRow, 0);
                        mode2.setValueAt(ExnmB,newRow, 1);
                        mode2.setValueAt(ExidS, newRow, 2);
                        mode2.setValueAt(ExnmS, newRow, 3);
                        //System.out.println(newRow);
                        mode2.setValueAt(rowDataS[2].trim(), newRow, 4);
                        mode2.setValueAt(rowDataS[3].trim(), newRow, 5);
                        mode2.setValueAt(rowData[5].trim(), newRow, 6);
                        
                            }
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } else if (rowData[6].trim().equals("true") && rowData[6].trim() != null) {
                    model.addRow(rowData);
                    model.setValueAt("Returned", i++, 6);
                    //System.out.println("Returned");
                } else if (rowData[6].trim().equals("false") && rowData[6].trim() != null && !rowDate.isBefore(currentDate)) {
                    model.addRow(rowData);
                    model.setValueAt("Pending", i++, 6);
                    //System.out.println("Pending");
                }
            }
        } //            if (match == 1) {
        //                String line2;
        //                int j = 0;
        //                int k = 0;
        //                int l = 0;
        //
        //                while ((line2 = readerS.readLine()) != null) {
        //                    String[] rowDataS = line2.split(",");
        //                    if (rowDataS[0].trim().equals(ExidS)) {
        //                        //mode2.addRow(rowData);
        //                        mode2.setValueAt(rowDataS[2].trim(), j++, 4);
        //                        mode2.setValueAt(rowDataS[3].trim(), k++, 5);
        //                        //mode2.setValueAt(rowData[5].trim(), l++, 6);
        //                    }
        //                    System.out.println("iner loop");
        //                }
        //            }
        //model.addRow(rowData);
        //JOptionPane.showMessageDialog(this, "Data loaded successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void Delete_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_button1ActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_Delete_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stastic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stastic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stastic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stastic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stastic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
